package java8.cconcepts.comparator;

import java.util.Arrays;
import java.util.Comparator;

import static java.util.Comparator.naturalOrder;

public class ComparatorClassExample {
    public static void main(String[] args) {
        Employee[] employees = {new Employee("John", 25, 3000.0, 9922001),
                new Employee("Ace", 22, 2000.0, 5924001),
                new Employee("Anurag", 22, 4000.0, 3924401),
                new Employee("Keith", 35, 4000.0, 3924401)};

        compareBasedOnEmployeeNameWithKeyExtractor(employees);
        System.out.println("________________________________________________");
        compareBasedOnEmployeeNameWithKeyExtractorAndKeyComparator(employees);
        System.out.println("________________________________________________");
        compareUsingComparingInt(employees);
        System.out.println("________________________________________________");
        compareUsingNaturalOrder(employees);
        System.out.println("________________________________________________");
        compareUsingThenComparing(employees);


    }

    private static void compareUsingThenComparing(Employee[] employees) {
        Comparator<Employee> compareByAgeAndName =  Comparator.comparing(Employee::getAge).thenComparing(Employee::getName);
        Arrays.sort(employees, compareByAgeAndName);
        Arrays.stream(employees).forEach(System.out::println);
    }

    private static void compareUsingNaturalOrder(Employee[] employees) {
        Comparator<Employee> naturalOrderSorting = Comparator.naturalOrder();
        Arrays.sort(employees, naturalOrderSorting);
        Arrays.stream(employees).forEach(System.out::println);
    }

    private static void compareUsingComparingInt(Employee[] employees) {
        Comparator<Employee> nameComparatorReverse = Comparator.comparingInt(Employee::getAge);
        Arrays.sort(employees, nameComparatorReverse);
        Arrays.stream(employees).forEach(System.out::println);
    }

    private static void compareBasedOnEmployeeNameWithKeyExtractorAndKeyComparator(Employee[] employees) {
        Comparator<Employee> nameComparatorReverse = Comparator.comparing(Employee::getName, Comparator.reverseOrder());
        Arrays.sort(employees, nameComparatorReverse);
        Arrays.stream(employees).forEach(System.out::println);
    }

    private static void compareBasedOnEmployeeNameWithKeyExtractor(Employee[] employees) {
        Comparator<Employee> nameComparator = Comparator.comparing(Employee::getName);
        Arrays.sort(employees, nameComparator);
        Arrays.stream(employees).forEach(System.out::println);

    }

}

class Employee implements Comparable<Employee>{
    private String name;
    private int age;
    private double salary;
    private long mobile;

    public Employee(String name, int age, double salary, long mobile) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", mobile=" + mobile +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return this.name.compareTo(o.getName());
    }
}
