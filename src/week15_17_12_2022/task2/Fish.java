package week15_17_12_2022.task2;

public class Fish extends Animal{
    public void move(){
        super.move();
        System.out.println(getClass().getSimpleName()+" are swimming");
    }
}
