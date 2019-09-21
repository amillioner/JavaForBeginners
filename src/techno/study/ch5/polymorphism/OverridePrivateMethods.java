package techno.study.ch5.polymorphism;
//https://www.geeksforgeeks.org/can-override-private-methods-java/
public class OverridePrivateMethods {
    class Base {
        public void fun() {
            System.out.println("Base fun");
        }
    }

    class Derived extends Base {
        public void fun() {  // overrides the Base's fun()
            System.out.println("Derived fun");
        }
        public void main(String[] args) {
            Base obj = new Derived();
            obj.fun();
        }
    }
    class Base1 {
        private void fun() {
            System.out.println("Base fun");
        }
    }

    class Derived1 extends Base1 {
        private void fun2() {
            System.out.println("Derived fun");
        }
        public void main(String[] args) {
            Base obj = new Derived();
            obj.fun();
        }
    }

    /* Java program to demonstrate whether we can override private method
   of outer class inside its inner class */
    class Outer {
        private String msg = "GeeksforGeeks";
        private void fun() {
            System.out.println("Outer fun()");
        }

        class Inner extends Outer {
            private void fun()  {
                System.out.println("Accessing Private Member of Outer: " + msg);
            }
        }

        public void main(String args[])  {

            // In order to create instance of Inner class, we need an Outer
            // class instance. So, first create Outer class instance and then
            // inner class instance.
            Outer o = new Outer();
            Inner  i   = o.new Inner();

            // This will call Inner's fun, the purpose of this call is to
            // show that private members of Outer can be accessed in Inner.
            i.fun();

            // o.fun() calls Outer's fun (No run-time polymorphism).
            o = i;
            o.fun();
        }
    }

}

