import java.util.Scanner;

/**
 * Java Course 1, Module 1
 * 
 * Calculate diameter, circumference, and area
   *
 * @author Elly Jay Gran
 */

public class Circle {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); //Scanner used for user input.

        System.out.println("Enter Radius: "); //Display to the user what to enter.
        double radius = sc.nextDouble(); //gets the user input.

        double diameter; //decalaring variable for diameter.
        diameter = radius * 2; //computation of diameter
        System.out.println("Diameter: " + diameter); //displays the output plus the diameter computed.

        double circumference; //declaring variable for circumference
        circumference = 2 * Math.PI * radius; //formula for circumference
        System.out.println("Circumference: " + circumference); //displays the result.

        double area; //declaring "area" variable
        area = Math.PI * radius * radius; //formula to get the area.
        System.out.println("Area: " + area); //displays the result for area.

        sc.close(); // To close the Scanner.
    }
}