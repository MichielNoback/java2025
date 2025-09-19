package nl.bioinf.rpg;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WorldBuilderFromConfig {

    /**
     * Creates and fills a world given items and characters listed in a file
     * @param configFile Input file describing the world contents
     * @return World object
     */
    public static World createWorldFromConfig(String configFile) {
        World world = new World();

        // TODO: perform checks before reading the file
        try(BufferedReader reader = new BufferedReader(new FileReader(configFile))) {
            String line;
            String header = reader.readLine(); // Skip header line
            while ((line = reader.readLine()) != null) {
                String elements[] = line.split("\t");
                String type =  elements[0];
                String className = elements[1];
                String name = elements[2];
                String description = elements[3];
                boolean usable = Boolean.parseBoolean(elements[4]);
                boolean equippable = Boolean.parseBoolean(elements[5]);
                double value =  Double.parseDouble(elements[8]);
                int damage = Integer.parseInt(elements[9]);

                switch (type) {
                    case "Character":
                        // Note: only using name field...
                        if (className.equals("Player"))
                            world.addPlayer(new Player(name));
                        else if (className.equals("NPC"))
                            world.addCharacter(new NPC(name));
                        break;
                    case "Item":
                        if (className.equals("Sword"))
                            world.addItem(new Sword(name, damage));
                        else if (className.equals("Apple"))
                            world.addItem(new Apple());
                }
            }
        } catch (IOException e) {
            // TODO: replace generic exception with specific exceptions and clear user messages
            System.out.println("IO exception: " + e.getMessage());
        }

        return world;
    }
}
