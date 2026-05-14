package pract9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("1. Add");
            System.out.println("2. View");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Exit");

            System.out.print("Enter your choice : ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Name : ");
                    String name = sc.next();

                    System.out.print("Enter Department : ");
                    String dept = sc.next();

                    System.out.print("Enter Salary : ");
                    double salary = sc.nextDouble();

                    EmployeeDAO.addEmployee(
                        new Employee(name, dept, salary)
                    );

                    break;

                case 2:

                    EmployeeDAO.viewEmployees();

                    break;

                case 3:

                    System.out.print("Enter ID : ");
                    int id = sc.nextInt();

                    System.out.print("Enter New Salary : ");
                    double sal = sc.nextDouble();

                    EmployeeDAO.updateEmployee(id, sal);

                    break;

                case 4:

                    System.out.print("Enter ID : ");
                    int del = sc.nextInt();

                    EmployeeDAO.deleteEmployee(del);

                    break;

                case 5:

                    System.out.println("Exiting Program...");
                    System.exit(0);

                    break;

                default:

                    System.out.println("Invalid Choice!");
            }
        }
    }
}
