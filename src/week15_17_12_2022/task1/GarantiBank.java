package week15_17_12_2022.task1;

public class GarantiBank extends Bank{

    @Override
    public void calcTheInterest() {
        System.out.println(getCapital()*8/1000);
    }
}
