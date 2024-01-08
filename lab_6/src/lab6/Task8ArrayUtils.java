package lab6;

import java.util.Arrays;

public class Task8ArrayUtils {
    public static double calculateAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / array.length;
    }

    public static void main(String[] args) {
        int[] array = {5, 10, 15, 20, 25};
        double average = Task8ArrayUtils.calculateAverage(array);

        System.out.println("Array: " + Arrays.toString(array)); // Вывод: Array: [5, 10, 15, 20, 25]
        System.out.println("Average: " + average); // Вывод: Average: 15.0
    }
}
