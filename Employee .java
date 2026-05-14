package OOP;

class Employee {

    int empID;
    String name;

    // Method to get employee details
    void getEmployee(int id, String n) {

        empID = id;
        name = n;
    }

    // Method to display employee details
    void displayEmployee() {

        System.out.println("Employee ID   : " + empID);
        System.out.println("Employee Name : " + name);
    }
}

class Salary extends Employee {

    double salary;

    // Method to get salary
    void getSalary(double s) {

        salary = s;
    }

    // Method to display salary
    void displaySalary() {

        System.out.println("Employee Salary : " + salary);
    }
}

// Main class
public class SingleInheritance {

    public static void main(String[] args) {

        Salary obj = new Salary();

        obj.getEmployee(101, "aaa");
        obj.displayEmployee();

        obj.getSalary(20000);
        obj.displaySalary();
    }
}
