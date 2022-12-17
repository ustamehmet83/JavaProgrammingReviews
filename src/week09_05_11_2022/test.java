package week09_05_11_2022;

import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        //DO NOT TOUCH THE FOLLOWING LINES
        Scanner input = new Scanner(System.in);
        float[] score = new float[7];
        //WRITE YOUR CODE HERE

        System.out.println("Enter score for judge 1:");
        score [0]=input.nextInt();
        System.out.println("Enter score for judge 2:");
        score [1]=input.nextInt();
        System.out.println("Enter score for judge 3:");
        score [2]=input.nextInt();
        System.out.println("Enter score for judge 4:");
        score [3]=input.nextInt();
        System.out.println("Enter score for judge 5:");
        score [4]=input.nextInt();
        System.out.println("Enter score for judge 6:");
        score [5]=input.nextInt();
        System.out.println("Enter score for judge 7:");
        score [6]=input.nextInt();
        System.out.println("Enter the difficulty rating:");
        float rate=input.nextFloat();
        float totalScore=0;
        Arrays.sort(score);
        for(int i=1; i< score.length-1;i++){
            totalScore+=score[i]*rate;
        }
        System.out.println(totalScore);
    }
}
