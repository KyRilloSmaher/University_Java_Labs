package QuestionFour;

public class CheckingAccount extends BankAccount {
    private int transactionCount = 0;
    private static int noOfFreeTransaction = 3;
    private static double transactionFees = 2.0;

    public CheckingAccount(double balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
        transactionCount++;
    }

    @Override
    public boolean withdraw(double amount) {
        if (super.withdraw(amount)) {
            transactionCount++;
            return true;
        }
        return false;
    }

    @Override
    public boolean transfer(double amount, BankAccount otherAccount) {
        if (super.transfer(amount, otherAccount)) {
            transactionCount++;
            return true;
        }
        return false;
    }

    public void deductFees() {
        if (transactionCount > noOfFreeTransaction) {
            int chargeableTransactions = transactionCount - noOfFreeTransaction;
            balance -= chargeableTransactions * transactionFees;
        }
        transactionCount = 0; // Reset transaction count after fees are deducted
    }

    public int getTransactionCount() {
        return this.transactionCount;
    }
}

