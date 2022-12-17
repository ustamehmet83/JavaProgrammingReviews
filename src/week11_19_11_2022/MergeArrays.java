package week11_19_11_2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MergeArrays {
    public static void main(String[] args) {
        ArrayList<Integer> first=new ArrayList<>(Arrays.asList(1,2,3));
        ArrayList<Integer> second=new ArrayList<>(Arrays.asList(4,5,6));

        ArrayList<Integer> merge=new ArrayList<>();
        int i=0;
        for (int each:first) {
            merge.add(each);
            i++;
        }
        for (int each:second) {
            merge.add(each);
            i++;
        }
        Integer [] arr= new Integer[merge.size()];
        merge.toArray(arr);
        System.out.println(Arrays.toString(arr));




    }

}
