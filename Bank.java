package SAMPLE;

// Abstract class
abstract class Bank {

    String customerName;
    double balance;

    // Method to get customer details
    void getDetails(String name, double bal) {

        customerName = name;
        balance = bal;
    }

    // Abstract method
    abstract void calculateInterest();

    // Method to display details
    void display() {

        System.out.println("Customer Name : " + customerName);
        System.out.println("Balance       : " + balance);
    }
}

// SBI Class
class SBI extends Bank {

    @Override
    void calculateInterest() {

        double interest = balance * 0.05;

        System.out.println("SBI Interest  : " + interest);
    }
}

// HDFC Class
class HDFC extends Bank {

    @Override
    void calculateInterest() {

        double interest = balance * 0.07;

        System.out.println("HDFC Interest : " + interest);
    }
}

// Main Class
public class AbstractBankExample {

    public static void main(String[] args) {

        SBI s = new SBI();

        s.getDetails("Rohan", 2000);
        s.display();
        s.calculateInterest();

        System.out.println("--------------------");

        HDFC h = new HDFC();

        h.getDetails("ABC", 2000);
        h.display();
        h.calculateInterest();
    }
}
