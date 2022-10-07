package lesson13;

public abstract class Stage {// Этап
    protected int length;
    protected String description;
    public String getDescription() {
        return description;
    }
    public abstract void go(Car c);
}

