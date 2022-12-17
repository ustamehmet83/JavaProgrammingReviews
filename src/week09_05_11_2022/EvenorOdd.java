package week09_05_11_2022;

public class EvenorOdd {
    public static void main(String[] args) {
        evenorOdd(5);
        isPrimeOrnot(1);
    }

    public static void evenorOdd(int number){
        if(number%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }

    public static void isPrimeOrnot(int number){
        String result="prime";
        if(number<2){
            result ="not prime";
        }
        for (int i = 2; i < number; i++) {
            if(number%i!=0){
                result="prime";
            }else{
                result="not prime";
                break;
            }
        }
        System.out.println(result);
    }




}
