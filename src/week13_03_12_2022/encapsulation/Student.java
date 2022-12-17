package week13_03_12_2022.encapsulation;

public class Student {
    public String name;
    public int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
