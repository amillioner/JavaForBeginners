package techno.study.ch2;

/**
 * addition, subtraction, multiplication, division, modulo (the modulo operation finds the remainder after division of one number by another), parentheses
 * +, -, *, /, %, ( )
 * <p>
 * TODO difference between pre increment, post increment
 *  making integer Double D, Float F, Long L
 *
 */
public class ArithmeticOperators {

    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a % b);
        System.out.println(a % b);
        System.out.println((a + b) / 3);

        System.out.println(a);
        System.out.println(a++);

        System.out.println(a);
        System.out.println(++a);

        b--;
        --b;

        a += 1;
        b -= 10;

        double d = 100D / 3;

        long l = 40L;
        System.out.println(d);
    }

    // TODO TAKS
    //   do some math, get average of several numbers
    //   ex: 23.4 24.0 12 450.3 123000.234
}
