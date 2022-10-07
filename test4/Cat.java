package test4;

public class Cat implements InterfTest{
    public Cat(String name) {
        this.name = name;
    }

    private String name;

    @Override
    public void beg() {
        System.out.println(name + " бежит");
    }

    @Override
    public void sikr() {
        System.out.println(name + " прыгает");

    }
}
