package week09_05_11_2022;

import java.util.Arrays;

public class week10_12_11_2022 {
    public static void main(String[] args) {
       fibonacci(8);
       String z =fibonacci2(8);
        System.out.println(z);
        int[ ] array=fibonacci3(18);
        System.out.println(Arrays.toString(array));
    }
    public static void fibonacci(int num){

        int x=0;
        int y=1;
        int z=0;
        for (int i = 0; i <= num; i++) {
            z=x;
            x=y;
            y=z+y;
            System.out.print(z+" ");
        }
    }
    public static String fibonacci2(int num){

        int x=0;
        int y=1;
        int z=0;
        String fibonacci="";
        for (int i = 0; i <= num; i++) {
            z=x;
            x=y;
            y=z+y;
            fibonacci+=" "+z;
        }
        return fibonacci;
    }
    public static int [] fibonacci3(int num){

        int x=0;
        int y=1;
        int z=0;
        int [] fibonacci= {};
        for (int i = 0; i <= num; i++) {
            z=x;
            x=y;
            y=z+y;
            int[] temp = new int[fibonacci.length + 1];
            i=0;
            for (int each : fibonacci) {
                temp[i++] = each;
            }
            temp[i] = z;
            fibonacci=temp;
        }
        return fibonacci;
    }















}
