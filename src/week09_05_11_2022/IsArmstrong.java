package week09_05_11_2022;
public class IsArmstrong {
    public static void main(String[] args) {
        isArmstrong(153);
    }
    public static void isArmstrong(int number) {
        //59555
        int sum = 0;
        int numberDumy = number;
        while (number > 0) {
            int dumy = 1;
            for (int i = 0; i < 3; i++) {
                dumy *= number % 10;
            }
            sum = sum + dumy;
            number = number / 10;
        }
        if (sum == numberDumy) {
            System.out.println("armstrong");
        }else{
            System.out.println("not armstrong");
        }
    }
}
