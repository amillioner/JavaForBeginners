package techno.study.ch2.questions;

class q1 {
//    perm_identity
//    Java | Data Types | Question 1

//    class Main {
//        public static void main(String args[]) {
//            int t;
//            System.out.println(t);
//        }
//    }
//(A) 0
//(B) garbage value
//(C) compiler error
//(D) runtime error
//
//
//Answer: (C)
//
//Explanation: Unlike class members, local variables of methods must be assigned a value to before they are accessed, or it is a compile error.
}

class q2 {
//    Java | Data Types | Question 2
//    Predict the output of following Java program.

//    class Test {
//        public static void main(String[] args) {
//            for(int i = 0; 0; i++)
//            {
//                System.out.println("Hello");
//                break;
//            }
//        }
//    }
//(A) Hello
//(B) Empty Output
//(C) Compiler error
//(D) Runtime error
//
//
//Answer: (C)
//
//Explanation: The error is in for loop where 0 is used in place of boolean value.
//
//Unlike C++, use of non boolean variables in place of bool is not allowed
}

class q3 {
//    Java | Data Types | Question 3
//    Predict the output of the following program.

    class Test {
        public void main(String[] args) {
            Double object = new Double("2.4");
            int a = object.intValue();
            byte b = object.byteValue();
            float d = object.floatValue();
            double c = object.doubleValue();

            System.out.println(a + b + c + d);

        }
    }
//(A) 8
//(B) 8.8
//(C) 8.800000095367432
//
//
//Answer: (C)
//
//Explanation: Arithmetic conversions are implicitly performed to cast the values to a common type. The compiler first performs integer promotion. If the operands still have different types, then they are converted to the type that appears highest in the hierarchy.
}