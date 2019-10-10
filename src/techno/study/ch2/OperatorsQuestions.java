package techno.study.ch2;

public class OperatorsQuestions {
    //    Predict the output of following Java Program
    static class Test {
        public static void main(String args[]) {
            int x = -4;
            System.out.println(x >> 1);
            int y = 4;
            System.out.println(y >> 1);
        }
    }
//    (A) Compiler Error: Operator >> cannot be applied to negative numbers
//    (B)
//    -2
//    2
//    (C)
//    2
//    2
//    (D)
//    0
//    2
//
//    Answer: (B)
//
//    Explanation: See https://www.TechnoforTechno.org/bitwise-shift-operators-in-java/

    //    Predict the output of following Java program. Assume that int is stored using 32 bits.
    static class Test2 {
        public static void main(String args[]) {
            int x = -1;
            System.out.println(x >>> 29);
            System.out.println(x >>> 30);
            System.out.println(x >>> 31);
        }
    }
//    (A)
//    7
//    3
//    1
//    (B)
//    15
//    7
//    3
//    (C)
//    0
//    0
//    0
//    (D)
//    1
//    1
//    1
//
//    Answer: (A)
//
//    Explanation: Please see https://www.TechnoforTechno.org/bitwise-shift-operators-in-java/


    static class Test3 {
        public static void main(String args[]) {
            System.out.println(10 + 20 + "TechnoQuiz");
            System.out.println("TechnoQuiz" + 10 + 20);
        }
    }
//    (A)
//    30TechnoQuiz
//    TechnoQuiz30
//    (B)
//    1020TechnoQuiz
//    TechnoQuiz1020
//    (C)
//    30TechnoQuiz
//    TechnoQuiz1020
//    (D)
//    1020TechnoQuiz
//    TechnoQuiz30

//    Answer: (C)
//
//    Explanation: In the given expressions 10 + 20 + “TechnoQuiz” and “TechnoQuiz” + 10 + 20 , there are two + operators, so associativity comes to the picture. The + operator is left to right. So the first expression is evaluated as (10 + 20) + “TechnoQuiz” and second expression is evaluated as (“TechnoQuiz” + 10) + 20 .

    static class Test4 {
        public static void main(String args[]) {
            System.out.println(10 * 20 + "TechnoQuiz");
            System.out.println("TechnoQuiz" + 10 * 20);
        }
    }
    //(A)
    //10*20TechnoQuiz
    //TechnoQuiz10*20
    //(B)
    //200TechnoQuiz
    //TechnoQuiz200
    //(C)
    //200TechnoQuiz
    //TechnoQuiz10*20
    //(D)
    //1020TechnoQuiz
    //TechnoQuiz220
    //
    //Answer: (B)
    //
    //Explanation: Precedence of * is more than +.


//    Which of the following is not an operator in Java?
//            (A) instanceof
//            (B) sizeof
//            (C) new
//            (D) >>>=
//
//
//    Answer: (B)
//
//    Explanation: There is no sizeof operator in Java. We generally don’t need size of objects.

    static class Base {
    }

    static class Derived extends Base {
        public static void main(String args[]) {
            Base a = new Derived();
            System.out.println(a instanceof Derived);
        }
    }
//    (A) true
//    (B) false
//
//
//    Answer: (A)
//
//    Explanation: The instanceof operator works even when the reference is of base class type.

    static class Test5 {
        public static void main(String args[]) {
            String s1 = "Technoquiz";
            String s2 = "Technoquiz";
            System.out.println("s1 == s2 is:" + s1 == s2);
        }
    }
    //(A) true
    //(B) false
    //(C) compiler error
    //(D) throws an exception
    //
    //
    //Answer: (B)
    //
    //Explanation: The output is “false” because in java + operator precedence is more than == operator. So the given expression will be evaluated to “s1 == s2 is:Technoquiz” == “Technoquiz” i.e false.

//    static class demo
//    {
//        int a, b, c;
//        demo(int a, int b, int c)
//        {
//            this.a = a;
//            this.b = b;
//        }
//
//        demo()
//        {
//            a = b = c = 0;
//        }
//
//        demo operator+(const demo &obj)
//        {
//            demo object;
//            object.a = this.a + obj.a;
//            object.b = this.b + obj.b;
//            object.c = this.c + obj.c;
//            return object;
//        }
//    }
//
//    static class Test7
//    {
//        public static void main(String[] args)
//        {
//
//            demo obj1 = new demo(1, 2, 3);
//            demo obj2 = new demo(1, 2, 3);
//            demo obj3 = new demo();
//
//            obj3 = obj1 + obj2;
//            System.out.println ("obj3.a = " + obj3.a);
//            System.out.println ("obj3.b = " + obj3.c);
//            System.out.println ("obj3.c = " + obj3.c);
//
//        }
//    }
    //(B) Compile Error
    //(C) Run Time Error
    //(D) Segmentation Fault
    //
    //
    //Answer: (B)
    //
    //Explanation: Operator overloading is not support by JAVA. It only supports method overloading, whereas C++ supports both method and operator overloading.

    static class Test8 {
        boolean[] array = new boolean[3];
        int count = 0;

        void setter(boolean[] arr, int x) {
            arr[x] = true;
            count++;
        }

        void func() {
            if (array[0] && array[++count - 2] | array[count - 1])
                count++;

            System.out.println("count = " + count);
        }


        public static void main(String[] args) {
            Test8 object = new Test8();
            object.setter(object.array, 0);
            object.setter(object.array, 1);
            object.func();
        }
    }

    //(A) 2
    //(B) 3
    //(C) 4
    //
    //
    //Answer: (C)
    //
    //Explanation:
    //First call to function set(), sets array[0] = true, array[1] = false and array[2] = false.
    //Second call to function set(), sets array[0] = true, array[1] = true and array[2] = false.
    //In function func(),if statement evaluates to be true. So, count = 4.
}
