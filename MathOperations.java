package OOP;

class MathOperations {

    // Method to calculate power using integer values
    void power(int num1, int num2) {

        double result = Math.pow(num1, num2);

        System.out.println("Power : " + result);
    }

    // Method to calculate power using double values
    void power(double num1, double num2) {

        double result = Math.pow(num1, num2);

        System.out.println("Power : " + result);
    }

    // Method to find absolute value of integer
    void absolute(int num) {

        double result = Math.abs(num);

        System.out.println("Absolute : " + result);
    }

    // Method to find absolute value of double
    void absolute(double num) {

        double result = Math.abs(num);

        System.out.println("Absolute : " + result);
    }
}

public class OVERLOADING {

    public static void main(String[] args) {

        MathOperations obj = new MathOperations();

        obj.power(10, 2);
        obj.power(40, 2);

        obj.absolute(-22);
        obj.absolute(-12.20);
    }
}
