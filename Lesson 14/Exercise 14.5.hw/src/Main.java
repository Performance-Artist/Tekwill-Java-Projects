public class Main {
    public static void main(String[] args) {
        Runnable runnable = Create.createRunnable("Hello!", 5);
        runnable.run();
    }
}