import java.util.*;

abstract class Bank {
    char bankType;
    double amount, interest;
    boolean platinumCard;
    boolean offerCreditCard;

    abstract void getRoi();

    void deposit() {
        bankType = 'v';
        amount = 0.00;
        interest = 0.0;
        platinumCard = false;
    }
}

class BankDetails extends Bank {
    Scanner sc = new Scanner(System.in);
    double termDeposit = 0;
    int term = 0;

    void getRoi() {
        if (bankType == 'n') {
            platinumCard = false;
            if (term >= 3)
                interest = 0.07 * termDeposit*term;
        } else {
            platinumCard = true;
            if (term >= 3)
                interest = 0.08 * termDeposit*term;
        }
    }

    @Override
    void deposit() {
        System.out.println("Enter the type of bank\n'n' - for Nationalised Bank \n'i' - for International Bank ");
        bankType = sc.next().charAt(0);
        if (bankType == 'n' || bankType == 'i') {
            System.out.print("Enter the amount to be deposited in the bank: ");
            termDeposit = sc.nextDouble();
            System.out.print("Enter the term for which amount has been deposited (in years): ");
            term = sc.nextInt();
            getRoi();
        } else
            System.out.println("Invalid Bank type!");
    }

    void display() {
        String bank;
        if (bankType == 'n')
            bank = "Nationalised Bank";
        else if (bankType == 'i')
            bank = "International Bank";
        else
            bank = "Invalid Bank type";

        System.out.println("Type of Bank: " + bank);
        System.out.println("Amount deposited :Rs."+termDeposit+" for "+term+" years");
        System.out.print("Interest accrued over "+term+" years:  Rs." );
        System.out.printf("%.3f\n",interest);
        if (platinumCard)
            System.out.println("Eligible for platinum card");
        else
            System.out.println("Not eligible for platinum card");
    }
}

public class BankDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of banks: ");
        int n = sc.nextInt();
        BankDetails[] bank = new BankDetails[n];

        for (int i = 0; i < n; i++) {
            bank[i] = new BankDetails();
            System.out.println("Enter the details of Bank " + (i + 1) + ": ");
            bank[i].deposit();
        }

        for (int i = 0; i < n; i++) {
            System.out.println("\n\n______________________________\nDetails of Bank " + (i + 1) + ": ");
            bank[i].display();
        }
    }
}
