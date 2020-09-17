import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConcatPositiveNumbersProblem {

    public static ArrayList<Integer> concatPositiveNumbers(List<Integer> l1, List<Integer> l2) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int integer : l1) {
            if(integer >= 0) {
                result.add(integer);
            }
        }
        for (int integer : l2) {
            if(integer >= 0) {
                result.add(integer);
            }
        }
        return result;
    }

    /* Do not modify this method */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list1 = readArrayList(scanner);
        ArrayList<Integer> list2 = readArrayList(scanner);
        ArrayList<Integer> result = concatPositiveNumbers(list1, list2);
        result.forEach(n -> System.out.print(n + " "));
    }

    /* Do not modify this method */
    private static ArrayList<Integer> readArrayList(Scanner scanner) {
        String[] split = scanner.nextLine().split("\\s+");

        ArrayList<Integer> integers = new ArrayList<>(split.length);

        for (String s : split) {
            integers.add(Integer.parseInt(s));
        }

        return integers;
    }
}