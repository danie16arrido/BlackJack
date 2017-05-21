import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import org.junit.*;
import blackjack.*;

public class HandTest {
  Hand hand;
  Card card;

  @Before
  public void before(){
    hand = new Hand();
    card = new Card(1,2);
  }

  @Test
  public void canCreateHand(){
    assertEquals(true, hand instanceof Hand);
  }

  @Test
  public void handStartsWithoutCards(){
    assertEquals(0, hand.numberOfCards());
  }

  @Test
  public void canAddICardToHand(){
    hand.addIcard(card);
    assertEquals(1, hand.numberOfCards());
  }

  @Test
  public void canRemoveICardToHand(){
    hand.addIcard(card);
    assertEquals(1, hand.numberOfCards());
    hand.removeIcard(card);
    assertEquals(0, hand.numberOfCards());
  }

  @Test
  public void canGetArrayList(){
    assertEquals(true, hand.getCards() instanceof ArrayList);
  }

  @Test
  public void canClearHand(){
    hand.addIcard(card);
    hand.addIcard(card);
    assertEquals(2, hand.numberOfCards());
    hand.clear();
    assertEquals(0, hand.numberOfCards());
  }

}
