package techno.study.misc;

public class RunVsCompileTime {

//    Difference between Compile Time Errors and Runtime Errors
//    Compile-Time Errors: Errors that occur when you violate the rules of writing syntax are known as Compile-Time errors. This compiler error indicates something that must be fixed before the code can be compiled. All these errors are detected by the compiler and thus are known as compile-time errors.
//    Most frequent Compile-Time errors are:
//
//    Missing Parenthesis (})
//    Printing the value of variable without declaring it
//    Missing semicolon (terminator)
//
//Below is an example to demonstrate Compile-Time Error:

// Java program to illustrate
// syntax error

    class CompileError {
        void main() {
            int x = 10;
            int y = 15;

// semicolon missed
            System.out.println(x + y);
        }
    }
//        Error:
//
//        error: expected ';' before '}' token
//        Run-Time Errors: Errors which occur during program execution(run-time) after successful compilation are called run-time errors. One of the most common run-time error is division by zero also known as Division error. These types of error are hard to find as the compiler doesn’t point to the line at which the error occurs.
//
//        For more understanding run the example given below.

// Java program to illustrate
// run-time error

    class RunError {
        void main() {
            int n = 9, div = 0;

            // wrong logic
            // number is divided by 0,
            // so this program abnormally terminates
            div = n / 0;

            System.out.println("result = " + div);
        }
    }
//        Error:

//        warning: division by zero [-Wdiv-by-zero]
//        div = n/0;
//        In the given example, there is Division by zero error. This is an example of run-time error i.e errors occurring while running the program.
//
//        The Differences between Compile-Time and Run-Time Error are:
//
//        COMPILE-TIME ERRORS	RUNTIME-ERRORS
//        These are the syntax errors which are detected by the compiler.	These are the errors which are not detected by the compiler and produce wrong results.
//        They prevent the code from running as it detects some syntax errors.	They prevent the code from complete execution.
//        It includes syntax errors such as missing of semicolon(;), misspelling of keywords and identifiers etc.	It includes errors such as dividing a number by zero, finding square root of a negative number etc.
//}
}