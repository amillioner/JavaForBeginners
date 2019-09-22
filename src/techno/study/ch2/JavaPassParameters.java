package techno.study.ch2;

class ex1 {
    //  Test.java
    class Test {
        // swap() doesn't swap i and j
        public void swap(Integer i, Integer j) {
            Integer temp = new Integer(i);
            i = j;
            j = temp;
        }

        public void main(String[] args) {
            Integer i = new Integer(10);
            Integer j = new Integer(20);
            swap(i, j);
            System.out.println("i = " + i + ", j = " + j);
        }
    }
//    In Java, parameters are always passed by value. For example, following program prints i = 10, j = 20.
}

class ex2 {
//    public class Main {
//        public static void main(String[] args) {
//            int x = 5;
//            change(x);
//            System.out.println(x);
//        }
//
//        public static void change(int x) {
//            x = 10;
//        }
//    }
//Output:
//5

}

class ex3 {
//// A Java program to show that references are also passed
//// by value.
//    class Test {
//        int x;
//
//        Test(int i) {
//            x = i;
//        }
//
//        Test() {
//            x = 0;
//        }
//    }
//
//    class Main {
//        public static void main(String[] args) {
//            // t is a reference
//            Test t = new Test(5);
//
//            // Reference is passed and a copy of reference
//            // is created in change()
//            change(t);
//
//            // Old value of t.x is printed
//            System.out.println(t.x);
//        }
//
//        public static void change(Test t) {
//            // We changed reference to refer some other location
//            // now any changes made to reference are not reflected
//            // back in main
//            t = new Test();
//
//            t.x = 10;
//        }
//    }
//Output:
//5

}
class ex4{
    // A Java program to show that we can change members using using
// reference if we do not change the reference itself.
//    class Test {
//        int x;
//
//        Test(int i) {
//            x = i;
//        }
//
//        Test() {
//            x = 0;
//        }
//    }
//
//    class Main {
//        public static void main(String[] args) {
//            // t is a reference
//            Test t = new Test(5);
//
//            // Reference is passed and a copy of reference
//            // is created in change()
//            change(t);
//
//            // New value of x is printed
//            System.out.println(t.x);
//        }
//
//        // This change() doesn't change the reference, it only
//        // changes member of object referred by reference
//        public static void change(Test t) {
//            t.x = 10;
//        }
//    }
//Output:
//10

}
