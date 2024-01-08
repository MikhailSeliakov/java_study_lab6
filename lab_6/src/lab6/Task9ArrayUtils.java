package lab6;

import java.util.Arrays;

public class Task9ArrayUtils {
    public static void swapElements(char[] array) {
        int length = array.length;
        for (int i = 0; i < length / 2; i++) {
            char temp = array[i];
            array[i] = array[length - i - 1];
            array[length - i - 1] = temp;
        }
    }

    public static void main(String[] args) {
        char[] array = {'H', 'e', 'l', 'l', 'o'};
        System.out.println("Before swapping: " + Arrays.toString(array)); // Вывод: Before swapping: [H, e, l, l, o]

        Task9ArrayUtils.swapElements(array);
        System.out.println("After swapping: " + Arrays.toString(array)); // Вывод: After swapping: [o, l, l, e, H]
    }
}
