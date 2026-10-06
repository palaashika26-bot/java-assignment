import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q3_CountStats {
    public static void main(String[] args) {
        String filename = "JavaFile1.txt";

        int lines = 0;
        int words = 0;
        int characters = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;

            while ((line = reader.readLine()) != null) {
                lines++;
                characters += line.length();
                String[] tokens = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    words += tokens.length;
                }
            }

            System.out.println("File: " + filename);
            System.out.println("Number of Lines: " + lines);
            System.out.println("Number of Words: " + words);
            System.out.println("Number of Characters: " + characters);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}