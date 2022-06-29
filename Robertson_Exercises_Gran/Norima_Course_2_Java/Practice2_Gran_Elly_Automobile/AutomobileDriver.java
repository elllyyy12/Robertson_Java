import java.util.*;

/**
 * Java Course 2, Module 2
 * 
 * Ungraded Practice Activity 2 - Automobile Description
   *
 * @author Elly Jay C. Gran
 */
public class AutomobileDriver {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //scanner used for user input.
        Automobile A1 = new Automobile(); //this line is to call the methods on automobile.java class.

        System.out.println("How many cars do you want to consider?"); //display for the user to input how many cars.
        int manyCars = sc.nextInt(); // this will get user input.
        
        for(int i = 0; i < manyCars; i++){ // I used for loop here so that if the user inputs 2 or more cars they can see another prompt.
            A1.setMake();
            A1.setColor();
            System.out.println(A1.printMake() + " " + A1.printColor());
        }

        sc.close();
    }
}