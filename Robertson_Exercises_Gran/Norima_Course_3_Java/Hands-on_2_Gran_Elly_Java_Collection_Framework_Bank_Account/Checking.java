public class Checking extends BankAccount{

    public Checking(double balance) {
        super(balance);
    }
    
    public void writeACheck(double amount) { //subtract the given amount from the current balance and then subtract an additional 1.
        balance = (balance - amount) - 1;
    }

    @Override
    public void display() { //print the type of account, checking, and then the balance.
        System.out.println("Checking account balance = $ " + balance);
    }
}
