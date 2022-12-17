package week13_03_12_2022.inheritance;

public class AppObjects {
    public static void main(String[] args) {

        Instagram instagram= new Instagram(10.2);
        System.out.println(instagram);
        System.out.println(instagram.version);
        instagram.postPhoto();
        System.out.println(instagram.name);
        instagram.useTheApp(30);
        System.out.println("======================");
        Discord discord= new Discord(5.4);
        System.out.println(discord);


    }
}
