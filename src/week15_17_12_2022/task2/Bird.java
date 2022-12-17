package week15_17_12_2022.task2;

public class Bird extends Animal{
    public void move(){
        super.move();
        System.out.println(getClass().getSimpleName()+"s are flying");
    }
}
