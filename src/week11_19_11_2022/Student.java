package week11_19_11_2022;

public class Student {
    public String name;
    public char gender;
    public int dateOfBirth;
    public int age;
    public int studentID;
    public char grade;


    public Student(String name, char gender, int dateOfBirth, int age, int studentID, char grade) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.studentID = studentID;
        this.grade = grade;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                ", age=" + age +
                ", studentID=" + studentID +
                ", grade=" + grade +
                '}';
    }
}
