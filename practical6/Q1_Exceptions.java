import java.util.InputMismatchException;
import java.util.Scanner;

public class Q1_Exceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int a = 10, b = 0;
            System.out.println("Division result: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Cannot divide by zero.");
        }

        try {
            int[] numbers = new int[5];
            numbers[10] = 100;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: Invalid array index.");
        }

        try {
            System.out.print("Marks must be numeric. Enter your roll number: ");
            String roll = sc.next();
            int rollNumber = Integer.parseInt(roll);
            System.out.println("Roll number accepted: " + rollNumber);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Marks must be numeric. Enter your roll number: abc");
        }

        try {
            System.out.print("Please enter an integer: ");
            int value = sc.nextInt();
            System.out.println("Integer accepted: " + value);
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException: Please enter an integer.");
            sc.nextLine();
        }

        try {
            String studentName = null;
            System.out.println("Student name length: " + studentName.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: Student name is null.");
        }

        try {
            String word = "Java";
            System.out.println("Character at index 10: " + word.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException: Invalid character index.");
        }

        try {
            System.out.print("Enter marks (between 0 and 100): ");
            int marks = sc.nextInt();
            if (marks < 0 || marks > 100) {
                throw new IllegalArgumentException("Marks must be between 0 and 100.");
            }
            System.out.println("Marks accepted: " + marks);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: Marks must be between 0 and 100.");
        }
    }
}