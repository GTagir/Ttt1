package lesson8;

import lesson6.Dogs;

public class Main {
    public static void main(String[] args) {
        Participant[] participants = new Participant[]{
            new Cat("Мурзик", 11, 11),
            new Robot("РобоРобин", 10, 5),
            new Human("Васёк", 10, 5),
            new Robot("jhgl", 20, 50),
        };
        Track[] tracks = new Track[]{
                new Wall(8),
                new Treadmill(6),
                new Wall(20),
                new Treadmill(21),

        };
        Competition competition = new Competition(participants, tracks);
        competition.start();
    }
}
