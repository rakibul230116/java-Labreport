package Labreport.question;

// Base class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// First interface
interface CanRun {
    void run();
}

// Second interface
interface CanSwim {
    void swim();
}

// Derived class inheriting from class and interfaces
class Dog extends Animal implements CanRun, CanSwim {
    @Override
    public void run() {
        System.out.println("The dog runs fast.");
    }

    @Override
    public void swim() {
        System.out.println("The dog can swim.");
    }
}

// Main class to run the program
public class setAB {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();   // From base class
        dog.run();   // From CanRun interface
        dog.swim();  // From CanSwim interface
    }
}

