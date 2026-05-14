package sample;

import java.util.Scanner;

class ATM {

    double balance = 10000;

    // Method to check balance
    void checkBalance() {

        System.out.println("Current Balance : " + balance);
    }

    // Method to deposit money
    void deposit(double amount) {

        try {

            if (amount <= 0) {
                throw new IllegalArgumentException("Invalid Deposit Amount");
            }

            balance += amount;

            System.out.println("Amount Deposited is : " + amount);
            System.out.println("Updated Balance is : " + balance);

        } catch (IllegalArgumentException e) {

            System.out.println("Error : " + e.getMessage());

        } finally {

            System.out.println("Deposit Money Operation Completed");
        }
    }

    // Method to withdraw money
    void withdraw(double amount) {

        try {

            if (amount > balance) {
                throw new ArithmeticException("Insufficient Funds in Account");
            }

            if (amount <= 0) {
                throw new IllegalArgumentException("Invalid Withdraw Amount");
            }

            balance -= amount;

            System.out.println("Withdrawal Successfully : " + amount);
            System.out.println("Remaining Balance is : " + balance);

        } catch (ArithmeticException e) {

            System.out.println("Error : " + e.getMessage());

        } catch (IllegalArgumentException e) {

            System.out.println("Error : " + e.getMessage());

        } finally {

            System.out.println("Withdrawal Operation Completed");
        }
    }
}

// Main Class
public class ATMmachine {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // ATM class object creation
        ATM atm = new ATM();

        int choice;

        do {

            try {

                System.out.println("\n========== ATM MACHINE MENU ==========");

                System.out.println("1. Check Balance");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. Exit");

                System.out.print("Enter your choice : ");

                choice = s.nextInt();

                switch (choice) {

                    case 1:

                        atm.checkBalance();
                        break;

                    case 2:

                        System.out.print("Enter the deposit amount : ");

                        double deposit = s.nextDouble();

                        atm.deposit(deposit);

                        break;

                    case 3:

                        System.out.print("Enter the withdraw amount : ");

                        double withdraw = s.nextDouble();

                        atm.withdraw(withdraw);

                        break;

                    case 4:

                        System.out.println("Thank You for using ATM !");
                        break;

                    default:

                        throw new IllegalArgumentException("Invalid Menu Choice");
                }

            } catch (Exception e) {

                System.out.println("Error : " + e.getMessage());

                s.nextLine(); // Clear buffer

                choice = 0;

            } finally {

                System.out.println("Transaction Completed");
            }

        } while (choice != 4);

        s.close();
    }
}
