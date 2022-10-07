package lesson14;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
//-----------------------------Первое задание---------------------
        int searchedNumber = 4;
        int[] arr = {1, 2, 4, 4, 2, 3, 1, 4, 1, 7};
//        int[] arr = {1, 2, 4, 4, 2, 3, 1, 1, 7};
//        int[] arr = {1, 6, 5, 4, 6, 5, 4, 6, 8, 6};
//        int[] arr = {};

        int[] result = resultArray(arr, searchedNumber);
        System.out.println(Arrays.toString(result));

//-------------------------------Второе задание---------------------
        int[] array = {1, 1, 1, 1, 4};
        int value1 = 1;
        int value2 = 4;

        System.out.println("Array: " + Arrays.toString(array));
        boolean result1 = checkArray(array, value1, value2);
        System.out.println("Array: " + result1);
    }
//-------------------------------------------------------------------------
    public static int[] resultArray(int[] sourceArray, int searchedNumber) {

        int index = IntStream.range(0, sourceArray.length)
                .map(i -> sourceArray.length - 1 - i)
                .filter(i -> sourceArray[i] == searchedNumber)
                .findFirst().orElseThrow(() -> new RuntimeException());

        int[] result = new int[sourceArray.length - index - 1];
        System.arraycopy(sourceArray, index + 1, result, 0, sourceArray.length - index - 1);
        return result;
    }


    public static boolean checkArray(int[] array, int first, int second) {
        boolean containsFirst = false;
        boolean containsSecond = false;
        for (int element : array) {
            if (element == first) {
                containsFirst = true;
            } else if (element == second) {
                containsSecond = true;
            }
        }
        return containsFirst && containsSecond;
    }
}
