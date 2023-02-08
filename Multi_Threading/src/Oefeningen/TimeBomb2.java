package Oefeningen;

public class TimeBomb2 implements Runnable {

    private int seconds;
    private Thread thread;

    public TimeBomb2(int seconds) {
        this.seconds = seconds;
        thread = new Thread(this);
    }

    public void activate() {
        System.out.println("Bomb started");
        thread.start();
    }

    public void disarm() {
        thread.interrupt();
        System.out.println("Bomb stopped");
    }

    @Override
    public void run() {
        System.out.println("Timebomb started");
        for (int i = seconds; i >= 0; i--) {
            System.out.println(i + " seconds left");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (i == 0) {
                thread.interrupt();
                System.out.println("BOOOMMM!");
            }
        }
    }
}
