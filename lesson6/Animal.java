package lesson6;

public abstract class Animal {
    private int run;
    private String nickName;
    private String whatAnimal;

    protected  final int dogMaxDistanceRun = 500;
    protected  final int catMaxDistanceRun = 200;
    protected  final int dogMaxDistanceSwim = 10;

    public Animal(int run, String nickname, String whatanimal) {
        this.run = run;
        this.nickName = nickname;
        this.whatAnimal = whatanimal;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public String getNickname() {
        return nickName;
    }

    public void setNickname(String nickname) {
        this.nickName = nickname;
    }

    public String getWhatanimal() {
        return whatAnimal;
    }

    public void setWhatanimal(String whatanimal) {
        this.whatAnimal = whatanimal;
    }

    @Override
    public String toString() {
        return String.format("%s %s пробежал %d м.%n", whatAnimal, nickName, run);
    }

    public void printInfo(){
        if (run > dogMaxDistanceRun) {
            System.out.printf("Собака %s столько не пробежит! %n%n", nickName);
        }
        else if (run > catMaxDistanceRun) {
        System.out.printf("Кошка %s столько не пробежит! %n%n", nickName);
        }
        else {
            System.out.print(this);
        }
    }
    public abstract void doAction();
}
