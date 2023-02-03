package nl.tudelft.jpacman.level;

import nl.tudelft.jpacman.board.Board;
import nl.tudelft.jpacman.board.Direction;
import nl.tudelft.jpacman.board.Square;
import nl.tudelft.jpacman.npc.Ghost;
import nl.tudelft.jpacman.npc.ghost.GhostColor;
import nl.tudelft.jpacman.npc.ghost.GhostFactory;
import nl.tudelft.jpacman.points.PointCalculator;
import nl.tudelft.jpacman.sprite.PacManSprites;
import nl.tudelft.jpacman.sprite.Sprite;
import nl.tudelft.jpacman.points.DefaultPointCalculator;
import java.util.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import com.google.common.collect.Lists;
import org.junit.jupiter.api.Test;
/**
 * test class to see if the LevelFactory class can create a level
 *
 * @author Sam Lee
 */

public class LevelFactorytest {

    private Level lv = new Level(mock(Board.class), Lists.newArrayList(mock(Ghost.class)), Lists.newArrayList(mock(Square.class), mock(Square.class)), mock(CollisionMap.class));
    
    @Test
    void LVFTest() {
        lv.start();
    }
}
