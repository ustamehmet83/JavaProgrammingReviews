package week03_24_09_2022;

import java.util.Scanner;

public class IsCorrect {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);

        System.out.print("Enter number = ");
        int number = num.nextInt();

        if (number % 3 == 0  &&  number % 5 != 0) {
            number += 20;
            System.out.println("New Number = " + number);
        }else if (number % 5 == 0  &&  number % 3 != 0) {
            number += 25;
            System.out.println("New Number = " + number);

        }else if (number % 3 == 0  &&  number % 5 == 0) {
            number += 50;
            System.out.println("New Number = " + number);

        }else {
            System.err.println("INVALID NUMBER");
        }
    }
}

