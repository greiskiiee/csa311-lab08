package account;

/**
 * Refactor Exercise 2: Account
 *
 * @author Zishen Wen (F22), Deyuan Chen (S22)
 */
public class DebitCard extends PaymentAccount {

    private int balance;

    public DebitCard(String accountHolder, int accountNumber, int balance) {
        super(accountHolder, accountNumber);
        this.balance = balance;
    }

    @Override
    public boolean pay(int amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public int getBalance() {
        return balance;
    }
}
