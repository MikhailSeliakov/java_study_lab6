package lab6;

public class Task2Counter {
    private static int count = 0;

    public static void displayAndIncrement() {
        System.out.println("Current count: " + count);
        count++;
    }

    public static void main(String[] args) {
        Task2Counter.displayAndIncrement();
        Task2Counter.displayAndIncrement();
        Task2Counter.displayAndIncrement();
    }
}
