package Labreport.L20;

class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
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
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative or zero.");
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary cannot be negative or zero.");
        }
    }

    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Age: " + age);
        System.out.println("Employee Salary: Rs " + salary);
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John", 30, 50000);
        employee1.displayDetails();

        employee1.setName("David");
        employee1.setAge(35);
        employee1.setSalary(55000);

        System.out.println("\nUpdated Employee Details:");
        employee1.displayDetails();
    }
}

