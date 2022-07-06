package lesson3;

import java.util.Arrays;

public class HomeWorkApp {
    static final int ARRAY_SIZE = 7;
    public static void main(String[] args) {
    createArr();
    createArr100();
    createArr2();
    createTwoBitArr();
    System.out.println(Arrays.toString(crearArrTwoArgument(5,7)));
    createArrMinMaxElement();
    summArrGran();
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

    private static void summArrGran() {
        int [] arr ={2, 2, 2, 1, 2, 2, 10, 1};
        int sum=0, sumlev=arr[0], sumprav=arr[arr.length-1];
        for (int i = 0; i < arr.length; i++) {
            sum =sum + arr[i];
        }
        if (arr[0]< arr[arr.length-1]){
            sumlev = arr[0] + arr[1];
        }else{sumprav = arr[arr.length-1]+arr[arr.length-2];}
        System.out.println("Сум лев " + sumlev);
        System.out.println("Сум прав " + sumprav);
    }
}
