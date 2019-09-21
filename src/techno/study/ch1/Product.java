package techno.study.ch1;
// Ex. 2.6: Product.java
// Calculate the product of three integers.

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        // create Scanner to obtain input from command window
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: "); // prompt for input
        int x = input.nextInt(); // read first integer

        System.out.print("Enter second integer: "); // prompt for input
        int y = input.nextInt(); // read second integer

        System.out.print("Enter third integer: "); // prompt for input
        int z = input.nextInt(); // read third integer

        int result = x * y * z; // calculate product of numbers

        System.out.printf("Product is %d%n", result);
    } // end method main
} // end class Product