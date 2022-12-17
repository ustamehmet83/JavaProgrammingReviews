package week15_17_12_2022.task1;

public class IngBank extends Bank{
    @Override
    public void calcTheInterest() {
        System.out.println(getCapital()*9/100);
    }
}
