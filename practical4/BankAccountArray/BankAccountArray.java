import java.util.Scanner;

class BankAccount {
    long accountNumber;
    String holderName;
    double balance;

    BankAccount(long accNo, String name, double openingBalance) {
        accountNumber = accNo;
        holderName = name;
        balance = openingBalance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance. Withdrawal failed.");
        }
    }

    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + holderName);
        System.out.println("Current Balance: " + balance);
    }
}

public class BankAccountArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount[] customers = new BankAccount[5];

        for (int i = 0; i < customers.length; i++) {
            System.out.println("\n--- Enter details for Customer " + (i + 1) + " ---");
            System.out.print("Enter Account Number: ");
            long accNo = sc.nextLong();
            sc.nextLine();
            System.out.print("Enter Account Holder Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Opening Balance: ");
            double bal = sc.nextDouble();
            customers[i] = new BankAccount(accNo, name, bal);
        }

        for (int i = 0; i < customers.length; i++) {
            System.out.println("\n--- Customer " + (i + 1) + " ---");
            customers[i].deposit(1000);
            customers[i].withdraw(500);
            customers[i].displayDetails();
        }

        sc.close();
    }
}