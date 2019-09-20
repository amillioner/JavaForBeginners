package techno.study.ch2.exersices;

import java.util.Scanner;

public class PositveOrNegative
{
    public static void main(String[] args)
    {
        int number=109;
        if(number > 0)
        {
            System.out.println(number+" is a positive number");
        }
        else if(number < 0)
        {
            System.out.println(number+" is a negative number");
        }
        else
        {
            System.out.println(number+" is neither positive nor negative");
        }
    }
}
