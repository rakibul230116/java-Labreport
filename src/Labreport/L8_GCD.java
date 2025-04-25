package Labreport;

import java.util.Scanner;

public class L8_GCD {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int num1 = se.nextInt();
        int num2 = se.nextInt();

        int gcd = 1;
        int min = Math.min(num1, num2);

        for (int i = 1; i <= min; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }

        System.out.println("The Greatest Common Divisor (GCD) is: " + gcd);
        se.close();
    }
}
