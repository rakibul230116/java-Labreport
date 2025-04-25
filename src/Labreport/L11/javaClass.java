package Labreport.L11;

class Car {
    String brand;
    String color;

    void setDetails(String carBrand, String carColor) {
        brand = carBrand;
        color = carColor;
    }

    void display() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Color: " + color);
    }
}

class Person {
    String name;

    void setName(String personName) {
        name = personName;
    }

    void displayName() {
        System.out.println("Person Name: " + name);
    }
}

public class javaClass {
    public static void main(String[] args) {
        Car myCar = new Car();
        Person driver = new Person();

        myCar.setDetails("TATA", "BLUE");
        driver.setName("Rakibul");

        System.out.println("Car Details:");
        myCar.display();

        System.out.println("Driver Details:");
        driver.displayName();
    }
}

