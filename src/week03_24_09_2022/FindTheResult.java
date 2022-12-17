package week03_24_09_2022;

public class FindTheResult {
    /*
Task 6: Create a class which is "FindTheResult" create a variable
int a=15;
 if a is divisable by 3 add 20
 if a is divisable by 5 add 25
 if a is divisable by 15 add 50
 */
    public static void main(String[] args) {

        int a = 15;
        int b = 0;
        int c = 0;
        int d = 0;

        if (a % 3 == 0) {
            b += 20;
        }
        if (a % 5 == 0) {
            c += 25;
        }
        if (a % 15 == 0) {
            d += 50;
        }
        System.out.println(a + b + c + d);

    }
}
