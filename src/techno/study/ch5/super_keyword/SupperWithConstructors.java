package techno.study.ch5.super_keyword;

//3. Use of super with constructors: super keyword can also be used to access the parent class constructor.
// One more important thing is that, ‘’super’ can call both parametric as well as non parametric constructors depending upon the situation.
// Following is the code snippet to explain the above concept:
class SupperWithConstructors {
    /* superclass Person */
    class Person {
        Person() {
            System.out.println("Person class Constructor");
        }
    }

    /* subclass Student extending the Person class */
    class Student extends Person {
        Student() {
            // invoke or call parent class constructor
            super();

            System.out.println("Student class Constructor");
        }
    }

    /* Driver program to test*/
    class Test {
        public void main(String[] args) {
            Student s = new Student();
        }
    }

}

//Output:
//
//Person class Constructor
//Student class Constructor


//    Other Important points:

//        Call to super() must be first statement in Derived(Student) Class constructor.
//        If a constructor does not explicitly invoke a superclass constructor, the Java compiler automatically inserts a call to the no-argument constructor of the superclass. If the superclass does not have a no-argument constructor, you will get a compile-time error. Object does have such a constructor, so if Object is the only superclass, there is no problem.
//        If a subclass constructor invokes a constructor of its superclass, either explicitly or implicitly, you might think that a whole chain of constructors called, all the way back to the constructor of Object. This, in fact, is the case. It is called constructor chaining..