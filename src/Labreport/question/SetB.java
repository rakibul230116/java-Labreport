package Labreport.question;

class SumCalculator {

    // Method to add two integers
    void printSum(int a, int b) {
        int sum = a + b;
        System.out.println("Sum of integers: " + sum);
    }

    // Method to add two long numbers
    void printSum(long a, long b) {
        long sum = a + b;
        System.out.println("Sum of longs: " + sum);
    }
}

public class SetB {
    public static void main(String[] args) {
        SumCalculator calculator = new SumCalculator();

        // Call method with int parameters
        calculator.printSum(10, 20); // calls int version

        // Call method with long parameters
        calculator.printSum(10000000000L, 20000000000L); // calls long version
    }
}
