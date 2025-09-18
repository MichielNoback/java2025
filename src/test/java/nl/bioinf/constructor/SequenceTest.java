package nl.bioinf.constructor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SequenceTest {
    @Test
    void testConstruction(){
        Sequence seq1 = new Sequence("gacttacgacactagcagcacgt");
        System.out.println("seq1 = " + seq1);

        System.out.println("seq1.sequence = " + seq1.getSequence());
        String seqChanged = seq1.getSequence() ;
        seqChanged = "HAHA";
        System.out.println("seqChanged = " + seqChanged);
        System.out.println("seq1.sequence = " + seq1.getSequence());
    }

    @Test
    void testInvalidConstructor() {
        Sequence seq2 = new Sequence("gacttacgacactagcagcacgt");

    }
}