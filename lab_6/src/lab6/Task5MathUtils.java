package lab6;

public class Task5MathUtils {
    public static int sumOfSquares(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Number must be positive");
        }

        return (n * (n + 1) * (2 * n + 1)) / 6;
    }

    public static void main(String[] args) {
        int number = 5;
        int sum = Task5MathUtils.sumOfSquares(number);
        System.out.println("Sum of squares from 1 to " + number + " = " + sum); // Вывод: Sum of squares from 1 to 5 = 55
    }
}
