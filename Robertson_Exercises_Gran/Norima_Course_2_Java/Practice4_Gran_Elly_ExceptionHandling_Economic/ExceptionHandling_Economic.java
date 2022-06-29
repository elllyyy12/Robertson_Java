import java.util.*;

/**
 * Java Course 2, Module 4
 * 
 * Ungraded Practice Activity 4 - Exception Handling with the economic program
   *
 * @author Elly Jay Gran
 */

public class ExceptionHandling_Economic {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //line 17 - I added exception handling using try-catch and finally on this code. If the user inputs strings it will fall on the try catch.
        try{
        System.out.println("Enter Growth rate: ");
        double growth_Value = sc.nextDouble();

        System.out.println("Enter Inflation rate: ");
        double inflation_Value = sc.nextDouble();

        if(growth_Value < 0.01){
            if (inflation_Value < 0.03) 
                System.out.println("Recommended economic policy is: Increase welfare spending, reduce personal taxes and decrease discount rate.");
            else 
            System.out.println("Recommended economic policy is: Reduce business taxes.");
        }
        else if(inflation_Value > 0.04){
            if(inflation_Value < 0.01)
            System.out.println("Recommended economic policy is: Increase welfare spending, reduce personal taxes, and decrease discount rate.");
            else
            if(inflation_Value > 0.03)
            System.out.println("Recommended economic policy is: Increase discount rate.");
            else 
            System.out.println("No change in economic policy.");
        }
        else{
            System.out.println("No change in economic policy");
        }
      }catch(Exception e){
          System.out.println("Wrong Input! Only numbers allowed!");
      }finally{
          System.out.println("Trying try catch in this program.");
      }
   }
}