abstract class BankAccount {

    double balance;

    public BankAccount(double balance) {
        this.balance = balance;
        if(balance < 0) {
            this.balance = 0;
        }
    }

    public void deposit(double amount) { //add the given amount to the current balance.
        this.balance = this.balance + amount;
    }

    public void withdraw(double amount) { // withdraw() method subtract the given amount from the current balance and Don’t allow the balance to go below zero.
        if((this.balance - amount) < 0) 
            this.balance = 0;
        else
            this.balance = this.balance - amount;
    }

    public abstract void display(); //abstract to inherit all subclass.
}