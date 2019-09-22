package techno.study.ch5;

class q1 {
    //    Java | Class and Object | Question 1
    //    Predict the output of following Java program?
    //    class Test {
    //        int i;
    //    }
    //
    //    class Main {
    //        public void main(String args[]) {
    //            Test t;
    //            System.out.println(t.i);
    //        }
    //    }
}

//(A) 0
//(B) garbage value
//(C) compiler error
//(D) runtime error
//
//
//Answer: (C)
//
//Explanation: t is just a reference, the object referred by t is not allocated any memory. Unlike C++, in Java all non-primitive objects must be explicitly allocated and these objects are allocated on heap. The following is corrected program.

class q1Corrected {

    class Test {
        int i;
    }

    class Main {
        public void main(String args[]) {
            Test t = new Test();
            System.out.println(t.i);
        }

    }
}

class q2 {
    //Java | Class and Object | Question 2
//Predict the output of following Java program

    class Test {
        int i;
    }

    class Main {
        public void main(String args[]) {
            Test t = new Test();
            System.out.println(t.i);
        }
    }
//(A) garbage value
//(B) 0
//(C) compiler error
//(D) runtime error
//
//
//Answer: (B)
//
//Explanation: In Java, fields of classes and objects that do not have an explicit initializer and elements of arrays are automatically initialized with the default value for their type (false for boolean, 0 for all numerical types, null for all reference types). Local variables in Java must be definitely assigned to before they are accessed, or it is a compile error.

}

class q3 {
//Java | Class and Object | Question 4

    class demo {
        int a, b;

        demo() {
            a = 10;
            b = 20;
        }

        public void print() {
            System.out.println("a = " + a + " b = " + b + "\n");
        }
    }

    class Test {

        public void main(String[] args) {
            demo obj1 = new demo();
            demo obj2 = obj1;

            obj1.a += 1;
            obj1.b += 1;

            System.out.println("values of obj1 : ");
            obj1.print();
            System.out.println("values of obj2 : ");
            obj2.print();

        }
    }
//(A) Compile error
//(B)
//
//values of obj1:
//a = 11 b = 21
//values of obj2:
//a = 11 b = 21
//(C)
//
//values of obj1:
//a = 11 b = 21
//values of obj2:
//a = 10 b = 20
//(D)
//
//values of obj1:
//a = 11 b = 20
//values of obj2:
//a = 10 b = 21
//(E) Run time error
//
//
//Answer: (B)
//
//Explanation: Assignment of obj2 to obj1 makes obj2 a reference to obj1. Therefore, any change in obj1 will be reflected in obj2 also.

}

class q5 {
    //Java | Class and Object | Question 4
    //Predict the output of following Java program.
//    class demoClass {
//        int a = 1;
//
//        void func() {
//            demo obj = new demo();
//            obj.display();
//        }
//
//
//        class demo {
//            int b = 2;
//
//            void display() {
//                System.out.println("\na = " + a);
//            }
//        }
//
//        void get() {
//            System.out.println("\nb = " + b);
//        }
//    }
//
//
//    class Test {
//        public void main(String[] args) {
//            demoClass obj = new demoClass();
//            obj.func();
//            obj.get();
//
//        }
//    }
//(A)
//    a = 1
//    b = 2
//(B) Compilation error
//(C)
//b = 2
//a = 1
//
//Answer: (B)
//
//Explanation:
//Members of inner class ‘demo’ can not be used in the outer class ‘Test’. Thus, get() of outer class can not access variable ‘b’ of inner class.

}

class q6 {
    //    Java | Class and Object | Question 5
//    Predict the output of the following program.
    class First {

        void display() {
            System.out.println("Inside First");
        }
    }

    class Second extends First {

        void display() {
            System.out.println("Inside Second");
        }
    }


    class Test {

        public void main(String[] args) {
            First obj1 = new First();
            Second obj2 = new Second();

            First ref;
            ref = obj1;
            ref.display();

            ref = obj2;
            ref.display();
        }
    }
//(A) Compilation error
//(B)
//
//Inside First
//Inside Second
//(C)
//
//Inside First
//Inside First
//(D) Runtime error
//
//
//Answer: (B)
//
//Explanation: ‘ref’ is a reference variable which obtains the reference of object of class First and calls its function display().
//Then ‘ref’ refers to object of class Second and calls its function display().
//

}

class q7 {
//    Java | Class and Object | Question 6
//    Predict the output of the following program.

    class Test {
        int a = 1;
        int b = 2;

        Test func(Test obj) {
            Test obj3 = new Test();
            obj3 = obj;
            obj3.a = obj.a++ + ++obj.b;
            obj.b = obj.b;
            return obj3;
        }

        public void main(String[] args) {
            Test obj1 = new Test();
            Test obj2 = obj1.func(obj1);

            System.out.println("obj1.a = " + obj1.a + "  obj1.b = " + obj1.b);
            System.out.println("obj2.a = " + obj2.a + "  obj1.b = " + obj2.b);

        }
    }
//(A)
//
//obj1.a = 1  obj1.b = 2
//obj2.a = 4  obj2.b = 3
//(B)
//
//obj1.a = 4  obj1.b = 3
//obj2.a = 4  obj2.b = 3
//(C) Compilation error
//
//
//Answer: (B)
//
//Explanation:
//obj1 and obj2 refer to same memory address.

}