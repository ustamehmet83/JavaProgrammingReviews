package week02_17_09_2022;

public class ConvertMinutesToYearAndDay {
    public static void main(String[] args) {
        int minutes = 3456789;
        int howManyMinutes = 365 * 24 * 60;
        int year = minutes / howManyMinutes;
        int remainderMinutes = minutes % howManyMinutes;
        int days = remainderMinutes / (24 * 60);

        //int days = (minutes - (365*24*60+6*60)*year)%(365*24*60+6*60);
        System.out.println(minutes + " minutes is approximately " + year + " years and " + days + " days ");


    }


}
