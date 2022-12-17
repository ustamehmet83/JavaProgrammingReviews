package week06_15_10_2022;

public class CountWordWithWhite {
    public static void main(String[] args) {
        String sentence= "Java is java in everywhere is Java";
        int count=1;

        for (int i = 0; i < sentence.length(); i++) {

            if (sentence.charAt(i)==' '){
                count++;
            }
        }
        System.out.println(count);






    }
}
