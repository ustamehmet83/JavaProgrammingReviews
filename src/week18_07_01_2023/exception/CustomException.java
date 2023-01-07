package week18_07_01_2023.exception;



public class CustomException {
    public static void main(String[] args) {
        try {
            System.out.println(3/0);
        } catch (Exception e) {
            throw new CustomArithmeticException("You have an error");
        }
    }

}
