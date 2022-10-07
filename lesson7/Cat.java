package lesson7;

public class Cat {

    private final int appetite;
    private final String name;
    private final boolean satiety;  //Сытость

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public void eat(Plate plate) {
        System.out.println("Кот " + getName() + " начинает есть" );
        if (plate.decreaseFood(appetite) == true) {
            System.out.println(getName() + " поел " + appetite);
        }
        else {
            System.out.println(getName() + " не поел");
        }
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean b) {
    }
}
