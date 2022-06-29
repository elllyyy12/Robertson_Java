import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Claim {
    //lines 8-13 declared variables
    private String claimNumber; 
    private String accidentDate;
    private String address;
    private String description;
    private String descriptionAccident;
    private int estimatedCostPrice;

    private List<Claim> claims = new ArrayList<>(); //list to hold claims.
    Scanner scan = new Scanner(System.in); //for user input

    public Claim() { //created claim constructor with no parameters. 

    }

    public Claim(String claimNumber, String accidentDate, String address, String description,
            String descriptionAccident, int estimatedCostPrice) {
        this.claimNumber = claimNumber;
        this.accidentDate = accidentDate;
        this.address = address;
        this.description = description;
        this.descriptionAccident = descriptionAccident;
        this.estimatedCostPrice = estimatedCostPrice;
    } // created claim constructor with parameters

    //lines 33-79 generated getters and setters.
    public String getClaimNumber() { 
        return claimNumber;
    }

    public void setClaimNumber(String claimNumber) {
        this.claimNumber = claimNumber;
    }

    public String getAccidentDate() {
        return accidentDate;
    }

    public void setAccidentDate(String accidentDate) {
        this.accidentDate = accidentDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescriptionAccident() {
        return descriptionAccident;
    }

    public void setDescriptionAccident(String descriptionAccident) {
        this.descriptionAccident = descriptionAccident;
    }

    public int getEstimatedCostPrice() {
        return estimatedCostPrice;
    }

    public void setEstimatedCostPrice(int estimatedCostPrice) {
        this.estimatedCostPrice = estimatedCostPrice;
    }

    public void claimSearcher() { //Method to search for the specific claim

        System.out.println("Enter Claim Number: "); //ask the user to input auto generated claim number
        String number = scan.next(); //takes user input
        scan.nextLine(); //extra line
        boolean flag = false; //created variable for boolean

        for (Claim claim : claims) { //for each loop to find the claim number 
            if (claim.getClaimNumber().toUpperCase().equalsIgnoreCase(number)) { //if the claim number is found
                System.out.println(claim); //will print the details of the claim
                flag = true;
                break;
            }
        }
        if (!flag) { //if not false 
            System.out.println("No Claim number with the given number."); //will print no claim number with the given number
        }
        System.out.println();
    }

    public void claimMaker(List<Policy> policies, List<Customer> accounts) { //method to make claim with parameters that holds policies and customers
        System.out.println("Enter Policy Number: "); //ask the user for the policy number
        int number = scan.nextInt(); //takes the user input
        Random rand = new Random(); //for random generated number
        String claimNumber = "C" + rand.nextInt(10000, 99999); //declared variable for the random claim number
        boolean flag = false; //declared variable for boolean

        for (Customer account : accounts) { //for each loop to find the customer
            for (Policy policy : account.getPolicies()) { //for each loop because the policy number is in policy 
                if (policy.getPolicyNumber() == number) { //if policy number is found
                    scan.nextLine(); //extra line 
                    System.out.print("Enter Accident Date in dd/mm/yyyy format: "); //ask the user for accident date
                    String accidentDate = scan.nextLine(); //takes user input 
                    System.out.print("Enter Accident Address: "); //ask the user for the address of accident
                    String address = scan.nextLine(); //takes user input
                    System.out.print("Enter Description of Accident: "); //ask the user for the description of accident
                    String descriptionAccident = scan.nextLine(); //takes the user input
                    System.out.print("Enter Description of damage to vehicle: "); //ask the user for the damage to the vehicle
                    String description = scan.nextLine(); //takes the user input
                    System.out.print("Enter Estimated Cost: "); //ask the user for the estimated cost
                    int cost = scan.nextInt(); //takes the user input
                    scan.nextLine(); //extra line
                    claims.add(new Claim(claimNumber, accidentDate, address, description, descriptionAccident, cost)); //add or save the info 
                    System.out.println("Claim is Added succesfully with the claim number " + claimNumber); //displays the auto generated claim number
                    flag = true;
                    break;
                }
            }
            if (flag) {
                break;
            }
        }
        if (!flag) { //if not false 
            System.out.println("No policy with the given number."); //will print no policy with the given number
        }
        System.out.println();
    }

    @Override
    public String toString() { //toString to return and display the values
        return "\nClaim Number: " + claimNumber + "\n" +
                "Accident Date: " + accidentDate + "\n" +
                "Address: " + address + "\n" +
                "Description of Damage: " + description + "\n" +
                "Description of Accident: " + descriptionAccident + "\n" +
                "Estimated Cost Price: " + estimatedCostPrice;
    }
}
