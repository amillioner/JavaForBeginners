package techno.study.ch3;

import java.util.Arrays;

/**
 * simple sorting algorithm, bubble sort, that works by repeatedly swapping the adjacent elements if they are in wrong order.
 */
public class SortingArrays {
    public static void main(String[] args) {

        int[] arr = {5,2,6,7,8,4,1,6};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i ; j++) {
                if(arr[j-1] > arr[j]){
                    //swap elements
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println(Arrays.toString(arr));

        }

        System.out.println(Arrays.toString(arr));
    }
}
