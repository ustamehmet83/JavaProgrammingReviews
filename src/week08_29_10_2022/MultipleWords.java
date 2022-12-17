package week08_29_10_2022;

import java.util.Arrays;

public class MultipleWords {
    public static void main(String[] args) {
        /*Task 2 :    Write a program that accepts string and prints multiple words in the string

        "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer”

        output : wooden spoons
                 trash can
                  dish washer

         */

        String sentence ="knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer";

        String [] words =sentence.split(",");
        for (String word:words) {

            if(word.trim().contains(" ")){
                System.out.println(word);
            }

        }



    }

}

