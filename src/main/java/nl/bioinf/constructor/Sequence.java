package nl.bioinf.constructor;

import java.util.Objects;

public class Sequence {
    //WELKE PROPERTIES HEEFT MIJN CLASS?
    private String sequence;
    private SequenceType type;
    private String name;
    private String id;
    //length?

    public Sequence(String sequence) {
        this(sequence, null);
    }

    public Sequence(String sequence, SequenceType type) {
        this(sequence, type, "UNKNOWN");
    }

    public Sequence(String sequence, SequenceType type, String name) {
        this(sequence, type, name, "UNKNOWN");
    }

    public Sequence(String sequence, SequenceType type, String name, String id) {
        if (sequence == null || sequence.length() == 0) {
            throw new IllegalArgumentException("sequence cannot be null or empty");
        }

        if (type == null) {
            this.type = determineSequenceType();
        }
        //Objects.requireNonNull(type);

        this.sequence = sequence;
        this.name = name;
        this.id = id;
    }

    public static SequenceType determineSequenceType() {
        return SequenceType.DNA;
    }


    public String getSequence() {
        return sequence;
    }

    public SequenceType getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Sequence{" +
                "sequence='" + sequence + '\'' +
                ", type=" + type +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
