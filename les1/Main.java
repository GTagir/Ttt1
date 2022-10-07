package les1;

public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

    }

    private static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
        System.out.println();
    }

    private static void checkSumSign() {
        int a = 5, b = -6;
        int result = a + b;
        System.out.println("a = " + a + " b = " + b);
        if (result >= 0){
            System.out.println("Сумма положительна");
        }else System.out.println("Сумма отрицательная");
    }

    private static void printColor() {
        int value = 200;
        if (value <= 0) {
            System.out.println();
            System.out.println("Красный");
        }else if (value > 0 && value <= 100){
            System.out.println();
            System.out.println("Желтый");
        }else if (value > 100){
            System.out.println();
            System.out.println("Зеленый");
        }
    }

    private static void compareNumbers() {
        System.out.println();
        int a = 5, b = 6;
        if (a >= b){
            System.out.println("a >= b");
        }else System.out.println("a < b");
    }
}




/** 1. Создать пустой проект в IntelliJ IDEA, создать класс HomeWorkApp, и прописать в нем метод main().
 2. Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple.
 Orange
 Banana
 Apple

 3. Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми значениями, которыми захотите. Далее метод должен просуммировать эти переменные, и если их сумма больше или равна 0, то вывести в консоль сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”;
 4. Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым значением. Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”, если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”, если больше 100 (100 исключительно) - “Зеленый”;
 5. Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми
 значениями, которыми захотите. Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”, в
 противном случае “a < b”; **/