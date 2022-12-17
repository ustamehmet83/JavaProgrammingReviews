package week15_17_12_2022.task1;

public class GarantiBank extends Bank {

    @Override
    public void calcTheInterest() {
        super.calcTheInterest();
        System.out.println(calc());
    }


    private int calc() {
        return getCapital() * 8 / 100;
    }
}
