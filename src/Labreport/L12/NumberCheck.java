package Labreport.L12;

class NumberChecker {
    void checkEven(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        }
    }

    void checkOdd(int number) {
        if (number % 2 != 0) {
            System.out.println(number + " is odd.");
        }
    }
}

public class NumberCheck {
    public static void main(String[] args) {
        NumberChecker obj = new NumberChecker();
        obj.checkEven(22);
        obj.checkOdd(13);
    }
}

