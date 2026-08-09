package P02Encapsulation;

class BankAccount {
    private double balance;

    public void deposite(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited:- " + amount);
        } else {
            System.out.println("Invalid deposite amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn:- " + amount);
        } else {
            System.out.println("Invalid withdraw amount");
        }
    }

    public void getBalance() {
        System.out.println("Balance:- " + balance);
    }
}

public class J01Bank {
    public static void main(String args[]) {
        BankAccount account = new BankAccount();

        account.deposite(1000);
        account.withdraw(2000);
        account.getBalance();
        account.withdraw(500.50);
        account.getBalance();
    }
}
