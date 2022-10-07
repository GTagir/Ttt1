package lesson8;

public class Treadmill implements Track{
    private int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }

    @Override
    public boolean overcome(Participant participant) {
        int run = participant.getRun();
        if (run >= distance){
            System.out.println(participant.getName() + " пробежал дорожку длиной " + distance);
            return true;
        }
        System.out.println(participant.getName() + " не смог пробежать дорожку длиной " + distance);
        return false;
    }
}
