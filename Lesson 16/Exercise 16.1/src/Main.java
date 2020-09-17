import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(0);
        list.add(1);
        list.add(7);

        for (Integer i : list) {
            System.out.print(i + " ");
        }
    }
}