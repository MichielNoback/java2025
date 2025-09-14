package nl.bioinf.rpg;

/**
 * An Item that provides a temporary boost to a character's attributes.
 */
public class Buff extends Item {

    public Buff(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }

    @Override
    Item pickUpItem() {
        return null;
    }

    @Override
    void dropItem() {
    }

    @Override
    void useItem() {
    }
}
