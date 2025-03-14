import java.util.Arrays;
import java.util.Scanner;
//Using inbuilt sort function of Array class in java.util package
class MergeArray {
    // Class array variables to store the arrays
    int[] array1;
    int[] array2;
	
//Default constructor which does nothing except create objects.
//Trying removing this default constructor and check what happens when compiled.
	MergeArray()
	{}
    //Parameterized Constructor to initialize the arrays
    MergeArray(int[] a, int[] b) {
        array1 = a;
        array2 = b;
    }

    // Method to merge both arrays
    public int[] merging() {
        int aLength = array1.length;
        int bLength = array2.length;
        int[] c = new int[aLength + bLength];

        // Merging array1 into mergedArray
        for (int i = 0; i < aLength; i++) {
            c[i] = array1[i];
        }

        // Merging array2 into mergedArray
        for (int i = 0; i < bLength; i++) {
            c[aLength + i] = array2[i];
        }

        return c;
    }

    // Method to sort the merged array
    public int[] sortArray(int[] A) {
        Arrays.sort(A); // Sorts in ascending order
        return A;
    }

    // Method to display the elements of an array
    public void displayArray(int[] A) {
        for (int i : A) {
            System.out.print(i + " ");
        }
        System.out.println(); // Newline after printing the array
    }

    // Method to take input from the user for an array
    public int[] takeInput(String statement, Scanner scanner) {
        System.out.println(statement);
        int n = scanner.nextInt(); // Size of the array
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements in unsorted order:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    // Main method to test the class functionality
    public static void main(String[] args) {
	MergeArray Obj1 = new MergeArray();
	MergeArray Obj2 = new MergeArray();
        Scanner input = new Scanner(System.in);

        // Take input for both arrays
        int[] a = Obj1.takeInput("Enter the number of elements for the first array:", input);
        int[] b = Obj2.takeInput("Enter the number of elements for the second array:", input);

        // Create an object of MergeArrays
        MergeArray Obj = new MergeArray(a, b);

        // Merge the arrays
        int[] d = Obj.merging();

        // Sort the merged array
        int[] sortedArray = Obj.sortArray(d);

        // Display the sorted array
        System.out.print("Sorted Merged Array: ");
        Obj.displayArray(sortedArray);

        
    }
}
