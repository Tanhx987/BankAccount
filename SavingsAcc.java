public class SavingsAcc extends BankAcc {
    private double interestRate;

    public SavingsAcc() {
    }

    public SavingsAcc(String accNum, double accBal, String accHolder, double interestRate) {
        super(accNum, accBal, accHolder);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = getAccountBalance() * interestRate / 100;
        deposit(interest);
    }
}
