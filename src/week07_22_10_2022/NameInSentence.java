package week07_22_10_2022;

public class NameInSentence {
    public static void main(String[] args) {
        /*
        --  Task 3: Count each name in sentence.

    input :

  String names = "Adam Adam Barry Aysun Aysun";

    output:

    Adam-2 Barry-1 Aysun-2
         */

        String str = "     ahmet           Adam             Adam                Barry        Aysun Aysun   ";

        String temp = "";

        String result = "";

        str=str.trim();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch != ' ') {
                temp += ch;

                continue;
            }
            int count = 0;
            String dumy = str;
            while (dumy.contains(temp)&& !temp.equals("")) {
                count++;
                dumy = dumy.replaceFirst(temp, "");
            }
            if (!result.contains(temp)){
                result += temp + "-" + count + " ";
            }

            temp = "";

        }

        System.out.println(result);


    }
}
