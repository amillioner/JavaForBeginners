package techno.study.ch5.super_keyword;
//2. Use of super with methods: This is used when we want to call parent class method.
// So whenever a parent and child class have same named methods then to resolve ambiguity we use super keyword.
// This code snippet helps to understand the said usage of super keyword.
class SuperWithMethods {
    /* Base class Person */
    class Person {
        void message() {
            System.out.println("This is person class");
        }
    }

    /* Subclass Student */
    class Student extends Person {
        void message() {
            System.out.println("This is student class");
        }

        // Note that display() is only in Student class
        void display() {
            // will invoke or call current class message() method
            message();

            // will invoke or call parent class message() method
            super.message();
        }
    }

    /* Driver program to test */
    class Test {
        public void main(String args[]) {
            Student s = new Student();

            // calling display() of Student
            s.display();
        }
    }

}
//Output:
//
//This is student class
//This is person class