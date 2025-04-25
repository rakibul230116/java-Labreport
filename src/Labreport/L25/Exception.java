package Labreport.L25;

import java.util.Scanner;

class ExceptionHandling {
    public static void main(String[] args) {
        int a, b;
        float result;

        Scanner s = new Scanner(System.in);

        System.out.print("Enter the value of A: ");
        a = s.nextInt();

        System.out.print("Enter the value of B: ");
        b = s.nextInt();

        try {
            result = (float) a / b;
            System.out.println("Result is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
            throw e;
        } finally {
            System.out.println("Program is complete.");
            s.close();
        }
    }
}
