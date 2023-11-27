package StreamLearning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamListDemo {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        lst.add(10);
        lst.add(20);
        lst.add(30);
        lst.add(40);
        lst.add(40);
        lst.add(40);
        lst.add(35);

        System.out.println("For Each Ordered: ");
        lst.stream().forEachOrdered(System.out::println);

        System.out.println("Limit: " +
                lst
                        .stream()
                        .limit(2)
                        .collect(Collectors.toList())
        );

        System.out.println("Skip: " +
                lst
                        .stream()
                        .skip(2)
                        .collect(Collectors.toList())
        );


        System.out.println("Reverse the insertion order: " +
                lst
                        .stream()
                        .distinct()
                        .sorted((num1, num2) -> -1)
                        .collect(Collectors.toList()));

        System.out.println("Insertion order: " +
                lst
                        .stream()
                        .distinct()
                        .sorted((num1, num2) -> 0)
                        .collect(Collectors.toList()));

        System.out.println("Ascending: " +
                lst
                        .stream()
                        .distinct()
                        .sorted()
                        .collect(Collectors.toList()));

        System.out.println("Descending: " +
                lst
                        .stream()
                        .distinct()
                        .sorted((num1, num2) -> num2.compareTo(num1))
                        .collect(Collectors.toList()));

        System.out.println("Reduce: " +
                lst
                        .stream()
                        .reduce((num1, num2) -> num1 + num2)
                        .get()
        );
    }
}
