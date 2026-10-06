class Student {
    int rollNumber;
    String studentName;

    static String collegeName = "Mithibai College";
    static int count = 0;

    Student(int roll, String name) {
        rollNumber = roll;
        studentName = name;
        count++;
    }

    void display() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Student Name: " + studentName);
        System.out.println("College Name: " + collegeName);
        System.out.println();
    }

    static void totalStudents() {
        System.out.println("Total Students: " + count);
    }
}

public class StaticKeyword {

    public static void main(String[] args) {
        Student s1 = new Student(1, "Harkeerat");
        Student s2 = new Student(2, "Rahul");
        Student s3 = new Student(3, "Priya");

        s1.display();
        s2.display();
        s3.display();

        Student.totalStudents();
    }
}