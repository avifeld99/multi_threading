package be.intecbrussel;

public class Heartbeat implements Runnable {

    private int milliSecondsBetweenBeats;

    public Heartbeat(int milliSecondsBetweenBeats) {
        this.milliSecondsBetweenBeats = milliSecondsBetweenBeats;
    }

    @Override
    public void run() {
        for (;;){

            try {
                Thread.sleep(milliSecondsBetweenBeats);
            } catch (InterruptedException e) {
                break;
            }
            System.out.println(Thread.currentThread().getName()+ " heart's: <3 <3");
        }

    }
}
