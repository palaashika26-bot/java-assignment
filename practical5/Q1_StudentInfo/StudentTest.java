import studentinfo.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();

        student.acceptDetails();

        System.out.println();
        System.out.println("--- Student Information ---");
        student.displayDetails();
        System.out.println("Grade: " + student.getGrade());
    }
}