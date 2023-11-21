package CollectionLearning;

import java.util.Comparator;

public class ComparatorDemo implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Laptop l1 = (Laptop) o1;
        Laptop l2 = (Laptop) o2;

        if (l1.price > l2.price) return -1;
        else if (l1.price < l2.price) return +1;
        return 0;
    }

    /*
    * When compare using string
    * (imagine laptop has a model attribute too)
    *
    * @Override
    * public int compare(Object o1, Object o2) {
    *   Laptop l1 = (Laptop) o1;
    *   Laptop l2 = (Laptop) o2;
    *
    *   int result = l1.model.compareTo(l2.model)
    *   if (result > 0) return +1;
    *   else if (result < 0) return -1;
    *   else return 0;
    * }
    * */
}
