package randomizer;

import java.util.*;
import java.util.stream.*;

public class RandomNumbers {

    public List<Long> random(int maxSize) {
        long a = System.currentTimeMillis();
        int c = 11;
        long m = (long) Math.pow(2, 48);

        return Stream.iterate(1, x -> x + 1)
                .limit(maxSize)
                .map(integer -> integer * (a * integer + c) % m)
                .toList();
    }
}
