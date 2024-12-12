package Task3;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.stream.Stream;

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

            FibonacciCalculator f = new FibonacciCalculator();

            Stream
                    .iterate(1, x -> x + 1)
                    .limit(n)
                    .forEach(x -> System.out.print(f.calculate(x) + " "));

        }
    }
}



