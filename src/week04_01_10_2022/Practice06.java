package week04_01_10_2022;

import java.util.Scanner;

public class Practice06 {
    public static void main(String[] args) {
        /*
         *
         * Kullanicidan aldigi urunun adedini ve liste fiyatini alin,
         * kullaniciya musteri karti olup olmadigini sorun
         *
         * Musteri karti varsa, 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
         * Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin
         *
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter quantity of product: ");
        int quantityOfProduct = scan.nextInt();
        System.out.println("Enter price of product: ");
        int priceOfProduct = scan.nextInt();
        System.out.println("Do you have client card? ");
        char hasClientCard = scan.next().charAt(0);
        if (hasClientCard == 'Y'||hasClientCard == 'y') {
            if (quantityOfProduct > 10) {
                System.out.println("Price: " + (quantityOfProduct * priceOfProduct * 0.8));

            } else {
                System.out.println("Price: " + (quantityOfProduct * priceOfProduct * 0.85));
            }

        } else if (hasClientCard == 'N'|| hasClientCard == 'n') {
            if (quantityOfProduct > 10) {
                System.out.println("Price: " + (quantityOfProduct * priceOfProduct * 0.85));

            } else {
                System.out.println("Price: " + (quantityOfProduct * priceOfProduct * 0.9));
            }
        } else {
            System.out.println("Invalıd answer");
        }
        scan.close();

    }
}
