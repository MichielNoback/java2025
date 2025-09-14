package nl.bioinf.rpg;

import java.util.ArrayList;
import java.util.List;

/**
 * Player character
 */
public class Player extends Character{
    // Inventory management
    private List<Item> inventory = new ArrayList<>();
    private static final int MAX_INVENTORY_SIZE = 10;
    private static int playerCount = 0;

    // Basic constructor with default values
    public Player(String name) {
        this(name, 100, 10);
    }

    // Constructor overloading with all attributes
    public Player(String name, int health, int strength) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        playerCount++;
    }

    // Constructor overloading with VARARGS for inventory
    public Player(String name, int health, int strength, Item... inventory) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.inventory = List.of(inventory);
        playerCount++;
    }

    public void pickUpItem(Item item) {
        if (inventory.size() < MAX_INVENTORY_SIZE) {
            inventory.add(item);
            System.out.println(name + " picked up an item (" + item.getClass().getSimpleName() + ").");
        } else {
            System.out.println(name + "'s inventory is full!");
        }
    }

    public void equipItem(Item item) {
    }

    public void useItem(Item item) {
        item.useItem();
    }

    public int getInventorySize() {
        return inventory.size();
    }

    public static int getPlayerCount() {
        return playerCount;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", strength=" + strength +
                ", inventory=" + inventory +
                '}';
    }
}
