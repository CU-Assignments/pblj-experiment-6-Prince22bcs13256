//question 1
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {
    String name;
    int age;
    double salary;

    // Constructor
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Getters for the fields
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "name='" + name + '\'' + ", age=" + age + ", salary=" + salary + '}';
    }
}

public class EmployeeSort {
    public static void main(String[] args) {
        // Creating a list of Employee objects
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 28, 50000));
        employees.add(new Employee("Alice", 35, 75000));
        employees.add(new Employee("Bob", 40, 60000));
        employees.add(new Employee("Charlie", 25, 45000));

        // Sorting by name using lambda expression
        Collections.sort(employees, (e1, e2) -> e1.getName().compareTo(e2.getName()));
        System.out.println("Sorted by name: " + employees);

        // Sorting by age using lambda expression
        Collections.sort(employees, (e1, e2) -> Integer.compare(e1.getAge(), e2.getAge()));
        System.out.println("Sorted by age: " + employees);

        // Sorting by salary using lambda expression
        Collections.sort(employees, (e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
        System.out.println("Sorted by salary: " + employees);
    }
}
// question 2
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class Employee {
    String name;
    int age;
    double salary;

    // Constructor
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Getters for the fields
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + ", salary=" + salary + "}";
    }
}

public class EmployeeSort {
    public static void main(String[] args) {
        // Creating a list of Employee objects
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 28, 50000));
        employees.add(new Employee("Alice", 35, 75000));
        employees.add(new Employee("Bob", 40, 60000));
        employees.add(new Employee("Charlie", 25, 45000));

        // Sorting by name using lambda expression (alphabetically)
        Collections.sort(employees, (e1, e2) -> e1.getName().compareTo(e2.getName()));
        System.out.println("Sorted by name: " + employees);

        // Sorting by age using lambda expression (ascending order)
        Collections.sort(employees, (e1, e2) -> Integer.compare(e1.getAge(), e2.getAge()));
        System.out.println("Sorted by age: " + employees);

        // Sorting by salary using lambda expression (ascending order)
        Collections.sort(employees, (e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
        System.out.println("Sorted by salary: " + employees);
    }
}
