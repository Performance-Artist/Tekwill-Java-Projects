import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] ints = sc.nextLine().split(" ");
        int n = sc.nextInt();

        List<Integer> intArray = new ArrayList<>();
        for (String intS : ints) {
            intArray.add(Integer.valueOf(intS));
        }

        int diff = Integer.MAX_VALUE;

        List<Integer> result = new ArrayList<>();

        for (Integer nr : intArray) {
            int tempDiff = Math.abs(nr - n);

            if (tempDiff == diff) {
                result.add(nr);
            }
            else if (tempDiff < diff) {
                diff = tempDiff;
                result.clear();
                result.add(nr);
            }
        }

        Collections.sort(result);

        for (Integer nr : result) {
            System.out.print(nr + " ");
        }
    }
}