package lesson7;

public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int foodToDecrease) {
        if (food >= foodToDecrease) {
        food -= foodToDecrease;
        return true;
        }
        return false;
    }

    public int getFood() {
        return food;
    }

    public void printInfo() {
        System.out.println("В тарелке " + food + " единиц еды");
    }

    public void increaseFood(int foodToIncrease) {
        food += foodToIncrease;
        System.out.println("В тарелку добавили " + foodToIncrease + " единиц еды");
    }
}
