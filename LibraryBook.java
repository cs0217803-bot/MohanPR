package OOP;

import java.util.Scanner;

class LibraryBook {

    int bookId;
    String bookName;
    String author;
    boolean issue = false;

    static int totalBooks = 0;

    // Method to add book
    void addBook(int id, String name, String authorName) {

        bookId = id;
        bookName = name;
        author = authorName;

        totalBooks++;

        System.out.println("Book added successfully");
    }

    // Method to issue book
    void issueBook() {

        if (!issue) {

            issue = true;

            System.out.println("Book issued successfully");
        }
        else {

            System.out.println("Book is already issued");
        }
    }

    // Method to return book
    void returnBook() {

        if (issue) {

            issue = false;

            System.out.println("Book returned successfully");
        }
        else {

            System.out.println("Book was not issued");
        }
    }

    // Display book details
    void display() {

        System.out.println("Book Id    : " + bookId);
        System.out.println("Book Name  : " + bookName);
        System.out.println("Author     : " + author);
        System.out.println("Status     : " + (issue ? "Issued" : "Available"));
    }

    // Static method to display total books
    static void totalBookCount() {

        System.out.println("Total Books are : " + totalBooks);
    }
}

public class Library {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LibraryBook book = new LibraryBook();

        int choice;

        do {

            System.out.println("\n===== Library Management System =====");

            System.out.println("1. Add Book");
            System.out.println("2. Display Book");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Total Books");
            System.out.println("6. Exit");

            System.out.print("Enter your choice : ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Book Id : ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Book Name : ");
                    String name = sc.nextLine();

                    System.out.print("Enter Author Name : ");
                    String author = sc.nextLine();

                    book.addBook(id, name, author);

                    break;

                case 2:

                    book.display();

                    break;

                case 3:

                    book.issueBook();

                    break;

                case 4:

                    book.returnBook();

                    break;

                case 5:

                    LibraryBook.totalBookCount();

                    break;

                case 6:

                    System.out.println("Exiting program...");

                    break;

                default:

                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 6);

        sc.close();
    }
}
