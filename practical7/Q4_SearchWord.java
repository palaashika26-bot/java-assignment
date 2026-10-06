import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Q4_SearchWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String filename = "JavaFile1.txt";

        System.out.print("Enter the word to search for: ");
        String searchWord = sc.next();

        int count = 0;
        int lineNo = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;

            while ((line = reader.readLine()) != null) {
                lineNo++;
                String[] words = line.trim().split("\\s+");
                for (String word : words) {
                    if (word.equalsIgnoreCase(searchWord)) {
                        count++;
                        System.out.println("Found on line " + lineNo + ": \"" + line.trim() + "\"");
                    }
                }
            }

            System.out.println("\nTotal occurrences of \"" + searchWord + "\": " + count);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}