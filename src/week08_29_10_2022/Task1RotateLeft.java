package week08_29_10_2022;

import java.util.Arrays;

public class Task1RotateLeft {
    public static void main(String[] args) {
        /*Task 1    : Write a program that accepts an array
        and prints an array with the elements "rotated left”

        int[] x = {1,2,3};             // = > [2,3,1]
        int[] y = {17,12,10,8};         // = > [12,10,8,17]
        int[] a = {7,0,0};              // = > [0,0,7]
        ?
         */

        int[] y = {17, 12, 10, 8};

        int temp = y[0];

        for (int i = 0; i < y.length - 1; i++) {
            y[i] = y[i + 1];

        }
        y[y.length - 1] = temp;
        System.out.println(Arrays.toString(y));


    }
}
