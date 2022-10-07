package les6;

public abstract class Animal {
    private String name;
    private int run;
    private int swim;
    protected static Integer kolichestvo = 0;

    public Animal(String name, int run, int swim, int kolichestvo) {
        this.name = name;
        this.run = run;
        this.swim = swim;
        this.kolichestvo = kolichestvo;

        this.kolichestvo++;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getSwim() {
        return swim;
    }

    public void setSwim(int swim) {
        this.swim = swim;
    }

    public static Integer getKolichestvo() {
        return kolichestvo;
    }

    public static void setKolichestvo(Integer kolichestvo) {
        Animal.kolichestvo = kolichestvo;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", run=" + run +
                ", swim=" + swim;
    }
}
