package Bank;

public class BankAccount {

    private int money;

    public BankAccount(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public synchronized void addOne() {
        money++;
        notifyAll();
    }

    public synchronized void removeOne() {
        if (money < 1500) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        money--;
        notifyAll();
    }
}
