package asgmnt3.lambdaexpression;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

@FunctionalInterface
interface SalarySorter{
    void sort(List<Employee> employee);
}

class Employee{
    private String empid;
    private double salary;

    public Employee(String empid, double salary) {
        this.empid = empid;
        this.salary = salary;
    }

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empid='" + empid + '\'' +
                ", salary=" + salary +
                '}';
    }
}


public class FunctionalInterfaceImpl {

    public static void main(String[] args) {
        SalarySorter sorter = (list) -> list.sort(Comparator.comparingDouble(Employee::getSalary));

        Employee emp1 = new Employee("emp1",20000.00);
        Employee emp2 = new Employee("emp2",25000.00);
        Employee emp3 = new Employee("emp3",30000.00);

        List<Employee> emplist = Arrays.asList(emp1, emp2, emp3);


        sorter.sort(emplist);

        emplist.forEach(System.out::println);
    }
}
