public class Counter {
    private long current;

    public Counter (int current) {
        this.current = current;
    }

    public long getCurrent () {
        return current;
    }
    public void inc () {
        current++;
    }
}
