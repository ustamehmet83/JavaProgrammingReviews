package week05_08_10_2022;

public class Password {
    /*
    Task 9: Given a string password. Encrypt with "x" a given password and print.

    Hint: do with for loop

     * password: cydeo
     * encrypt with char :x
     * output:cxyxdxexox
     */
    public static void main(String[] args) {
        String str = "cydeo";
        int length = str.length();
        String str1 = "";
        for (int i = 0; i < length; i++) {

            str1 += str.charAt(i) + "x";

        }
        System.out.println(str1);
    }

}
