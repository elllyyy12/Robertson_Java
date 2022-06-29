import java.util.*;


public class Town {
    
    //Based on the given instructions, I need to put 2 variables which are numberOfAdults and numberOfChildren. 
    //I added scanner for user input.
    Scanner sc = new Scanner(System.in);
    private int numberOfAdults;
    private int numberOfChildren;

    //This is my simulateBirth method that allows to give a birth.
    public void simulateBirth(){
        
        this.numberOfChildren = numberOfChildren + 1;
    }

    //This is my printStatistics method that displays the current statistics.
    public void printStatistics(){

        System.out.println("Town New Home has " + numberOfAdults + " adults and " + numberOfChildren + " children.");
    }

    //This is my initialValues method that lets the user input for the number of adults and children.
    public void initialValues(){
        System.out.println("Enter number of Adults: ");
        numberOfAdults = sc.nextInt();
        System.out.println("Enter number of Children: ");
        numberOfChildren = sc.nextInt();
    }
}
