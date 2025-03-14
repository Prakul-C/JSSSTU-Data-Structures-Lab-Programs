
/** JAVA program to print scores of students
    Name of the program: _11StudentScore.java
*/

import java.util.Scanner;

class Student {
    int rollNumber;

    void readNumber(int n) {
        rollNumber = n;
    }

    void printNumber() {
        System.out.println("Roll No: " + rollNumber);
    }
}

class Test extends Student {
    int sub1, sub2;

    void readMarks(int m1, int m2) {
        sub1 = m1;
        sub2 = m2;
    }

    void printMarks() {
        System.out.println("Marks in Subject-1: " + sub1);
        System.out.println("Marks in Subject-2: " + sub2);
    }
}

interface Sports {
    void readWt(double n);

    void printWt();
}

class Results extends Test implements Sports {
    double total, sportWt;

    public void readWt(double n) {
        sportWt = n;
    }

    public void printWt() {
        System.out.println("Sports Weightage: " + sportWt);
    }

    void display() {
        total = sub1 + sub2 + sportWt;
        printNumber();
        printMarks();
        printWt();
        System.out.println("Total Score: " + total);
    }
}

public class StudentScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        Results[] students = new Results[n];

        for (int i = 0; i < n; i++) {
            students[i] = new Results();
            System.out.println("\nEnter details of student-" + (i + 1));
            System.out.print("Roll Number: ");
            students[i].readNumber(sc.nextInt());
            System.out.print("Subject-1 Marks: ");
            int m1 = sc.nextInt();
            System.out.print("Subject-2 Marks: ");
            int m2 = sc.nextInt();
            students[i].readMarks(m1, m2);
            System.out.print("Sports Weightage: ");
            students[i].readWt(sc.nextDouble());
        }

        for (int i = 0; i < n; i++) {
            System.out.println("\nDetails of Student-" + (i + 1) + " ~");
            students[i].display();
        }
        sc.close();
    }
}
