package week05_08_10_2022;

import java.util.Scanner;

public class CalculatorWithSwitch {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double firstNumber = scan.nextDouble();
        System.out.println("Enter second number: ");
        double secondNumber = scan.nextDouble();

        System.out.println("Enter operator: ");
        char operator = scan.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println(firstNumber + secondNumber);
                break;
            case '-':
                System.out.println(firstNumber - secondNumber);
                break;
            case '*':
                System.out.println(firstNumber * secondNumber);
                break;
            case '/':
                System.out.println(firstNumber / secondNumber);
                break;
            default:
                System.out.println("invalid operator");
                break;


        }

        scan.close();
    }
}
