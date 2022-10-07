package les6;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик");
        Cat cat2 = new Cat("Черныш");
        Cat cat3 = new Cat("Ксюня");
        Dog dog1 = new Dog("Шарик");
        Dog dog2 = new Dog("Бобик");

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(cat3);
        System.out.println("Всего у нас животных - " + Animal.kolichestvo);
    }
}

/**
 * Создать классы Собака и Кот с наследованием от класса Животное.
 * Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия. Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
 * У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
 * * Добавить подсчет созданных котов, собак и животных.
 *  swim и run - плыть и бежать
 */