package week04_01_10_2022;

import java.util.Scanner;

public class SpeedCheck {
    public static void main(String[] args) {
        int speedLimit=55;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the current speed:");
        int currentSpeed= scan.nextInt();
        if (currentSpeed>speedLimit){
            System.out.println("You're driving 50 mph over the limit. Slow down!");
        }
        scan.close();
    }
}
