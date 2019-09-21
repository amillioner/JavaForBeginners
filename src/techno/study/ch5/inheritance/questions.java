package techno.study.ch5.inheritance;

//https://www.geeksforgeeks.org/java-inheritance-question-5/
class q1 {
    class Base {
        public void show() {
            System.out.println("Base::show() called");
        }
    }

    class Derived extends Base {
        public void show() {
            System.out.println("Derived::show() called");
        }
    }

    public class Main {
        public void main(String[] args) {
            Base b = new Derived();
            b.show();
        }
    }
    //(A) Derived::show() called
    //(B) Base::show() called
    //
    //
    //    Answer: (A)
    //
    //    Explanation: In the above program, b is a reference of Base type and refers to an abject of Derived class.
    //    In Java, functions are virtual by default. So the run time polymorphism happens and derived fun() is called.

}


//public class q2 {
//    class Base {
//        final public void show() {
//            System.out.println("Base::show() called");
//        }
//    }
//
//    class Derived extends Base {
//        public void show() {
//            System.out.println("Derived::show() called");
//        }
//    }
//
//    class Main {
//        public void main(String[] args) {
//            Base b = new Derived();;
//            b.show();
//        }
//    }
////(A) Base::show() called
////(B) Derived::show() called
////(C) Compiler Error
////            (D) Runtime Error
////
////
////    Answer: (C)
////
////    Explanation: Final methods cannot be overridden. See the compiler error here.
//
//}
//
class q3 {
    class Base {
        public void show() {
            System.out.println("Base::show() called");
        }
    }

    class Derived extends Base {
        public void show() {
            System.out.println("Derived::show() called");
        }
    }

    class Main {
        public void main(String[] args) {
            Base b = new Derived();
            ;
            b.show();
        }
    }
}

////(A) Base::show() called
////        (B) Derived::show() called
////        (C) Compiler Error
////
////
////        Answer: (A)
////
////        Explanation: Like C++, when a function is static, runtime polymorphism doesn’t happen.
//}
class q4 {
//Java | Inheritance | Question 4
//        Which of the following is true about inheritance in Java?
//
//
//        1) Private methods are final.
//        2) Protected members are accessible within a package and
//        inherited classes outside the package.
//        3) Protected methods are final.
//        4) We cannot override private methods.
//        (A) 1, 2 and 4
//        (B) Only 1 and 2
//        (C) 1, 2 and 3
//        (D) 2, 3 and 4
//
//
//        Answer: (A)
//
//        Explanation: See https://www.geeksforgeeks.org/can-override-private-methods-java/ and https://www.geeksforgeeks.org/comparison-of-inheritance-in-c-and-java/
}

//Java | Inheritance | Question 5
//Output of following Java program?
class q5 {
    class Base {
        public void Print() {
            System.out.println("Base");
        }
    }

    class Derived extends Base {
        public void Print() {
            System.out.println("Derived");
        }
    }

    class Main {
        public void DoPrint(Base o) {
            o.Print();
        }

        public void main(String[] args) {
            Base x = new Base();
            Base y = new Derived();
            Derived z = new Derived();
            DoPrint(x);
            DoPrint(y);
            DoPrint(z);
        }
    }
}
//(A)
//        Base
//        Derived
//        Derived
//
//(B)
//        Base
//        Base
//        Derived
//
//(C)
//        Base
//        Derived
//        Base
//        (D) Compiler Error
//
//        Answer: (A)
//
//        Explanation: See question 1 of https://www.geeksforgeeks.org/output-of-java-program-set-2/

class q6 {
    //Java | Inheritance | Question 9
//Predict the output of following program. Note that fun() is public in base and private in derived.
//    class Base2 {
//        public void foo() {
//            System.out.println("Base");
//        }
//    }
//
//    class Derived2 extends Base2 {
//        private void foo() {
//            System.out.println("Derived");
//        }
//    }
//
//    class Main4 {
//        public void main4(String args[]) {
//            Base2 b = new Derived2();
//            b.foo();
//        }
//    }

//(A) Base
//        (B) Derived
//        (C) Compiler Error
//        (D) Runtime Error
//
//
//        Answer: (C)
//
//        Explanation: It is compiler error to give more restrictive access to a derived class function which overrides a base class function.
}

class q7 {
//Java | Inheritance | Question 7
//Which of the following is true about inheritance in Java.
//1) In Java all classes inherit from the Object class directly or indirectly. The Object class is root of all classes.
//2) Multiple inheritance is not allowed in Java.
//3) Unlike C++, there is nothing like type of inheritance in Java where we can specify whether the inheritance is protected, public or private.
//
//(A) 1, 2 and 3
//(B) 1 and 2
//(C) 2 and 3
//(D) 1 and 3
//
//
//Answer: (A)
//
//Explanation: See Comparison of Inheritance in C++ and Java
}

class q8 {
//Java | Inheritance | Question 8
//Predict the output of following Java Program

//    // filename Main.java
//    class Grandparent {
//        public void Print() {
//            System.out.println("Grandparent's Print()");
//        }
//    }
//
//    class Parent extends Grandparent {
//        public void Print() {
//            System.out.println("Parent's Print()");
//        }
//    }
//
//    class Child extends Parent {
//        public void Print() {
//            super.super.Print();
//            System.out.println("Child's Print()");
//        }
//    }
//
//    public class Main {
//        public void main(String[] args) {
//            Child c = new Child();
//            c.Print();
//        }
//    }
//(A) Compiler Error in super.super.Print()
//(B)
//        Grandparent's Print()
//        Parent's Print()
//        Child's Print()
//(C) Runtime Error
//
//
//        Answer: (A)
//
//        Explanation: In Java, it is not allowed to do super.super. We can only access Grandparent’s members using Parent. For example, the following program works fine.

    // Guess the output
// filename Main.java
}

//explanation for q8 below:
class q8Good {
    // Guess the output
// filename Main.java
    class Grandparent {
        public void Print() {
            System.out.println("Grandparent's Print()");
        }
    }

    class Parent extends Grandparent {
        public void Print() {
            super.Print();
            System.out.println("Parent's Print()");
        }
    }

    class Child extends Parent {
        public void Print() {
            super.Print();
            System.out.println("Child's Print()");
        }
    }

    class Main {
        public void main(String[] args) {
            Child c = new Child();
            c.Print();
        }
    }
}

class q9 {
    //    Java | Inheritance | Question 9
    final class Complex {

        private final double re;
        private final double im;

        public Complex(double re, double im) {
            this.re = re;
            this.im = im;
        }

        public String toString() {
            return "(" + re + " + " + im + "i)";
        }
    }

    class Main {
        public void main(String args[]) {
            Complex c = new Complex(10, 15);
            System.out.println("Complex number is " + c);
        }
    }
//(A) Complex number is (10.0 + 15.0i)
//(B) Compiler Error
//(C) Complex number is SOME_GARBAGE
//(D) Complex number is Complex@8e2fb5
//    Here 8e2fb5 is hash code of c
//
//    Answer: (A)
//
//    Explanation: See https://www.geeksforgeeks.org/overriding-tostring-method-in-java/
}