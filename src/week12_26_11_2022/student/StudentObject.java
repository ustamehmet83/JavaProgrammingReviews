package week12_26_11_2022.student;


import week12_26_11_2022.student.Student;

import static week12_26_11_2022.student.Student.*;

public class StudentObject {
    public static void main(String[] args) {

    Student student1= new Student("Adam");
        System.out.println(student1.toString());
        System.out.println(school);

    }

    static {
        System.out.println(school);
    }
}
