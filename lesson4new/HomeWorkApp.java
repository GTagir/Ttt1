package lesson4new;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWorkApp {
    private static final char DOT_EMPTY = '•';
    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = 'O';

    public static final String HEADER_FIRST_SYMBOL = "♥";
    public static final String SPACE_MAP = " ";
    private static int size, sizeWin;

    private static char[][] MAP;

    private static Scanner in = new Scanner(System.in);
    private static Random random = new Random();
    private static int turnsCount;
    private static int lastTurnRow;
    private static int lastTurnColumn;
    private static int rowNumber, columnNumber;

    public static void main(String[] args) {
        enteringSettings();
        MAP = new char[size][size];
        if (size >= 3 && size <= 6){
            sizeWin = 3;
            System.out.println("Победная серия 3");
        } else if (size >= 7 && size <= 10) {
            sizeWin = 4;
            System.out.println("Победная серия 4");
        } else {
            sizeWin = 5;
            System.out.println("Победная серия 5");}

        do {
            System.out.println("\nИгра начинается!!!");
            init();
            printMap();
            playGame();
        } while (isContinueGame());
        endGame();
    }

    private static void enteringSettings() {
        while (true) {
            System.out.print("Введите размер игрового поля (от 3 до 15): ");
            size = getValidNumberFromScanner2();
            if (size >= 3 && size <= 15) {
                break;
            }
        }
    }
    private static int getValidNumberFromScanner2() {
        while (true) {
            if (in.hasNextInt()) {
                int m = in.nextInt();
                if (diapazonMap(m)) {
                    return m;
                }
                System.out.println("ОШБИКА! Проверьте значение координаты. Допускается от 3 до 15");
            } else {
                System.out.println("ОШИБКА! Ввод допускает лишь целые числа!");
                in.next();
            }
        }
    }

    private static boolean diapazonMap(int m) {
        return m >= 3 && m <= 15;
    }

    private static int getValidNumberFromScanner() {
        while (true) {
            if (in.hasNextInt()) {
                int n = in.nextInt();
                if (isNumberValid(n)) {
                    return n;
                }
                System.out.println("ОШБИКА! Проверьте значение координаты. Допускается от 1 до " + size);
            } else {
                System.out.println("ОШИБКА! Ввод допускает лишь целые числа!");
                in.next();
            }
        }
    }

    private static void init() {
        turnsCount = 0;
        initMap();
    }

    private static void initMap() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                MAP[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printMap() {
        printMapHeader();
        printMapBody();
    }

    private static void printMapHeader() {
        System.out.print(HEADER_FIRST_SYMBOL + SPACE_MAP);
        for (int i = 0; i < size; i++) {
            printMapNumber(i);
        }
        System.out.println();
    }

    private static void printMapNumber(int i) {
        System.out.print(i + 1 + SPACE_MAP);
    }

    private static void printMapBody() {
        for (int i = 0; i < size; i++) {
            printMapNumber(i);
            for (int j = 0; j < size; j++) {
                System.out.print(MAP[i][j] + SPACE_MAP);
            }
            System.out.println();
        }
    }

    private static void playGame() {
        while (true) {
            humanTurn();
            printMap();
            if (checkEnd(DOT_HUMAN)) {
                break;
            }

            aiTurn();
            printMap();
            if (checkEnd(DOT_AI)) {
                break;
            }
        }
    }

    private static void humanTurn() {
        System.out.println("\nХОД ЧЕЛОВЕКА!");

        while (true) {
            System.out.print("Введите координату строки: ");
            rowNumber = getValidNumberFromScanner() - 1;

            System.out.print("Введите координату столбика: ");
            columnNumber = getValidNumberFromScanner()  - 1;

            if (isCellFree(rowNumber, columnNumber)) {
                break;
            }

            System.out.printf("ОШИБКА! Ячейка с координатами %s:%s уже используется%n%n", rowNumber + 1,
                    columnNumber + 1);
        }

        MAP[rowNumber][columnNumber] = DOT_HUMAN;
        turnsCount++;
    }

    private static boolean isCellFree(int rowNumber, int columnNumber) {
        return MAP[rowNumber][columnNumber] == DOT_EMPTY;
    }

    private static boolean isNumberValid(int n) {
        return n >= 1 && n <= size;
    }

    private static boolean checkEnd(char symbol) {
        if (checkHorizontWin(symbol) || checkVertikalWin(symbol) || checkDiagonal1(symbol) || checkDiagonal2(symbol)) {
            if (symbol == DOT_HUMAN) {
                System.out.println("УРА ВЫ ПОБЕДИЛИ!");
            } else {
                System.out.println("Восстание близко... ИИ победил...");
            }
            return true;
        }
        if (checkDraw()) {
            System.out.println("Ничья!");
            return true;
        }
        return false;
    }

    private static boolean checkHorizontWin(char symbol) {
        int n = 0;
        for (int i = 0; i < size; i++) {
            if (MAP[rowNumber][i] == symbol) {
                n++;
                System.out.println("Горизонт n=" + n);
                if (n ==sizeWin){
                    return true;
                }
            }
            else n = 0;
        }
        return false;
    }

    private static boolean checkVertikalWin(char symbol) {
        int n = 0;
        for (int i = 0; i < size; i++) {
            if (MAP[i][columnNumber] == symbol) {
                n++;
                if (n == sizeWin){
                    return true;
                }
            }
            else n = 0;
        }
        return false;
    }

    private static boolean checkDiagonal1(char symbol) {
        int n = 0;
        int b = columnNumber + rowNumber;
        for (int i = 0; i < MAP.length; i++) {
            for (int j = 0; j < MAP.length; j++) {
                if (b == i + j) {
                    if (MAP[i][j] == symbol){
                        n ++;
                    }
                    else n = 0;
                }
                if (n == sizeWin){
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean checkDiagonal2(char symbol) {
        int a = 0;
        do {
            if (rowNumber != 0 && columnNumber != 0) {
                rowNumber--;
                columnNumber--;
            }
            else break;
        }
        while (true);

        for (int i = 0; i < MAP.length; i++) {
            for (int j = 0; j < MAP.length; j++) {
                if (i == rowNumber && j == columnNumber) {
                    if (MAP[rowNumber][columnNumber] == symbol) {
                        a++; columnNumber++; rowNumber++;
                    }
                    else {
                        a = 0; columnNumber++; rowNumber++;
                    }
                    if (a == sizeWin){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    private static boolean checkDraw() {
        return turnsCount >= size * size;
    }

    private static void aiTurn() {
        System.out.println("\nХОД КОМПУКТЕРА!");
        do {
            rowNumber = random.nextInt(size);
            columnNumber = random.nextInt(size);

        } while (!isCellFree(rowNumber, columnNumber));

        MAP[rowNumber][columnNumber] = DOT_AI;
        turnsCount++;
    }

    private static boolean isContinueGame() {
        System.out.println("Хотите продолжить? y\\n");
        return switch (in.next()){
            case "y", "yes", "д", "да", "+" -> true;
            default -> false;
        };
    }

    private static void endGame() {
        in.close();
        System.out.println("Ты заходи, если что");
    }
}
