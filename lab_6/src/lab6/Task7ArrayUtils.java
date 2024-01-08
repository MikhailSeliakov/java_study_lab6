package lab6;

import java.util.Arrays;

public class Task7ArrayUtils {
    public static int[] getCharCodes(char[] chars) {
        int[] charCodes = new int[chars.length];

        for (int i = 0; i < chars.length; i++) {
            charCodes[i] = (int) chars[i];
        }

        return charCodes;
    }

    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'c'};
        int[] charCodes = Task7ArrayUtils.getCharCodes(chars);

        System.out.println("Original array: " + new String(chars)); // Вывод: Original array: abc
        System.out.println("Character codes: " + Arrays.toString(charCodes)); // Вывод: Character codes: [97, 98, 99]
    }
}
