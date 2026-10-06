import java.util.Scanner;

class Student {
    int studentID;
    String studentName;
    String course;
    double marksAAS;
    double marksJAVA;
    double marksPython;

    Student() {
        studentID = 0;
        studentName = "Unknown";
        course = "Not Assigned";
        marksAAS = 0;
        marksJAVA = 0;
        marksPython = 0;
    }

    Student(int id, String name, String c, double aas, double java, double python) {
        studentID = id;
        studentName = name;
        course = c;
        marksAAS = aas;
        marksJAVA = java;
        marksPython = python;
    }

    void acceptDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student ID: ");
        studentID = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Student Name: ");
        studentName = sc.nextLine();
        System.out.print("Enter Course: ");
        course = sc.nextLine();
        System.out.print("Enter Marks in AAS: ");
        marksAAS = sc.nextDouble();
        System.out.print("Enter Marks in JAVA: ");
        marksJAVA = sc.nextDouble();
        System.out.print("Enter Marks in Python: ");
        marksPython = sc.nextDouble();
    }

    double calculateTotal() {
        return marksAAS + marksJAVA + marksPython;
    }

    double calculatePercentage() {
        return (calculateTotal() / 3);
    }

    void displayDetails() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Name: " + studentName);
        System.out.println("Course: " + course);
        System.out.println("Marks in AAS: " + marksAAS);
        System.out.println("Marks in JAVA: " + marksJAVA);
        System.out.println("Marks in Python: " + marksPython);
        System.out.println("Total Marks: " + calculateTotal());
        System.out.println("Percentage: " + calculatePercentage() + "%");
    }
}

public class StudentRecord {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.acceptDetails();
        System.out.println("\n--- Student 1 (Default Constructor) ---");
        s1.displayDetails();

        Student s2 = new Student(101, "Harkeerat", "BSC-CS", 85.5, 90.0, 78.5);
        System.out.println("\n--- Student 2 (Parameterized Constructor) ---");
        s2.displayDetails();
    }
}