import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Policy {
    //lines 9-14: Declared variables 
    private int policyNumber; 
    private String effectiveDate;
    private LocalDate expirationDate;
    private PolicyHolder policyHolder;
    private List<Vehicle> vehicles;
    private double policyPremium;

    Scanner scan = new Scanner(System.in); //Scanner for user input
    List<Policy> policies = new ArrayList<>(); //to hold list of policy
    Vehicle v1 = new Vehicle(); //created object of vehicle

    public Policy() { //constructors with no parameters.

    }

    public Policy(int policyNumber, String effectiveDate, PolicyHolder policyHolder, LocalDate expDate) { // created constructors with parameters.
        this.policyNumber = policyNumber;
        this.effectiveDate = effectiveDate;
        vehicles = new ArrayList<>();
        this.policyHolder = policyHolder;
        this.expirationDate = expDate;
    }

    // lines 33-89 generated getters and setters.
    public int getPolicyNumber() { 
        return policyNumber;
    }

    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public PolicyHolder getPolicyHolder() {
        return policyHolder;
    }

    public void setPolicyHolder(PolicyHolder policyHolder) {
        this.policyHolder = policyHolder;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public double getPolicyPremium() {
        return policyPremium;
    }

    public void setPolicyPremium(double policyPremium) {
        this.policyPremium = policyPremium;
    }

    public void addVehicles(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }

    public void dateDate(String date) { //created method to make the effective date add 6 months which will be the expiration date.
        LocalDate dateToday = LocalDate.parse(date);
        expirationDate = dateToday.plusMonths(6);
    }

    public void policyRemover() { //Method to remove a policy. Number 3 in the Main menu options
        System.out.print("Enter Policy Number: "); //user input
        int number = scan.nextInt(); //takes the user input
    
        for (Policy policy : policies) { //for each to find the policy number if existing
            if (policy.getPolicyNumber() == number) { //if the policy number if found then it will print policy associated to it.
                System.out.println(policy);
                System.out.println("\n==============================================================");

                System.out.println("Do you want to cancel the policy? (Yes or No)"); //user input
                String choice = scan.next(); //takes user input

                if (choice.equals("Yes") || choice.equals("yes")) { //if the user picks yes, it will get the policy number and remove policy associated to it.
                    policies.remove(policy.getPolicyNumber());
                    System.out.println("Policy has been removed.");
                }
                else if(choice.equals("No") || choice.equals("no")) { //if the user picks no, it will print that policy is not cancelled.
                    System.out.println("Policy not cancelled.");
                }
                else {
                    System.out.println("Invalid Input"); //if the user input another it will say invalid input.
                }
            }
            else {
                System.out.println("No Policy Found."); //if policy number is not found.
            }
        }
    }

    public void policySearcher() { //Method to search a policy. 
        System.out.print("Enter Policy Number: "); //user input for policy number.
        int number = scan.nextInt(); //takes the user input
        boolean flag = false; //declared a variable for boolean

        for (Policy policy : policies) { //for each to get find the policy number in arraylist of policies.
            if (policy.getPolicyNumber() == number) { //if the policy number equals to user input then it will print the details of the policy.
                System.out.println(policy); 
                flag = true;
                break;
            }
        }
        if (!flag) { //if not false, will print line 132
            System.out.println("No Policy with the given number.");
        }
        System.out.println();
    }

    public void policyCreator(List<Customer> accounts) { //method for creating policy with parameter that holds the list of customer
        System.out.print("Enter Account Number: "); //user input for the given account number.
        int number = scan.nextInt(); //takes user input with variable number
        scan.nextLine(); //creates extra space
        boolean flag = false; //declared variable for boolean
        Customer customer = null; //created customer object

        for (Customer account : accounts) { // for loop that will be Iterating over all the accounts.
            if (account.getAccountNumber() == number) { // if the given account number matches
                flag = true; //if the account number is found flag will be true
                customer = account; //customer is going to the list named accounts.
                break;
            }
        }

        if (flag) { // if account is present it will continue here. 
            PolicyHolder holder; //created policy holder object to save data's later
            Random rand = new Random(); //random to generate random numbers
            System.out.print("Are you the policy holder? "); // if account is found, it will ask if the user is the policy holder or no.
            String check = scan.nextLine(); //variable named check will get the user input

            if (check.equals("Yes") || check.equals("yes")) { // if the customer is the policy holder.
                System.out.print("Please Enter Birth Date (dd/mm/yyyy): "); // asking birth date in dd/mm/yyyy format e.g 12/02/1999
                String dob = scan.nextLine(); //will take user input
                System.out.print("Enter License Number: "); //asking the user to input license number
                String license = scan.next(); //will take user input
                scan.nextLine(); //extra line
                System.out.print("Please enter driver's license date of issuance (dd/mm/yyyy): "); //ask the user to input issuance of the date of license
                String doi = scan.nextLine(); //take the user input
                holder = new PolicyHolder(customer.getFirstName(), customer.getLastName(), dob, customer.getAddress(), license, doi); // creating policy holder with the same customer details.

            } else { //if the account owner wants to apply for his family. Example: Policy Holder could be the child or the spouse of the customer.
                System.out.println("What is your Relationship to the Account owner? "); //ask the user to input what is his relation to the account owner
                String relationship = scan.nextLine(); //takes user input
                System.out.print("Enter First Name: "); //ask the new person for his name
                String firstName = scan.nextLine(); //takes user input
                System.out.print("Enter Last Name: "); //ask the user for last name
                String lastName = scan.nextLine(); //takes the user input
                System.out.print("Enter Address: "); //ask the user for the address
                String address = scan.nextLine(); //takes the user input
                System.out.print("Enter date of birth (dd/mm/yyyy): "); //ask the user for birthday
                String dob = scan.nextLine(); //takes user input 
                System.out.print("Enter License number: "); //ask for user for license number
                String license = scan.next(); //takes the user input 
                scan.nextLine(); //prints extra line 
                System.out.print("Please Enter Driver's License date of issuance (dd/mm/yyyy): "); //ask the user for license date
                String doi = scan.nextLine(); //takes user input 
                holder = new PolicyHolder(relationship, firstName, lastName, dob, address, license, doi); //holder is to hold data of the account owner's family
            }

            int policyNumber = rand.nextInt(100000, 999999); // declared policy number with random numbers.
            System.out.print("Enter Desired Policy Effective start Date (yyyy-mm-dd): "); //ask the user for the effective date of the policy
            effectiveDate = scan.nextLine(); //takes user input
            dateDate(effectiveDate); //called the method dateDate to pass in the user input effective date and add 6 months to get expiration date
            Policy policy = new Policy(policyNumber, effectiveDate, holder, expirationDate);  // creating new policy
            policy.addVehicles(v1.inputVehicle()); //for the user to add vehicle.
            int flag2 = -1; //variable declaration
            while (flag2 != 0) { // Asking to add vehicle until user enters 0 for no.
                System.out.println("Do you want to add more vehicles? Press 1 if yes. If no, Enter 0."); //ask the user if they want to add more vehicles
                flag2 = scan.nextInt(); //takes user input
                scan.nextLine(); //prints extra line only 
                if (flag2 != 0) { //if flag2 variable is not equal to 0 or the user presses 1 it will add another vehicle
                    policy.addVehicles(v1.inputVehicle()); //will add the vehicle info to policy and called the method inputVehicle on vehicle.java class
                }
            }

            RatingEngine.premiumGenerator(policy); // Setting policy premium with rating engine
            System.out.println("The cost of the policy is " + policy.getPolicyPremium()); //Display for the cost of policy
            System.out.println("Do you want to purchase it? (Press 1 = Yes, Press 0 = No)"); //ask the user if they want to purchase the policy
            int yesOrNo = scan.nextInt(); //takes the user input

            if (yesOrNo == 1) { //if they purchase the policy 
                policies.add(policy); //policy will be added to the list
                customer.addPolicy(policy); //policy will be added to the customer
                System.out.println("\nPolicy is added to the Customer Account."); //display only
                System.out.println("Here is your Policy Number: " + policyNumber); //prints out random 6 digit number for policy number
            } else if (yesOrNo == 0) { //if they choose 0 or no
                System.out.println("Policy not purchased."); //displays that it's not purchased.
            } else {
                System.out.println("You Entered wrong input."); 
            }
        } else {
            System.out.println("Acccount does not exist.");
        }
        System.out.println();
    }

    @Override
    public String toString() { //toString method to print the data saved in the arraylist
        String veh = ""; //declared variable
        for (Vehicle vehicle : vehicles) { // for iterating over all vehicles and storing their info in the "veh" variable.
            System.out.println("\n==========Information=========="); //display
            veh += "Vehicle Model: " + vehicle.getModel() + "\t"; //display
            veh += "Vehicle Purchase Price: " + vehicle.getPurchasePrice() + "\t"; //display
            veh += "Vehicle Type: " + vehicle.getType() + "\n"; //display
        }

        return "\nPolicy Number: " + policyNumber + "\n" + //returns and display policy number
                "Effective Date: " + effectiveDate + "\n" + //returns and display effective date
                "Expiration Date: " + expirationDate + "\n" + //returns and displays expiration date
                "Policy Holder: " + policyHolder.getFirstName().toUpperCase() + " " + policyHolder.getLastName().toUpperCase() + "\n" + //returns and display customer name
                "Vehicles: " + "\n" + veh + //returns and display all the vehicle on the policy 
                "Policy Premium Charged: " + policyPremium; //returns and display the premium charge.
    }
}
