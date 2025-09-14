package nl.bioinf.rpg;

public class Apple extends Buff {
    private final int healthRestore;

    public Apple(int healthRestore, int weight, int value) {
        super(weight, value);
        this.healthRestore = healthRestore;
        this.isEquippable = false;
        this.isUsable = true;
    }

    public Apple(int weight, int value) {
        this(10, weight, value);
    }

    public Apple() {
        this(10, 1, 1);
    }

    @Override
    void useItem() {
        System.out.println("You eat the apple and restore " + healthRestore + " health.");
    }

}
