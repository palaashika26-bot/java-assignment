import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Q1_ArmstrongClient {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost", 5000);

        DataInputStream in = new DataInputStream(s.getInputStream());
        DataOutputStream out = new DataOutputStream(s.getOutputStream());

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        out.writeInt(num);

        String reply = in.readUTF();
        System.out.println("Server says: " + reply);

        s.close();
    }
}
