package Labreport.L16;

import java.util.Scanner;

class Fruit {
    public float unitPrice;
    public int quantity;

    public void readData() {
        Scanner se = new Scanner(System.in);
        System.out.println("Enter the price per kg: ");
        unitPrice = se.nextFloat();
        System.out.println("Enter the quantity: ");
        quantity = se.nextInt();
    }

    public void display() {
        System.out.printf("Price per kg: Rs %.2f\n", unitPrice);
        System.out.println("Purchased quantity: " + quantity);
        float totalCost = unitPrice * quantity;
        System.out.printf("Cost = Rs %.2f\n", totalCost);
    }
}

class Mango extends Fruit {
    public String name;
    public String taste;

    public Mango(String t, String n) {
        taste = t;
        name = n;
    }

    public void makeJuice() {
        System.out.println("Peel off and slice the fruit.");
        System.out.println("Crush the fruit slices to make juice.");
    }
}

public class EatFruit {
    public static void main(String[] args) {
        Mango malgora = new Mango("Sweet", "Mango");
        System.out.printf("Taste of %s is %s.\n", malgora.name, malgora.taste);

        malgora.readData();
        malgora.display();
        malgora.makeJuice();
    }
}
