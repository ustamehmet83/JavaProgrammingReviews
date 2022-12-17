package week03_24_09_2022;

public class SingleAndDoubleAnd {

    public static void main(String[] args) {

        boolean result = false;
        int a = 10;

        if (result & a++ < 12) {

        }
        System.out.println("a = " + a);
        int b = 10;

        if (result && b++ < 12) {

        }
        System.out.println("b = " + b);

        System.out.println("==============");
        boolean result2 = true;
        int a2 = 10;

        if (result2 & a2++ < 12) {

        }
        System.out.println("a2 = " + a2);
        int b2 = 10;

        if (result2 && b2++ < 12) {

        }
        System.out.println("b2 = " + b2);






        }
    }
