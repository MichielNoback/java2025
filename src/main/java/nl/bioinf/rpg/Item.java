package nl.bioinf.rpg;

public abstract class Item {
    int weight;
    int value;
    boolean isUsable;
    boolean isEquippable;

    abstract Item pickUpItem();
    abstract void dropItem();
    abstract void useItem();
}
