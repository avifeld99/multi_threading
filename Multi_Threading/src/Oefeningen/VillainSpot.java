package Oefeningen;

import java.util.Random;

public class VillainSpot {
    public static void main(String[] args) {


        Random random = new Random();
        TimeBomb2 timeBomb = new TimeBomb2(10);//bomb has 1à seconds!
        timeBomb.activate();
        try {
            Thread.sleep(random.nextInt(30000));//it will take us between 0-30 secs do disarm the bomb
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        timeBomb.disarm();
    }


}
