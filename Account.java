public class Account {
    private int accountNo;
    private String accountName;
    private double balance;

    // Constructor with fields
    public Account(int accountNo, String accountName, double balance) {
        this.accountNo = accountNo;
        this.accountName = accountName;
        this.balance = balance;
    }

    // Default constructor
    public Account() {
        this.balance = 0.0;
    }

    // Deposit method
    public void deposit(double amount) {
        balance += amount;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Getter for accountNo
    public int getAccountNo() {
        return accountNo;
    }

    // Getter for accountName
    public String getAccountName() {
        return accountName;
    }
}
