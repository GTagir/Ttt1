package les6;

public class Cat extends Animal{
    public Cat(String name, int run, int swim, int kolichestvo) {
        super(name, run, swim, kolichestvo);
    }

    public Cat(String name) {
        super(name, 200, 0, kolichestvo);
    }

    @Override
    public String toString() {
        return "Кошка - " + getName() + " может пробежать - " + getRun() + "м. И совсем не умеет плавать!!!";
    }
}
