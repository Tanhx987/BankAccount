public class BankAcc {
    private String accountNumber;
    private double accountBalance;
    private String accountHolder;

    public BankAcc() {
    }

    public BankAcc(String accNum, double accBal, String accHolder) {
        accountNumber = accNum;
        accountBalance = accBal;
        accountHolder = accHolder;
    }

    public void deposit(double amount) {
        accountBalance += amount;
    }

    public void withdraw(double amount) {
        accountBalance -= amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Balance: " + accountBalance);
    }
}