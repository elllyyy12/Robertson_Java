import java.util.*;

/**
 * Java Course 1, Module 3
 * 
 *  A program that reads phone numbers, and for each phone number, it displays the phone number’s three components –country code, area code, and local number.
   *
 * @author Elly Jay C. Gran
 */

public class PhoneNumberDissector {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); //Scanner for user input.

        while (true) {
            boolean isValid = true; //declared a variable with the name isValid.
            System.out.println("Enter a phone number in the form cc-area-local,where cc = country code digits, area = area code digits,and local = local phone digits: "); //Display for the user to enter a phone number.
            String readNum = sc.next(); //gets the user input.

            if(readNum.equalsIgnoreCase("q")) { //if the user input is equals to 'q' then the program will exit.
                System.out.println("Exit :)");
                System.exit(0);
            }

            if (readNum.matches(".*\\d.*")) { 
                String [] splitNum = readNum.split("-"); //Declared a string array to split with '-', the phone number inputted by the user.
                String countryCode = "", areaCode = "", localPhoneNumber = ""; //declared a variable with the name of countryCode, areaCode and localPhoneNumber.

                for(int i = 0; i < splitNum.length; i++) {
                    if(splitNum[0].length() <= 2 && splitNum[0].matches("[0-9]+")) { //if array splitnum with the index 0 is less than or equals to 2 digits and it matches 0-9 then it will accept country code.
                        countryCode = splitNum[0];
                    } 
                    else {
                        isValid = false; //if the user input is false it will print line 37.
                        System.out.println("Invalid country code.");
                        break;
                    }
                    if(splitNum[1].length() <= 3 && splitNum[1].matches("[0-9]+")) { //if the array splitnum is less than or equal to 3 and it matches numbers then it will accept that areacode.
                        areaCode = splitNum[1];
                    }
                    else {
                        isValid = false; //If the array splitnum is false it will print line 45;
                        System.out.println("Invalid Area Code.");
                        break;
                    }
                    if (splitNum[2].matches("[0-9]+")) { //if the array splitnum matches it will accept the local phone number.
                        localPhoneNumber = splitNum[2];
                    }
                    else {
                        isValid = false; //if it is false it will print out line 53.
                        System.out.println("Invalid Phone Number.");
                        break;
                    }
                }

                if(isValid)
                System.out.println("Country code: " + countryCode + "\nArea Code: " + areaCode + "\nPhone Number: " + localPhoneNumber); //if the user input is valid it will print the country code area code and local phone number seperately.
                else {
                    System.out.println("Please enter numbers only.");
                }
            }
        }
    }
}