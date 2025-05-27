import java.util.*;

public class StreamEvenNumbers {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Charlie", "Alice", "Eve", "Bob");

        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));

        System.out.println("Sorted names: " + names);
    }
}
