package week07_22_10_2022;

public class CatDogs {
    public static void main(String[] args) {
        /*
        -- Task 2:  Write a programt that replaces every occurrence of "cat" in
        the message with "dog", using indexOf and substring.

  input:
                    012345678910
  String message = "I love cats! I have a cat named Coco. My cat's very smart!";

  output:

 "I love dogs! I have a dog named Coco. My dog's very smart!";
         */

        String str="I love dogs! I have a dog dog named Coco. My dog's very dog smart!";
        String strNew="";
        int count=0;

        for (int i = 0; i < str.length()-2; i++) {
            String str2=str.substring(i,i+3);
            if(str2.equals("dog")){
                strNew+=str.substring(count,str.indexOf("dog"));
                strNew+="cat";
                i=i+3;
                count=i;
                str=strNew+str.substring(count);
            }
        }
        strNew+=str.substring(count);
        System.out.println(strNew);
    }
}
