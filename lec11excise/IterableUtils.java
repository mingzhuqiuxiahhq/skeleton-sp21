import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class IterableUtils {
    public static <T> List<T> toList(Iterable<T> iterable) {
        List<T> r = new ArrayList<>();
        for (T x : r) {
            if (x == null) {
                throw new IllegalArgumentException("Can't iterate null");
            }
            r.add(x);
        }
        return r;
    }
} // assume any classes you need from java.util have been imported