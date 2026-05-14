package OOP;

import java.util.Scanner;

public class ECommerceOrderProcessing {

    static class Product {

        int id;
        String name;
        double price;
        int quantity;

        // Default Constructor
        Product() {
            id = 0;
            name = "Unknown";
            price = 0;
            quantity = 0;
        }

        // Parameterized Constructor
        Product(int id, String name, double price, int quantity) {
            this.id = id;
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        // Method to calculate total price
        double getTotal() {
            return price * quantity;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        sc.nextLine();

        Product[] products = new Product[n];

        double grandTotal = 0;

        // Input product details
        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter details for product " + (i + 1));

            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            products[i] = new Product(id, name, price, quantity);

            grandTotal += products[i].getTotal();
        }

        // Discount calculation
        double discount = 0;

        if (grandTotal > 5000) {
            discount = grandTotal * 0.20;
        }
        else if (grandTotal > 2000) {
            discount = grandTotal * 0.10;
        }

        double finalAmount = grandTotal - discount;

        // Bill display
        System.out.println("\n===== BILL =====");

        for (int i = 0; i < n; i++) {

            System.out.println(
                products[i].name +
                " | Price: " + products[i].price +
                " | Qty: " + products[i].quantity +
                " | Total: " + products[i].getTotal()
            );
        }

        System.out.println("----------------------");
        System.out.println("Grand Total: " + grandTotal);
        System.out.println("Discount: " + discount);
        System.out.println("Final Amount: " + finalAmount);

        sc.close();
    }
}

