package nl.bioinf.collections;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class ContainsTester {
    public static void main(String[] args) {
        long iterations = 1000000;
        long size = 100000000;

        //Prepare data
        List<Integer> numbers = new LinkedList<>();
        for (int i=0; i<size; i++) {
            numbers.add(i);
        }
        Collections.shuffle(numbers);
        Set<Integer> numbersSet = new HashSet<>();
        numbersSet.addAll(numbers);

        // Timing the contains method
        long start = System.nanoTime();
        for (int j = 0; j < iterations; j++) {
            //get a random number
            long query = (long)(Math.random() * size);
            numbersSet.contains(query);
        }

        long end = System.nanoTime();
        System.out.printf("That took: %d ms.%n", TimeUnit.NANOSECONDS.toMillis(end - start));

    }
}
