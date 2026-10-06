import java.util.InputMismatchException;
import java.util.Scanner;

public class Q3_ResultSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter student name: ");
            String name = sc.nextLine();
            System.out.print("Enter number of subjects: ");
            int subjectCount = sc.nextInt();

            int[] marks = new int[subjectCount];
            int total = 0;

            for (int i = 0; i < subjectCount; i++) {
                System.out.print("Enter marks for subject " + (i + 1) + ": ");
                marks[i] = sc.nextInt();
                total += marks[i];
            }

            try {
                double average = total / subjectCount;
                System.out.println("\nStudent: " + name);
                System.out.println("Average Marks: " + average);

                for (int i = 0; i <= subjectCount; i++) {
                    System.out.println("Marks of subject " + (i + 1) + ": " + marks[i]);
                }
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException: Cannot calculate average when the number of subjects is zero.");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException: Invalid subject index accessed.");
            }
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException: User entered text instead of marks.");
            sc.nextLine();
        }
    }
}