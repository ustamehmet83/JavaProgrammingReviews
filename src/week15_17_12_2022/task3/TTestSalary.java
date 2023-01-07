package week15_17_12_2022.task3;

public class TTestSalary {
    public static void main(String[] args) {
        Employee employee= new Employee();
        System.out.println(employee.salary());
        System.out.println("==================");
        Manager manager= new Manager();
        System.out.println(manager.salary());
        System.out.println("==============");
        Clerk clerk= new Clerk();
        System.out.println(clerk.salary());

    }
}
