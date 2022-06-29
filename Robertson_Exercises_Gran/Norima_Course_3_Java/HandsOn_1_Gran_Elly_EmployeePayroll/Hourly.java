import java.util.Scanner;

public class Hourly extends Employee{
    
    private static final int Overtime_hrs = 40;
    private static final double Overtime_Rate = 1.5;
    private double hourlyPay;
    private double hoursWorkedforCurrentWeek;

    public void load() { //Load an hourly employee's info.
        super.load();

        Scanner sc = new Scanner(System.in);

        System.out.println("Hourly Pay ==> ");
        hourlyPay = sc.nextDouble();

        System.out.println("Hours Worked this past week ==> ");
        hoursWorkedforCurrentWeek = sc.nextDouble();
    }

    double getEarnings() { //Return earnings for an hourly employee.

        double wage = 0.0;

        if(hoursWorkedforCurrentWeek <= 40) {
            wage = hoursWorkedforCurrentWeek * hourlyPay;
        }
        else {
            wage = 40 * hourlyPay + (hoursWorkedforCurrentWeek - 40) * hourlyPay * 1.5;
        }
        return wage;
    }
}
