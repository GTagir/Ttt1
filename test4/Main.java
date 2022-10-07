package test4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cat chernish = new Cat("Черныш");
        Dog reks = new Dog("Рекс");

//        chernish.beg();
//        chernish.sikr();
//        reks.beg();
//        reks.sikr();
        InterfTest[] arr = new InterfTest[]{chernish, reks};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr);
        }
    }
}
