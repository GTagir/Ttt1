package les4_krestnol;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    private static Scanner in = new Scanner(System.in);
    private static int size;
    private static int lineWin = 0;
    private static int ostPolia = 0;
    private static char[][] map;

    private static final char X = 'X';
    private static final char O = 'O';
    private static final char point = '•';
    private static final char empty = '♥';

    private static int koordVert;
    private static int koordHoriz;

    private static int checkChel;
    private static int checkIO;

    public static void main(String[] args) {
//        System.out.println("----- Крестики-нолики -----");
//        System.out.println("---- Добро пожаловать! ----");
        checkSize();
        creatMap();
        map();

        while (true) {
            hodChel();
            map();

            chekWin(X);

            hodIO();
            map();
            chekWin(O);
        }
    }

    private static void creatMap() {
        map = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                map[i][j] = point;
            }
        }
    }

    private static void checkSize() {
        while (true) {
            System.out.println("Введите размер игрового поля от 3 до 15");
            if (in.hasNextInt()) {
                size = in.nextInt();
                if (size >= 3 && size <= 15) {
                    ostPolia = size * size;
                    break;
                } else {
                    System.out.println("Размер поля должен быть от 3 до 15");
                    continue;
                }
            }
            System.out.println(in.next() + " - это не число");
        }

        if (size <3 || size > 15){
            System.out.println("Введен не правильный размер игрового поля!");
        } else if (size >= 3 && size <= 6){
            lineWin = 3;
//            System.out.println(lineWin);
        } else if (size >= 7 && size <= 10) {
            lineWin = 4;
//            System.out.println(lineWin);
        } else if (size >= 11 && size <= 15) {
            lineWin = 5;
//            System.out.println(lineWin);
        }
    }

    private static void creatMapShapka() {
        System.out.print(empty + " ");
        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + " ");
        }
        System.out.println();
    }

    private static void printMap() {
        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < size; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void hodChel() {
        int x = 100, y = 100;
        do {
            while (true) {
                if (x != 100){
                    System.out.println("Данное поле занято!");
                }
                System.out.println("Введите координату по вертикали от 1 до " + size);
                if (in.hasNextInt()) {
                    x = in.nextInt();
                    if (x >= 1 && x <= size) {
                        break;
                    } else System.out.println("Нужно ввести число от 1 до " + size);
                } else System.out.println(in.next() + " - это не число");
            }

            while (true) {
                System.out.println("Введите координату по горизонтали от 1 до " + size);
                if (in.hasNextInt()) {
                    y = in.nextInt();
                    if (y >= 1 && y <= size) {
                        break;
                    } else System.out.println("Нужно ввести число от 1 до " + size);
                } else System.out.println(in.next() + " - это не число");
            }
        } while (map[x-1][y-1] != point);
        koordVert = x - 1;
        koordHoriz = y - 1;
        map[koordVert][koordHoriz] = X;
        ostPolia--;
    }

    private static void hodIO() {
        System.out.println(checkHorizontHodChel());
        if (checkHorizontHodChel() == false){
        while (true) {
            int a = ThreadLocalRandom.current().nextInt(0, size);
            int b = ThreadLocalRandom.current().nextInt(0, size);
            if (map[a][b] == point){
            map[a][b] = O;
                koordVert = a;
                koordHoriz = b;
            ostPolia--;
            break;
            }
        }
    }}

    private static boolean checkHorizontHodChel() { //Есть ошибка
        int n = 0;
        int m = lineWin - 1;
        for (int i = 0; i <size ; i++) {
            if (map[koordVert][i] == O){
                n++;
                System.out.println("n = " + n);
                if (n == m){
                    if (map[koordVert][i+1] == point){
                    map[koordVert][i+1] = O;
                    return true;
                    }else if(map[koordVert][i+1] == X){
                        if (map[koordVert][i-1] == point){map[koordVert][i-1] = O;
                        return true;}
                    }

//                    if (symbol == X){
//                        System.out.println("Вы выиграли!!!");
//                        end();} else {
//                        System.out.println("IO оказался умнее!!!");
//                        end();}
                }
            } else {
                n = 0;
            return false;
            }
        }
        return false;
    }

    private static void chekWin(char symbol) {
        checkNichia();
        checkHorizont(symbol);
        checkVertikal(symbol);
        checkDiagonal(symbol);
        checkObrDiagonal(symbol);
    }

    private static boolean checkHorizont(char symbol) {
        int n = 0;
        for (int i = 0; i <size ; i++) {
            if (map[koordVert][i] == symbol){
                n++;
                if (n == lineWin){
                    if (symbol == X){
                        System.out.println("Вы выиграли!!!");
                        end();} else {
                        System.out.println("IO оказался умнее!!!checkHorizont");
                        end();}
                }
            } else n = 0;
        }
        return false;
    }

    private static boolean checkVertikal(char symbol) {
        int n = 0;
        for (int i = 0; i <size ; i++) {
            if (map[i][koordHoriz] == symbol){
                n++;
                if (n == lineWin){
                    if (symbol == X){
                    System.out.println("Вы выиграли!!!");
                    end();} else {
                        System.out.println("IO оказался умнее!!!checkVertikal");
                        end();
                    }
                }
            } else n = 0;
        }
        return false;
    }

    private static boolean checkDiagonal(char symbol) {
        int c = koordVert + koordHoriz;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i + j == c) {
                    if (map[i][j] == X) {
                        checkChel++;
                        if (checkChel == lineWin){
                            System.out.println("Вы выиграли!!!");
                            end();}
                    } else if (map[i][j] == point || map[i][j] == O){
                        checkChel = 0;
                    }
                    if (map[i][j] == O){
                        checkIO++;
                        if (checkIO == lineWin) {
                            System.out.println("IO оказался умнее!!!checkDiagonal");
                            end();
                        }
                    }else if (map[i][j] == point || map[i][j] == X){
                        checkIO = 0;
                    }
                }
            }
        }
        return false;
    }

    private static boolean checkObrDiagonal(char symbol) { // Есть ошибка у IO
        int a = koordVert;
        int b = koordHoriz;
        while (a != 0 && b != 0) {
            a--;
            b--;
        }
        int c = a + b;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == a && j == b) {
                    System.out.println("a = " + a + " b = " + b + " c = " + c + " checkChel = " + checkChel);
                    if (map[i][j] == X) {
                        a++;
                        b++;
                        c = a + b;
                        checkChel++;
                        System.out.println("aЦ = " + a + " bЦ = " + b + " checkChel = " + checkChel);
                        if (checkChel == lineWin) {
                            System.out.println("Вы выиграли!!!");
                            end();
                        }
                    } else if (map[i][j] == point || map[i][j] == O) {
                        checkChel = 0;
                    }
                        if (map[i][j] == O) {
                            a++;
                            b++;
                            c = a + b;
                            checkIO++;
                            System.out.println("aЦ = " + a + " bЦ = " + b + " checkIO = " + checkIO);
                            if (checkIO == lineWin) {
                                System.out.println("IO оказался умнее!!!checkObrDiagonal");
                                end();
                            }
                        } else if (map[i][j] == point || map[i][j] == O) {
                            checkIO = 0;
                        }
                    }
                }
        }
        return false;
    }

    private static void end() {
        System.exit(-1);
    }

    private static void map() {
        creatMapShapka();
        printMap();
    }

    private static void checkNichia() {
        if (ostPolia == 0){
            System.out.println();
            System.out.println("Ничья!!!");
            end();
        }
    }
}

/**
 *         //получить размер игрового поля
 *         //подобрать победную серию для выбранного размера
 *         //размер 3-6 -> победная серия 3
 *         //размер 7-10 -> победная серия 4
 *         //размер 11+ -> победная серия 5
 */

