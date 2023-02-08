package be.intecbrussel;

public class Heartbeat implements Runnable {

    private int milliSecondsBetweenBeats;

    public Heartbeat(int milliSecondsBetweenBeats) {
        this.milliSecondsBetweenBeats = milliSecondsBetweenBeats;
    }

    @Override
    public void run() {

    }
}
