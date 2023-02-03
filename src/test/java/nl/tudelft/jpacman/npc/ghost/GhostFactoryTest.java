package nl.tudelft.jpacman.npc.ghost;

import nl.tudelft.jpacman.npc.Ghost;
import nl.tudelft.jpacman.sprite.PacManSprites;
import org.junit.jupiter.api.Test;
/**
 * A very simple test class that test GhostFactory and creates all four ghosts.
 *
 * @author Sam Lee
 */
public class GhostFactoryTest {
    private static final PacManSprites SPRITE_STORE = new PacManSprites();
    private GhostFactory GF = new GhostFactory(SPRITE_STORE);

    @Test
    void creatingGhost() {
        GF.createBlinky();
        GF.createPinky();
        GF.createInky();
        GF.createClyde();
    }
}