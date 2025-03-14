
/** Java program to take details of Books and print the output
    Name of the program: _8GetBook.java
*/

import java.util.Scanner;

class Book {
    Scanner sc = new Scanner(System.in);

    String name;
    int code, quantity;
    double unitPrice, totalPrice;

    void inputData() {
        System.out.print("Enter the name of the Book: ");
        name = sc.nextLine();
        System.out.print("Enter the code of Book: ");
        code = sc.nextInt();
        System.out.print("Enter the Price of Book: ");
        unitPrice = sc.nextDouble();
        System.out.print("Enter the number of Books: ");
        quantity = sc.nextInt();

        totalPrice = quantity * unitPrice;
    }

    void outputData() {
        System.out.println(name + "\t" + code + "\t" + unitPrice + "\t\t" + quantity + "\t\t" + totalPrice);
    }
}

public class GetBookDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of Books: ");
        int u = sc.nextInt();

        Book[] books = new Book[u];
        for (int i = 0; i < u; i++) {
            books[i] = new Book();
            System.out.println("\nEnter the details of Book- " + (i + 1));
            books[i].inputData();
        }

        System.out.println("\nName\tCode\tUnitPrice\tQuantity\tTotalPrice");
        for (int i = 0; i < u; i++)
            books[i].outputData();

        sc.close();
    }
}

/*
 * Sample Output:
 * 
 * Enter the number of Books: 2
 * 
 * Enter the details of Book- 1
 * Enter the name of the Book: Java
 * Enter the code of Book: 1024
 * Enter the Price of Book: 100
 * Enter the number of Books: 5
 * 
 * Enter the details of Book- 2
 * Enter the name of the Book: ansiC
 * Enter the code of Book: 1045
 * Enter the Price of Book: 50
 * Enter the number of Books: 6
 * 
 * Name Code UnitPrice Quantity TotalPrice
 * Java 1024 100.0 5 500.0
 * ansiC 1045 50.0 6 300.0
 * 
 */
