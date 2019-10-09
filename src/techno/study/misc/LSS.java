package techno.study.algo;

public class LSS {

    public static void main(String args[]) {
        String myString = "aaaabbbbcccchhhhiiiiibbbbbbbbbccccccc";
        LongestSequenceOfRepetativeChars(myString);
    }

    private static void LongestSequenceOfRepetativeChars(String s) {
        int counter = 1;
        char cur = '\0';
        char next = '\0';
        int max = 0;
        char res = '\0';

        for (int i = 0; i < s.length() - 1; i++) {
            cur = s.charAt(i);
            next = s.charAt(i + 1);

            // If character's are in sequence , increase the counter
            if (cur == next) {
                counter++;
            } else {
                // When sequence is completed, check if it is longest
                if (counter > max) {
                    max = counter;
                    res = cur;
                }
                counter = 1; // re-initialize counter
            }
        }
        // Check if last string sequence is longest
        if (counter > max) {
            max = counter;
            res = cur;
        }
        String repeated = new String(new char[max]).replace('\0', res);
        System.out.println(repeated);
        System.out.println("Longest character sequence is of character "
                + res + " and is " + max + " long");
    }

}
