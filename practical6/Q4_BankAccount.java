import java.util.Scanner;

public class Q4_BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 10000;

        System.out.print("Enter account holder's name: ");
        String name = sc.nextLine();
        System.out.print("Enter withdrawal amount: ");
        double withdrawal = sc.nextDouble();

        try {
            if (withdrawal > balance) {
                throw new IllegalArgumentException("Insufficient balance");
            }
            balance -= withdrawal;
            System.out.println(name + ", you withdrew " + withdrawal + ".");
            System.out.println("Remaining balance: " + balance);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}