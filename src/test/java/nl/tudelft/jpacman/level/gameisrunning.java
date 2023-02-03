package nl.tudelft.jpacman.level;

import nl.tudelft.jpacman.Launcher;
import nl.tudelft.jpacman.game.Game;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
/**
 *A test that will check to see if the game is running
 * @author Sam Lee
 */
public class gameisrunning {

    private Launcher launcher = new Launcher();
    private Game getGame(){
        return launcher.getGame();
    }
    @Test
    void Running() {
        launcher.launch();
        getGame().start();
        assertThat(getGame().isInProgress()).isEqualTo(true);
    }
    }
