package Bank;

public class BankRunnable implements Runnable {

    private BankAccount bankAccount;
    private int amount;

    public BankRunnable(BankAccount bankAccount, int amount) {
        this.bankAccount = bankAccount;
        this.amount = amount;
    }

    @Override
    public void run() {
        if (amount > 0) {
            for (int i = 0; i < amount; i++) {
                bankAccount.addOne();
            }
        }
        else {
            for (int i = amount; i < 0; i++) {
                bankAccount.removeOne();
            }
        }

    }
}
