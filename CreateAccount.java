public class CreateAccount {
    public static void main(String[] args) {
        // Using default constructor
        Account emmaAccount = new Account();
        emmaAccount.deposit(500);
        System.out.println("Account balance: " + emmaAccount.getBalance());

        // Using parameterized constructor
        Account johnAccount = new Account(2001, "John", 1000.0);
        johnAccount.deposit(250);

        System.out.println("Account Number: " + johnAccount.getAccountNo());
        System.out.println("Account Name: " + johnAccount.getAccountName());
        System.out.println("Balance: " + johnAccount.getBalance());
    }
}
