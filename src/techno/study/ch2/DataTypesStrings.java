package techno.study.ch2;

/**
 * 1. char: 'a' only one symbol can be passed to '', single quotes
 *
 * 2. String: "hello world"
 *
 * 3. String concatenation "hello" + " " + "world"
 *
 *
 */

public class DataTypesStrings {

    public static void main(String[] args) {
        char aChar = '2';
        char A = 'A';
        char B = 'A' + 1;
        System.out.println(A);
        System.out.println(B);


        String courseName = "techno study";
        System.out.println(courseName);

        String printA = "letter is: " + A;
        System.out.println(printA);

        courseName.charAt(0);
        courseName.startsWith("te");
        courseName.endsWith("dy");
        courseName.contains("no");
        courseName.replace("t", "M");
        courseName.replaceAll("t", "M");
        courseName.equals("techno study");

        String name = "John";
        String name2 = new String("John");

        System.out.println(name == name2);
        System.out.println(name.equals(name2));

    }

    // TODO TASK
    //  1. check if string is equals to your name than print your surname
    //  2. write code that count length of string and prints sum of length and index of "e"
    //    ex: "techno" => 6+1 = 7
    //    hint: length(), indexOf()
}
