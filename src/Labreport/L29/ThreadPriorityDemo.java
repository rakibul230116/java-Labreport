package Labreport.L29;

class A extends Thread {
    public void run() {
        System.out.println("Thread A started");
        for (int i = 1; i <= 4; i++) {
            System.out.println("From Thread A: i = " + i);
        }
        System.out.println("Exit from Thread A");
    }
}

class B extends Thread {
    public void run() {
        System.out.println("Thread B started");
        for (int i = 1; i <= 4; i++) {
            System.out.println("From Thread B: i = " + i);
        }
        System.out.println("Exit from Thread B");
    }
}

class C extends Thread {
    public void run() {
        System.out.println("Thread C started");
        for (int i = 1; i <= 4; i++) {
            System.out.println("From Thread C: i = " + i);
        }
        System.out.println("Exit from Thread C");
    }
}

public class ThreadPriorityDemo {
    public static void main(String[] args) {
        A threadA = new A();
        B threadB = new B();
        C threadC = new C();

        threadC.setPriority(Thread.MAX_PRIORITY);
        threadB.setPriority(threadA.getPriority());
        threadA.setPriority(Thread.MIN_PRIORITY);

        System.out.println("Starting Thread A");
        threadA.start();

        System.out.println("Starting Thread B");
        threadB.start();

        System.out.println("Starting Thread C");
        threadC.start();
    }
}

