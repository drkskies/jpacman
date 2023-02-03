package nl.tudelft.jpacman.level;

import static org.assertj.core.api.Assertions.assertThat;
import nl.tudelft.jpacman.sprite.PacManSprites;
import nl.tudelft.jpacman.level.PlayerFactory;
import nl.tudelft.jpacman.level.Player;
import org.junit.jupiter.api.Test;

/**
 * A very simple (and not particularly useful)
 * test class to have a starting point where to put tests.
 *
 * @author Sam Lee
 */
public class PlayerTest {

    private static final PacManSprites SPRITE_STORE = new PacManSprites();
    private PlayerFactory Factory = new PlayerFactory(SPRITE_STORE);
    private Player ThePlayer = Factory.createPacMan();
    @Test
    void testAlive() {
        assertThat(ThePlayer.isAlive()).isEqualTo(true);
    }
}
