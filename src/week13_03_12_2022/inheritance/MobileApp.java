package week13_03_12_2022.inheritance;

public class MobileApp {
    protected String name;
    protected double version;


    public MobileApp(String name, double version) {
        this.name = name;
        this.version = version;
    }
    public void useTheApp(int minutes){
        System.out.println("The user is using " +name+ "application for "+ minutes + " minutes");
    }




    public void download(){
        System.out.println(name+" applicaiton is downloading by the user. ");

    }

    public String toString() {
        return "MobileApp{" +
                "name='" + name + '\'' +
                ", version=" + version +
                '}';
    }

}
