package Task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            doCalculate();
        } catch (InputMismatchException e) {
            System.out.println("Введите число!");
            doCalculate();
        }
    }

    private static void doCalculate() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Введите число:");
            int n = sc.nextInt();

            Array2D array = new Array2D(n);
            array.printArray();

            System.out.println();

            System.out.printf("Сумма элементов массива = %d", array.sumDiagonal());
        }
    }
}

