package week04_01_10_2022;

public class CodilityTask {
    public static void main(String[] args) {
        int number=1;
        String result ="";
        if (number>0) {
            if(number%2==0){
                result="Codility";
            }
            if(number%3==0){
                result+="Test";
            }
            if(number%5==0){
                result+="Coders";
            }
            if (number%2!=0 ||number%3!=0 ||number%5!=0){
                System.out.println("number is not devisible by 2,3, or5");
            }


        }else{
            System.out.println("Your number is smaller than 0");
        }
        System.out.println("result = " + result);
    }

    /*

    Task 1:
  Write a function:
            that, given a positive integer N  However, any number divisible by 2, 3 or 5 should be replaced by the word

                                Codility -- 2
                                Test     -- 3
                                Coders   -- 5

            - If a number is divisible by more than one of the numbers:2,3 or 5, it should be replaced by a
            concatenation of the respective words Codility, Test and Coders in this given order.

                                EXPECTED

                        numbers divisible by both 2 and 3 should be replacée by CodilityTest
                        INPUT : 6    OUTPUT :  CodilityTest

                        numbers divisible by allthree numbers: 2,3 and 5, should be replaced by CodilityTestCoders.
                        INPUT : 30    OUTPUT :  CodilityTestCoders
     */















}
