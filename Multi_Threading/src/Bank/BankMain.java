package Bank;

public class BankMain {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(0);

        Thread addMoney = new Thread(new BankRunnable(bankAccount, 10000));
        Thread removeMoney = new Thread(new BankRunnable(bankAccount, -10000));

        addMoney.start();
        removeMoney.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(bankAccount.getMoney());


        Thread addMoney2 = new Thread(new BankRunnable(bankAccount, 10000));
        addMoney2.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(bankAccount.getMoney());
    }
}
