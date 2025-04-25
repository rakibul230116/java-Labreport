package Labreport.L30;

import java.lang.Math;

class MathSin extends Thread {
    double deg;
    double res;

    public MathSin(int degree) {
        deg = degree;
    }

    public void run() {
        System.out.println("Executing sin of " + deg);
        double rad = Math.toRadians(deg);
        res = Math.sin(rad);
        System.out.println("Exit from MathSin - Result = " + res);
    }
}

class MathCos extends Thread {
    double deg;
    double res;

    public MathCos(int degree) {
        deg = degree;
    }

    public void run() {
        System.out.println("Executing cos of " + deg);
        double rad = Math.toRadians(deg);
        res = Math.cos(rad);
        System.out.println("Exit from MathCos - Result = " + res);
    }
}

class MathTan extends Thread {
    double deg;
    double res;

    public MathTan(int degree) {
        deg = degree;
    }

    public void run() {
        System.out.println("Executing tan of " + deg);
        double rad = Math.toRadians(deg);
        res = Math.tan(rad);
        System.out.println("Exit from MathTan - Result = " + res);
    }
}

public class MathThread {
    public static void main(String[] args) {
        MathSin st = new MathSin(45);
        MathCos ct = new MathCos(60);
        MathTan tt = new MathTan(30);

        st.start();
        ct.start();
        tt.start();

        try {
            st.join();
            ct.join();
            tt.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e);
        }

        double sum = st.res + ct.res + tt.res;
        System.out.println("Sum of sin, cos, and tan = " + sum);
    }
}

