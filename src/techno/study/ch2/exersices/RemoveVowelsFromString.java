package techno.study.ch2.exersices;

/*
Given a string S, remove the vowels 'a', 'e', 'i', 'o', and 'u' from it, and return the new string.

Example 1:
Input: "leetcodeisacommunityforcoders"
Output: "ltcdscmmntyfrcdrs"

Example 2:
Input: "aeiou"
Output: ""
 */
public class RemoveVowelsFromString {

    public static void main(String[] args) {

        String S = "asdanskdoqweoenrwenrwor";
        String result =  S.replaceAll("[aeiou]", "");

        System.out.println(result);
    }
}
