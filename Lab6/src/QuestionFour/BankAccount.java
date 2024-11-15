package QuestionFour;

public abstract class BankAccount implements Comparable<BankAccount> {
    protected double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public boolean transfer(double amount, BankAccount otherAccount) {
        if (this.withdraw(amount)) {
            otherAccount.deposit(amount);
            return true;
        }
        return false;
    }

    @Override
    public int compareTo(BankAccount other) {
        return Double.compare(other.getBalance(), this.getBalance());
    }

    @Override
    public String toString() {
        return String.format("%s: Balance = %.2f", this.getClass().getSimpleName(), balance);
    }
}
