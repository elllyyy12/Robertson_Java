/**
 * Java Course 4, Module 3
 * 
 * In this capstone project, a simple Automobile Insurance Policy and Claims Administration system (PAS) 
 *  will be created to manage customer automobile insurance policies and as well as accident claims for an insurance company. 
   *
 * @author Elly Jay Gran
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PASApp {
    public static void main(String[] args) {

        int response = 0; // Variable to take user input.
        try (Scanner scan = new Scanner(System.in)) {

            Claim c1 = new Claim(); // Created new object for claim.
            Customer cust1 = new Customer(); // created new object for customer.
            Policy p1 = new Policy(); // created new object for policy.

            List<Customer> accounts = new ArrayList<>(); // List to hold all customers accounts.
            List<Policy> policies = new ArrayList<>(); // list to hold all policies.

            try { // Try-catch for error handling
                while (response != 8) { // while-loop until response is not 8.

                    System.out.println("============|AutoMobile PAS System Menu|============\n"); // Main Menu
                    System.out.println("1. Create a new Customer Account\n" +
                            "2. Get a Policy quote and buy the policy.\n" +
                            "3. Cancel a specific policy.\n" +
                            "4. File an accident claim against a policy.\n" +
                            "5. Search for a customer account.\n" +
                            "6. Search for and display a specific policy.\n" +
                            "7. Search for and display a specific claim.\n" +
                            "8. Exit the PAS System.");
                    System.out.println("\n===================================================\n");

                    System.out.print("What would you like to do? "); // asking the user what choice he would like.
                    response = scan.nextInt(); // takes user input for the response on the main menu

                    // lines 35-51: created if-else for the choices on the menu.
                    if (response == 1) { // if response is equals to 1 then it will create new customer account
                        cust1.customerMaker(accounts);
                    } else if (response == 2) { // if response is equals to 2 then it will get a policy
                        p1.policyCreator(accounts);
                    } else if (response == 3) { // if response is 3 it will go to cancel policy
                        p1.policyRemover();
                    } else if (response == 4) { // if response is 4 it will file an accident claim
                        c1.claimMaker(policies, accounts);
                    } else if (response == 5) { // if response is 5 it will search for customer account
                        cust1.customerFinder(accounts);
                    } else if (response == 6) { // if response is 6 it will search and display specific policy
                        p1.policySearcher();
                    } else if (response == 7) { // if response is 7 it will search and display specific claim
                        c1.claimSearcher();
                    } else {
                        System.out.println("Thank you! Hope you are having a Good Day!"); // display
                    }

                }
            } catch (Exception e) { // catch incase the user inputs string or char on the main menu.
                System.out.println("\nInvalid Input! Try Again!\n"); // display
                main(args); // returns back to the Main method.
            } finally { // learned back on course 2.
                System.out.println("Good Bye! Thanks for using Automobile PAS System!"); // display
            }
        }
    }
}