package week15_17_12_2022.task1;

public class TestsInterest {
    public static void main(String[] args) {


        Bank bank = new Bank();
        bank.calcTheInterest();

        Akbank akbank= new Akbank();
        akbank.calcTheInterest();

        GarantiBank garantiBank= new GarantiBank();
        garantiBank.calcTheInterest();

        IngBank ingBank=new IngBank();
        ingBank.calcTheInterest();

        TestsInterest testsInterest=new TestsInterest();
        System.out.println(testsInterest.getClass().getSimpleName());




    }
}
