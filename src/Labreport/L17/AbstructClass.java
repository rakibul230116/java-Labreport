package Labreport.L17;

import java.util.Scanner;

abstract class Solid {
    double radius;

    abstract void surfaceArea();
    abstract void volume();
    abstract void readRadius();

    double baseArea(double r) {
        return Math.PI * r * r;
    }
}

class Cylinder extends Solid {
    double height;

    public Cylinder(double height) {
        this.height = height;
    }

    public void readRadius() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius (cylinder): ");
        radius = sc.nextDouble();
    }

    public void surfaceArea() {
        double baseArea = baseArea(radius);
        double totalArea = 2 * Math.PI * radius * height + 2 * baseArea;
        System.out.printf("Surface Area of Cylinder: %.2f\n", totalArea);
    }

    public void volume() {
        double volume = baseArea(radius) * height;
        System.out.printf("Volume of Cylinder: %.2f\n", volume);
    }
}

class Sphere extends Solid {
    public void readRadius() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius (sphere): ");
        radius = sc.nextDouble();
    }

    public void surfaceArea() {
        double surfaceArea = 4 * baseArea(radius);
        System.out.printf("Surface Area of Sphere: %.2f\n", surfaceArea);
    }

    public void volume() {
        double volume = (4.0 / 3) * baseArea(radius) * radius;
        System.out.printf("Volume of Sphere: %.2f\n", volume);
    }
}

public class AbstructClass {
    public static void main(String[] args) {
        Solid s = new Cylinder(3);
        s.readRadius();
        s.surfaceArea();
        s.volume();

        s = new Sphere();
        s.readRadius();
        s.surfaceArea();
        s.volume();
    }
}
