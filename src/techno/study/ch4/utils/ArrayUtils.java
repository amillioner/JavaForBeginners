package techno.study.ch4.utils;

import java.util.Arrays;

public class ArrayUtils {

    public static int[] addToArray(int[] inputArray, int index, int number) {
        inputArray[index] = number;

        return inputArray;
    }

    public static void main(String[] args) {
        int[] arr = addToArray(new int[3], 0, 10);

        System.out.println(Arrays.toString(arr));
    }
}
