package StreamLearning;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapDemo {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        lst.add(10);
        lst.add(20);
        lst.add(30);
        System.out.println(lst.stream().map(num -> num / 5).collect(Collectors.toList()));

        List<String> strLst = new ArrayList<>();
        strLst.add("John");
        strLst.add("Doe");
        strLst.add("Mathew");
        System.out.println(strLst.stream().map(str -> str + " BSc(Hons)").collect(Collectors.toList()));
        System.out.println(strLst.stream().map(str -> str.toUpperCase()).collect(Collectors.toList()));
    }
}
