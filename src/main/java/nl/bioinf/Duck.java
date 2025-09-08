package nl.bioinf;

public class Duck {
    private static int duckCount = 0;
    private boolean isMale = false;

    public Duck(boolean isMale) {
        Duck.duckCount += 1;
        this.isMale = isMale;
    }

    public static int getDuckCount() {
        return duckCount;
    }

    void swim() {
        //String sexString = isMale ? "male" : "female";
        String sexString = "female";
        if (isMale) {
            sexString = "male";
        }

        System.out.println("I am a " + sexString + " Duck and swimming in the pond.");
    }

    @Override
    public String toString() {
        return "Duck{" +
                "isMale=" + isMale +
                '}';
    }
}
