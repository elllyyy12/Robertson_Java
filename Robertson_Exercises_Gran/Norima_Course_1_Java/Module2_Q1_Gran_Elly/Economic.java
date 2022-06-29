import java.util.Scanner;

/**
 * Java Course 1, Module 2
 * 
 *  Illustrate traditional economic policy theory in terms of regulating a government’s economy.
   *
 * @author Elly Jay C. Gran
 */

public class Economic {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); //Scanner for User Input

        System.out.println("Enter Growth rate: "); //Display to the user to enter growth rate.
        double growth_Value = sc.nextDouble(); //gets the user input growth value.

        System.out.println("Enter Inflation rate: "); //Display to the user to enter Inflation rate.
        double inflation_Value = sc.nextDouble(); //Gets the user input for inflation value.

        if(growth_Value < 1) { //if growth value is less than 0.01 there conditions to be followed.
            if (inflation_Value < 3) //inflation value is less than 0.03 it will print out line 25 and if it's not it will print out line 27 or line 38.
                System.out.println("Recommended economic policy is: Increase welfare spending, reduce personal taxes and decrease discount rate.");
            else 
                System.out.println("Recommended economic policy is: Reduce business taxes.");
        }
        else if(inflation_Value > 4) { //The else if I made basically says that if inflation value is greater than 0.04 it will check the codes from line 30-39
            if(inflation_Value < 1)//If inflation value is less than 0.01 then it will print out line 31 and if it's not it will go to else line 32.
            System.out.println("Recommended economic policy is: Increase welfare spending, reduce personal taxes, and decrease discount rate.");
            else
            if(inflation_Value > 3) //if inflation value is greater than 0.03 it will print out line 34 and if it's not then it will print out line 36.
            System.out.println("Recommended economic policy is: Increase discount rate.");
            else 
            System.out.println("No change in economic policy.");
        }
        else {
            System.out.println("No change in economic policy");
        }
        sc.close(); //to close the scanner.
   }
}