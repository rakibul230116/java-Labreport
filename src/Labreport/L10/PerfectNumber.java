package Labreport.L10;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = se.nextInt();

        int sum, count = 0;

        for (int i = 1; count < n; i++) {
            sum = 0;
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }

            if (sum == i) {
                System.out.printf("%d is a perfect number.\n", i);
                count++;
            }
        }

        se.close();
    }
}

