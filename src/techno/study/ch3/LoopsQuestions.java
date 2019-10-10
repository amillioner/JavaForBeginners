package techno.study.ch3;

public class LoopsQuestions {




//    Which of these jump statements can skip processing remainder of code in its body for a particular iteration?
//    a) break
//    b) return
//    c) exit
//    d) continue
//    View Answer
//
//    Answer: d
//    Explanation: None.
//
//
//    What is the output of this program?
//
//    class comma_operator {
//        public static void main(String args[])
//        {
//            int sum = 0;
//            for (int i = 0, j = 0; i < 5 & j < 5; ++i, j = i + 1)
//                sum += i;
//            System.out.println(sum);
//        }
//    }
//    a) 5
//    b) 6
//    c) 14
//    d) compilation error
//    View Answer
//
//    Answer: b
//    Explanation: Using comma operator , we can include more than one statement in the initialization and iteration portion of the for loop. Therefore both ++i and j = i + 1 is executed i gets the value – 0,1,2,3,4 & j gets the values -0,1,2,3,4,5.
//    output:
//    $ javac comma_operator.java
//    $ java comma_operator
//6
//
//
//
//
//
//    What is the output of this program?
//
//    class jump_statments {
//        public static void main(String args[])
//        {
//            int x = 2;
//            int y = 0;
//            for ( ; y < 10; ++y) {
//                if (y % x == 0)
//                    continue;
//                else if (y == 8)
//                    break;
//                else
//                    System.out.print(y + " ");
//            }
//        }
//    }
//    a) 1 3 5 7
//    b) 2 4 6 8
//    c) 1 3 5 7 9
//    d) 1 2 3 4 5 6 7 8 9
//    View Answer
//
//    Answer:c
//    Explanation: Whenever y is divisible by x remainder body of loop is skipped by continue statement, therefore if condition y == 8 is never true as when y is 8, remainder body of loop is skipped by continue statements of first if. Control comes to print statement only in cases when y is odd.
//    output:
//    $ javac jump_statments.java
//    $ java jump_statments
//1 3 5 7 9
//
//
//
//
//
//
//
//
//
//    What is the output of this program?
//
//    class Output {
//        public static void main(String args[])
//        {
//            final int a=10,b=20;
//            while(a<b)
//            {
//
//                System.out.println("Hello");
//            }
//            System.out.println("World");
//
//        }
//    }
//    a) Hello
//    b) run time error
//    c) Hello world
//    d) compile time error
//    View Answer
//
//    Answer: d
//    Explanation: Every final variable is compile time constant.
//
//
//
//
//
//
//
//
//
//    What is the output of this program?
//
//    class Output {
//        public static void main(String args[])
//        {
//            int a = 5;
//            int b = 10;
//            first: {
//                second: {
//                    third: {
//                        if (a ==  b >> 1)
//                            break second;
//                    }
//                    System.out.println(a);
//                }
//                System.out.println(b);
//            }
//        }
//    }
//    a) 5 10
//    b) 10 5
//    c) 5
//    d) 10
//    View Answer
//
//    Answer: d
//    Explanation: b >> 1 in if returns 5 which is equal to a i:e 5, therefore body of if is executed and block second is exited. Control goes to end of the block second executing the last print statement, printing 10.
//    output:
//    $ javac Output.java
//    $ java Output
//10
}
