import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import org.junit.*;

public class CardTest {
  Card card;

  @Before
  public void before(){
    card = new Card(1, 2);
  }

  @Test
  public void canCreateCard(){
    assertEquals(true, card instanceof Card);
  }

  @Test
  public void canGetRank(){
    assertEquals(1, card.getRank());
  }

  @Test
  public void canGetSuite(){
    assertEquals(2, card.getSuite());
  }

  @Test
  public void canGetName(){
    String card_name = "ace of hearts";
    assertEquals(card_name, card.getName());
  }
}
