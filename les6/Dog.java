package les6;

public class Dog extends Animal{
    public Dog(String name, int run, int swim, int kolichestvo) {
        super(name, run, swim, kolichestvo);
    }
    public Dog(String name) {
        super(name, 500, 10, kolichestvo);
    }

    @Override
    public String toString() {
        return "Собака - " + getName() + " может пробежать - " + getRun() + "м. И проплыть - " + getSwim() + "м.";
    }
}
