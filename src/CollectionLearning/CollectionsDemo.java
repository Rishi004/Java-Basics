package CollectionLearning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {

        Laptop dell = new Laptop(200000, 8, true);
        Laptop lenovo = new Laptop(150000, 5, true);
        Laptop hp = new Laptop(180000, 6, false);

        ArrayList laptopList = new ArrayList();
        laptopList.add(dell);
        laptopList.add(lenovo);
        laptopList.add(hp);

        System.out.println(dell.hashCode());
        System.out.println(dell.getClass().getName() + '@' + Integer.toHexString(dell.hashCode()));

        Comparator comp = new ComparatorDemo();
        Collections.sort(laptopList, comp);
        System.out.println("After Sort by Comparator: " + laptopList);
        System.out.println("Laptop: " + Collections.binarySearch(laptopList, lenovo, comp));

        Collections.reverse(laptopList);
        System.out.println("After Reversed: " + laptopList);

        ArrayList al = new ArrayList();
        al.add("s");
        al.add("f");
        al.add("v");
        al.add("a");
        System.out.println("Before Sort: " + al);

        Collections.sort(al);
        System.out.println("After Sort: " + al);

        System.out.println("Index: " + Collections.binarySearch(al, "v"));
        System.out.println("Insertion Point: " + Collections.binarySearch(al, "b"));


        String name1 = "Shikamaru";
        String name2 = "Lee";
        String name3 = "Orochimaru";

        System.out.println(name1.compareTo(name2));


    }
}
