import java.util.ArrayList;
import java.util.Collection;

class CollectionUtils {
    public static Collection<String> filterPhones(Collection<String> phones, Collection<String> blacklist) {
        ArrayList<String> result = new ArrayList<>();
        for (String phone : phones) {
            if(!blacklist.contains(phone)) {
                result.add(phone);
            }
        }
        return result;
//    phones.removeAll(blacklist);
//    return phones;
    }
}