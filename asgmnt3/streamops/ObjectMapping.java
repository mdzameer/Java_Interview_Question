package asgmnt3.streamops;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Person {
    String name;
    Person(String name) { this.name = name; }
}

class Employee {
    String employeeName;
    Employee(String name) { this.employeeName = name; }
}

public class ObjectMapping {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("John"), new Person("Jane"));

        List<Employee> employees = people.stream()
                .map(p -> new Employee(p.name))
                .collect(Collectors.toList());

        employees.forEach(e -> System.out.println(e.employeeName));
    }
}

