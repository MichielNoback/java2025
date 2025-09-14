package nl.bioinf;

import nl.bioinf.rpg.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
}
