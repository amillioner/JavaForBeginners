package techno.study.ch5.super_keyword;

/* superclass Person */
class Person3 {
    Person3() {
        System.out.println("Person class Constructor");
    }
}

/* subclass Student extending the Person class */
class Student3 extends Person3 {
    Student3() {
        // invoke or call parent class constructor
        super();

        System.out.println("Student class Constructor");
    }
}

/* Driver program to test*/
class Test3 {
    public static void main(String[] args) {
        Student3 s = new Student3();
    }
}

//Output:
//
//Person class Constructor
//Student class Constructor
