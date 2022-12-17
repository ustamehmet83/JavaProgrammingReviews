package week09_05_11_2022;

import java.util.Scanner;

public class has55 {
    public static void main(String[] args) {
        //DO NOT TOUCH BELOW:
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TYPE YOUR CODE BELOW:
        String result="false";
        for(int i=0; i <nums.length-1;i++){
            if(nums[i]==5 && nums[i+1]==5){
                result="true";
                break;
            }
            if(nums[i]==5 && nums[i+1]!=5){
                result="The 5s are not next to each other";
                break;
            }
            if(nums[i]!=5){
                result="There is no 5 in this array";
            }

        }
        System.out.println(result);

    }
}
