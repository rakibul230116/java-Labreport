package Labreport.L2;

public class loop {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            System.out.println("For loop count: " + i);
        }

        int i = 0;
        while (i <= 5) {
            System.out.println("While loop count: " + i);
            i++;
        }

        i = 0;
        do {
            System.out.println("Do-while loop count: " + i);
            i++;
        } while (i <= 5);
    }
}
