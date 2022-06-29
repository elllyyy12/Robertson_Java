import java.util.*;

/**
 * Java Course 2, Module 3
 * 
 * Hands-on Assignment 3: Arrays
   *
 * @author Elly Jay Gran
 */
public class VowelDriver {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); //For user input
        VowelCounter2 vCounter2 = new VowelCounter2(); //new object 
        //Lines 12-18: I used while loop in this part to continue prompting if the user inputs character and if they dont the program will exit and print summary.
        while (true) {
            System.out.println("Enter a line of characters (press enter by itself to quit): "); //Display for the user.
            String line = sc.nextLine(); //User input
            if (line.length() == 0)
            break;
            vCounter2.processLine(line);
        }
        vCounter2.printSummary(); //Displays the lowercase, uppercase and total vowels.
        sc.close(); //closing scanner.
    }
}