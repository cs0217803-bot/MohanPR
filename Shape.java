package SAMPLE;

// Interface
interface Shape {

    void area();
}

// Class 1
class Circle implements Shape {

    double radius = 4;

    @Override
    public void area() {

        double result = 3.14 * radius * radius;

        System.out.println("The area of Circle is : " + result);
    }
}

// Class 2
class Rectangle implements Shape {

    int length = 10;
    int width = 4;

    @Override
    public void area() {

        double result = length * width;

        System.out.println("The area of Rectangle is : " + result);
    }
}

// Class 3
class Square implements Shape {

    double side = 4;

    @Override
    public void area() {

        double result = side * side;

        System.out.println("The area of Square is : " + result);
    }
}

// Main Class
public class InterfaceExample {

    public static void main(String[] args) {

        Circle c = new Circle();
        c.area();

        Rectangle r = new Rectangle();
        r.area();

        Square s = new Square();
        s.area();
    }
}
