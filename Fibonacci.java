// Print ‘N’ Fibonacci numbers.
   import java.util.*;
   import java.util.Scanner;
   public class Fibonacci{
       public static void main(String args[]){
           Scanner in = new Scanner(System.in);
           int N, n1=0, n2=1, n3, i;
           System.out.println("Enter the value of N : ");
           N = in.nextInt();
           System.out.print("Fibonacci sequence upto "+N+" terms : "+n1+" "+n2);
           for(i=2;i<N;i++){
               n3 = n1+n2;
               System.out.print(" "+n3);
               n1 = n2;
               n2 = n3;
           }
       }
   }
