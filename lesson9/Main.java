package lesson9;

public class Main {

    public static void main(String[] args) {
        String[][] array = new String[][]{
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };

        String[][] array1 = new String[][]{
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };

        String[][] array2 = new String[][]{
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3"},
                {"1", "2", "3", "4"}
        };

        String[][][] arr = new String[][][]{array, array1, array2};



        int result = 0;
        try {
            result = sum(array);
        } catch (MyArraySizeException | MyArrayDataException e) {
            throw new RuntimeException(e.getMessage(), e);
        }

        System.out.println(result);

    }

    public static int sum(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException("Некорректный размер массива");
        }

        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                String element = array[i][j];
                if (element.matches("\\d+")) {
                    sum += Integer.parseInt(element);
                } else {
                    throw new MyArrayDataException("Некорректные данные в ячейке [" + i + ", " + j + "]: " + element);
                }
            }
        }
        return sum;
    }
}