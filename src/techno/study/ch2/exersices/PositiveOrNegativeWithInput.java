package techno.study.ch2.exersices;

import java.util.Scanner;


//Example 2: Check whether the input number(entered by user) is positive or negative
//        Here we are using Scanner to read the number entered by user and then the program checks and displays the result.

public class PositiveOrNegativeWithInput {

    public static void main(String[] args)
    {
        int number;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number you want to check:");
        number = scan.nextInt();
        scan.close();
        if(number > 0)
        {
            System.out.println(number+" is positive number");
        }
        else if(number < 0)
        {
            System.out.println(number+" is negative number");
        }
        else
        {
            System.out.println(number+" is neither positive nor negative");
        }
    }
}