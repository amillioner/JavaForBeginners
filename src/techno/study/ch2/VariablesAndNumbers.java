package techno.study.ch2;

public class VariablesAndNumbers {

//    1. What is the range of short data type in Java?
//    a) -128 to 127
//    b) -32768 to 32767
//    c) -2147483648 to 2147483647
//    d) None of the mentioned
//
//    Answer:b
//    Explanation:Short occupies 16 bits in memory. Its range is from -32768 to 32767.
//    Wrong Explanation: That is not correct.
//
//
//
//    2. What is the range of byte data type in Java?
//    a) -128 to 127
//    b) -32768 to 32767
//    c) -2147483648 to 2147483647
//    d) None of the mentioned
//    View Answer
//
//    Answer:a
//    Explanation:Byte occupies 8 bits in memory. Its range is from -128 to 127.
//
//
//            3. Which of the following are legal lines of Java code?
//            1. int w = (int)888.8;
//2. byte x = (byte)100L;
//3. long y = (byte)100;
//4. byte z = (byte)100L;
//    a) 1 and 2
//    b) 2 and 3
//    c) 3 and 4
//    d) All statements are correct.
//    View Answer
//
//    Answer: d
//    Wrong Answer Explanation: That is only partially correct.
//            Explanation:Statements (1), (2), (3), and (4) are correct. (1) is correct because when a floating-point number (a double in this case) is cast to an int, it simply loses the digits after the decimal.(2) and (4) are correct because a long can be cast into a byte. If the long is over 127, it loses its most significant (leftmost) bits.(3) actually works, even though a cast is not necessary, because a long can store a byte.
//
//
//
//    What is the output of this program?
//
//    class increment {
//        public static void main(String args[])
//        {
//            int g = 3;
//            System.out.print(++g * 8);
//        }
//    }
//    a) 25
//    b) 24
//    c) 32
//    d) 33
//    View Answer
//
//    Answer:c
//    Explanation:Operator ++ has more preference than *, thus g becomes 4 and when multiplied by 8 gives 32.
//    output:
//    $ javac increment.java
//    $ java increment
//32
//
//
//
//
//    What is the output of this program?
//
//    class area {
//        public static void main(String args[])
//        {
//            double r, pi, a;
//            r = 9.8;
//            pi = 3.14;
//            a = pi * r * r;
//            System.out.println(a);
//        }
//    }
//    a) 301.5656
//    b) 301
//    c) 301.56
//    d) 301.56560000
//    View Answer
//
//    Answer:a
//    Explanation:None.
//            output:
//    $ javac area.java
//    $ java area
//301.5656
}
