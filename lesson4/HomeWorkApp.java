package lesson4;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class HomeWorkApp {
    private static final int SIZE=3;

    private static final char DOT_EMPTY = '•';
    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = 'O';
    public static final String HEADER_FIRST_SYMBOL = "♥";
    private static char[][] MAP = new char[SIZE][SIZE];

    private static Scanner in = new Scanner(System.in);
    private static Random random = new Random();

    private static int rowNumber, columnNumber;
    private static int numbersCharsMap = 0;

    public static void main(String[] args) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                MAP[i][j] = DOT_EMPTY;
            }

        }
        map();
        playGame();

    }

    private static void map() {
        oneStringmap(MAP);
        printBodyMap(MAP);
    }

    private static void printBodyMap(char[][] map) {
        for (int i = 0; i < SIZE; i++) {
            System.out.println();
            printMapNumber(i);
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
        }
        System.out.println();
    }

    private static void oneStringmap(char[][] map) {
        System.out.print(HEADER_FIRST_SYMBOL + " ");
        for (int i = 0; i < SIZE; i++) {
            printMapNumber(i);
        }
    }

    private static void printMapNumber(int i) {
        System.out.print(i +1 + " ");
    }

    private static void playGame() {
        while (true) {
            vvodKoordinatIgrokom();
            checkEndHuman();

            vvodKoordinatAI();
            checkEndAI();
        }

    }

    private static void checkEndHuman() {
    }

    private static void  vvodKoordinatIgrokom() {
        while (true) {
            vvodStrokiHuman();
            vvodStolbcaHuman();

            if (MAP[rowNumber][columnNumber] != DOT_EMPTY){
                System.out.println("Это поле занято, повторите ввод!");
            }
            else break;
        }
        MAP[rowNumber][columnNumber] = DOT_HUMAN;
        numbersCharsMap++;
        map();
    }

    private static void vvodStolbcaHuman() {
        do {
            System.out.println("Введите координату столбца: ");
            columnNumber = getIntNumFromScanner() -1;
            if (columnNumber>SIZE-1 || columnNumber<0){
                System.out.println("Такого столбца нет!!!");
            }
            else break;
        } while (true);
    }

    private static void vvodStrokiHuman() {
        do {
            System.out.println("Введите координату строки: ");
            rowNumber = getIntNumFromScanner() -1;
            if (rowNumber>SIZE-1 || rowNumber<0){
                System.out.println("Такой строки нет!!!");
            }
            else break;
        } while (true);
    }

    private static void vvodKoordinatAI() {
       while (true) {
           rowNumber = (int) (Math.random() * 3);
           columnNumber = (int) (Math.random() * 3);
        if (MAP[rowNumber][columnNumber] == DOT_EMPTY){
            break;
        }
       }
            MAP[rowNumber][columnNumber] = DOT_AI;
            numbersCharsMap++;
            map();
    }

    private static void checkEndAI() {
    }

    private static int getIntNumFromScanner() {
        while (true) {
            if (in.hasNextInt()) {
                return in.nextInt();
            }
            System.out.println(in.next() + " - это не число");
        }
    }
}
