package CursorsLearning;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Spliterator;

public class CursorsDemo {
    public static void main(String[] args) {
        ArrayList names = new ArrayList();
        names.add("Shikamaru");
        names.add("Jiraiya");
        names.add("Kakashi");
        names.add("Lee");
        names.add("Hinata");
        names.add("Sakura");

        System.out.println(names);
        // Iterator
        // uni-directional
        Iterator i = names.iterator();
        while (i.hasNext()) {
            if (i.next().equals("Sakura")) i.remove();
        }
        System.out.println(names);

        // ListIterator
        // bi-directional
        ListIterator li = names.listIterator();
        while (li.hasNext()) {
            if (li.next().equals("Lee")) li.set("Rock Lee");
        }
        System.out.println(names);

        // Spliterator
        // parallel processing
        // Java 8
        Spliterator s = names.spliterator();
        s.forEachRemaining(System.out::println);

    }
}
