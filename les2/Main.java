package les2;

public class Main {
    static int a = 5;
    static int b = 9;
    static String string = "Строка напечаталась";
    static final int god = 2024;

    public static void main(String[] args) {
        System.out.println(sumPredel(a, b));
        checkPositivity(a);
        System.out.println(booleancheckPositivity(a));
        stringPrint(string, 6);
        System.out.println(god + " " + checkVisokos());
    }

    private static boolean sumPredel(int a, int b) {
        int result = a + b;
        if (result >= 10 && result <= 20){
            return true;
        } else return false;
    }

    private static void checkPositivity(int a) {
        if (a >= 0) {
            System.out.println("Число A положительное");
        }else System.out.println("Число А отрицательное");
    }

    private static boolean booleancheckPositivity(int a) {
        if (a >= 0) {
            return true;
        }else return false;
    }

    private static void stringPrint(String string, int i) {
        for (int j = 0; j < i; j++) {
            System.out.println(string);
        }
    }

    private static boolean checkVisokos() {
        System.out.println();
        if (god % 400 == 0){
            return true;
        } else if (god % 100 == 0) {
            return false;
        } else if (god % 4 == 0) {
            return true;
        }else return false;
    }
}

/**
 *1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
 * 2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
 * 3. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
 * 4. Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль
 * указанную строку, указанное количество раз;
 * 5. * Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
 */