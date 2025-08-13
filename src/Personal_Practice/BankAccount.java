package Personal_Practice;

public class BankAccount {
    private double balance;



    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount)
    {
        balance = balance + amount;

    }

}
