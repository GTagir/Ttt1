package les5;

import java.time.YearMonth;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Уmployee chel1 = new Уmployee("Ivanov Ivan", "Engineer", "dfsx@hjcebj.com", "71234567890", 40000.0, 35);
        Уmployee chel2 = new Уmployee("Petrov Petr", "Direktor", "direktor@hjcebj.com", "7123456456", 130000.0, 56);
        Уmployee chel3 = new Уmployee("Vasilkov Vasil", "Dvornik", "gfdd@hjcebj.com", "71576676767", 20000.0, 61);
        Уmployee chel4 = new Уmployee("Sidorov Sidor", "Ohrannik", "dagrgtor@hjcebj.com", "71275677676", 30000.0, 39);
        Уmployee chel5 = new Уmployee("Kuznecova Lena", "ZamDirektora", "zamdirektor@hjcebj.com", "71676767676", 80000.0, 45);

        Уmployee[] уmployees = new Уmployee[]{chel1, chel2, chel3, chel4, chel5};
        for (Уmployee X : уmployees) {
            if (X.getVozrast() > 40){
                System.out.println(X);
            }
        }
    }
}

/**
 * Создать класс ""Сотрудник"" с полями: ФИО, должность, email, телефон, зарплата, возраст.
 * Конструктор класса должен заполнять эти поля при создании объекта.
 * Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
 * Создать массив из 5 сотрудников. Пример: Person[] persArray = new Person[5]; // Вначале объявляем массив объектов persArray[0] = new Person(""Ivanov Ivan"", ""Engineer"", ""ivivan@mailbox.com"", ""892312312"", 30000, 30); // потом для каждой ячейки массива задаем объект persArray[1] = new Person(...); ... persArray[4] = new Person(...);
 * С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
 */