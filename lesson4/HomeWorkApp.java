package lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWorkApp {
    private static final int SIZE=3;
    private static final int SIZEWIN=3;

    private static final char DOT_EMPTY = '•';
    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = 'O';
    public static final String HEADER_FIRST_SYMBOL = "♥";
    private static char[][] MAP = new char[SIZE][SIZE];

    private static Scanner in = new Scanner(System.in);
    private static Random random = new Random();

    private static int rowNumber, columnNumber;
    private static int turnsCount;

    public static void main(String[] args) {
        completionArrMapDotEmpty();
        map();
        playGame();

    }

    private static void completionArrMapDotEmpty() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                MAP[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void map() {
        oneStringmap(MAP);
        printBodyMap(MAP);
    }

    private static void oneStringmap(char[][] map) {
        System.out.print(HEADER_FIRST_SYMBOL + " ");
        for (int i = 0; i < SIZE; i++) {
            printMapNumber(i);
        }
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
        System.out.println();
    }

    private static void printMapNumber(int i) {
        System.out.print(i + 1 + " ");
    }

    private static void playGame() {
        while (true) {
            vvodKoordinatIgrokom();
            if (checkEnd(DOT_HUMAN)){
                break;
            }

            vvodKoordinatAI();
            if (checkEnd(DOT_AI)){
                break;
            }
        }

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
        map();
        turnsCount++;
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

    private static boolean checkEnd(char symbol) {
        if (checkWin(symbol)) {
            if (symbol == DOT_HUMAN) {
                System.out.println("УРА ВЫ ПОБЕДИЛИ!");
            } else {
                System.out.println("Восстание близко... ИИ победил...");
            }
            return true;
        }
        return checkNichya();
 //   }
 //       return false;
    }

    private static boolean checkWin(char symbol) {
        checkHorizontWin(symbol);
        checkVertikalWin(symbol);
        checkDiagonal1(symbol);
        checkDiagonal2(symbol);
        return false;
    }

    // rowNumber columnNumber
    private static void checkDiagonal1(char symbol) {
//        for (int i = 0; i < MAP.length; i++) {
//            for (int j = 0; j < MAP[i].length; j++) {
//                if (i == j || i+j+1 == ARRAY_SIZE){
//                    arr[i][j] = 1;
//                }
//                System.out.printf("%2d ",arr[i][j]);
//            }
//            System.out.println();
//        }
    }

    private static void checkDiagonal2(char symbol) {
    }

    private static boolean checkHorizontWin(char symbol) {
        int n = 0;
        for (int i = 0; i < SIZE; i++) {
            if (MAP[rowNumber][i] == symbol) {
                System.out.println(symbol);
                n++;
                if (n==SIZEWIN){
                    if (symbol == DOT_HUMAN) {
                        System.out.println("УРА ВЫ ПОБЕДИЛИ!");
                    } else {
                        System.out.println("Восстание близко... ИИ победил...");
                    }
                    return true;
                }
            }
            else n = 0;
        }
        return false;
    }

    private static boolean checkVertikalWin(char symbol) {
        int m = 0;
        for (int i = 0; i < SIZE; i++) {
            if (MAP[i][columnNumber] == symbol) {
                m++;
                if (m==SIZEWIN){
                    if (symbol == DOT_HUMAN) {
                        System.out.println("УРА ВЫ ПОБЕДИЛИ!");
                    } else {
                        System.out.println("Восстание близко... ИИ победил...");
                    }
                    return true;
                }
            }
            else m = 0;
        }
        return false;
    }

    private static boolean checkNichya() {
        if (checkDraw()) {
            System.out.println("Ничья!");
            return true;
        }
        return false;
    }
    private static boolean checkDraw() {
        return turnsCount == SIZE * SIZE;
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
           rowNumber = (int) (Math.random() * SIZE);
           columnNumber = (int) (Math.random() * SIZE);
        if (MAP[rowNumber][columnNumber] == DOT_EMPTY){
            break;
        }
       }
            MAP[rowNumber][columnNumber] = DOT_AI;
            map();
        turnsCount++;
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
