package week04_01_10_2022;

import java.util.Scanner;

public class PlaceAnOrder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the product name:");
        String productName= scan.nextLine();
        System.out.println("enter the price");
        double price= scan.nextDouble();
        System.out.println("enter the quantity");
        int quantity=scan.nextInt();
        System.out.println("enter their first name");
        String firstName=scan.next();
        scan.close();
        double totalPrice=price*quantity;
        System.out.println(firstName+", your order for "+quantity+" "+productName+" has been places. Your total is "+totalPrice+".");









    }
}
