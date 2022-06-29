import java.util.Scanner; 

/**
 * Java Course 1, Module 1
 * 
 *  Prompts the user for his/her birthday month, day, and year and prints the date of the user’s one-hundredth birthday.
   *
 * @author Elly Jay C. Gran
 */

public class Birthday {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); // I used Scanner for user input

        System.out.println("Enter the month you were born: "); // Display to the user what month they were born.
        String bdayMonth = sc.next(); //To get the user input for birthday month.

        System.out.println("Enter the day you were born: "); //Display to the user what day they were born.
        int day = sc.nextInt(); //Gets the user input for day.

        System.out.println("Enter the year you were born: "); //Display to the user to enter year they were born.
        int year = sc.nextInt(); //Gets the user input for year.

        int age, newyear = 100; //declaring new variable called age and newyear with the value of 100.
        age = year + 100; //computation of age.

        System.out.println("You will be " + newyear + " on " + bdayMonth + " " + day+"," + age); //Prints out the new year, birthday month, day and age. 

        sc.close(); //To close the scanner.
    }
}