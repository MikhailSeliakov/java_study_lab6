package lab6;

import java.util.Arrays;

public class Task10ArrayMinMaxUtils {
    public static int[] findMinMax(int... numbers) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        return new int[]{max, min};
    }

    public static void main(String[] args) {
        int[] array = {5, 10, -2, 8, 3};
        int[] result = Task10ArrayMinMaxUtils.findMinMax(array);

        System.out.println("Numbers: " + Arrays.toString(array)); // Вывод: Numbers: [5, 10, -2, 8, 3]
        System.out.println("Min: " + result[1]); // Вывод: Min: -2
        System.out.println("Max: " + result[0]); // Вывод: Max: 10
    }
}
