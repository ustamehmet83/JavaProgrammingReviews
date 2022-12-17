package week15_17_12_2022.task1;

public class Akbank extends Bank {
    @Override
    public void calcTheInterest() {
        super.calcTheInterest();
        System.out.println(getCapital()*7/100);
    }
}
