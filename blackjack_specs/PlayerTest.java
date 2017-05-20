import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import org.junit.*;
import blackjack.*;

public class PlayerTest {
  Player player;

  @Before
  public void before(){
    player = new Player("Daniel");
  }

  @Test
  public void canCreatePlayer(){
    assertEquals(true, player instanceof Player);
  }

  @Test
  public void canGetName(){
    assertEquals("Daniel", player.getName());
  }

  @Test
  public void canGetHand(){

    assertEquals(true , player.getHand() instanceof Hand);
  }
}
