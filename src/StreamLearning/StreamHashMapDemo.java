package StreamLearning;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamHashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("John", 100);
        map.put("Doe", 200);
        map.put("Eric", 400);
        map.put("Mathew", 300);

        System.out.println("Keys: " +
                map
                        .keySet()
                        .stream()
                        .collect(Collectors.toList())
        );

        System.out.println("Values: " +
                map
                        .values()
                        .stream()
                        .collect(Collectors.toList())
        );

        System.out.println("Sorted Keys: " +
                map
                        .keySet()
                        .stream()
                        .sorted()
                        .collect(Collectors.toList())
        );

        System.out.println("Sorted By Keys: " +
                map
                        .entrySet()
                        .stream()
                        .sorted(Map.Entry.comparingByKey())
                        .collect(Collectors.toList())
        );

        System.out.println("Sorted By Values: " +
                map
                        .entrySet()
                        .stream()
                        .sorted(Map.Entry.comparingByValue())
                        .collect(Collectors.toList())
        );

        System.out.println("Ends with: " +
                map
                        .keySet()
                        .stream()
                        .anyMatch(key -> key.endsWith("n"))
        );
    }
}
