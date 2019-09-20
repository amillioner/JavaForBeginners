package techno.study.ch2.exersices;

import java.io.Console;
import java.util.Scanner;

public class ThreeNumbersSum {

    public static int sum(int num1, int num2, int num3)
    {
        int total;
        total = num1 + num2 + num3;
        return total;
    }
    public static void Main(String[] args)
    {
        System.out.println("\n\nFunction to calculate the sum of two numbers :\n");
        System.out.print("--------------------------------------------------\n");
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a number1: ");
        int n1 = input.nextInt();
        System.out.print("Enter a number2: ");
        int n2 = input.nextInt();
        System.out.print("Enter a number3: ");
        int n3 = input.nextInt();
        System.out.println();
        System.out.println("\nThe sum of three numbers is : {0} \n");
        System.out.println(sum(n1, n2, n3));
    }
}

