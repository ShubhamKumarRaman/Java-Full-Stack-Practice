// Custom checked exception - extends Exception (not RuntimeException)

public class Insufficientfundsexception extends Exception {
    private double balance;
    private double withdrawalAmount;

    // Constructor with details context
    public Insufficientfundsexception(double balance, double withdrawalAmount) {
        super(String.format(
                "Insufficient funds! Attempted to withdraw ₹%.2f but available balance is only ₹%.2f.",
                withdrawalAmount, balance));

        this.balance = balance;
        this.withdrawalAmount = withdrawalAmount;
    }

    // Getter to access financial details from catch block
    public double getBalance() {
        return balance;
    }

    public double getWithdrawalAmount() {
        return withdrawalAmount;
    }

    public double getShortfall() {
        return withdrawalAmount - balance;
    }
}
