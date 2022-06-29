import java.util.Scanner;

public class SalariedPlusCommission extends Salaried{
    
    private double sales;
    private double commissionRate;

    public void load() { //Load an Salaried with commission employee's info.
        super.load();

        Scanner sc = new Scanner(System.in);

        System.out.println("Sales for this past week ==> ");
        sales = sc.nextDouble();

        System.out.println("Sales commission rate (fraction paid to employee) ==> ");
        commissionRate = sc.nextDouble();
    }

    double getEarnings() { //Return earnings for an Salaried with commission employee.
        return super.getEarnings() + sales * commissionRate;
    }
}
