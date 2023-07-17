public class TestProgram {
    public static void main(String[] args) {
        BankAcc bankAccount = new BankAcc("246890", 1000.0, "Ali");
        bankAccount.deposit(600.0);
        bankAccount.withdraw(100.0);
        bankAccount.displayAccountInfo();

        SavingsAcc savingsAccount = new SavingsAcc("135798", 6500.0, "Ahmmad", 2.5);
        savingsAccount.addInterest();
        savingsAccount.displayAccountInfo();

        CurrentAcc currentAccount = new CurrentAcc("999901", 8000.0, "Abu", 500.0);
        currentAccount.withdraw(5000.0);
        currentAccount.displayAccountInfo();
    }
}
