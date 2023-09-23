package concat_steam;

import java.util.*;
import java.util.regex.*;
import java.util.stream.*;

public class ConcatStream {

    Stream<Integer> firstMass = Stream.of(1, 2, 0);
    Stream<Integer> secondMass = Stream.of(4, 5);

    public List<Integer> concat() {
        Stream<Integer> concat = Stream.concat(firstMass, secondMass);
        return concat.sorted(Comparator.naturalOrder()).toList();
    }

    public List<String> concatGiven(String[] mass) {
        String string = "";

        for (final String s : mass) {
            string += s;
        }
        String group = "";
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            group += matcher.group();
        }

        String[] massString = group.split("");
        List<String> result = new ArrayList<>(Arrays.asList(massString));

        return result.stream().sorted().toList();
    }
}
