package part2;
/**
 * @author Giovanni Bacci
 */
public class BankAccount {
    
    // Attributes
    private double balance;
    
    public BankAccount() {
        balance = 0;
    }// constructor
    
    // Methods
    public double getBalance() {
        return balance;
    }
    
    public void withdraw(double amount) {
        balance = getBalance() - amount;
    }
    
    public void deposit(double amount) {
        balance = balance + amount;
    }

    public double safeWithdraw(double amount){
        double safeAmount = Math.min(balance,amount);
        withdraw(safeAmount);
        return safeAmount;
    }
    
}
