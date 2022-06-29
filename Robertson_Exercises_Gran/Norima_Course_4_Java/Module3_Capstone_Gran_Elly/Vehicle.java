import java.util.Scanner;

public class Vehicle {
    //lines 5-12 declared variables
    private String Make; 
    private String Model;
    private int year;
    private String Type;
    private String fuelType;
    private int purchasePrice;
    private String Color;
    private double premiumCharge;

    Scanner scan = new Scanner(System.in); //scanner to take user input 

    public Vehicle() { //vehicle constructor with no parameters.

    }

    public Vehicle(String make, String model, int year, String type, String fuelType, int purchasePrice, String color) { 
        Make = make;
        Model = model;
        this.year = year;
        Type = type;
        this.fuelType = fuelType;
        this.purchasePrice = purchasePrice;
        Color = color;
    } //created vehicle constructors with parameters

    //lines 31-93 generated getters and setters.
    public String getMake() { 
        return Make;
    }

    public void setMake(String make) {
        Make = make;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(int purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public double getPremiumCharge() {
        return premiumCharge;
    }

    public void setPremiumCharge(double premiumCharge) {
        this.premiumCharge = premiumCharge;
    }

    public Vehicle inputVehicle() { //Created inputVehicle Method to take the user input about their vehicles.

        System.out.print("Enter make of Vehicle: "); //ask user for the maker of vehicle. Example: Toyota, Honda, etc.
        String make = scan.nextLine(); //takes user input
        System.out.print("Enter Model of Vehicle: "); //ask the user for the model of the car.
        String model = scan.nextLine(); //takes user input
        System.out.print("Enter age / year model of Vehicle: "); //ask the user for the year of car or like age.
        int year = scan.nextInt(); //takes user input
        scan.nextLine(); //extra line
        System.out.print("Enter type of Vehicle (2-Door sportscar, 4-Door sedan, suv): "); //ask the user for type of car
        String type = scan.nextLine(); //takes user input
        System.out.print("Enter Fuel Type: "); //ask the user for the fuel type
        String fuel = scan.nextLine(); //takes the user input
        System.out.print("Enter purchase price of the Vehicle: "); //ask the user for the price of the vehicle.
        int purchase = scan.nextInt(); //takes user input 
        scan.nextLine(); //extra line
        System.out.print("Enter the Color of Vehicle: "); //ask the user for the color of car
        String color = scan.nextLine(); //takes user input
        return new Vehicle(make, model, year, type, fuel, purchase, color); //return the information and save it to list.
    }
}
