package asgmnt1.oops;

// Superclass
class Person {
    String name;
    double salary;

    public Person(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double calculateBonus() {
        return 0; // Default implementation
    }
}

// Subclass: Employee
class Employee extends Person {
    public Employee(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateBonus() {
        return salary * 0.10; // 10% bonus
    }
}

// Subclass: Manager
class Manager extends Employee {
    int teamSize;

    public Manager(String name, double salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    @Override
    public double calculateBonus() {
        return salary * 0.10 + teamSize * 500; // 10% bonus + ₹500 per team member
    }
}

// Main class to test
public class EmployeeManagement {
    public static void main(String[] args) {
        Manager m = new Manager("Alice", 45000, 5);
        Employee e = new Employee("Bob", 30000);

        System.out.println("Manager Bonus: " + (int)m.calculateBonus());
        System.out.println("Employee Bonus: " + (int)e.calculateBonus());
    }
}

