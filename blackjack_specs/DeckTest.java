import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import org.junit.*;
import interfaces.*;
import blackjack.*;

public class DeckTest {
  Deck deck;
  Card card;

  @Before
  public void before(){
    deck = new Deck();
    card = new Card(1,2);
  }

  @Test
  public void canCreateDeck() {
    assertEquals(true, deck instanceof Deck);
  }

  @Test
  public void canAddICard(){
    deck.addIcard(card);
    assertEquals(1, deck.numberOfCards());
  }

  @Test
  public void canRemoveICard(){
    deck.populateDeck();
    ICard second = deck.getCard(1);
    deck.removeIcard(second);
    assertEquals(51, deck.numberOfCards());
  }

  @Test
  public void canPopulateDeck(){
    deck.populateDeck();
    assertEquals(52, deck.numberOfCards());
  }

  @Test
  public void canGetNextCard(){
    deck.populateDeck();
    ICard second = deck.getCard(1);
    //get first card on deck
    deck.next();
    assertEquals(second, deck.next());
  }

  @Test
  public void canCheckDeckHasNoCardsLeft(){
    deck.populateDeck();
    while (deck.hasNext()){
        System.out.println(((Card) deck.next()).getName());
    }
    assertEquals(52, deck.getMyIndex());
  }
  @Test
  public void canClearDeck(){
    deck.clear();
    assertEquals(0, deck.numberOfCards());
  }


}
