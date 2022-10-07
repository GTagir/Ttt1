package test3;

public class Dog implements CanVoice, Runeble{

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void voice() {
        System.out.println(name + " гафкнул!!!");
    }

    @Override
    public void run() {
        System.out.println(name + " побежал!!!!");
    }
}
