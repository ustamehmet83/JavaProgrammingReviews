package week07_22_10_2022;

public class ReverseWordInSentence {
    public static void main(String[] args) {
        /*
        --  Task 4: Reverse each word in a sentence.

    input:

    String str = "Adam come here";

    output:

    madA emoc ereh
         */

        String str="Adam come here";
        String temp="";
        String temp2="";

        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            temp+=ch;
            if(ch!=' '&& i!=str.length()-1){
               continue;
            }
            for (int j = temp.length()-1; j >= 0; j--) {

                char ch2=temp.charAt(j);
                temp2+=ch2;
            }
            temp=" ";
        }
        System.out.println(temp2.trim());







    }
}
