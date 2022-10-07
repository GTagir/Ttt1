package les3;

import java.util.Arrays;

public class Main {
    static int[] arr;
    static int[] arr1;
    static int[] arr2;

    static int[][] arr3;

    static int[] array;

    static int len = 10;
    static int initialValue = 5;

    static final int sizeArr = 5;

    static int[] arrMinMax;

    static int[] arrLeftRight;

    static int[] arrLeftRight_N;
    static  final int n = -5;

    public static void main(String[] args) {

        arr1to0();
        arr0_100();
        arr6multiplead2();
        cubeArrDiagonal();
        System.out.println(Arrays.toString(metodSargumArr(len, initialValue)));
        arrMinMax();

        arrLeftRight = new int[]{1, 2, 2, 2, 1, 2, 2, 10, 1, 2};
        System.out.println(metodArrLeftRight(arrLeftRight));

        System.out.println();
        arrLeftRight_N = new int[]{6, 1, 3, 5};
        System.out.println("Исходный массив " + Arrays.toString(arrLeftRight_N));
        System.out.println(Arrays.toString(metodArrLeftRight_N(arrLeftRight_N, n)));

    }

    private static void arr1to0() {
        arr = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1){
                arr[i] = 0;
            } else arr[i] = 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void arr0_100() {
        arr1 = new int[100];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i+1;
            System.out.print(arr1[i] + ", ");
        }
    }

    private static void arr6multiplead2() {
        arr2 = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < 6){
                arr2[i] = arr2[i] * 2;
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(arr2));
    }

    private static void cubeArrDiagonal() {
       arr3 = new int[sizeArr][sizeArr];
        for (int i = 0; i < sizeArr; i++) {
            System.out.println(" ");
            for (int j = 0; j < sizeArr; j++) {
                arr3[i][j] = 0;
                if (i == j){
                    arr3[i][j] = 1;
                }
                if (i + j == sizeArr - 1){
                    arr3[i][j] = 1;
                }
                System.out.print(arr3 [i][j] + " ");
            }
        }
        System.out.println();
        System.out.println();
    }

    private static int[] metodSargumArr(int len, int initialValue) {
        array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        return array;
    }

    private static void arrMinMax() {
        System.out.println();
        arrMinMax = new int[]{10, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int max = 0, min = arrMinMax[0];
        for (int i = 0; i < arrMinMax.length; i++) {
            if (arrMinMax[i] > max){
                max = arrMinMax[i];
            }
            if (arrMinMax[i] < min){
                min = arrMinMax[i];
            }
        }
        System.out.println("Максимальное число в массиве = " + max);
        System.out.println("Минимальное число в массиве = " + min);
        System.out.println();
    }

    private static boolean metodArrLeftRight(int[] arrLeftRight) {
        int sum = 0;
        int nach = 0;
        int a = 0;
        for (int i = 0; i < arrLeftRight.length; i++) {
            sum += arrLeftRight[i];
        }
        if (sum % 2 != 0){
            return false;
        }else while (nach != sum / 2) {
            nach += arrLeftRight[a];
            a++;
        }
            System.out.println(a);
        System.out.print("[ ");
        for (int i = 0; i < a; i++) {
            System.out.print(arrLeftRight[i] + " ");
        }
        System.out.print("||| ");
        for (int i = a; i < arrLeftRight.length; i++) {
            System.out.print(arrLeftRight[i] + " ");
        }
        System.out.print("]");
            return true;
    }

    private static int[] metodArrLeftRight_N(int[] arrLeftRight_n, int n) {     //{6, 1, 3, 5}
        int m = 0;
        int N = Math.abs(n);
        while (N != 0) {
            N--;
            if (n > 0){
                m = arrLeftRight_n[0];
                for (int i = 1; i < arrLeftRight_n.length; i++) {
                    arrLeftRight_n[i-1] = arrLeftRight_n[i];
                }
                arrLeftRight_n[arrLeftRight_n.length - 1] = m;
//                System.out.println(Arrays.toString(arrLeftRight_n));
            } else if (n < 0) {
                m = arrLeftRight_n[arrLeftRight_n.length - 1];
                for (int i = arrLeftRight_n.length - 1; i > 0; i--) {
                    arrLeftRight_n[i] = arrLeftRight_n[i - 1];
                }
                arrLeftRight_n[0] = m;
//                System.out.println(Arrays.toString(arrLeftRight_n));
            } else if (n == 0) {
                System.out.println("N = ноль, некуда перемищать");
            }
        }
//        System.out.println(Arrays.toString(arrLeftRight_n));
        return arrLeftRight_n;
    }
}

/**
 * 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
 * 2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
 * 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
 * 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
 * 5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
 * 6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
 * 7. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
 * **Примеры:
 * checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
 * checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1
 *
 * граница показана символами |||, эти символы в массив не входят и не имеют никакого отношения к ИЛИ.
 *
 * 8. *** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным), при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.
 * Если выполнение задач вызывает трудности, можете обратиться к последней странице методического пособия. Для задач со * не нужно искать решение в интернете, иначе нет смысла их выполнять.
 */