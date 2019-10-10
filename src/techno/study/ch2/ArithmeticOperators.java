package techno.study.ch2;

/**
 * addition, subtraction, multiplication, division, modulo (the modulo operation finds the remainder after division of one number by another), parentheses
 * +, -, *, /, %, ( )
 * <p>
 * TODO difference between pre increment, post increment
 * making integer Double D, Float F, Long L
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
//
//
//    Which of the following can be operands of arithmetic operators?
//        a) Numeric
//        b) Boolean
//        c) Characters
//        d) Both Numeric & Characters
//        View Answer
//        Answer:d
//        Explanation: The operand of arithmetic operators can be any of numeric or character type, But not boolean.
//
//
//        Modulus operator, %, can be applied to which of these?
//        a) Integers
//        b) Floating – point numbers
//        c) Both Integers and floating – point numbers.
//        d) None of the above
//        View Answer
//
//        Answer:c
//        Explanation: Modulus operator can be applied to both integers and floating point numbers.
//
//
//        With x = 0, which of the following are legal lines of Java code for changing the value of x to 1?
//        1. x++;
//        2. x = x + 1;
//        3. x += 1;
//        4. x =+ 1;
//        a) 1, 2 & 3
//        b) 1 & 4
//        c) 1, 2, 3 & 4
//        d) 3 & 2
//        View Answer
//
//        Answer: c
//        Explanation: Operator ++ increases value of variable by 1. x = x + 1 can also be written in shorthand form as x += 1. Also x =+ 1 will set the value of x to 1.
//
//
//
//        Decrement operator, --, decreases value of variable by what number?
//        a) 1
//        b) 2
//        c) 3
//        d) 4
//        View Answer
//
//        Answer: a
//        Explanation: None.
//
//
//
//
//
//        What is the output of this program?
//
//class increment {
//    public static void main(String args[])
//    {
//        double var1 = 1 + 5;
//        double var2 = var1 / 4;
//        int var3 = 1 + 5;
//        int var4 = var3 / 4;
//        System.out.print(var2 + " " + var4);
//
//    }
//}
//a) 1 1
//        b) 0 1
//        c) 1.5 1
//        d) 1.5 1.0
//        View Answer
//
//        Answer:c
//        Explanation: None
//        output:
//        $ javac increment.java
//        $ java increment
//        1.5 1
//
//
//        What is the output of this program?
//
//class Output {
//    public static void main(String args[])
//    {
//        int a = 1;
//        int b = 2;
//        int c;
//        int d;
//        c = ++b;
//        d = a++;
//        c++;
//        b++;
//        ++a;
//        System.out.println(a + " " + b + " " + c);
//    }
//}
//a) 3 2 4
//        b) 3 2 3
//        c) 2 3 4
//        d) 3 4 4
//        View Answer
//
//        Answer: d
//        Explanation: None.
//        output:
//        $ javac Output.java
//        $ java Output
//        3 4 4