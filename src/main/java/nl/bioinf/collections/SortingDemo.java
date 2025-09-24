package nl.bioinf.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingDemo {

    public static record Person(String name, int age, long money)
            implements Comparable<Person> {

        @Override
        public int compareTo(Person o) {
            //DELEGATE
            return Integer.compare(o.age, this.age);

//            final int BEFORE = -1;
//            final int AFTER = 1;
//            final int EQUAL = 0;
//            if (this.age < o.age) return BEFORE;
//            else if (this.age > o.age) return AFTER;
//            else return EQUAL;
        }
    }
    public static void main(String[] args) {
        testObjectSorting();
    }

    private static void testObjectSorting() {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Henk", 42, 1000));
        persons.add(new Person("Kees", 24, 100000));
        persons.add(new Person("Sarah", 31, 1000000));
        persons.add(new Person("Roos", 52, 100));
        System.out.println("persons = " + persons);
        //uses natural ordering
        Collections.sort(persons);
        System.out.println("persons = " + persons);

        // do name sorting
        Collections.sort(persons, (o1, o2) -> o1.name.compareTo(o2.name));
//        Collections.sort(persons, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.name.compareTo(o2.name);
//            }
//        });
        System.out.println("persons = " + persons);
        Collections.sort(persons, new MoneyAgeComparator());
        System.out.println("persons = " + persons);

    }

    void testLetterSorting() {
        List<Character> letters = new ArrayList<>();
        letters.add('a');
        letters.add('A');
        letters.add('g');
        letters.add('C');
        letters.add('c');
        letters.add('D');
        System.out.println("letters = " + letters);
        Collections.sort(letters);
        System.out.println("letters = " + letters);
    }
}
