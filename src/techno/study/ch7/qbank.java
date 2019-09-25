package techno.study.ch7;

//Output of Java Programs | Set 38 (Arrays)
//Prerequisite : Arrays in Java
//
//Question 1. What is the output of this question
class Test1 {
    public
    static void main(String[] args) {
        int arr[] = {11, 22, 33};
        System.out.print(arr[-2]);
    }
}

//Option
//        A) 11 33
//        B) Error
//        C) exception
//        D) 11 -33
//
//        Output: C
//        Explanation : We will get java.lang.ArrayIndexOutOfBoundsException because [-2] index is out of range.
//
//        Question 2. What is the output of this question?
class Test2 {
    public
    static void main(String[] args) {
        int arr[][] = {{11, 22}, {33, 44, 55}};
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < arr.length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}
//Option
//        A) 11 22
//        33 44 55
//        B) 11 22
//        33 44
//        C) Error
//        D) Exception
//
//        Output: B
//        Explanation : Here arr.length returns 2 of the array size, because first dimension size if 2.
//
//        Question 3. What is the output of this question?

class Test3 {
    public
    static void main(String[] args) {
        int arr[][] = {{11, 22}, {33, 44, 55}};
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}
//Option
//        A) 11 22
//        33 44 55
//        B) 11 22
//        33 44
//        C) Exception
//        D) Error
//
//        Output: A
//        Explanation : Here arr[i].length returns first time 2 because first dimension size is 2 and second time 3 because 3 second dimension array size is 3.
//
//        Question 4. What is the output of this question ?

class Test4 {
    public
    static void main(String[] args) {
        int arr[][] = {{11, 22}, {33, 44, 55}};
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}
//Option
//        A) 11 22
//        33 44 55
//        B) 11 22
//        33 44
//        C) Error
//        D) Exception
//
//        Output: D
//        Explanation : This program will give exception :java.lang.ArrayIndexOutOfBoundsException
//        because we want to print the value out of range of array.
//
//        Question 5. What is the output of this question?

class Test5 {
    public
    static void main(String[] args) {
//        int arr[] = new int[5];
//        int arr2[] = new int[5];
//        System.out.print(arr.length + " ");
//        System.out.print(arr2.length());
    }
}
//Option
//        A) 5 5
//        B) Error
//        C) Exception
//        D) None
//
//        Output: B
//        Explanation : It will give error because length() method is not in java. error : Can not find symbol length().

//Output of Java Programs | Set 42 (Arrays)
//Prerequisite : Java Arrays
//
//Question 1. What is the output of this question?

class Test6 {
    public
    static void main(String[] args) {
        int arr[] = new int[5];
        int arr2[] = new int['a'];
        byte bt = 10;
        int arr3[] = new int[bt];
        System.out.println(arr.length);
        System.out.println(arr2.length);
        System.out.println(arr3.length);
    }
}

//Option
//        A) Error
//        B) Runtime Exception
//        C) 5
//        97
//        10
//        D) 5
//        65
//        10
//
//        Output: C
//        Explanation : To specify array size allowed data type are – byte, short, int, char and all of these are valid data types here.
//
//        Question 2. What is the output of this question?
class Test7 {
    public
    static void main(String[] args) {
//        int a[] = new int[5]; // line 1
//        int[] a11 = new int[]; // line 2
    }
}

//Option
//        A) Error
//        B) Exception
//        C) Run successfully
//        D) None
//
//        Output: A
//        Explanation : One Dimension array have size declaration as compulsory feature.
//
//        Error : array dimension missing
//        int []a11 = new int[]; // line 2
//        Question 3. Which of the following declarations are invalid?
class Test8 {
    public
    static void main(String[] args) {
//        int[][] arr1 = new int[2][3]; // Line 1
//        int[][] arr2 = new int[2][]; // line 2
//        int[][] arr3 = new int[][]; // line 3
//        int[][] arr4 = new int[][ 2]; // line 4
    }
}
//Option
//        A) All
//        B) line 1, 3, 4
//        C) line 3, 4
//        D) line 2, 3, 4
//
//        Output: C
//        Explanation : First two declarations are allowed and so no error. line 3 and 4 have zero and last dimension respectively.
//        error: array dimension missing
//
//        int [][]arr3=new int[][];//line 3
//        ^
//        error: ']' expected
//        int [][]arr4=new int[][2];//line 4
//        ^
//        error: ';' expected
//        int [][]arr4=new int[][2];//line 4
//        Question 4. Which of the following lines give error?

class Test9 {
    public
    static void main(String[] args) {
        int[][][] arr1 = new int[1][2][3]; // Line 1
        int[][][] arr2 = new int[1][2][]; // Line 2
        int[][][] arr3 = new int[2][][]; // Line 3
//        int[][][] arr4 = new int[][][]; // Line 4
//        int[][][] arr5 = new int[][ 2][3]; // Line 5
//        int[][][] arr6 = new int[][][ 3]; // Line 6
//        int[][][] arr7 = new int[][ 2][]; // Line 7
    }
}
//Option
//        A) line 4, 5, 6, 7
//        B) All
//        C) No Error
//        D) line 4, 7
//
//        Output: A
//        Explanation : In three dimensional array have first two dimension declaration is compulsory other wise we will get compile time error:illegal startup expression.
//
//        Question 5. What is the output of this question?

class Test10 {
    public
    static void main(String[] args) {
        int arr[] = new int[5];
        System.out.println(arr);
        System.out.println(arr[0]);
    }
}

//Option
//        A) 0
//        0
//        B)[I@6bc7c054
//        0
//        C) 0 0 0 0 0
//        0
//        D) none
//
//        Output: B
//        Explanation : arr : It is giving the base address of array
////        arr[0] : It is giving value of array element at 0th location.
//
//Output of Java Programs | Set 47 (Arrays)
//Prerequisite : Arrays in Java
//
//Question 1. What is the output of this question?
class Test11 {
    public
    static void main(String[] args) {
//        int arr[] = {11, 22, 33};
//        for (int i = 0; i < arr.length; i++)
//            System.out.print(arr[i] + " ");
//
//        System.out.println();
//
//        int arr2[] = new int[3];
//        arr2[] ={
//            11, 22, 33
//        } ;
//        for (int i = 0; i < arr2.length; i++)
//            System.out.print(arr2[i] + " ");
    }
}

//Option
//        A) 11 22 33
//        11 22 33
//        B) Error
//        C) Exception
//        D) None
//
//        Output: B
//        Explanation : It’s not a valid Syntax for array declarations. It will give compile time error : not a statement arr2[] = {11, 22, 33}
//
//Question 2. What is the output of this question?
class Test12 {
    public
    static void main(String[] args) {
        String str[] = {"Geeks", "for", "Geeks"};
        for (int i = 0; i < str.length; i++)
            System.out.print(str[i]);
    }
}
//A)GeeksforGeeks
//        B)Error
//        C)Geeks
//        D)GfG
//        Option
//
//        Output: A
//        Explanation : It is a simple one dimension string type array.
//
//Question 3. What is the output of this question?

class Test13 {
    public
    static void main(String[] args) {
//        String str[] = {"Geeks", "for", "Geeks"};
//        System.out.println(str.length);
//        System.out.println(str[0].length);
    }
}
//Option
//        A)Error
//        B)3
//        5
//        C)3
//        13
//        D)None
//
//        Output: A
//        Explanation : length is applied only to find the size of array. If we are try get the size of string object, then we will get compile time error : cannot find symbol.
//
//Question 4. What is the output of this question?

class Test14 {
    public
    static void main(String[] args) {
        int number = 11;
        int NUMBER = 22;
        int Number = 33;
        System.out.print(number + " ");
        System.out.print(NUMBER + " ");
        System.out.println(Number);
    }
}
//Option
//        A)11 22 33
//        B)11 11 11
//        C)33 33 33
//        D)error
//
//        Output:A
//        Explanation : Java is case sensitive. Therefore, here three different int type variable are there.
//
//Question 5. What is the output of this question?

class Test15 {
    public
    static void main(String[] args) {
        String str[] = {"geeks", "for", "geeks"};
        System.out.print(str[0] + str[1] + str[2]);
    }
}
//Option
//        A)geeksforgeeks
//        B)gfg
//        C)Error
//        D)none
//
//        Output : A
//        Explanation : In Java + operator can concatenate the string.