public class Main {

    public static void main(String[] args) {
        Counter count = new Counter(10);
        System.out.println(count.getCurrent());
        count.inc();
        count.inc();
        count.inc();
        count.inc();
        count.inc();
        System.out.println(count.getCurrent());
    }
}
