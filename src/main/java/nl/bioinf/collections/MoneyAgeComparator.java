package nl.bioinf.collections;

import java.util.Comparator;

public class MoneyAgeComparator implements Comparator<SortingDemo.Person> {
    @Override
    public int compare(SortingDemo.Person o1, SortingDemo.Person o2) {
        int first = Long.compare(o1.money(), o2.money());
        if (first == 0) {
            //delegate to String
            return o1.name().compareTo(o2.name());
        }
        return first;
    }
}
