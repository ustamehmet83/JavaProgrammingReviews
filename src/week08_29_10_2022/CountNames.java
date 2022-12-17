package week08_29_10_2022;

public class CountNames {
    public static void main(String[] args) {
        /*
        Task 3 : Write a program that accepts String array.
        Count how many names have the same first and last letter

                Input : "Anna", "Mike", "Aliya", "Donald", "Muhtar", "Remus", "Mehmet","Asya"

                Output : 4
         */
        int count = 0;
        String[] sentence = {"Anna", "Mike", "Aliya", "Donald", "Muhtar", "Remus", "Mehmet", "Asya"};
        for (String word : sentence) {
            if (("" + word.charAt(0)).equalsIgnoreCase("" + word.charAt(word.length() - 1))) {
                count++;
            }
        }
        System.out.println(count);
    }
}
