package week09_05_11_2022;

public class OurTrim {
    public static void main(String[] args) {

ourTrim("    hello");

    }
    public static void ourTrim(String word){
        String dumy="";
        for (int i = 0; i < word.length(); i++) {
            if(!(""+word.charAt(i)).equals(" ")){
                dumy+=word.charAt(i);
            }
        }
        System.out.println(dumy);

    }


}
