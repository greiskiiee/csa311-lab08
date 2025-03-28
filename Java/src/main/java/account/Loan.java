package account;

/**
 * Refactor Exercise 2: Account
 *
 * @author Zishen Wen (F22), Deyuan Chen (S22)
 */
public class Loan extends PaymentAccount {

    private int balanceRemaining;
    private final int minimumMonthlyPayment;

    public Loan(String accountHolder, int accountNumber, int balanceRemaining, int minimumMonthlyPayment) {
        super(accountHolder, accountNumber);
        this.balanceRemaining = balanceRemaining;
        this.minimumMonthlyPayment = minimumMonthlyPayment;
    }

    @Override
    public boolean pay(int amount) {
        if (amount < this.minimumMonthlyPayment) {
            return false;
        }
        balanceRemaining -= amount;
        return true;
    }

    public int getBalanceRemaining() {
        return balanceRemaining;
    }

    public int getMinimumMonthlyPayment() {
        return minimumMonthlyPayment;
    }

}
