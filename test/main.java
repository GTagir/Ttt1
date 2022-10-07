package test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class main {

    private static final char charchel = 'X';
    private static final char charspace = '•';
    private static final char charpc = 'O';
    private static final char charpust = '♥';

    private static int row;    // Ряд, строка
    private static int column;   // Столбец

    private static int size, sizeWin;

    private static Scanner in = new Scanner(System.in);

    private static Random random = new Random();

    private static char [] [] arr;

    public static void main(String[] args) {
        nachalo();
        newCard();
        hodChel();
        checkWin();
        hodPC();
        checkWin();
    }

    private static void nachalo() {
        System.out.println("Начало игры!!!");
        interingSettings();
        sizeWin();

    }

    private static void interingSettings() {
        System.out.println("Введите размер игравого поля от 3-х до 15:");
        size = vvodRazmeraPolia();
    }

    private static int vvodRazmeraPolia() {
        while (true) {
            if (in.hasNextInt()) {
                int size = in.nextInt();
                if (diapazonMap(size)) {
                    return size;
                }
                System.out.println("ОШБИКА! Проверьте значение координаты. Допускается от 3 до 15");
            } else {
                System.out.println("ОШИБКА! Ввод допускает лишь целые числа!");
                in.next();
            }
        }
    }

    private static boolean diapazonMap(int size) {
        return size >= 3 && size <= 15;
    }

    private static void sizeWin() {
        if (size >= 3 && size <=6) {
            sizeWin = 3;
        }
        if (size >=7 && size <= 10) {
            sizeWin = 4;
        }
        if (size >= 11 && size <= 15) {
            sizeWin = 5;
        }
    }

    private static void newCard() {
        shapkaMap();
        zapolnenieArr();
        bodyMap();
    }

    private static void shapkaMap() {
        System.out.print(" " + charpust + " ");
        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + " ");
        }
        System.out.println();
    }

    private static void zapolnenieArr() {
        arr = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = charspace;
            }
        }
    }

    private static void bodyMap() {
        for (int i = 0; i < size; i++) {
            System.out.printf("%2d ", i+1);
            for (int j = 0; j < size; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void hodChel() {
        System.out.println("Ход человека!!!");
        while (true) {
            if (in.hasNextInt()) {
                row = in.nextInt();
                if (row <= size) {
                    break;
                }
                System.out.printf("ОШБИКА! Проверьте значение координаты. Допускается от 1 до %d\n", size);
            } else {
                System.out.println("ОШИБКА! Ввод допускает лишь целые числа!");
                in.next();
            }
        }

        while (true) {
            if (in.hasNextInt()) {
                column = in.nextInt();
                if (column <= size) {
                    break;
                }
                System.out.printf("ОШБИКА! Проверьте значение координаты. Допускается от 1 до %d\n", size);
            } else {
                System.out.println("ОШИБКА! Ввод допускает лишь целые числа!");
                in.next();
            }
        }
        arr[row - 1][column - 1] = charchel;
        shapkaMap();
        bodyMap();
    }

    private static void checkWin() {
    }

    private static void hodPC() {
        System.out.println("Ход ПК!!!");
    }
}
