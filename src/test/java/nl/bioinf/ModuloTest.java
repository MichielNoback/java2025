package nl.bioinf;
import org.junit.jupiter.api.Test;

public class ModuloTest {
    @Test
    void testModulo() {
        int grams = 1235;
        int poundGrams = 454;

        //int i = Math.floorDiv(grams, poundGrams);
        int i = (int)(grams / poundGrams);
        System.out.println("i = " + i);
        int remainder = grams % poundGrams;
        System.out.println("remainder = " + remainder);

    }
}
