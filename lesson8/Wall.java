package lesson8;

public class Wall implements Track{
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean overcome(Participant participant) {
        int jump = participant.getJump();
        if (jump >= height){
            System.out.println(participant.getName() + " перепрыгнул через стену высотой " + height);
            return true;
        }
        System.out.println(participant.getName() + " не смог перепрыгнуть через стену высотой " + height);
        return false;
    }
}
