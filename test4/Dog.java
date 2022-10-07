package test4;

public class Dog implements InterfTest{
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void beg() {
        System.out.println(name + " бежит");
    }

    @Override
    public void sikr() {
        System.out.println(name + " прыгает");
    }
}
