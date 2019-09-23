package techno.study.ch5.polymorphism.questions;

import java.io.IOException;

class q1 {

    //1) What is the output of the following program?
    class GFG {
        protected void getData() {
            System.out.println("Inside GFG");
        }
    }

    class GeeksforGeeks extends GFG {
        protected void getData() {
            System.out.println("Inside GeeksforGeeks");
        }
    }

    public class Test {
        public void main(String[] args) {
            GFG obj = new GeeksforGeeks();
            obj.getData();
        }
    }

//a) Inside GFG
//b) Inside GeeksforGeeks
//c) Compilation error
//d) Runtime error
//
//Ans. (b)
//Explanation: A reference variable of GFG class is used to point to an object of class GeeksforGeeks. At the time of compilation, the JVM checks whether the method being called is defined in GFG class, but at the runtime, JVM invoke the method of GeeksforGeeks class because the object is from class GeeksforGeeks. Refer to static vs dynamic binding in java for more details.
}


class q2 {
//    2) What is the output of the following program?

//    class Test {
//        void myMethod() {
//            System.out.println("GeeksforGeeks");
//        }
//    }
//
//    public class Derived extends Test {
//        void myMethod() {
//            System.out.println("GFG");
//        }
//
//        public void main(String[] args) {
//            Derived object = new Test();
//            object.myMethod();
//        }
//    }
//a) GeeksforGeeks
//b) GFG
//c) Compilation error
//d) Runtime error
//
//Ans. (c)
//Explanation: A child class cannot be used as a reference to an object of super class.
}

class q3 {
//    3) What is the output of the following program?
//
//    class GFG {
//        protected void getData() {
//            System.out.println("Inside GFG");
//        }
//    }
//
//    class GeeksforGeeks extends GFG {
//        protected void getData() {
//            System.out.println("Inside GeeksforGeeks");
//        }
//
//        protected void getValue() {
//            System.out.println("GeeksforGeeks");
//        }
//    }
//
//    public class Test {
//        public static void main(String[] args) {
//            GFG obj = new GeeksforGeeks();
//            obj.getValue();
//        }
//    }
//a) Compilation error
//b) Runtime error
//c) GeeksforGeeks
//d) None of these
//
//Ans. (a)
//Explanation: A GFG reference variable is used to store GeeksforGeeks object. At compile time, JVM looks for getValue method in GFG class. Detecting the absence of it, JVM throws a compile time error. Refer to static vs dynamic binding in java for more details.
}

class q4 {
//    4) What is the output of the following program?

    interface GFG {
        void myMethod();

        void getInfo();
    }

    abstract class Geeks implements GFG {
        void getData() {
            System.out.println("GFG");
        }
    }

    public class Test extends Geeks {
        public void myMethod() {
            System.out.println("GeeksforGeeks");
        }

        public void getInfo() {
            System.out.println("Geeks");
        }

        public void main(String[] args) {
            Geeks obj = new Test();
            obj.getInfo();
        }
    }
//a) Geeks
//b) Compilation error
//c) Runtime error
//d) None of these
//
//Ans. (a)
//Explanation: Class Geeks implements GFG interface. So all the methods declared in GFG interface get replicated for Geeks class. So when getInfo method is called on line 1 in the program above, the compiler checks to see if getInfo method exists in the Geeks class as a variable of type Geeks is being used to reference Test object.
}

class q5 {
//    5) What is the output of the following program?

//    class Test {
//        public void gfg() {
//            System.out.println("GeeksforGeeks");
//        }
//    }
//
//    public class Derived extends Test {
//        public void gfg() {
//            System.out.println("GFG");
//        }
//
//        public static void main(String[] args) {
//            Derived obj = new Test();
//            obj.gfg();
//        }
//    }
//a) Compilation error
//b) Runtime error
//c) GFG
//d) GeeksforGeeks
//
//Ans. (a)
//Explanation: A child class reference variable cannot be used to store an instance of parent class.
}


//// OVERRIDING EXAMPLES


class q6 {
//    1) What is the output of the following program?

//    class Derived {
//        protected final void getDetails() {
//            System.out.println("Derived class");
//        }
//    }
//
//    public class Test extends Derived {
//        protected final void getDetails() {
//            System.out.println("Test class");
//        }
//
//        public static void main(String[] args) {
//            Derived obj = new Derived();
//            obj.getDetails();
//        }
//    }
//a) Derived class
//b) Test class
//c) Runtime error
//d) Compilation error
//
//Ans. (d)
//Explanation: Final and static methods cannot be overridden. For more details Check: Can we Overload or Override static methods in java ?
}

class q7 {
    //    2) What is the output of the following program?
//    class Derived {
//        public void getDetails(String temp) {
//            System.out.println("Derived class " + temp);
//        }
//    }
//
//    public class Test extends Derived {
//        public int getDetails(String temp) {
//            System.out.println("Test class " + temp);
//            return 0;
//        }
//
//        public static void main(String[] args) {
//            Test obj = new Test();
//            obj.getDetails("GFG");
//        }
//    }
//a) Derived class GFG
//b) Test class GFG
//c) Compilation error
//d) Runtime error
//
//Ans. (c)
//Explanation: The overriding method must have same signature, which includes, the argument list and the return type. For details, See : Overriding in Java
}

class q8 {
//    3) What is the output of the following program?

//    class Derived {
//        public void getDetails() {
//            System.out.println("Derived class");
//        }
//    }
//
//    public class Test extends Derived {
//        protected void getDetails() {
//            System.out.println("Test class");
//        }
//
//        public static void main(String[] args) {
//            Derived obj = new Test();  // line xyz
//            obj.getDetails();
//        }
//    }
//a) Test class
//b) Compilation error due to line xyz
//c) Derived class
//d) Compilation error due to access modifier
//
//Ans: (d)
//Explanation: The overriding method can not have more restrictive access modifier.
}

class q9 {
//    4) What is the output of the following program?
//
//    class Derived {
//        public void getDetails() throws IOException //line 23
//        {
//            System.out.println("Derived class");
//        }
//    }
//
//    public class Test extends Derived {
//        public void getDetails() throws Exception //line 24
//        {
//            System.out.println("Test class");
//        }
//
//        public static void main(String[] args) throws IOException //line 25
//        {
//            Derived obj = new Test();
//            obj.getDetails();
//        }
//    }
//    a) Compilation error due to line 23
//    b) Compilation error due to line 24
//    c) Compilation error due to line 25
//    d) All the above
//
//Ans. (b)
//    Explanation: The exception thrown by the overriding method should not be new or more broader checked exception. In the code above, Exception is more broader class of checked exception than IOException, so this results in compilation error.
}

class q10 {
//    5) What is the output of the following program?

    class Derived {
        public void getDetails() {
            System.out.printf("Derived class ");
        }
    }

    public class Test extends Derived {
        public void getDetails() {
            System.out.printf("Test class ");
            super.getDetails();
        }

        public void main(String[] args) {
            Derived obj = new Test();
            obj.getDetails();
        }
    }
//a) Test class Derived class
//b) Derived class Test class
//c) Compilation error
//d) Runtime error
//
//Ans. (a)
//Explanation: super keyword is used to invoke the overridden method from a child class explicitly.
}


////OVERLOADING EXAMPLES
class q11 {
//1) What is the output of the following program?

//    public class Test {
//        public int getData() //getdata() 1
//        {
//            return 0;
//        }
//
//        public long getData() //getdata 2
//        {
//            return 1;
//        }
//
//        public static void main(String[] args) {
//            Test obj = new Test();
//            System.out.println(obj.getData());
//        }
//    }
//a) 1
//b) 0
//c) Runtime error
//d) Compilation error
//
//Ans. (d)
//Explanation: For method overloading, methods must have different signatures. Return type of methods does not contribute towards different method signature, so the code above give compilation error. Both getdata 1 and getdata 2 only differ in return types and NOT signatures.

}

class q12 {
//    2) What is the output of the following program?

//    public class Test {
//        public int getData(String temp) throws IOException {
//            return 0;
//        }
//
//        public int getData(String temp) throws Exception {
//            return 1;
//        }
//
//        public static void main(String[] args) {
//            Test obj = new Test();
//            System.out.println(obj.getData("GFG"));
//        }
//    }
//a) 0
//b) 1
//c) Compilation error
//d) Runtime error
//
//Ans. (c)
//Explanation: Methods that throws different exceptions are not overloaded as their signature are still the same.
}

class q13 {

//    public class Test
//    {
//        private String function()
//        {
//            return ("GFG");
//        }
//        public final static String function(int data)
//        {
//            return ("GeeksforGeeks");
//        }
//        public static void main(String[] args)
//        {
//            Test obj = new Test();
//            System.out.println(obj.function());
//        }
//    }
//a) Compilation error
//b) Runtime error
//c) GFG
//d) None of these
//
//Ans. (c)
//Explanation: Access modifiers associated with methods doesn’t determine the criteria for overloading. The overloaded methods could also be declared as final or static without affecting the overloading criteria.
}

class q14 {
//    4) What is the output of the following program?

    public class Test {
        private String function(String temp, int data) {
            return ("GFG");
        }

        private String function(int data, String temp) {
            return ("GeeksforGeeks");
        }

        public void main(String[] args) {
            Test obj = new Test();
            System.out.println(obj.function(4, "GFG"));
        }
    }
//a) GFG
//b) GeeksforGeeks
//c) Compilation error
//d) Runtime error
//
//Ans. (b)
//Explanation: The order of argument are an important parameter for determining method overloading. As the order of attributes are different, the methods are overloaded.
}

class q15 {
//        5) What is the output of the following program?

    public class Test {
        private String function(String temp, int data, int sum) {
            return ("GFG");
        }

        private String function(String temp, int data) {
            return ("GeeksforGeeks");
        }

        public void main(String[] args) {
            Test obj = new Test();
            System.out.println(obj.function("GFG", 0, 20));
        }
    }
//a) GFG
//b) Compilation error
//c) Runtime error
//d) GeeksforGeeks
//Output A
}

class q16 {

//        6) What is the output of the following program?

    public class Test {
        private String function(float i, int f) {
            return ("gfg");
        }

        private String function(double i, double f) {
            return ("GFG");
        }

        public void main(String[] args) {
            Test obj = new Test();
            System.out.println(obj.function(1., 20));
        }
    }
//a) GFG
//b) Compilation error
//c) Runtime error
//d) GeeksforGeeks
//
//Ans. (a)
//Explanation: This one is really simple. Different type of arguments contribute towards method overloading as the signature of methods is changed with type of attributes. Whichever matches the attributes is obviously called in Method Overloading. Here we are pass first attributes double not float.
}