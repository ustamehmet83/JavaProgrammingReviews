package week21_28_01_2023.enums;

import static week21_28_01_2023.enums.Day.Sunday;

public class TestEnum {
    public static void main(String[] args) {

        Day day = Sunday;


        day=Day.Monday;


        switch (day) {
            case Monday:
                System.out.println("Today is "+ day);
                break;
            case Tuesday:
                System.out.println("Today is "+ day);
                break;
            case Wednesday:
                System.out.println("Today is "+ day);
                break;
            case Thursday:
                System.out.println("Today is "+ day);
                break;
            case Friday:
                System.out.println("Today is "+ day);
                break;
            case Saturday:
                System.out.println("Today is "+ day);
                break;
            case Sunday:
                System.out.println("Today is "+ day);
                break;

        }


    }
}
