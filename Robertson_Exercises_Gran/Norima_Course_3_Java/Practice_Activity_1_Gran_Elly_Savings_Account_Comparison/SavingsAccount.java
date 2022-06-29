
public class SavingsAccount {
    // lines 4-6: declaring variables.
    static double annualInterestRate;
    final int Account_Number;
    double balance;

    public SavingsAccount(int accountNum, double Bal) { //created a two parameter constructor to initialize the instant constant and instance variable.
        Account_Number = accountNum; 
        balance = Bal;
    }

    public int getAccountNumber() { //created a method to return account number.
        return Account_Number;
    }
    
    public double getBalance() { //created method to return balance.
        return balance;
    }

    public void addMonthlyInterest() { //formula is from the instruction given. 
      balance += balance * annualInterestRate / 12;
    }

    public static void setannualInterestRate(double rate) { //created set annual rate method to pass value to the driver.
        annualInterestRate = rate;
    }
}
