import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.System.*;

public class main {
    List<String> list = Arrays.asList("apple", "banana", "orange");
    Set<Integer> set = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
    Map<Integer, String> map = new HashMap<>();
map.put(1, "one");
map.put(2, "two");
map.put(3, "three");

    String str = "swiss";
    Optional<Character> firstNonRepeated = str.chars()
            .mapToObj(c -> (char) c)
            .filter(ch -> str.indexOf(ch) == str.lastIndexOf(ch))
            .findFirst();
firstNonRepeated.ifPresent(System.out::println);
// Optional is a container object used to represent the presence or absence of an object
    String str = "swiss";
    Optional<Character> firstRepeated = str.chars()
            .mapToObj(c -> (char) c)
            .filter(ch -> str.indexOf(ch) != str.lastIndexOf(ch))
            .findFirst();
firstRepeated.ifPresent(System.out::println);

    List<Integer> numbers = Arrays.asList(5, 3, 2, 8, 1);
    List<Integer> sortedNumbers = numbers.stream()
            .sorted()
            .collect(Collectors.toList());
System.out.println(sortedNumbers);

    Stream<String> stream1 = Stream.of("a", "b", "c");
    Stream<String> stream2 = Stream.of("d", "e", "f");
    Stream<String> concatenatedStream = Stream.concat(stream1, stream2);
concatenatedStream.forEach(System.out::println);

    List<String> list = Arrays.asList("apple", "banana", "orange", "apple");
    Map<String, Long> map = list.stream()
            .collect(Collectors.groupingBy(Function.identity(), TreeMap::new, Collectors.counting()));
System.out.println(map);

    List<String> list = Arrays.asList("apple", "banana", "orange", "apple");
    Map<String, Long> map = list.stream()
            .collect(Collectors.groupingBy(Function.identity(), TreeMap::new, Collectors.counting()));
System.out.println(map);

    List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
    Map<String, Long> wordCount = words.stream()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
System.out.println(wordCount);

    List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
    Map<String, Long> duplicates = words.stream()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
            .entrySet().stream()
            .filter(entry -> entry.getValue() > 1)
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
System.out.println(duplicates);

    int[] numbers = {5, 3, 9, 1, 6};
    int max = Arrays.stream(numbers).max().getAsInt();
System.out.println("Maximum element: " + max);

    String str = "banana";
    Map<Character, Long> charCount = str.chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
System.out.println(charCount);


}
