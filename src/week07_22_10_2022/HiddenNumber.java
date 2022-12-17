package week07_22_10_2022;

import java.util.Random;
import java.util.Scanner;

public class HiddenNumber {
    public static void main(String[] args) {
        /*
        -- Task 1: Find the number taht given a hidden number between 1 and 100 randomly created.

 Hint:   Random random=new Random();

        int hiddenNumber = random.nextInt(100) + 1;
         */

        Random random = new Random();
                             // create a number from 0 (inclusive) to 10(exclusive)
        int hiddenNumber = random.nextInt(10) + 1;


        Scanner scan = new Scanner(System.in);
        boolean flag = true;

        do {
            System.out.println("Enter a number");
            int searchedNumber = scan.nextInt();
            if (searchedNumber == hiddenNumber) {
                System.out.println("you find number Congrats");
                flag=false;
            }
        }while( flag);
        }
    }















