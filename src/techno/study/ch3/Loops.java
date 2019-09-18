package techno.study.ch3;

/**
 * Loops: while, do-while, for
 * break, continue
 * nested loops
 */
public class Loops {

    public static void main(String[] args) {

        // While loop
        int a = 0;
        while (a < 5) {
            System.out.println("while: " + a);
            a++;
        }

        // do-while loop
        a = 0;
        do {
            System.out.println("do-while: " + a);
            a++;
        } while (a < 0);

        // for loop
        for (int i = 0; i < 10; i++) {
            System.out.println("for: " + i);
        }

        // break infinite loop
        int n = 0;
        while (true) {
            System.out.println("going to moon");
            if (n > 10) {
                break;
            }
        }

        // continue
        for (int i = 0; i < 10; i++) {
            if (i < 8) {
                continue;
            }
            System.out.println("for: " + i);
        }

        // loops inside loops
        for (int i = 0; i < 3; i++) {
            while (true){

            }
        }

        // naming loop
        FIRST_LOOP:
        for (int i = 0; i < 10; i++) {
            secondLoop:
            for (int j = 0; j < 10; j++) {
                System.out.println(i + " " + j);
                if (j == 2) {
                    break FIRST_LOOP;
                }
            }
        }
    }

    //TODO Task
    // 1. write program that prints this using loops
    //    *
    //    **
    //    ***
    //    ****
    //    *****
    // 2. write program that prints this figures using loops
    //        *
    //       **
    //      ***
    //     ****
    //    *****
    //      *
    //     * *
    //    *   *
    //     * *
    //      *
    // 3. Make interactive calculator ¯\_(ツ)_/¯
}
