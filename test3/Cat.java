package test3;

public class Cat implements CanVoice, Runeble{
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void voice() {
        System.out.println(name + " мяукнул!!!");
    }

    @Override
    public void run() {
        System.out.println(name + " Бежит!");
    }
}
