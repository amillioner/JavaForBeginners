package techno.study.ch3;

public class MultiDimensionalArrays {

    public static void main(String[] args) {
        // declaring and initializing 2D array
        int arr[][] = {{1, 2, 3}, {2, 4, 5}, {4, 4, 5}};
        // printing 2D array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    //TODO Task
    //  0. Get sum from 2D array
    //    ex: {{1,2,3}, {3,2,1}} => 12
    //  1. Get average of each student in 2D array
    //    ex: {                  {
    //          {5,5,5},           5,
    //          {4,4,4}      =>    4
    //        }                  }
    //  3. Transpose an 2D array, such that rows become columns
    //    ex: 1 2 3     1 4
    //        4 5 6  => 2 5
    //                  3 6
}
