package nl.bioinf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {

    @Test
    void calculateDistance_sunny() {
        double speed = 10;
        double time = 5;
        double expected = 50;
        assertEquals(expected, Utils.calculateDistance(speed, time));

        speed = 30;
        time = 0.1;
        expected = 3;
        assertEquals(expected, Utils.calculateDistance(speed, time));

        //boundary
        speed = 0;
        time = 0;
        expected = 0;
        assertEquals(expected, Utils.calculateDistance(speed, time));


    }
    @Test
    void calculateDistance_negativeInput() {
        double speed = -1;
        double time = 5;
        //assertEquals(-5, Utils.calculateDistance(speed, time));
        assertThrows(IllegalArgumentException.class,
                () -> Utils.calculateDistance(speed, time));

        //assertEquals(-5, Utils.calculateDistance(speed, time));
        assertThrows(IllegalArgumentException.class,
                () -> Utils.calculateDistance(1, -5));
    }


}