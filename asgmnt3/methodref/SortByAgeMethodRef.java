package asgmnt3.methodref;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Employee {
    String name;
    int age;

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class SortByAgeMethodRef {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Zameer", 30),
                new Employee("Jasvanthi", 28),
                new Employee("Dinesh", 35)
        );

        employees.sort(Comparator.comparing(Employee::getAge));

        employees.forEach(System.out::println);
    }
}
