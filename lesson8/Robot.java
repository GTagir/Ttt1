package lesson8;

public class Robot implements Participant{
    private String name;
    private int run, jump;

    public Robot(String name, int run, int jump) {
        this.name = name;
        this.run = run;
        this.jump = jump;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getRun() {
        return run;
    }

    @Override
    public int getJump() {
        return jump;
    }
}
