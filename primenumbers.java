// Generate prime numbers for the given range.
import java.util.*;
import java.util.Scanner;
public class primenumbers{
   public static void main(String args[]){
     Scanner in = new Scanner(System.in);
     int n1, n2, i, j, flag;
     System.out.print("Enter the lower no. of interval : ");
     n1 = in.nextInt();
     System.out.print("Enter the higher no. of interval : ");
     n2 = in.nextInt();
     System.out.println("Prime no. between "+n1+" and "+n2+" are : ");
     for(i=n1;i<=n2;i++){
         if(i==1 || i==0)
             continue;
         flag = 1;
         for(j=2;j<=i/2;j++){
             if(i%j == 0){
                 flag = 0;
                 break;
             }
         }
         if(flag == 1)
             System.out.print(i+" ");
     }
   }
}
