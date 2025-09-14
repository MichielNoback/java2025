package nl.bioinf.rpg;

public class Sword extends Weapon {
    private final String name;
    private static boolean exists;

    public Sword(String name, int damage) {
        if (exists) {
            throw new IllegalStateException("Only one instance of " + name + " is allowed.");
        }

        this.name = name;
        this.damage = damage;
        exists = true;
        this.isEquippable = true;
    }

    @Override
    void useItem() {
        System.out.println("You swing the sword " + name + " and deal " + this.damage + " damage.");
    }
}
