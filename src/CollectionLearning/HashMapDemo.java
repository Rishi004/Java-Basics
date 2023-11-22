package CollectionLearning;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put("John", 100);
        hm.put("Doe", 101);
        hm.put("Eric", 102);

        System.out.println(hm.containsValue(100));

//        System.out.println(hm);

        Set s = hm.keySet();
//        System.out.println("Keys: " + s);

        Collection v = hm.values();
//        System.out.println("Values: " + v);

        Set s2 = hm.entrySet();
//        System.out.println("Entries: " + s2);

        Iterator i = s2.iterator();
        while (i.hasNext()) {
            Map.Entry me = (Map.Entry) i.next();
//            System.out.println(me.getKey() + "-" + me.getValue());
            if (me.getKey().equals("John")) me.setValue(200);
            System.out.println(me);
        }

        System.out.println();
    }
}
