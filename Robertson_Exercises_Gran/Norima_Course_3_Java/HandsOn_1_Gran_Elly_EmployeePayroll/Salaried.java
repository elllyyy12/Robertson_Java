import java.util.Scanner;

public class Salaried extends Employee{
    
    private double Salary;

    public void load() { //Load an Salaried employee's info.

        super.load();

        Scanner sc = new Scanner(System.in);

        System.out.println("Salary ==> ");
        Salary = sc.nextDouble();
    }

    double getEarnings() { //Return earnings for an Salaried employee.
        return Salary;
    }
}
