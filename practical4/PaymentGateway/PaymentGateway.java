abstract class Payment {
    double amount;

    Payment(double amount) {
        this.amount = amount;
    }

    void displayReceipt() {
        System.out.println("Transaction Amount: " + amount);
    }

    abstract void processPayment();
}

class CryptoPayment extends Payment {
    String walletAddress;

    CryptoPayment(double amount, String walletAddress) {
        super(amount);
        this.walletAddress = walletAddress;
    }

    @Override
    void processPayment() {
        System.out.println("Secure blockchain transfer of " + amount +
                " confirmed to wallet: " + walletAddress);
    }
}

public class PaymentGateway {

    public static void main(String[] args) {
        CryptoPayment payment = new CryptoPayment(250.75, "0x3f9a1cB7e2D8a1f6b4C9E7d2A5B8e4F1c0D3a7b2");

        payment.displayReceipt();
        payment.processPayment();
    }
}