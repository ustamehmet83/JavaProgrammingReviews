package week07_22_10_2022;

public class NestedLoopIntro {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {
                System.out.println("outer loop: "+i+" inner loop"+j);

            }

        }

        /*
        *******
        *******
        *******
        *******


         */

        int starNumberColumn=7;
        int starNumberRow=4;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("--------------");
        /*
        for (int i = 0; i < 28; i++) {

            System.out.print("*");
            if(i==6){
                System.out.println();
            }
            if(i==13){
                System.out.println();
            }
            if(i==20){
                System.out.println();
            }
            if(i==27){
                System.out.println();
            }
        }
*/
        int count=0;
        for (int i = 0; i < 28; i++) {

            System.out.print("*");
            count++;
            if(count==7){
                System.out.println();
                count=0;
            }
        }
























    }
}
