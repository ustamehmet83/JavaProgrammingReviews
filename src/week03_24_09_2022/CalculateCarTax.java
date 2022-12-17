package week03_24_09_2022;

public class CalculateCarTax {
    /*
    Task 5: Create a class which is "CalculateCarTax"
        if the price between $20000 and $39999 taxRate=0.2
        if the price between $40000 and $59999 taxRate=0.3
        if the price between $60000 and $80000 taxRate=0.4
     */
    public static void main(String[] args) {

        int price = 50000;
        double tax= 0.1;
        if (price<80000 && price>19999) {
            if (price>=20000 && price<=39999) {
                tax=0.2;
            } else if (price>=40000 && price<=59999) {
                tax=0.3;
            }else{
                tax=0.4;
            }
        }else{
            System.out.println("Invalid Price");
        }
        double CalculateCarTax= price*tax;
        System.out.println(CalculateCarTax);





    }

}
