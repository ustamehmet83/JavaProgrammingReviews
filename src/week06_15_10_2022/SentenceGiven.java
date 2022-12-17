package week06_15_10_2022;

public class SentenceGiven {
    /*
    Task 1: Given a sentence which is string find word how many times repeats in it.

Hint: use substring with for loop

input:
*                                String str="Java is java in everywhere is Java";
*                                String word="Java";
output:3
     */

    /*

    String sentence= "Java is Java in everywhere is Java";
    String word="Java";
    int count= 0;

    for (int i = 0; i <= sentence.length()-word.length(); i++) {

        String each = sentence.substring(i,i+word.length());

        if(word.equalsIgnoreCase(each)){
            count++;
        }
    }
    System.out.println(count);


     */
    public static void main(String[] args) {
        String sentence = "Java is java in everywhere is Java";
        String word = "Java";
        int count = 0;
        sentence = sentence.toLowerCase();
        word = word.toLowerCase();
        while (sentence.contains(word)) {
            count++;
            sentence = sentence.replaceFirst(word, " ");
        }
        System.out.println(count);
    }
}
