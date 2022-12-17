package week15_17_12_2022.task1;

public class Bank {
    private int capital=10000;
    public int getCapital(){
        return capital;
    }
    // how we can get the class name?
    // the answer is getClass().getSimpleName()
    public void calcTheInterest(){
        System.out.println("Interest of the "+ getClass().getSimpleName());
    }





}
