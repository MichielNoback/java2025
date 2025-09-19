package nl.bioinf.rpg;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RpgTest {

    @Test
    void testRpgGameLogic() {
        Player player = new Player("Hero");
        // Assert that one player has be created (calling static method)
        assertEquals(1, Player.getPlayerCount());
        System.out.println(player);
        Sword sword = new Sword("Desolation Glass Deflector", 24);
        Apple apple = new Apple();

        // Make sure only one sword of each type can be created
        assertThrows(IllegalStateException.class, () -> {
            Sword anotherSword = new Sword("Desolation Glass Deflector", 24);
        });

        player.pickUpItem(apple);
        player.useItem(apple);
        player.pickUpItem(sword);
        player.equipItem(sword);
        player.useItem(sword);

        assertEquals(2, player.getInventorySize());
    }

    @Test
    void testRPGWorldBuildingFromConfigFile() {
        // Sample configuration file
        String fileName = "gameworld.tsv";
        // Get the path to the file in the src/test/resources folder (standard location)
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource(fileName).getFile());
        String absolutePath = file.getAbsolutePath();

        // Create world
        World world = WorldBuilderFromConfig.createWorldFromConfig(absolutePath);
        assertEquals(2, world.getCharacters().size());
        assertEquals(2, world.getItems().size());
        System.out.println(world.getPlayer());
    }
}
