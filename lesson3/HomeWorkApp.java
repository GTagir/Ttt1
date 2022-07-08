package lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWorkApp {
    static final int ARRAY_SIZE = 7;
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
    createArr();
    createArr100();
    createArr2();
    createTwoBitArr();
    System.out.println(Arrays.toString(crearArrTwoArgument(5,7)));
    createArrMinMaxElement();
    System.out.println(summArrGran());
    moveElementArr();
    }

    private static void createArr() {
        int [] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr [i] == 1) {
                arr [i] = 0;
            }else arr[i] = 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void createArr100() {
        int [] arr = new int [100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void createArr2() {
        int [] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void createTwoBitArr() {
        int [][] arr = new int [ARRAY_SIZE][ARRAY_SIZE];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j || i+j+1 == ARRAY_SIZE){
                    arr[i][j] = 1;
                }
                System.out.printf("%2d ",arr[i][j]);
            }
            System.out.println();
        }
    }

    private static int[] crearArrTwoArgument(int len, int initialValue) {
        int [] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr [i] = initialValue;
        }
        return arr;
    }

    private static void createArrMinMaxElement() {
        int [] arr = {1, 0, 5, 9, 1, 4, 8, 1, 2, 0};
        int max = arr[0], min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max = arr[i];
            }
            if (arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Максимальное значение массива" + max);
        System.out.println("Минимальное значение массива" + min);
    }

    private static boolean summArrGran() {
        int [] arr ={2, 2, 2, 1, 2, 2, 10, 1, 1};
        int sum=0, sumlev=0, sumprav=0, indlev=0, indprav = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        while (true){
        if (sumlev<=sumprav){sumlev = sumlev + arr[indlev]; indlev++;}
        else {sumprav = sumprav + arr[indprav]; indprav--;}
        if (sumlev + sumprav >= sum) {break;}
         }
return (sumlev == sumprav);
    }


    private static void moveElementArr() {
        int[] arr = {3, 1, 2, 4, 5};
        int a = getIntNumFromScanner();
        if (a>0){int b = arr[0];
        for (int j = 0; j < a; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];}
            arr[arr.length - 1] = b;
            b = arr[0];}
        }else{int b = arr[arr.length-1];
            for (int j = 0; j < Math.abs(a); j++) {
                for (int i = 0; i < arr.length - 1; i++) {
                    arr[arr.length-i-1] = arr[arr.length-i - 2];}
                arr[0] = b;
                b = arr[arr.length-1];
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    private static int getIntNumFromScanner() {
        while (true) {
            System.out.println("Введите целое число на которое будет сдвигаться массив: ");
            if (in.hasNextInt()) {
                return in.nextInt();
            }
            System.out.println(in.next() + " - это не число");
        }
    }
}
