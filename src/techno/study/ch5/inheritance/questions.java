package techno.study.ch5.inheritance;

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
            ;
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
    //
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
//public class q3 {
//    class Base {
//        public static void show() {
//            System.out.println("Base::show() called");
//        }
//    }
//
//    class Derived extends Base {
//        public static void show() {
//            System.out.println("Derived::show() called");
//        }
//    }
//
//    class Main {
//        public static void main(String[] args) {
//            Base b = new Derived();
//            ;
//            b.show();
//        }
//    }
////(A) Base::show() called
////        (B) Derived::show() called
////        (C) Compiler Error
////
////
////        Answer: (A)
////
////        Explanation: Like C++, when a function is static, runtime polymorphism doesn’t happen.
//}