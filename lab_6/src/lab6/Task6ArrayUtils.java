package lab6;

import java.util.Arrays;

public class Task6ArrayUtils {
    public static int[] subArray(int[] array, int count) {
        if (count <= 0) {
            throw new IllegalArgumentException("Count must be positive");
        }

        if (count > array.length) {
            return Arrays.copyOf(array, array.length);
        }

        return Arrays.copyOf(array, count);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int count = 3;
        int[] result = Task6ArrayUtils.subArray(array, count);

        System.out.println("Original array: " + Arrays.toString(array)); // Вывод: Original array: [1, 2, 3, 4, 5]
        System.out.println("SubArray of " + count + " elements: " + Arrays.toString(result)); // Вывод: Subarray of 3 elements: [1, 2, 3]
    }
}
