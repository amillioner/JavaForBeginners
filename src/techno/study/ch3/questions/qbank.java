package techno.study.ch3.questions;

//Output of Java Programs | Set 37 (If-else)
//Prerequisite: if else, for loops
//
//1. What will be the output for the following program?
class Test1 {
    public static void main(String[] args) {
        for (; ; )
            System.out.println("TECHNO");
    }
}

//Options:
//        1.TECHNO
//        2.Compile time error
//        3.Run time Exception
//        4.TECHNO (Infinitely)
//
//        The answer is option (4)
//        Explanation: In the above example, we are using for loop. In for loop if we did not provide any initialization, condition-check and increment/decrement part then it will go to infinite loop if we did not provide any condition in statement.
//
//2. What will be the output for the following program?
class Test2 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; )
            System.out.println("TECHNO");
    }
}
//Options:
//        1.TECHNO TECHNO TECHNO
//        2.Compile time error
//        3.TECHNO (Infinitely)
//        4.No output
//
//        The answer is option (3)
//        Explanation: When we are not taking any statement in increment/decrement section therefore overtime it does not increment/decrement the value of I and the condition always true. That’s why it results into TECHNO (Infinitely).
//
//3. What will be the output for the following program?

class Test3 {
    public static void main(String[] args) {
        boolean b = true;
        if (b = false) {
            System.out.println("HELLO");
        } else {
            System.out.println("BYE");
        }
    }
}

//Option:
//        1.HELLO
//        2.BYE
//        3.Compile time error: re- initialization
//        4.No output
//
//        The answer is option (2)
//        Explanation : In the condition of if statement, we assigning are false to b which return a boolean value which is false. Therefore the control goes to the else part and the output is BYE.
//
//4. What will be the output for the following program?
class Test4 {
    public
    static void main(String[] args) {
        int a = 10, b = 20;
        if (a < b) {
            if (a > b) {
                System.out.println("HELLO TECHNO");
            } else {
                System.out.println("WELCOME");
            }
        }
    }
}
//Option:
//        1.HELLO TECHNO
//        2.WELCOME
//        3.Compile time error
//        4.HELLO TECHNO WELCOME
//
//        The answer is option (2)
//        Explanation: Here we are defining nested if and a single else part. In java, there is no dangling else problem in java. Every else is mapped to the nearest if statement. Therefore the else part belongs to if(x>y) in the above program, which returns false that’s why control goes to else part and the output is WELCOME.
//
//5. What will be the output for the following program?

class Test5 {
//    public static void main(String[] args) {
//        for (int i = 0; ; i++) {
//            System.out.println("HIII");
//        }
//        System.out.println("BYE");
//    }
}
//Options:
//1. HIII
//2. HIII(infinitely)
//3. BYE
//4. Compile time error
//
//The answer is option (4)
//Explanation: In the above for loop it will go for infinite loop and the above program does not give any chance to the next lines of the program. That’s why compiler will give compile time error saying error: unreachable statement.