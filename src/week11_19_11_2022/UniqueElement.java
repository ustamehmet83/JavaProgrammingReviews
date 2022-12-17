package week11_19_11_2022;

import java.util.ArrayList;
import java.util.Arrays;

public class UniqueElement {

    public static void main(String[] args) {

        int [] first={1,2,3,4,5};
        int [] second={4,5,6};

        ArrayList<Integer> arr= new ArrayList<>();

        for (int each:first) {
            if (!arr.contains(each)){
                arr.add(each);
            }
        }
        for (int each:second) {
            if (!arr.contains(each)){
                arr.add(each);
            }
        }
        System.out.println(arr);






    }




}
