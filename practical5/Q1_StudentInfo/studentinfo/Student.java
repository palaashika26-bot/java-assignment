package studentinfo;

import java.util.Scanner;

public class Student {
    int studentId;
    String studentName;
    String course;
    double marks;

    public void acceptDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student ID: ");
        studentId = sc.nextInt();
        System.out.print("Enter Student Name: ");
        sc.nextLine();
        studentName = sc.nextLine();
        System.out.print("Enter Course: ");
        course = sc.nextLine();
        System.out.print("Enter Marks: ");
        marks = sc.nextDouble();
    }

    public void displayDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Course: " + course);
        System.out.println("Marks: " + marks);
    }

    public char calculateGrade() {
        if (marks >= 90 && marks <= 100) {
            return 'A';
        } else if (marks >= 80) {
            return 'A';
        } else if (marks >= 70) {
            return 'B';
        } else if (marks >= 60) {
            return 'C';
        } else {
            return 'D';
        }
    }

    public String getGrade() {
        if (marks >= 90 && marks <= 100) {
            return "A+";
        } else if (marks >= 80) {
            return "A";
        } else if (marks >= 70) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else {
            return "D";
        }
    }
}