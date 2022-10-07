package lesson7;

import lesson6.Cats;

import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        Plate plate = new Plate(100);
        plate.printInfo();

        Cat murzik = new Cat("Мурзик", 25, false);
        Cat gav = new Cat("Гав", 2, false);
        Cat vasia = new Cat("Вася", 10, false);
        Cat kisa = new Cat("Киса", 5, false);


        Cat[] cats = new Cat[]{murzik, gav, vasia, kisa};

        while (plate.getFood() > 0) {
            for (Cat cat :  cats) {
                cat.setSatiety(false);
            }
            System.out.println("Прошел день");

            plate.increaseFood(ThreadLocalRandom.current().nextInt(25));

            for (Cat cat : cats) {
                cat.eat(plate);
                plate.printInfo();
            }
            System.out.println("Коты поели!");
        }
    }

    /**
     * Домашнее задание
     * 1. Расширить задачу про котов и тарелки с едой.
     * 2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды
     * (например, в миске 10 еды, а кот пытается покушать 15-20).
     * 3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту
     * удалось покушать (хватило еды), сытость = true.
     * 4. Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть
     * наполовину сыт (это сделано для упрощения логики программы).
     * 5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и
     * потом вывести информацию о сытости котов в консоль.
     * 6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку
     */

}
