package techno.study.ch3;

/**
 * another way to represent if-else statements
 */
public class SwitchStatement {

    public static void main(String[] args) {
        String grade = "A";

        if (grade.equals("A")) {
            System.out.println("Excellent");
        } else if (grade.equals("B+") || grade.equals("B") || grade.equals("B-")) {
            System.out.println("Good");
        } else if (false) { // and more cases
        }

        switch (grade) {
            case "A":
                System.out.println("Excellent");
                break;
            case "B+":
            case "B":
            case "B-":
                System.out.println("Good");
                break;
            case "C+":
            case "C":
            case "C-":
                System.out.println("Ok");
                break;
            case "D":
                System.out.println("Pass");
                break;
            case "F":
                System.out.println("Fail");
                break;
            default:
                System.out.println("Provided grade is not supported");
                break;
        }

        //TODO Task
        //  write program that prints word representation of number N, where number is 0 <= N < 10


    }
}
