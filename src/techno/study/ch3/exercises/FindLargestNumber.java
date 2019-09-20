package techno.study.ch3.exercises;
//Find the Largest Number Among Three Numbers
import java.util.Scanner;

public class FindLargestNumber {
    public static void Main(String[] args)
    {
        System.out.println("\n\nFind the Largest Number Among Three Numbers :\n");
        System.out.print("--------------------------------------------------\n");
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a number1: ");
        int A = input.nextInt();
        System.out.print("Enter a number2: ");
        int B = input.nextInt();
        System.out.print("Enter a number3: ");
        int C = input.nextInt();
        System.out.println();

        if (A >= B && A >= C)
            System.out.print(A + " is the largest number.");

        if (B >= A && B >= C)
            System.out.print(B + " is the largest number.");

        if (C >= A && C >= B)
            System.out.print(C + " is the largest number.");
    }
}
