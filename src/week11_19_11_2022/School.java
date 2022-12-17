package week11_19_11_2022;

import java.util.ArrayList;
import java.util.Arrays;

public class School {
    public static void main(String[] args) {

        Student student1= new Student("Ahmet",'M',23,15,146,'A');
        Student student2= new Student("Mehmet",'M',12,19,156,'B');
        Student student3= new Student("Elif",'F',05,18,126,'C');
        Student student4= new Student("Rumeysa",'F',15,20,116,'A');
        ArrayList<Student>studentAll=new ArrayList<>();

        studentAll.addAll(Arrays.asList(student1,student2,student3,student4));

        System.out.println(nameStartWithA(studentAll));
    }


    public static ArrayList nameStartWithA(ArrayList<Student>studentAll){
   ArrayList<String>list=new ArrayList<>();
        for(Student each:studentAll){
            if (each.name.startsWith("A")){
                list.add(each.name);
            }

        }
        return list;

        }


    }

