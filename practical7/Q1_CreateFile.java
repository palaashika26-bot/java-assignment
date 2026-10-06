import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q1_CreateFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the text to save in JavaFile1.txt (press Enter):");
        String text = sc.nextLine();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("JavaFile1.txt"))) {
            writer.write(text);
            System.out.println("Text saved successfully to JavaFile1.txt");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}