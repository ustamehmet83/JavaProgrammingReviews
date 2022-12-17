package week06_15_10_2022;

import java.util.Scanner;

public class WarmUpTask {
    public static void main(String[] args) {
        /*
        - Given a non-empty string like "Code" print a string like below output.

 *                                 Code → "CCoCodCode"
 *                                 abc → "aababc"
 *                                 ab → "aab"
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = scan.next();
        String temp = "";
        for (int i = 0; i <= word.length(); i++) {
            String word2 = word.substring(0, i);
            temp += word2;
        }
        System.out.println(temp);
    }

}










