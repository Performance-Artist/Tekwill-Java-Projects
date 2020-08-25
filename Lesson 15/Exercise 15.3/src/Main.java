import java.util.function.LongUnaryOperator;

public class Main {
    public static LongUnaryOperator unaryOperator = l -> l % 2 == 0 ? l + 2 :  l + 1;

    public static void main(String[] args) {
        System.out.println(unaryOperator.applyAsLong(1));
        System.out.println(unaryOperator.applyAsLong(2));
        System.out.println(unaryOperator.applyAsLong(3));
        System.out.println(unaryOperator.applyAsLong(10000000000000001L));
        System.out.println(unaryOperator.applyAsLong(10000000000000000L));
    }
}
