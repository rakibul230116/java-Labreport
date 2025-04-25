package Labreport.L24;

import java.util.Scanner;

interface Lift {
    void move();
    void display();
}

interface Room {
    void roomType();
    void display();
}

class Inn {
    public void display() {
        System.out.println("The hotel Barzani is a Three-Star type.");
    }
}

class Stay extends Inn implements Lift, Room {
    int duration;

    void rwValue() {
        Scanner se = new Scanner(System.in);
        System.out.print("Enter the duration of stay (No. of days): ");
        duration = se.nextInt();
        System.out.println("Duration of stay: " + duration + " days.");
    }

    @Override
    public void move() {
        System.out.println("Go to the fifth floor.");
    }

    @Override
    public void roomType() {
        System.out.println("Room type is AC Double.");
    }
}

public class Multiple1 {
    public static void main(String[] args) {
        Stay s = new Stay();
        s.rwValue();

        Lift l = s;
        l.display();
        l.move();

        Room r = s;
        r.roomType();
        r.display();
    }
}