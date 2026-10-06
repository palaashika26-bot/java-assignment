import java.util.Scanner;

interface Employee {
    void calculateSalary();

    void displayDetails();
}

class Manager implements Employee {
    String name;
    double basicSalary;
    double bonus;

    Manager(String name, double basicSalary, double bonus) {
        this.name = name;
        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }

    @Override
    public void calculateSalary() {
        System.out.println("Salary: " + (basicSalary + bonus));
    }

    @Override
    public void displayDetails() {
        System.out.println("Designation: Manager");
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Bonus: " + bonus);
    }
}

class Developer implements Employee {
    String name;
    double basicSalary;
    int projects;

    Developer(String name, double basicSalary, int projects) {
        this.name = name;
        this.basicSalary = basicSalary;
        this.projects = projects;
    }

    @Override
    public void calculateSalary() {
        double projectBonus = projects * 5000;
        System.out.println("Salary: " + (basicSalary + projectBonus));
    }

    @Override
    public void displayDetails() {
        System.out.println("Designation: Developer");
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Projects Completed: " + projects);
    }
}

public class Q3_ManagerDeveloper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Enter Manager Details ---");
        System.out.print("Name: ");
        String mName = sc.nextLine();
        System.out.print("Basic Salary: ");
        double mBasic = sc.nextDouble();
        System.out.print("Bonus: ");
        double mBonus = sc.nextDouble();
        Manager manager = new Manager(mName, mBasic, mBonus);

        sc.nextLine();
        System.out.println("\n--- Enter Developer Details ---");
        System.out.print("Name: ");
        String dName = sc.nextLine();
        System.out.print("Basic Salary: ");
        double dBasic = sc.nextDouble();
        System.out.print("Number of Projects: ");
        int projects = sc.nextInt();
        Developer developer = new Developer(dName, dBasic, projects);

        System.out.println("\n--- Manager ---");
        manager.displayDetails();
        manager.calculateSalary();

        System.out.println("\n--- Developer ---");
        developer.displayDetails();
        developer.calculateSalary();
    }
}