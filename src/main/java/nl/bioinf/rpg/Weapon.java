package nl.bioinf.rpg;

/**
 * A Weapon is a type of Item that can be used to deal damage to enemies.
 */
public class Weapon extends Item{
    protected int damage;
    protected int durability;

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
