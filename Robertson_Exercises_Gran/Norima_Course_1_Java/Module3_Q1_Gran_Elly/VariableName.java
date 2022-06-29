import java.util.*;

/**
 * Java Course 1, Module 3
 * 
 *  Program that checks the properness of a given variable name.
   *
 * @author Elly Jay C. Gran
 */

public class VariableName {

    public static void main(String[] args) {

        String inputVName = " "; //I declared a string type with the variable inputVName with the space as a value.
        System.out.println("(q to quit)"); //Display to the user that press q to quit.

        //lines 19-25: while inputVName is not equals to 'q' inputVName will go to the method requestline. 
        while (!inputVName.equals("q")) {
            
            inputVName = requestLine();

            if(checkValid(inputVName)){ //If checkValid method is true it will print out that it's legal.
                System.out.printf("%s is legal.\n", inputVName);
            }
        }
    }

    public static String requestLine() {
        Scanner sc = new Scanner(System.in); //For the user input.
        System.out.println("Enter a variable name: ");  //Display to enter a variable name.
        return sc.nextLine(); //gets the user input.
    }

    public static boolean LetterStart(String input) { //LetterStart method tells that if input is lowercase and numbers then it will return true.
        if(123 > (int)input.toLowerCase().charAt(0) && (int)input.toLowerCase().charAt(0) > 60) { 
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean withInvalid(String input) { //withInvalid method says that if it has special characters it will print out that it is in poor style.
        if((input.indexOf('$') != -1 || input.indexOf('_') != -1) && input.indexOf(' ') == -1){ 
            System.out.printf("Using $ or underscore is poor style.\n");
        }
        if(input.indexOf(' ') != -1){
            return true;
        }
        else {
            return false;}
        }

    public static boolean checkValid(String input) { //checkValid method returns false if the LetterStart method and withInvalid method conditions are met.
        if(!LetterStart(input)){
            System.out.println("Illegal\n");
            return false;
        }
        else if(withInvalid(input)) {
            System.out.printf("Illegal\n", input);
            return false;
        }
        else {
            return true;
        }
    }
}