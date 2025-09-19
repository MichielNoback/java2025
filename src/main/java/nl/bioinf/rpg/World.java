package nl.bioinf.rpg;

import java.util.ArrayList;
import java.util.List;

public class World {
    private List<Item> items = new ArrayList<>();
    private List<Character> characters = new ArrayList<>();
    private Player player;

    public void addItem(Item item) {
        items.add(item);
    }

    public void addCharacter(Character character) {
        characters.add(character);
    }

    public void addPlayer(Player player) {
        this.player = player;
    }

    public List<Item> getItems() {
        return items;
    }

    public List<Character> getCharacters() {
        return characters;
    }

    public Player getPlayer() {
        return player;
    }
}
