package week12_26_11_2022.statics;

public class StaticWorkStyle {

    static {
        System.out.println("first static");
    }

    static {
        System.out.println("second static");
    }

    public static void main(String[] args) {
        System.out.println("main method");
    }

    static {
        System.out.println("third static");
    }





}
