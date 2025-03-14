 // Find all the roots of a quadratic equation
 import java.util.*;
 import java.util.Scanner;
 public class quadratic{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        double a, b, c, det, r1, r2;
        System.out.print("Enter non-zero co-effecient value : ");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();
        det = b*b - 4*a*c;
        if(det > 0){
            System.out.println("Roots are real and distinct ");
            r1 = (-b + Math.sqrt(det))/(2*a);
            r2 = (-b - Math.sqrt(det))/(2*a);
            System.out.println("Root-1 : "+r1+" and Root-2 : "+r2);
        }
        else if(det == 0){
            System.out.println("Roots are real and equal ");
            r1 = r2 = (-b)/(2*a);
            System.out.println("Root-1 = Root-2 = "+r1);
        }
        else{
            System.out.println("Roots are complex and imaginary");
            double real = (-b)/(2*a);
            double imaginary = Math.sqrt(-det)/(2*a);
            System.out.println("Root-1 = "+real+" + "+imaginary+"i");
            System.out.println("Root-2 = "+real+" - "+imaginary+"i");
        }
    }
 }
