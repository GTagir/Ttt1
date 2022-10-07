package lesson10_1;



import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] s = new Integer[]{1, 2, 3, 4};
        System.out.println(Arrays.toString(s));
        swap(s, 0, 3);
        System.out.println(Arrays.toString(s));

        Box<Apple> appleBox = new Box<>(
                new Apple(),
                new Apple(),
                new Apple(),
                new Apple(),
                new Apple(),
                new Apple()
        );

        Box<GoldenApple> goldenAppleBox = new Box<>(
                new GoldenApple(),
                new GoldenApple(),
                new GoldenApple(),
                new GoldenApple(),
                new GoldenApple()
        );

        Box<Orange> orangeBox = new Box<>(
                new Orange(),
                new Orange(),
                new Orange(),
                new Orange()
        );
        System.out.println("Вес простых Яблок " + appleBox.getWeight());
        System.out.println("Вес золотых яблок " + goldenAppleBox.getWeight());
        System.out.println("Вес апельсинов " + orangeBox.getWeight());
        System.out.println("Сравнение яблок и апельсинов " + appleBox.compare(orangeBox));

//        appleBox.moveTo(orangeBox);
goldenAppleBox.moveTo(appleBox);
    }

    private static void swap(Integer[] s, int firstIndex, int secondIndex) {
        Integer temp = s[firstIndex];
        s[firstIndex] = s[secondIndex];
        s[secondIndex] = temp;
    }
}