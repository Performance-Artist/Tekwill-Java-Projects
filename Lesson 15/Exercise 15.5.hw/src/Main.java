public class Main {

    public static void main(String[] args) {
        String boris1 = PrefixSuffixOperator.operator.apply("Boris");
        String boris2 = PrefixSuffixOperator.operator.apply("Boris ");
        String boris3 = PrefixSuffixOperator.operator.apply(" Boris  ");
        String boris4 = PrefixSuffixOperator.operator.apply(" Boris the Blade");
        
        System.out.println(boris1);
        System.out.println(boris2);
        System.out.println(boris3);
        System.out.println(boris4);
    }
}
