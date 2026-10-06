import java.util.InputMismatchException;
import java.util.Scanner;

public class Q2_MarksSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter number of subjects: ");
            int subjectCount = sc.nextInt();

            int[] marks = new int[subjectCount];
            int total = 0;

            for (int i = 0; i < subjectCount; i++) {
                System.out.print("Enter marks for subject " + (i + 1) + ": ");
                String input = sc.next();
                marks[i] = Integer.parseInt(input);
                total += marks[i];
            }

            double average = total / subjectCount;

            System.out.print("Enter index to display marks for: ");
            int index = sc.nextInt();
            System.out.println("Marks at index " + index + ": " + marks[index]);

            System.out.println("Average Marks: " + average);
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException: User entered text instead of marks.");
            sc.nextLine();
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Marks are entered as a string and converted incorrectly.");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Cannot calculate average when the number of subjects is zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: Marks array accessed using an invalid index.");
        }
    }
}