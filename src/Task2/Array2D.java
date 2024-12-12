package Task2;

import java.util.Arrays;

public class Array2D {
    private int[][] array;
    private final int size;

    public Array2D(int size) {
        this.size = size;
        createArray();
    }

    private void createArray() {
        array = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = (int) (Math.random() * 100);
            }
        }
    }

    public void printArray() {
        Arrays.stream(array)
                .map(Arrays::toString)
                .forEach(System.out::println);
    }

    public int sumDiagonal() {
        int sum = 0;

        for (int i = 0; i < size; i++) {
            sum += array[i][i];
            sum += array[i][size - 1 - i];
        }

        if (size % 2 != 0) {
            sum -= array[size / 2][size / 2];
        }

        return sum;
    }
}
