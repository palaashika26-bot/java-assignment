import java.util.Scanner;

class User {
    int userID;
    String userName;
    long mobileNumber;

    User(int id, String name, long mobile) {
        userID = id;
        userName = name;
        mobileNumber = mobile;
    }

    void displayUserDetails() {
        System.out.println("User ID: " + userID);
        System.out.println("User Name: " + userName);
        System.out.println("Mobile Number: " + mobileNumber);
    }
}

class Customer extends User {
    String customerAddress;
    int orderID;

    Customer(int id, String name, long mobile, String address, int order) {
        super(id, name, mobile);
        customerAddress = address;
        orderID = order;
    }

    void displayCustomerDetails() {
        displayUserDetails();
        System.out.println("Customer Address: " + customerAddress);
        System.out.println("Order ID: " + orderID);
    }
}

class PremiumCustomer extends Customer {
    String membershipType;
    double discountPercentage;

    PremiumCustomer(int id, String name, long mobile, String address, int order,
                    String membership, double discount) {
        super(id, name, mobile, address, order);
        membershipType = membership;
        discountPercentage = discount;
    }

    double calculateDiscount(double orderAmount) {
        return orderAmount * discountPercentage / 100;
    }

    void displayFinalBill(double orderAmount) {
        double discount = calculateDiscount(orderAmount);
        System.out.println("Order Amount: " + orderAmount);
        System.out.println("Discount (" + discountPercentage + "%): " + discount);
        System.out.println("Final Bill Amount: " + (orderAmount - discount));
    }

    void displayPremiumDetails() {
        displayCustomerDetails();
        System.out.println("Membership Type: " + membershipType);
        System.out.println("Discount Percentage: " + discountPercentage + "%");
    }
}

public class OnlineShopping {

    public static void main(String[] args) {
        PremiumCustomer pc = new PremiumCustomer(201, "Harkeerat", 9876543210L,
                "Mithibai College, Mumbai", 5001, "Gold", 15);

        System.out.println("--- Premium Customer Details ---");
        pc.displayPremiumDetails();

        System.out.println();
        System.out.println("--- Bill Calculation ---");
        pc.displayFinalBill(5000);
    }
}