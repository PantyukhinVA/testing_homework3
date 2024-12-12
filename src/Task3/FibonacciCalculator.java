package Task3;

public class FibonacciCalculator {
    public Integer calculate(int number) {
        if (number < 1) {
            throw new IllegalArgumentException("Число не может быть меньше 1");
        }
        if (number == 1 || number == 2) {
            return 1;
        }
        return calculate(number - 1) + calculate(number - 2);
    }
}