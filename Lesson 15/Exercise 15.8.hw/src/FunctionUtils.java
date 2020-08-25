import java.util.function.*;

public class FunctionUtils {

    public static Supplier<Integer> getInfiniteRange() {
        Supplier<Integer> supplier = new Supplier<Integer>() {
            private int i;//1

            @Override
            public Integer get() {
                return i++;
            }
        };
        return supplier;
    }

    public static void main(String[] args) {
        Supplier<Integer> sup1 = getInfiniteRange();
        Supplier<Integer> sup2 = getInfiniteRange();
        for(int i = 0; i < 5; i++) {
            System.out.print(sup1.get() + " " + sup2.get() + " ");
        }
    }
}