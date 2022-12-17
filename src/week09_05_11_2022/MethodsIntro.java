package week09_05_11_2022;


public class MethodsIntro {
    public static void main(String[] args) {
        // method: reusable code fragment
        hello5Times();
        hello5Times();
        hello5Times();

        // we want to add two number
        //multiply that number

        int result=sum(5,6);
        multiplywith2AndPrint(result);

    }

    public static void multiplywith2AndPrint(int result){
        System.out.println(result*2);
    }
    public static int sum(int num1, int num2){
        int sum=num1+num2;
        return sum;
    }





    public static void hello5Times(){
        for (int i = 0; i < 5; i++) {
            System.out.println("hello");
        }
    }






}
