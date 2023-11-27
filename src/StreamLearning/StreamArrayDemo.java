package StreamLearning;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamArrayDemo {
    public static void main(String[] args) {
        int arr[] = {10, 4, 7, 3, 3};
//        System.out.println(arr.length);

//        IntStream s = Arrays.stream(arr);
        System.out.println("Length Count: " + Arrays.stream(arr).count());

//        s = s.sorted();
//        s.forEach(no -> System.out.println(no));
        System.out.println("Loop: ");
        Arrays
                .stream(arr)
                .sorted()
                .forEach(System.out::println);

        System.out.println("Average: " + Arrays.stream(arr).average());
        System.out.println("Average: " + Arrays.stream(arr).average().getAsDouble());
        System.out.println("Max: " + Arrays.stream(arr).max().getAsInt());
        System.out.println("Min: " + Arrays.stream(arr).min().getAsInt());
        System.out.println("Find First: " + Arrays.stream(arr).findFirst().getAsInt());
        System.out.println("Find Any: " + Arrays.stream(arr).findAny().getAsInt());

        System.out.println("Unique Values: ");
        Arrays.stream(arr).distinct().forEach(System.out::println);

        System.out.println("Even num: ");
        Arrays.stream(arr).filter(num -> num % 2 == 0).forEach(System.out::println);


    }
}
