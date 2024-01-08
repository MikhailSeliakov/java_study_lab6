package lab6;

public class Task4MathUtils {
    public static int doubleFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }

        int result = 1;
        if (n % 2 == 0) {
            for (int i = n; i >= 2; i -= 2) {
                result *= i;
            }
        } else {
            for (int i = n; i >= 1; i -= 2) {
                result *= i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int number1 = 6;
        int doubleFactorial1 = Task4MathUtils.doubleFactorial(number1);
        System.out.println(number1 + "!! = " + doubleFactorial1); // Вывод: 6!! = 48

        int number2 = 5;
        int doubleFactorial2 = Task4MathUtils.doubleFactorial(number2);
        System.out.println(number2 + "!! = " + doubleFactorial2); // Вывод: 5!! = 15
    }
}
