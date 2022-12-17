package week08_29_10_2022;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {
        // if we know the element of the array
        int[] arrayName = {1, 2, 3, 4, 5, 6};

        // if we do not know the elements we have to
        // define size of array
        // use knew keyword
        int[] array = new int[10];
        array[0] = 10;
        array[1] = 10;
        array[2] = 10;
        array[3] = 10;
        array[4] = 10;
        array[5] = 10;
        array[6] = 10;
        array[7] = 10;
        array[8] = 10;
        array[9] = 10;
        // have to print the elements we need to use toString()
        // method with Arrays utility class
        System.out.println(Arrays.toString(array));
        char[] letters={'B','C','D','Y'};
        System.out.println(Arrays.toString(letters));

        char[] ch= new char[5];
        System.out.println(Arrays.toString(ch));

        boolean [] array1=new boolean[3];
        System.out.println(Arrays.toString(array1));

        // sort method is sorting elements to smaller to bigger

        int [] number= {1,2,4,8,5,9,2,8,2,6,7,3};
        Arrays.sort(number);
        System.out.println(Arrays.toString(number));

        //equals method of elements are important

        int[] array3={1,2,3};
        int[] array4={2,3,1};

        System.out.println(Arrays.equals(array3,array4));
        Arrays.sort(array4);
        System.out.println(Arrays.equals(array3,array4));








    }
}
