package week21_28_01_2023;

import java.util.*;

public class IterableExample {
    public static void main(String[] args) {

        //List<String>list=List.of("apple","banana","chery","Cydeo","dog");

        // ı want to remove the word which is starting with "a"

        List<String>words=new ArrayList<>(Arrays.asList("apple","banana","cherry","Cydeo","dog"));

        Iterator<String>iterator=words.iterator();
        while(iterator.hasNext()){
            String word=iterator.next();
            if (word.startsWith("a")){
                iterator.remove();
            }
        }
        System.out.println(words);

        List<String>names=new ArrayList<>(Arrays.asList("apple","banana","cherry","Cydeo","dog"));

        Iterator<String>iterator2=names.iterator();
        while(iterator2.hasNext()){
            String word=iterator2.next();
            if (word.length()>5){
                iterator2.remove();
            }
        }
        System.out.println(names);//[apple, Cydeo, dog] insertion order

        //remove the word which has more than 5 letters

        Set<String>str=new HashSet<>(Arrays.asList("apple","banana","cherry","Cydeo","dog"));
        Iterator<String>iterator1=str.iterator();
        while(iterator1.hasNext()){
            String word=iterator1.next();
            if (word.length()>5){
                iterator1.remove();
            }
        }
        System.out.println(str);//[Cydeo, apple, dog] random order
    }
}
