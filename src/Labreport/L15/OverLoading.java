package Labreport.L15;

import java.util.Scanner;

class Posting {
    int[] jobCodes = {131, 132, 133};
    int courseMark, aptTest, techTest, interview;

    void employee(int techTest, int interview) {
        int x = techTest + interview;
        if (x >= 85) {
            System.out.println("Congrats! You are selected as Team Leader.");
        } else {
            System.out.println("Sorry, you are not selected. Try your best next time.");
        }
    }

    void employee(int interview) {
        if (interview >= 90) {
            System.out.println("Congrats! You are selected as Project Manager.");
        } else {
            System.out.println("Sorry, you are not selected. Try your best next time.");
        }
    }

    void employee(int courseMark, int aptTest, int techTest, int interview) {
        int x = courseMark + aptTest + techTest;
        if (x >= 80) {
            System.out.println("Congrats! You are selected as Programmer.");
        } else {
            System.out.println("Sorry, you are not selected. Try your best next time.");
        }
    }

    void readMarks(int code) {
        Scanner sc = new Scanner(System.in);
        switch (code) {
            case 131:
                System.out.println("Enter Course mark (max: 25): ");
                courseMark = sc.nextInt();
                System.out.println("Enter AptTest mark (max: 25): ");
                aptTest = sc.nextInt();
                System.out.println("Enter TechTest mark (max: 50): ");
                techTest = sc.nextInt();
                System.out.println("Enter Interview mark (max: 25): ");
                interview = sc.nextInt();
                break;
            case 132:
                System.out.println("Enter TechTest mark (max: 50): ");
                techTest = sc.nextInt();
                System.out.println("Enter Interview mark (max: 50): ");
                interview = sc.nextInt();
                break;
            case 133:
                System.out.println("Enter Interview mark (max: 100): ");
                interview = sc.nextInt();
                break;
        }
    }

    public static void main(String[] args) {
        Posting emp = new Posting();

        emp.readMarks(emp.jobCodes[0]);
        emp.employee(emp.courseMark, emp.aptTest, emp.techTest, emp.interview);
    }
}
