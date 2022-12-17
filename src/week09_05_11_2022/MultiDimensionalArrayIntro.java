package week09_05_11_2022;

import java.util.Arrays;

public class MultiDimensionalArrayIntro {
    public static void main(String[] args) {

        int[] firstArray = {1, 2, 3};
        int[] secondArray = {1, 2, 3};
        int[] thirdArray = {1, 2, 3};

        int[][] twoDimensionArray = {
                {1, 2, 3},      //first array
                {4, 5, 6},      // second array
                {7, 8, 9, 10}    // third array
        };
        System.out.println(Arrays.toString(twoDimensionArray[0]));
        System.out.println(twoDimensionArray[0][1]);

    }
}
