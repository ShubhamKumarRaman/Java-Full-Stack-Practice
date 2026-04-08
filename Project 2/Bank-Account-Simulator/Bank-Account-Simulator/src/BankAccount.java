public class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative " + balance);
        }
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Deposit
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive. Provided. Rs." + amount);
        }

        balance += amount;
        System.out.printf("[DEPOSIT]  ₹%.2f credited  →  New Balance: ₹%.2f%n", amount, balance);
    }

    // Withdraw
    public void withdraw(double amount) throws Insufficientfundsexception {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive. Provided: ₹" + amount);
        }

        if (amount > balance) {
            throw new Insufficientfundsexception(balance, amount);
        }

        balance -= amount;
        System.out.printf("[WITHDRAW] ₹%.2f debited   →  New Balance: ₹%.2f%n", amount, balance);
    }

    // Getters
    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    @Override
    public String toString(){
        return String.format("Account[%s | %s | Balance: ₹%.2f]", accountNumber, holderName, balance);
    }
}
