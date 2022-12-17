package week04_01_10_2022;

public class CharacterType2 {
    public static void main(String[] args) {
      /*
      Given a character, the task is to check whether the given character is in upper case, lower case, or non-alphabetic         character

                            Input: ch = 'A'
                            Output: A is an UpperCase character

                            Input: ch = 'a'
                            Output: a is an LowerCase character

                            Input: ch = '0'
                            Output: 0 is not an aplhabetic character
       */


        char ch = 'A';
        boolean isUpperCase = ch >= 'A' && ch <= 'Z';
        boolean isLowerCase = ch >= 'a' && ch <= 'z';
        boolean isNotAlphabetic = !(isLowerCase || isLowerCase);

        if (isUpperCase) {
            System.out.println(ch + " is an Upper Case Character");
        }
        if (isLowerCase) {
            System.out.println(ch + "is Lower Case Character");
        }
        if (isNotAlphabetic) {
            System.out.println(ch + " is not an alphapedic character");
        }
    }
}




