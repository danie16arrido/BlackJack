import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import org.junit.*;

public class GameTest {
  Game game;
  Player player;

  @Before
  public void before(){
    game = new Game();
    player = new Player("Daniel");
  }

  @Test
  public void canCreateGame(){
    assertEquals(true, game instanceof Game);
  }

  @Test
  public void canHavePlayers(){
    assertEquals(true, game.getPlayersList() instanceof ArrayList);
  }

  @Test
  public void gameStartsWithNoPlayers(){
    assertEquals(0, game.numberOfPlayers());
  }

  @Test
  public void canAddPlayers(){
    game.addPlayer(player);
    assertEquals(1, game.numberOfPlayers());
  }

  @Test
  public void canAddDeck(){
    assertEquals(true, game.getDeck() instanceof Deck);
  }

}
