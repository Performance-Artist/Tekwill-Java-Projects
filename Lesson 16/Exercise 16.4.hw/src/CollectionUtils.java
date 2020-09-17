import java.util.ArrayList;
import java.util.Collection;

public class CollectionUtils {

    public static Collection<Integer> pow2(Collection<Integer> numbers) {
        Collection<Integer> result = new ArrayList<>();
        numbers.forEach(el -> result.add(el * el));
        return result;
    }
}