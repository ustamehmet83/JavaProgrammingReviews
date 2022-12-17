package week04_01_10_2022;

import java.util.Scanner;

public class CentsToDollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter cents");
        int cents = scan.nextInt();
        int dollars = cents / 100;
        int remainder = cents % 100;
        if (remainder != 0) {
            System.out.println(cents + " cents equal to: " + dollars + " dollars and " + remainder + " cents");

        } else {
            System.out.println(cents + " cents equal to: " + dollars + " dollars");
            scan.close();

        }
    }
}
