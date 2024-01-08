package lab6;

public class Task3NumberUtils {
    public static int findMaximum(int... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("No numbers provided");
        }

        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static int findMinimum(int... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("No numbers provided");
        }

        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    public static double findAverage(int... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("No numbers provided");
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.length;
    }

    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 7};

        int max = Task3NumberUtils.findMaximum(array);
        System.out.println("Maximum: " + max); // Вывод: Maximum: 9

        int min = Task3NumberUtils.findMinimum(array);
        System.out.println("Minimum: " + min); // Вывод: Minimum: 1

        double avg = Task3NumberUtils.findAverage(array);
        System.out.println("Average: " + avg); // Вывод: Average: 4.8
    }
}
