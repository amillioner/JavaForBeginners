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

        char c = courseName.charAt(0);
        boolean te = courseName.startsWith("te");
        boolean dy = courseName.endsWith("dy");
        boolean no = courseName.contains("no");
        String replace = courseName.replace("t", "M");
        String replaceAll = courseName.replaceAll("techno", "super");
        boolean technoStudy = courseName.equals("techno study");
        String substring = courseName.substring(0, 5);

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
    //  3. write program that prints your initials
    //    ex: Michale Jackson => M.J.
}
