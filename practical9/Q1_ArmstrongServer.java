import java.io.*;
import java.net.*;

public class Q1_ArmstrongServer {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(5000);
        System.out.println("Server is waiting for client...");

        Socket s = ss.accept();
        System.out.println("Client connected");

        DataInputStream in = new DataInputStream(s.getInputStream());
        DataOutputStream out = new DataOutputStream(s.getOutputStream());

        int num = in.readInt();
        System.out.println("Number received: " + num);

        int temp = num;
        int digits = 0;
        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }

        temp = num;
        int sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum = sum + (int) Math.pow(digit, digits);
            temp = temp / 10;
        }

        if (sum == num) {
            out.writeUTF(num + " is an Armstrong number");
        } else {
            out.writeUTF(num + " is not an Armstrong number");
        }

        s.close();
        ss.close();
    }
}
