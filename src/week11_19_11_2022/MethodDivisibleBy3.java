package week11_19_11_2022;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodDivisibleBy3 {
    public static void main(String[] args) {

        ArrayList<Integer>number2=new ArrayList<>();
        number2.addAll(Arrays.asList(2,3,4,5,6,8,9));
        System.out.println(divisibleBy3(number2));

    }


    public static ArrayList<Integer> divisibleBy3(ArrayList<Integer>numbers){
        ArrayList<Integer>numberDivisibleBy3=new ArrayList<>();
        for (int each: numbers){
            if(each%3==0)
                numberDivisibleBy3.add(each);
        }
        return numberDivisibleBy3;
    }
}
