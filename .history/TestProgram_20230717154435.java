public class TestProgram {
    public static void main(String[] args) {
        BankAcc bankAccount = new BankAcc("246890", 1000.0, "Name A");
        bankAccount.deposit(500.0);
        bankAccount.withdraw(200.0);
        bankAccount.displayAccountInfo();

        SavingsAcc savingsAccount = new SavingsAcc("135798", 3000.0, "Ahmad", 2.5);
        savingsAccount.addInterest();
        savingsAccount.displayAccountInfo();

        CurrentAcc currentAccount = new CurrentAcc("999901", 8000.0, "Abu", 500.0);
        currentAccount.withdraw(4000.0);
        currentAccount.displayAccountInfo();
    }
}