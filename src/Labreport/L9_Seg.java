package Labreport;

import java.util.Scanner;

class L9_Seq {
    public void alternatingSignSeq() {
        int sign = -1, n = 4, k = 1;
        System.out.println("The sequence is:");
        for (int i = 1; i <= 10; i++) {
            n += k;
            int temp = n * sign;
            System.out.printf("%d ", temp);
            sign = -sign; // Alternate sign
        }
        System.out.println();
    }

    public void repeatSeq() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d\t", i);
            }
            System.out.println();
        }
    }
}

public class L9_Seg {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
         L9_Seq obj = new L9_Seq();

        while (true) {
            System.out.println("Enter your option:");
            System.out.println("1. Line sequence");
            System.out.println("2. Triangle sequence");

            int opt = se.nextInt();

            switch (opt) {
                case 1:
                    obj.alternatingSignSeq();
                    break;
                case 2:
                    obj.repeatSeq();
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
                    continue;
            }

            System.out.print("Do you want to continue (0/1)? ");
            int ch = se.nextInt();
            if (ch != 1) {
                break;
            }
        }

        se.close();
    }
}
