package techno.study.ch5.abstraction;

public class AbstractExample {

    static class GFG1 {
        public static void main(String[] args) {

            // creating the Object of Rectangle class
            // and using shape class reference.
            Shape1 rect = new Rectangle1(2, 3, "Rectangle");
            System.out.println("Area of rectangle: " + rect.area());
            rect.moveTo(1, 2);

            System.out.println(" ");

            // creating the Objects of circle class
            Shape1 circle = new Circle1(2, "Cicle");
            System.out.println("Area of circle: " + circle.area());
            circle.moveTo(2, 4);

        }
    }

    static class Circle1 extends Shape1 {

        double pi = 3.14;
        int radius;

        //constructor
        Circle1(int radius, String name) {

            super(name);
            this.radius = radius;
        }

        @Override
        public void draw() {

            System.out.println("Circle has been drawn ");
        }

        @Override
        public double area() {
            return (double) ((pi * radius * radius) / 2);
        }
    }

    static class Rectangle1 extends Shape1 {

        int length, width;

        // constructor
        Rectangle1(int length, int width, String name) {

            super(name);
            this.length = length;
            this.width = width;
        }

        @Override
        public void draw() {
            System.out.println("Rectangle has been drawn ");
        }

        @Override
        public double area() {
            return (double) (length * width);
        }
    }

    // abstract class
    abstract static class Shape1 {
        // declare fields
        String objectName = " ";

        Shape1(String name) {
            this.objectName = name;
        }

        // declare non-abstract methods
        // it has default implementation
        public void moveTo(int x, int y) {
            System.out.println(this.objectName + " " + "has been moved to"
                    + " x = " + x + " and y = " + y);
        }

        // abstract methods which will be
        // implemented by its subclass(es)
        abstract public double area();

        abstract public void draw();
    }
}
