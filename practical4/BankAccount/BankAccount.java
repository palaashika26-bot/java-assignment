class Account {
    long accountNumber;
    String accountHolderName;
    double balance;

    Account() {
        accountNumber = 0;
        accountHolderName = "Unknown";
        balance = 0.0;
    }

    Account(long accNo, String name, double openingBalance) {
        accountNumber = accNo;
        accountHolderName = name;
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

    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        displayBalance();
    }
}

public class BankAccount {

    public static void main(String[] args) {
        Account a1 = new Account();
        System.out.println("--- Account 1 (Default Constructor) ---");
        a1.displayAccountDetails();
        a1.deposit(5000);
        a1.withdraw(2000);
        a1.displayAccountDetails();

        System.out.println();

        Account a2 = new Account(1023456789L, "Harkeerat", 10000);
        System.out.println("--- Account 2 (Parameterized Constructor) ---");
        a2.displayAccountDetails();
        a2.withdraw(12000);
        a2.withdraw(4000);
        a2.displayBalance();
        a2.displayAccountDetails();
    }
}