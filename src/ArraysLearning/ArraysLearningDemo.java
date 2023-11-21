package ArraysLearning;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class ArraysLearningDemo {
    public static void main(String[] args) {
        int[] arr = {5, 3, 10, 92, 18};
        System.out.println("Before Sorting: " + Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println("After Sorting: " + Arrays.toString(arr));
//        Arrays.toString(Arrays.stream(arr).sorted().toArray());

        String[] names = {"John", "Doe", "Kim", "Eric", "Mathew"};
        Arrays.sort(names);
        System.out.println("After Sorting: " + Arrays.toString(names));

        Comparator comp = new ComparatorDemo();
        Arrays.sort(names, comp);
        System.out.println("After Sorting by Comparator: " + Arrays.toString(names));
    }
}
