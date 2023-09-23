package concat_steam;

import java.util.*;
import java.util.stream.*;

public class ConcatStream {

    Stream<Integer> firstMass = Stream.of(1, 2, 0);
    Stream<Integer> secondMass = Stream.of(4, 5);

    public List<Integer> concat() {
        Stream<Integer> concat = Stream.concat(firstMass, secondMass);
        return concat.sorted(Comparator.naturalOrder()).toList();
    }
}
