package week05_08_10_2022;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a word : ");
        String word= scan.next();

        String wordUpper = word.toUpperCase();
        System.out.println(""+wordUpper.charAt(0)+wordUpper.charAt(1));



    }


}
