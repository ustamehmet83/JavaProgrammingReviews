package week08_29_10_2022;

public class Palindrome {
    public static void main(String[] args) {
        /*
        Task 4 :  For Each - Nested For

            Longest Palindrome

                Given a String array. Find the longest Palindrome String in your array.
                    Ex:
                    Input: [“java”, “longer word”, “civic” “apple”, “racecar”, “mom”, “anna”] Output: racecar
                    Ex:
                    Input: [“abc”, “dna”, “kevin”, “joe”, “lamp”]
                    Output: No palindrome
         */
        String[] palindrome = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};

        int count = 0;
        String word1 = "";
        for (String word : palindrome) {
            String reversed = "";
            for (int i = word.length() - 1; i >= 0; i--) {

                reversed += word.charAt(i);

            }
            if (word.equals(reversed)) {
                if (word.length() > count) {
                    word1 = word;
                    count = word.length();
                }
            }
        }
        if(word1.isBlank()){
            System.out.println("No palindrome");
        }else{
            System.out.println(word1);
        }

    }
}
