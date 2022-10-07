package lesson10;

import lesson10.Apple;
import lesson10.Box;
import lesson10.GoldenApple;
import lesson10.Orange;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] s = new Integer[]{1, 2, 3, 4};
        System.out.println(Arrays.toString(s));
        swap(s, 0, 3);
        System.out.println(Arrays.toString(s));

        lesson10.Apple[] apples = new lesson10.Apple[]{
                new lesson10.Apple(),
                new lesson10.Apple(),
                new lesson10.Apple(),
                new lesson10.Apple(),
                new lesson10.Apple()
        };

        lesson10.Orange[] oranges = new lesson10.Orange[]{
                new lesson10.Orange(),
                new lesson10.Orange(),
                new lesson10.Orange(),
                new Orange()
        };

        lesson10.GoldenApple[] goldenApples = new lesson10.GoldenApple[]{
                new lesson10.GoldenApple(),
                new lesson10.GoldenApple(),
                new GoldenApple()
        };

//        System.out.println(Apple.getWeight());

        int test = 0;
        for (Apple appleBox : apples) {
//            System.out.println(Arrays.toString(apples));

            test += 1;

        }
        System.out.println("Количество яблок в ящике " + test);
        System.out.println(apples.length);
    }

    private static void swap(Integer[] s, int firstIndex, int secondIndex) {
        Integer temp = s[firstIndex];
        s[firstIndex] = s[secondIndex];
        s[secondIndex] = temp;
    }
}