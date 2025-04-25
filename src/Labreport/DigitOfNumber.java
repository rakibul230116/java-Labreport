package Labreport;

import java.util.Scanner;

class DigitOfNumber {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = se.nextInt();

        int reversed = 0;
        int original = n;

        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }

        System.out.println("The reversed number is: " + reversed);

        se.close();
    }
}
