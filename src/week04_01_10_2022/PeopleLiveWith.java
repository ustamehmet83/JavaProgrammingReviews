package week04_01_10_2022;

import java.util.Scanner;

public class PeopleLiveWith {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many people they live with?:");
        int peopleWith = scan.nextInt();
        if (peopleWith < 3) {
            System.out.println("Live with less than 3 people");
        } else if (3 <= peopleWith && peopleWith <= 6) {
            System.out.println("Live with 3-6 people");
        } else {
            System.out.println("Live with more than 6 people");
        }


    }
}
