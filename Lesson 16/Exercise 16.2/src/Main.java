import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Collection<String> phones = Arrays.asList(scanner.nextLine().split("\\s+"));
        Collection<String> blockList = Arrays.asList(scanner.nextLine().split("\\s+"));
        Collection<String> nonBlockedPhones = CollectionUtils.filterPhones(
                new ArrayList<>(phones), new ArrayList<>(blockList));
        System.out.println(nonBlockedPhones.stream()
                .map(Object::toString)
                .collect(Collectors.joining(" ")));

    }
}