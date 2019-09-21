package techno.study.ch3;


/**
 * if , else if, else
 */
public class IfElseStatement {

    public static void main(String[] args) {

        int number = 10;
        if (number > 0) {
            System.out.println("Number is positive.");
        }
        System.out.println("This statement is always executed.");


        int grade = 4; // 5, 4, 3, 2

        if (grade == 5) {
            System.out.println("Excellent");
        } else if (grade > 2) {
            System.out.println("Ok");
        } else {
            System.out.println("Fail");
        }


        boolean isSleeping = true;
        if (!isSleeping) {
            System.out.println("Awake");
        } else {
            System.out.println("Sleeping");
        }
    }

    //TODO
    //  0. check whether number is even or odd
    //   ex: 2 => Even, 3 => Odd
    //  1. find lowest in the following numbers, using if-else statements
    //   a = 12*34, b = 45*28
    //  2. find highest  in the following numbers, using if-else statements
    //   a = 12*34, b = 45*28, c = 32*24


}
