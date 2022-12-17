package week12_26_11_2022.student;

public class Student {
    /*
     Class Name: Student

            instance variables:
                    name, age, batchNumber

            static variables :
                    school

            1st constructor: initializes the name ONLY

            2nd constructor: initializes name & age
                        (MUST use constructor call to set the name)

            3rd Constructor: initializes name, age ,batchNumber
                        (MUST use constructor call to set the name & age)


            instance methods: toString()
     */

    public String name;
    public int age;
    public long batchNumber;

    public static String school;

    public Student(String name){
        this.name=name;
    }
    public Student(String name, int age){
        this(name);
        this.age=age;
    }
    public Student(String name,int age,long batchNumber) {
        this(name,age);
        this.batchNumber=batchNumber;
    }


    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", school=" + school +
                '}';
    }



    static {
        school="Cydeo";
    }


}
