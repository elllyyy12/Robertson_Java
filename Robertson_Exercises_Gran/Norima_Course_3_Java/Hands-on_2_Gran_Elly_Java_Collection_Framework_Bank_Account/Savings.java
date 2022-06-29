public class Savings extends BankAccount{
    
    double intRate;

    public Savings(double balance, double intRate) { 
        super(balance);
        this.intRate = intRate;
    }

    public void addInterest() { //Add the interest to the balance
       balance = (balance * intRate) + balance;
    }

    @Override
    public void display() { //print the type of account, savings, and then the balance
        System.out.println("Savings account balance = $ " + balance);
    }
}
