package Labreport.L18;

// Abstract class Animal
abstract class Animal {
    abstract void makeSound();

    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Interface Pet
interface Pet {
    void play(); // Abstract method

    default void showAffection() {
        System.out.println("This pet shows affection.");
    }
}

// Dog class extending Animal and implementing Pet
class Dog extends Animal implements Pet {
    @Override
    void makeSound() {
        System.out.println("Dog barks.");
    }

    @Override
    public void play() {
        System.out.println("Dog plays fetch.");
    }
}

// Main class
public class Interface {
    public static void main(String[] args) {
        Dog myDog = new Dog();

        myDog.makeSound();
        myDog.eat();
        myDog.play();
        myDog.showAffection();
    }
}