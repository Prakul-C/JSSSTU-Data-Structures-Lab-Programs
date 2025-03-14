import java.util.*;
import java.util.Scanner;
class CUBE{
    Scanner in = new Scanner(System.in);
    int vol, out_ar, j=1, k=1;
    int[] a = new int[20];
    void read(int n){
        for(int i=0; i<n; i++){
            System.out.print("Enter the length of side of cube-"+j+" : ");
            a[i] = in.nextInt();
            j++;
        }
    }
    void calculate(int n){
        for(int i=0; i<n;i++){
            vol = a[i]*a[i]*a[i];
            out_ar = 6*a[i]*a[i];
            System.out.println("Vole=ume of cube-"+k+" = "+vol);
            System.out.println("Outer area of cube-"+k+" = "+out_ar);
            k++;
        }
    }
}
public class Cubes{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n;
        System.out.print("Enter no. of cubes : ");
        n = in.nextInt();
        CUBE cube = new CUBE();
        cube.read(n);
        cube.calculate(n);
    }
}
