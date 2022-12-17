package week09_05_11_2022;

public class AbsoluteNAnd21 {
    public static void main(String[] args) {
        int result = absoluteNAnd21(23);
        System.out.println(result);
    }

    public static int absoluteNAnd21(int n) {
        return (n<21)?21-n:(n-21)*2;
    }


}
