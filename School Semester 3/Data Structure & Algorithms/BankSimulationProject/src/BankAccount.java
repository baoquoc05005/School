// BankAccount.java
// Student: Tran Truong Quoc Bao
// Student ID: 4164529859

public class BankAccount {
    // Encapsulation of the bank balance and define the deposit limit
    private double balance;
    private static final double DEPOSIT_LIMIT = 100000;

    // Constructor
    public BankAccount() {
        balance = 0;
    }

    // This is synchronized method to deposit money to the account
    public synchronized void deposit(double amount) throws InterruptedException {
        // I make it to wait until balance is less than $100,000 before allowing new deposit
        while (balance + amount > DEPOSIT_LIMIT) {
            System.out.println("Deposit blocked. Balance would exceed insurance limit.");
            wait();  // Wait for a withdraw thread to free up space
        }
        balance += amount;
        System.out.println("Deposited: " + amount + ", Current balance: " + balance);
        notifyAll();  // And notify other threads there is space for withdrawal
    }
    
    

    // Synchronized method to withdraw money from account
    public synchronized void withdraw(double amount) throws InterruptedException {
        // I block withdrawal if there isn't enough balance to withdrawal
        while (balance < amount) {
            System.out.println("Insufficient balance. Waiting to withdraw: " + amount);
            wait();  //This will wait until a deposit occurs
        }
        balance -= amount;
        System.out.println("Withdrew: " + amount + ", Current balance: " + balance);
        notifyAll();  // Notify available space for deposits
    }

    // Getter for balance
    public synchronized double getBalance() {
        return balance;
    }
}
