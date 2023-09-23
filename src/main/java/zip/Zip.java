package zip;

import java.util.*;
import java.util.stream.*;

public class Zip {

    public static <T> Stream<T> zip(Stream<T> firstStream, Stream<T> secondStream) {
        List<T> result = new ArrayList<>();
        Iterator<T> firstIterator = firstStream.iterator();
        Iterator<T> secondIterator = secondStream.iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            result.add(firstIterator.next());
            result.add(secondIterator.next());
        }
       return result.stream();
    }
}
