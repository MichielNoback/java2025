import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class OperatorsTest {
    @Test
    void testPostPreIncrement(){
        int i = 10;
        int j = 20;

        int x = ++i + j--;
//        System.out.println("x = " + x);
//        System.out.println("j = " + j);
//        System.out.println("i = " + i);
//
//        for (byte k = 0; k < 5; k--) {
//            System.out.println("k = " + k);
//        }

        byte q = 0;
        int z = 0;
        while(z < 300) {
            z ++;
            q ++;
            System.out.println("q = " + q);
        }
    }


    @Test
    void testTernaryOperator(){
        String gender = "Male";
        String startOfSentence = "Dear";

//        startOfSentence = gender.equalsIgnoreCase("Male")
//                ? startOfSentence + " mr"
//                : startOfSentence + " mrs";
//        System.out.println("startOfSentence = " + startOfSentence);

        if (gender.equalsIgnoreCase("Male")) {
            startOfSentence += " Mr";
        } else {
            startOfSentence += "Mrs";
        }
        System.out.println("startOfSentence = " + startOfSentence);
    }

    @Test
    void testForloop() {
        int i = 0;
        for (i = -1; i < 0; i++) {
            System.out.println(" Hello ");
        }
        
        List<String> animals = List.of("Chihuahua", "bull terrier", "jack russell");
        for (String animal : animals) {
            System.out.println("animal = " + animal);
        }
    }
}
