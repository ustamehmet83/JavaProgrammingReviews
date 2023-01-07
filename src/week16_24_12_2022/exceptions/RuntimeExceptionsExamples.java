package week16_24_12_2022.exceptions;

import week15_17_12_2022.task3.Employee;

public class RuntimeExceptionsExamples {
    //ArithmeticException
    static Employee employee;// we need to make it static in order to use inside main method which is static

    public static void main(String[] args) {

        // ArithmeticException
        //ctrl + alt+ t
        try {
            for (int i = 5; i >= 0; i--) {
                System.out.println(60 / i);// java.lang.ArithmeticException

            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());//simple message
            e.printStackTrace();// Detailed message
        }
        //NullPointerException
        // you can not reach instance variables or methods from the static block or method
        //java.lang.NullPointerException if you want to reach object fields or methods you have to initialize it.
        // mean creating object
        //System.out.println(employee.salary());
        // NumberFormatException
        try {
            String s = "123.";
            System.out.println(Integer.parseInt(s));
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }


        //ArrayIndexOutOfException
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        //java.lang.ArrayIndexOutOfBoundsException : Index 3 out of bounds for length 3
        //StringIndexOutOfBoundsException
        try {
            String name="Adam";
            System.out.println(name.charAt(4));
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
//java.lang.StringIndexOutOfBoundsException: String index out of range: 4
    }

}

