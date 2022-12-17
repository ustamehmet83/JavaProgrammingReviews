package week02_17_09_2022;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class BonusForWeek {
    public static void main(String[] args) {

        LocalDateTime today = LocalDateTime.now();
        System.out.println("today = " + today);
        int hour = today.getHour();
        int minute = today.getMinute();
        int second = today.getSecond();
        System.out.println(hour + ":" + minute + ":" + second);


    }


}
