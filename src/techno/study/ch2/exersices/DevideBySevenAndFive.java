package techno.study.ch2.exersices;

import java.util.Scanner;

//  Write a Boolean expression to check that an integer is divisible by 5 and 7 by no remainder.

public class DevideBySevenAndFive
{
    public static void Main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your number:");
        double n = scan.nextInt();
        scan.close();

        boolean result = (n % 5 == 0) && (n % 7 == 0);
        System.out.print("The number " + n + " can be divided by 5 and 7? ANSWER: " + result);
    }
}