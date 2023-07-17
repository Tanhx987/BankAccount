public class CurrentAcc extends BankAcc {
    private double overdraftLimit;

    public CurrentAcc() {
    }

    public CurrentAcc(String accNum, double accBal, String accHolder, double overdraftLimit) {
        super(accNum, accBal, accHolder);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getAccountBalance()) {
            super.withdraw(amount);
        } else if (amount <= getAccountBalance() + overdraftLimit) {
            double remainingBalance = amount - getAccountBalance();
            super.withdraw(getAccountBalance());
            overdraftLimit -= remainingBalance + (remainingBalance * 0.03);
        } else {
            System.out.println("Withdrawal amount exceeds account balance and overdraft limit.");
        }
    }
}