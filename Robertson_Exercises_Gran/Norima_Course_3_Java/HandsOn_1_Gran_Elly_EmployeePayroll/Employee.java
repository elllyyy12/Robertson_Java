import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Scanner;

abstract class Employee {

    private static final double Max_Earnings = 1000.0; //Max weekly earnings for any employee.
    private static final double Bday_Bonus = 100.0; //Employee receives this bonus during the week of his birthday.
    private String name; //Lines 9-12: Declaring variables based on the document given.
    private String Social_Security_Number;
    private int bday_Month;
    private int bday_Week;

    abstract double getEarnings(); //To get all the subclasses implement in this method.

    public void load() { //load() method: Gets the user input.
        Scanner sc = new Scanner(System.in);

        System.out.println("Name ==> ");
        name = sc.nextLine();

        System.out.println("Social Security Number ==> ");
        Social_Security_Number = sc.nextLine();

        System.out.println("Birthday Month (1-12) ==> ");
        bday_Month = sc.nextInt();

        System.out.println("Birthday Bonus Week (1-4) ==> ");
        bday_Week = sc.nextInt();
    }

    public String toString() { //Return a string version of the contents of the employee.
        DecimalFormat emp = new DecimalFormat(".00");
        System.out.println("Employee Name: " + name);
        System.out.println("Social Security Number: " + Social_Security_Number);
        System.out.println("Paycheck: $" + emp.format(getEarnings() + getBonus()) + "\n");
        return "";
    }

    public double getBonus() { ///Return Bday_Bonus if the employee was born during the current month and it's now that week of the month.
        Calendar empCalendar = Calendar.getInstance();
        int cMonth = empCalendar.get(Calendar.MONTH);
        int calendarDay = empCalendar.get(Calendar.DAY_OF_WEEK);

        if (bday_Week == calendarDay && cMonth == bday_Month) {
            return Bday_Bonus;
        }
        else {
            return 0;
        }
    }
}