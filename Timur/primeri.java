package Timur;

import java.util.Scanner;

public class primeri {
    private static Scanner in = new Scanner(System.in);
    private static int a, b, c;
    private static double rezultat1;
    private static double rezultat2;
    private static double rezultat3;

    private static final char symbolA = 'A';
    private static final char symbolB = 'B';
    private static final char symbolC = 'C';

    public static void main(String[] args) {
        a = vvodChisla('A');
        b = vvodChisla('B');
        c = vvodChisla('C');

        rezultat1 = (((c / b)-(Math.sqrt(24)) + a) / (2 * a * c - 1));
        rezultat2 = (Math.atan(b) + c * b - a / 4) / (a * b - 1);
        rezultat3 = Math.abs(Math.pow(a, 2) - Math.pow(a, 3)) - (7 * a / (Math.pow(a, 3) - 15 * a));

        System.out.println();
        System.out.println("Результат вычисдения = " + rezultat1);
        System.out.println("Результат вычисдения = " + rezultat2);
        System.out.println("Результат вычисдения = " + rezultat3);

    }

    private static int vvodChisla(char symbol) {
        int x = 0;
        while (true) {
            System.out.println("Введите целое число " + symbol);
            if (in.hasNextInt()) {
                x = in.nextInt();
                if (x >= 0) {
                    break;
                } else System.out.println("Нужно ввести целое число");
            } else System.out.println(in.next() + " - это не корректные данные!!!");
        }
        return x;
    }
}