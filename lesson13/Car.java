package lesson13;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Car implements Runnable {
    private static int CARS_COUNT;
    private static boolean winnerFound;
    private static Lock win = new ReentrantLock();

    static {
        CARS_COUNT = 0;
    }


    private Race race;
    private int speed;
    private String name;
    private CyclicBarrier cb;
    private CountDownLatch cd1;

    public String getName() {
        return name;
    }
    public int getSpeed() {
        return speed;
    }
    public Car(Race race, int speed, CyclicBarrier cb, CountDownLatch cd1) {
        this.race = race;
        this.speed = speed;
        CARS_COUNT++;
        this.name = "Участник #" + CARS_COUNT;
        this.cb = cb;
        this.cd1 = cd1;
    }

    @Override
    public void run() {
        try {
            System.out.println(this.name + " готовится");
            Thread.sleep(500 + (int)(Math.random() * 800));
            System.out.println(this.name + " готов");
            cb.await();
            cb.await();
        for (int i = 0; i < race.getStages().size(); i++) {
            race.getStages().get(i).go(this);
        }
        checkWinner(this);
        cb.await();
    } catch (Exception e){
    e.printStackTrace();
    }
}

    private static synchronized void checkWinner(Car c) {
    if (!winnerFound) {
        System.out.println(c.name + " Winner!!!");
        winnerFound = true;
        }
    }
}
