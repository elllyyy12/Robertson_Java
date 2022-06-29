import java.text.DecimalFormat;

/**
 * Java Course 3, Module 1
 * 
 * A program that establishes two savings accounts with saver1 having account number 10002 with an initial balance of $2,000, and saver2 having account 10003 with an initial balance of $3,000.
   *
 * @author Elly Jay C. Gran
 */

public class SavingsAccountDriver {

    public static void main(String[] args) {
        
        DecimalFormat decimal = new DecimalFormat("#.00"); //I used decimal format to specified the pattern and format pattern with "#.00".
        SavingsAccount saver1 = new SavingsAccount(10002, 2000); // Created a new object with the name saver1 that has a values of account number and balance.
        SavingsAccount saver2 = new SavingsAccount(10003, 3000); // Created another object with the name saver2.
        SavingsAccount.setannualInterestRate(0.05); //Called the method setannualInterestRate to pass the value of 0.05.
        System.out.println("\nMonthly balances for one year with 0.05 annual interest:\n");//display only
        System.out.println("Month \t Account#\t Balance\t Account#\t Balance"); //display
        System.out.println("-----\t --------\t -------\t --------\t -------"); //display
        for(int i = 0; i <= 12; i++) { //I used for loop to display 12 months and it was also mentioned in the instruction to use for loop.
            System.out.println(i + "\t " + saver1.getAccountNumber() + "\t\t " + decimal.format(saver1.getBalance()) + "\t " + saver2.getAccountNumber() + "\t\t " + decimal.format(saver2.getBalance())); //gets to display the saver1 account number and balance. Also, for saver2 account number and balance.
            if (i == 12) { //if i is equal to 12 it will print out the final balance.
                System.out.println("\nFinal balance of both accounts combined: " + decimal.format(saver1.getBalance() + saver2.getBalance()) + "\n");
            }  
            else { //else it will call the method addMonthlyInterest for both saver1 and saver2.
                saver1.addMonthlyInterest();
                saver2.addMonthlyInterest();
            }
        }
        
    }
}