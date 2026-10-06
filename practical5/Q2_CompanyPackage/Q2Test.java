import company.Employee;
import department.Manager;

public class Q2Test {
    public static void main(String[] args) {
        Employee employee = new Manager("Harkeerat", 60000, 15000);
        employee.calculateSalary();
    }
}