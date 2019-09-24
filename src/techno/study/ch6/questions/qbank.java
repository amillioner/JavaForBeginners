package techno.study.ch6.questions;

//Output of Java Programs | Set 41 (try-catch)
//Prerequisite : try-catch, Exception Handling
//
//1. What will be the output of the following program?
class Test1 {
    public static void main(String[] args) {
        try {
            System.out.println(1 / 0);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}

//Options:
//1. java.lang.ArithmeticExcetion
//2. / by zero
//3. java.lang.ArithmeticExcetion:/ by zero
//4. ArithmeticExcetion
//
//The answer is option (2)
//Explanation: In the above program, we are calling getMessage() method to print the exception information. We know that getMessage() method will always be printed as the description of the exception which is / by zero.
//
//2. What will be the output of the following program?
class Test2 {
    public static void main(String[] args) {
        try {
            System.out.println(1 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Hello Test");
        } catch (Exception e) {
            System.out.println("Welcome");
        }
    }
}
//Options:
//1. Hello Test
//2. No Output
//3. Compile-time error
//4. welcome
//
//The answer is option (1)
//Explanation: In the above program, we are following the approach of try with multiple catch blocks. Here 1/0 is an ArithmeticException, which is cought by the first catch block and it is executed.
//
//3. What will be the output of the following program?

class Test3 {
//        public static void main(String[] args) {
//            try {
//                System.out.println(1 / 0);
//            } catch (Exception e) {
//                System.out.println("Hello Test");
//            } catch (ArithmeticException e) {
//                System.out.println("Welcome");
//            }
//        }
}

//Options:
//1. Hello Test
//2. No Output
//3. Compile-time error
//4. welcome
//
//The answer is option (3)
//Explanation: If we are trying try with multiple catch block then we should take care that the child class catch block is first then parent class catch block.
// Otherwise we will get compile time error saying error: exception ArithmeticException has already been caught.
//
//4. What will be the output of the following program?
class Test4 {
//        public static void main(String[] args) {
//            try {
//                System.out.println(1 / 0);
//            }
//        }
}
//Options:
//1. Run-time Exception
//2. Compile-time error
//3. No Output
//4. Compile-time Exception
//
//The answer is option (2)
//Explanation: In the above program, we are declaring a try block without any catch or finally block. We have to always declare try with catch or finally block because single try block is invalid. That’s Why it will give compile time error saying error: ‘try’ without ‘catch’, ‘finally’ or resource declarations.

//5. What will be the output of the following program?
class Test5 {
//        public static void main(String[] args) {
//            try {
//                System.out.println(1 / 0);
//            }
//            System.out.println("Hello TEST");
//        catch(ArithmeticException e)
//            {
//                System.out.println("Welcome");
//            }
//        }
}
//Options:
//1. Hello Test5
//2. Hello Test
//Welome
//3. Run-time Exception
//4. Compile-time error
//
//The answer is option (4)
//Explanation: In the above program, we are declaring a try block and also a catch block but both are separated by a single line which will cause compile time error:
//
//prog.java:5: error: 'try' without 'catch', 'finally' or resource declarations
//try
//^
