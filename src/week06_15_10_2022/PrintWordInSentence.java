package week06_15_10_2022;

public class PrintWordInSentence {
    public static void main(String[] args) {


    /*
    Task 3: Given a sentence which is string and print the each word.


input:

String str="Java is java in everywhere is Java";

output:
Java
is
java
in
.
.
.
     */
        String str = "Java is java in everywhere is Java";

        String temp = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch != ' ') {
                temp += ch;
            }

            if (ch == ' ') {
                System.out.println(temp);
                temp = "";
            }
        }

        System.out.println(temp);

    }


}
