// Print pyramid shape using * symbols.
   import java.util.*;
   import java.util.Scanner;
   public class Pyramid{
       public static void print(int n){
           for(int i=0;i<n;i++){
               for(int j=n-i;j>1;j--)
                   System.out.print(" ");
               for(int j=0;j<=i;j++)
                   System.out.print("* ");
               System.out.println();
           }
       }
     
       public static void main(String args[]){
           Scanner in = new Scanner(System.in);
           int a;
           System.out.print("Enter no. of * required at base : ");
           a = in.nextInt();
           print(a);
       }
   }
