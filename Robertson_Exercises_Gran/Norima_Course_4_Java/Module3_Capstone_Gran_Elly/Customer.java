import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Customer {
    //Lines 8-13 declared a variable
    private int accountNumber; 
    private String firstName;
    private String lastName;
    private String address;
    private List<Policy> policies;
    private List<PolicyHolder> holders;

    Scanner scan = new Scanner(System.in); //for taking user inputs.
    PolicyHolder p1 = new PolicyHolder();

    public Customer() { // created constructor with no parameters

    }

    public Customer(int accountNumber, String firstName, String lastName, String address) { // create constructor with parameters.
        this.accountNumber = accountNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        policies = new ArrayList<>();
        holders = new ArrayList<>();
    }

    // Lines 31 - 85 generated getters and setters
    public int getAccountNumber() { 
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Policy> getPolicies() {
        return policies;
    }

    public void setPolicies(List<Policy> policies) {
        this.policies = policies;
    }

    public List<PolicyHolder> getHolders() {
        return holders;
    }

    public void setHolders(List<PolicyHolder> holders) {
        this.holders = holders;
    }

    public void addPolicy(Policy policy) {
        this.policies.add(policy);
    }

    public void addHolder(PolicyHolder holder) {
        this.holders.add(holder);
    }

    public void customerFinder(List<Customer> accounts) {
        System.out.print("Enter First Name: ");
        String firstName = scan.nextLine();
        System.out.print("Enter Last Name: ");
        String lastName = scan.nextLine();
        boolean flag = false;

        for (Customer account : accounts) {
            if (account.getFirstName().toUpperCase().equalsIgnoreCase(firstName) && account.getLastName().toUpperCase().equalsIgnoreCase(lastName)) {
                System.out.println(account);
                System.out.println("\nAccount Found!");
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("No Customer Account with the given name.");
        }
        System.out.println();
    }

    public void customerMaker(List<Customer> accounts) {
        Random rand = new Random(); 
        int number = rand.nextInt(1000, 9999); // variable for policy number that gives random 4 digit numbers.
        System.out.print("Enter First Name: "); // user input
        String firstName = scan.nextLine(); // get user input
        System.out.print("Enter Last Name: "); // user input
        String lastName = scan.nextLine(); // get user input
        System.out.print("Enter Address: "); //user input
        String address = scan.nextLine(); //takes usser input
        System.out.println("Account Number: " + number); //prints out the random 4 digit account number.
        accounts.add(new Customer(number, firstName, lastName, address)); // adding customer account.
        System.out.println();
    }

    @Override
    public String toString() {
        String policiesS = "";
        for (Policy policy : policies) {
            policiesS += "Policy Number: " + policy.getPolicyNumber() + "\n" +
                         "Policy Holder Name: " + policy.getPolicyHolder().getFirstName().toUpperCase() + " "
                                                + policy.getPolicyHolder().getLastName().toUpperCase() + "\n";                                      
        }

        return "\nAccount Number: " + accountNumber + "\n" +
                "First Name: " + firstName.toUpperCase() + "\n" +
                "Last Name: " + lastName.toUpperCase() + "\n" +
                "Address: " + address.toUpperCase() + "\n" +
                "Policies within this account: " + "\n" + policiesS;
    }
}