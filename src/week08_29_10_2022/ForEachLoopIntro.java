package week08_29_10_2022;

import java.util.Arrays;

public class ForEachLoopIntro {
    public static void main(String[] args) {

        int [] numbers={1,2,3,4};

        for (int each:numbers) {
            System.out.println(each);
        }

        //toCharArray()
        String str="Adam";
        char[] letters=str.toCharArray();
        System.out.println(Arrays.toString(letters));

        //split(regex)

        String sentence="Java is a good language.";

        String [] word=sentence.split(" ");
        System.out.println(Arrays.toString(word));


    }
}
