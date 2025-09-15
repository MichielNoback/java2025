package nl.bioinf.methods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathStuffTest {

    @Test
    void powerUp() {
        MathStuff math = new MathStuff();
        System.out.println(math.powerUp(2, 4));
        System.out.println(math.powerUp(2));

    }
}