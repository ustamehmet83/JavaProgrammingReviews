package week05_08_10_2022;

import java.util.Scanner;

public class Practice {
    /*
    Task 3: Given a string, return a version without the first and last char, so "Hello" yields "ell".
      Hint: The string length will be at least 2.
     */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a word: ");
        String word=scan.next();
        String wordWithOutLastAndFirst="";
        if (word.length()>2){
            wordWithOutLastAndFirst=word.substring(1,word.length()-1);
            System.out.println(wordWithOutLastAndFirst);
        }else{
            System.out.println("Print word more than two character");
        }





    }
}
