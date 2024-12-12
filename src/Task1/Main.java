package Task1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int[] array = IntStream.range(0, 10)
                .map(i -> (int) (Math.random() * 10))
                .toArray();

        System.out.println("Массив: ");
        printArray(array);

        int countIter = Sort.sort(array);
        System.out.println("Отсортированный массив: ");
        printArray(array);

        System.out.println("Количество итераций: " + countIter);
    }

    private static void printArray(int[] array) {
        Arrays.stream(array).forEach(x -> System.out.print(x + " "));
    }
}
