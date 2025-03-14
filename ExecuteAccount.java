/** 2)  Define a class to represent a bank ACCOUNT and include the following members:
         I.Data Members(States):
             a) Name of Depositor
             b) Account number
             c) Type of Account
             d) Balance amount in the account
         II. Member Methods(Behaviors):
             a) To assign initial values
             b) To deposit an amount
             c) To withdraw an amount after checking for the balance
             d) To display name & balance
         III. Define EXECUTEACCOUNT class that defines main method to test above class.
         IV. In the above class, maintain the total number of account holders present in the bank and also define a
                method to define it. Change the main method appropriately.
         V. In main method of EXECUTEACCOUNT class, define an array to handle five accounts.
         VI. In ACCOUNT class constructor, demonstrate the use of “this” keyword

    Name of the program: ExecuteAccount.java
 */

import java.util.*;

class Account {
    private int AccNo;
    private String name;
    private double balance;
    private String AccType;
    Scanner sc = new Scanner(System.in);

    Account() {
        AccNo = 0;
        name = "";
        balance = 0.0;
        AccType = "";
    }

    void getDetails() {
        System.out.print("Enter account holder's name: ");
        name = sc.next();
        System.out.print("Enter Account Number: ");
        AccNo = sc.nextInt();
        System.out.print("Enter the balance amount: ");
        balance = sc.nextDouble();
        System.out.print("Enter account type: ");
        AccType = sc.next();
    }

    void printDetails() {
        System.out.println("Acc No\tName\tBalance amount\tType of account");
        System.out.println(AccNo + "\t\t" + name + "\t\t" + balance + "\t\t" + AccType);
    }

    void deposit() {
        double amt;
        System.out.print("\nEnter the amount to be deposited: ");
        amt = sc.nextDouble();
        balance += amt;
        System.out.print("\nAmount deposited successfully....\nCurrent Balance: " + balance);
    }

    void withdrawal() {
        double amt;
        System.out.print("\nEnter the amount to be withdrawn: ");
        amt = sc.nextDouble();
        if (balance >= amt) {
            balance -= amt;
            System.out.print("Transaction successful......\nCurrent Balance: " + balance);
        } else {
            System.out.print("\nInsufficient balance in account....\nTransaction failed.....");
        }
    }

    boolean search(int acn) {
        if (AccNo == acn) {
            printDetails();
            return true;
        }
        return false;
    }
}

public class ExecuteAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the number of account holders: ");
        int n = sc.nextInt();
        Account[] holder = new Account[n];

        for (int i = 0; i < n; i++) {
            holder[i] = new Account();
            System.out.println("For Account~" + (i + 1) + " >>>");
            holder[i].getDetails();
        }

        int choice;
        do {
            System.out.println(
                    "\n\n********* Main Menu **********\n\nEnter\n1. To display all details of account holder");
            System.out.println("2. Search details by account number\n3. To deposit amount\n4. To withdraw the amount");
            System.out.println("5. To exit from the program\n");

            System.out.print("Enter your Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    for (int i = 0; i < n; i++)
                        holder[i].printDetails();
                    break;
                case 2:
                    System.out.print("\nEnter the account number: ");
                    int acn = sc.nextInt();
                    boolean found = false;
                    for (int i = 0; i < n; i++) {
                        found = holder[i].search(acn);
                        if (found)
                            break;
                    }
                    if (!found) {
                        System.out.print("\nSearch failed.....\nAccount doesn't exists");
                    }
                    break;

                case 3:
                    System.out.print("\nEnter the account number: ");
                    int ac = sc.nextInt();
                    boolean dep = false;
                    for (int i = 0; i < n; i++) {
                        dep = holder[i].search(ac);
                        if (dep) {
                            holder[i].deposit();
                            break;
                        }
                    }
                    if (!dep) {
                        System.out.print("\nSearch failed....\nAccount doesn't exits");
                    }
                    break;

                case 4:
                    System.out.print("\nEnter account number: ");
                    int acc = sc.nextInt();
                    boolean fou = false;
                    for (int i = 0; i < n; i++) {
                        fou = holder[i].search(acc);
                        if (fou) {
                            holder[i].withdrawal();
                            break;
                        }
                    }
                    if (!fou) {
                        System.out.print("\nSearch failed.....\nAccount doesn't exists");
                    }
                    break;

                case 5:
                    System.out.print("Thank you.....");
                    break;
            }

        } while (choice != 5);
      //  sc.close();
    }
}
