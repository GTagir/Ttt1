package lesson12;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
//    static final int SIZE = 10000000;
    static final int SIZE = 10;
    static final int HALF = SIZE / 2;

    public static void main(String[] args) {
        metod1();
        metod2();
    }

    private static void metod1() {
        long a = System.currentTimeMillis();
        System.out.println("Начинает работать 1-ый метод");
        float[] arr = new float[SIZE];

        IntStream.range(0, arr.length).forEach(i1 -> arr[i1] = 1f);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = getaFloat(arr, i);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        long b = System.currentTimeMillis();
        System.out.println("Время выполнения 1-го метода = " + (b - a));
    }

    private static void metod2() {
        long a = System.currentTimeMillis();
        System.out.println("Начинает работать 2-ый метод");

        float[] arr = new float[SIZE];

        IntStream.range(0, arr.length).forEach(i -> arr[i] = 1f);

        float[] a1 = new float[HALF];
        float[] a2 = new float[HALF];
     System.arraycopy(arr, 0, a1, 0, HALF);
     System.arraycopy(arr, HALF, a2, 0, HALF);

        Runnable task1 = () -> {
            for (int i = 0; i < a1.length; i++) {
                a1[i] = getaFloat(a1, i);
                System.out.print(a1[i] + " ");
            }
            System.out.println();
            System.arraycopy(a1, 0, arr, 0, HALF);
        };
        Thread thread = new Thread(task1);
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Runnable task2 = () -> {
        for (int i = 0; i < a2.length; i++) {
            a2[i] = getaFloat(a2, i);
            System.out.print(a2[i] + " ");
        }
        System.out.println();
            System.arraycopy(a2, 0, arr, HALF, HALF);
        };
        Thread thread2 = new Thread(task2);
        thread2.start();
        try {
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(Arrays.toString(arr));

        long b = System.currentTimeMillis();
        System.out.println("Время выполнения 2-го метода = " + (b - a));
    }

    private static float getaFloat(float[] arr, int i) {
        return (float) (arr[i] * Math.sin(0.2f + (i / 5f)) * Math.cos(0.2f + (i / 5f)) * Math.cos(0.4f + (i / 2f)));
    }
}
