package Labreport.L5;

import java.util.Scanner;

public class Branching {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Checking the day of the week
        System.out.print("Enter a day number (1-7): ");
        int day = scanner.nextInt();

        switch (day) {
            case 1 -> System.out.println("Saturday");
            case 2 -> System.out.println("Sunday");
            case 3 -> System.out.println("Monday");
            case 4 -> System.out.println("Tuesday");
            case 5 -> System.out.println("Wednesday");
            case 6 -> System.out.println("Thursday");
            case 7 -> System.out.println("Friday");
            default -> System.out.println("Invalid day number.");
        }

        // Loop from 1 to 5, skipping 3 and stopping at 4
        System.out.println("\nNumbers from 1 to 5, skipping 3 and stopping at 4:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // Skip 3
            }
            System.out.println(i);
            if (i == 4) {
                break; // Stop at 4
            }
        }

        // Checking if a number is positive, negative, even, or odd
        System.out.print("\nEnter a number: ");
        int num = scanner.nextInt();

        if (num > 0) {
            System.out.println("Number is positive.");
        } else if (num < 0) {
            System.out.println("Number is negative.");
        } else {
            System.out.println("Number is zero.");
        }

        if (num % 2 == 0) {
            System.out.println("Number is even.");
        } else {
            System.out.println("Number is odd.");
        }

        scanner.close();
    }
}

