package nl.bioinf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuckTest {

    @Test
    void testDuckCreation(){
        Duck duck1 = new Duck(true);
//        duck1.duckCount = 1;
//        duck1.isMale = true;
        System.out.println(duck1);
        duck1.swim();
//        System.out.println("in testDuckCreation() " + Duck.duckCount);
    }

    @Test
    void testDuckCount(){
        System.out.println(Duck.getDuckCount());
    }
//    @Test
//    void testInstanceChange() {
//        Duck.duckCount += 1;
//        System.out.println ("in testInstanceChange()" +Duck.duckCount);
//    }
}