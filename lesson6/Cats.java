package lesson6;

public class Cats extends Animal{

    public Cats(int run, String nickname, String whatanimal) {
        super(run, nickname, "Кошка");
    }
    @Override
    public void doAction() {
       System.out.printf("%s не умеет плавать  %n", super.getNickname());
    }
}
