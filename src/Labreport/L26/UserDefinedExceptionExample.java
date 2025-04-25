package Labreport.L26;

class UserException extends Exception {
    private int n;
    private int d;

    public UserException(int num, int den) {
        n = num;
        d = den;
    }

    @Override
    public String toString() {
        return n + " / " + d + " Divide By Zero Exception";
    }
}

public class UserDefinedExceptionExample {
    public static void main(String[] args) {
        int number[] = {7, 1, 10};
        int denom[] = {0, 8, 2};

        for (int i = 0; i < 3; i++) {
            try {
                if (denom[i] == 0) {
                    throw new UserException(number[i], denom[i]);
                } else {
                    System.out.println(number[i] + " / " + denom[i] + " = " + (number[i] / denom[i]));
                }
            } catch (UserException e) {
                System.out.println(e);
            }
        }
    }
}
