package week03_24_09_2022;

public class FindTheResult2 {
    public static void main(String[] args) {
        int a = 15;

        if (a % 3 == 0 && a % 5 != 0 && a % 15 != 0) {
            a += 20;
        } else if (a % 3 != 0 && a % 5 == 0 && a % 15 != 0) {
            a += 25;

        } else if (a % 3 != 0 && a % 5 != 0 && a % 15 == 0) {
            a += 50;
        } else if (a % 3 == 0 && a % 5 == 0 && a % 15 != 0) {
            a += 45;

        } else if (a % 3 == 0 && a % 5 != 0 && a % 15 == 0) {
            a += 70;

        } else if (a % 3 != 0 && a % 5 == 0 && a % 15 == 0) {
            a += 75;

        } else if (a % 3 == 0 && a % 5 == 0 && a % 15 == 0) {
            a += 95;

        } else {
            a += 0;
        }

        System.out.println(a);
    }
}
