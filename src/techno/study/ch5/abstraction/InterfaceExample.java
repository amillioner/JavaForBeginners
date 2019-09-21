package techno.study.ch5.abstraction;

// Java program to illustrate the
// concept of interface

import java.io.*;

public class InterfaceExample {
    interface Shape2 {
        // abstract method
        void draw();

        double area();
    }

    static class Rectangle2 implements Shape2 {
        int length, width;

        // constructor
        Rectangle2(int length, int width) {
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

    static class Circle2 implements Shape2 {

        double pi = 3.14;
        int radius;

        //constructor
        Circle2(int radius) {

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

    static class GFG2 {
        public static void main(String[] args) {

            // creating the Object of Rectangle class
            // and using shape interface reference.
            Shape2 rect = new Rectangle2(2, 3);
            System.out.println("Area of rectangle: " + rect.area());

            // creating the Objects of circle class
            Shape2 circle = new Circle2(2);
            System.out.println("Area of circle: " + circle.area());
        }
    }
}
