package department;

import company.Employee;

public class Manager implements Employee {
    String managerName;
    double basicSalary;
    double bonus;

    public Manager(String name, double basic, double bonus) {
        managerName = name;
        basicSalary = basic;
        this.bonus = bonus;
    }

    @Override
    public void calculateSalary() {
        double totalSalary = basicSalary + bonus;
        System.out.println("Manager: " + managerName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + totalSalary);
    }
}