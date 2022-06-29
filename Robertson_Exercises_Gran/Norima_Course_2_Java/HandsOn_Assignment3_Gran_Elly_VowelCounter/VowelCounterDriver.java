import java.util.*;

/**
 * Java Course 2, Module 3
 * 
 * Hands-on Assignment 3: Arrays
   *
 * @author Elly Jay Gran
 */
public class VowelCounterDriver {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); //For user input later.
        VowelCounter vCounter = new VowelCounter(); //I created an object of vowel counter.

//Line 18 - I used while loop just like in my other hands-on exercise for the user to input and when he presses enter the program will display the summary and quit.
        while(true){
            System.out.println("Enter a line of characters (press enter by itself to quit): ");
            String text = sc.nextLine();

            vCounter.processLine(text);
            if(text.equals("")) {
                vCounter.printSummary();
                break;
            }
        }
        sc.close();
    }
}