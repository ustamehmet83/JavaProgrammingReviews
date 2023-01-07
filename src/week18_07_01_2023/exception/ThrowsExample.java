package week18_07_01_2023.exception;

public class ThrowsExample {
    public static void main(String[] args) throws InterruptedException {

        Thread.sleep(3000);
        waitFor(3);
        sleep(4);
    }
    public static void sleep(int seconds){
        try {
            Thread.sleep(seconds*1000);
        }catch (InterruptedException e){

        }
    }

    public static void waitFor(int seconds) throws InterruptedException{
        sleep(seconds*1000);
    }







}
