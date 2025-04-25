package Labreport.question;

// Abstract class
abstract class Person {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Abstract method
    abstract void displayIdentity();
}

// Interface for contact information
interface Contactable {
    void showContactDetails();
}

// Interface for location
interface Locatable {
    void showLocation();
}

// Derived class that extends abstract class and implements interfaces
class Employee extends Person implements Contactable, Locatable {
    String phoneNumber;
    String address;

    // Constructor
    Employee(String name, int age, String phoneNumber, String address) {
        super(name, age);
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    @Override
    void displayIdentity() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    @Override
    public void showContactDetails() {
        System.out.println("Phone Number: " + phoneNumber);
    }

    @Override
    public void showLocation() {
        System.out.println("Address: " + address);
    }
}

// Main class
public class setBB{
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", 30, "123-456-7890", "New York, USA");

        emp.displayIdentity();
        emp.showContactDetails();
        emp.showLocation();
    }
}

