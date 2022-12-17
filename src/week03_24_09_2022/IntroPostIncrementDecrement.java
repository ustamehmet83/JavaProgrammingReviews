package week03_24_09_2022;

public class IntroPostIncrementDecrement {
    public static void main(String[] args) {

        int a=5;
        System.out.println(a);//a=5
        System.out.println(a++);//print=5,after a=6
        System.out.println(++a);//print=7,after a=7
        System.out.println(a);

        int x = 10;
        int number=x++ + 100;
        System.out.println("x = " + x);
        System.out.println("number = " + number);

        int number2=++x+100;
        System.out.println("x = " + x);
        System.out.println("number2 = " + number2);




    }




}
