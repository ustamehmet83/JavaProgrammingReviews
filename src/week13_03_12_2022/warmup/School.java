package week13_03_12_2022.warmup;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class School {

    /*
    Task 1 :
         1. create a class named Teacher that has the followings features:
                Attributes:
                    name,lastName, gender, dateOfBirth(use LocalDate), age, id

                Methods:

                    sets all the attributes of the teacher object
                    toString(): returns the full info of teacher Object

        2. create a class which is School with main method

        3. create a list of teacher in School class inside the STATIC BLOCK

        4. create a method in School class which is returning the list of teachers if the last name start with "M"

        5. create a method in School class then you will find the female teachers

        6. create a method in School class then find the teachers age smaller than 30

        7. create a methot in School class then find the teachers born in 1967 year
     */


    static ArrayList<Teacher> teachers = new ArrayList<>();

    static {

        Teacher teacher1 = new Teacher("Muhtar", "M", 'M', LocalDate.of(1987, 12, 3), 1L);
        Teacher teacher2 = new Teacher("Gurkan", "M", 'M', LocalDate.of(1977, 12, 3), 2L);
        Teacher teacher3 = new Teacher("Aysun", "M", 'F', LocalDate.of(1967, 12, 3), 3L);
        Teacher teacher4 = new Teacher("Mike", "M", 'M', LocalDate.of(1970, 12, 3), 4L);
        Teacher teacher5 = new Teacher("Saim", "M", 'M', LocalDate.of(1989, 12, 3), 5L);
        Teacher teacher6 = new Teacher("Asya", "M", 'F', LocalDate.of(1990, 12, 3), 6L);
        teachers.addAll(Arrays.asList(teacher1, teacher2, teacher3, teacher4, teacher5, teacher6));
    }


    public static void main(String[] args) {

        System.out.println(teachers);

        ArrayList<Teacher> result = getTeachersNamesStartWith("M");
        System.out.println(result);
        ArrayList<Teacher> females = getTeachersByGender('F');
        System.out.println(females);
    }

    private static ArrayList<Teacher> getTeachersNamesStartWith(String prefix) {
        ArrayList<Teacher> result = new ArrayList<>();
        for (Teacher teacher : teachers) {
            if (teacher.name.startsWith(prefix)) {
                result.add(teacher);
            }
        }
        return result;
    }

    private static ArrayList<Teacher> getTeachersByGender(char gender) {
        ArrayList<Teacher> result = new ArrayList<>();
        for (Teacher teacher : teachers) {
            if (teacher.gender == gender) {
                result.add(teacher);
            }
        }
        return result;
    }

}
