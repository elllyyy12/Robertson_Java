import java.util.Scanner;

/**
 * Java Course 1, Module 2
 * 
 *  Prompts the user for a starting balance and then prints the number of years it takes to reach $100,000 and also the number of years it takes to reach $1,000,000.
   *
 * @author Elly Jay C. Gran
 */
public class BankBalance {

    public static void main(String[] args) {

    System.out.println("\n=============== So you want to be a Millionaire ===============\n"); //Display only to the top.
        
        Scanner sc = new Scanner(System.in); //For the user input.

        //lines 18-21: Declaring int type and variables named balance, onHundred_K, oneMill and initial.
        int balance = 0;
        int oneHundred_K = 0;
        int oneMill = 0;
        int initial = 0;

        System.out.println("Enter starting balance: "); //Display to the user to input the starting balance.
        initial = sc.nextInt(); //Gets the user input for entering the starting balance.
        balance = initial; //Since on Line 25 we can see that initial variable is there when the user inputs the starting balance. I made balance is equals to the initial.

        //Lines 29-34: I used while loop to check. While balance is less than one million it will increment. If balance is less than one hundred thousand it will increment variable oneHundred_K. Then Balance is multiplied.
        while(balance < 1000000) { 
            oneMill++;
            if (balance < 100000) {
                oneHundred_K++;
            }
            balance *= 2;
        }
        System.out.println("It takes " + oneHundred_K + " years to reach 100,000."); //Display to the user how many years to reach 100,000.
        System.out.println("It takes " + oneMill + " years to reach 1,000,000."); //Display to the user how many years to reach 1,000,000.

        sc.close(); //To close scanner.
    }	
}