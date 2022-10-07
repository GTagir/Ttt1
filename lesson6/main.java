package lesson6;

import lesson5.player;

public class main {
    public static void main(String[] args) {
        Dogs Dog1 = new Dogs(505,"Бобик", "");
        Dogs Dog2 = new Dogs(195,"Шарик", "");

        Cats Cat1 = new Cats(175,"Черныш", "");
        Cats Cat2 = new Cats(290,"Васька", "");

        int score = 0;
        int swim = 5;

        Animal[] animals = {Dog1, Dog2, Cat1, Cat2};
        for (int i = 0; i < animals.length; i++) {
            score = i + 1;
        }

        for (Animal animal: animals) {
            animal.printInfo();
            animal.doAction();
        }
        System.out.println("");
        System.out.println("Всего животных: " + score);
    }
}
