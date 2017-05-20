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

  // @Test
  // public void canAddCardToDeck(){
  //   deck.addCard(card);
  //   assertEquals(1, deck.numberOfCards());
  // }

  @Test
  public void canPopulateDeck(){
    assertEquals(52, deck.numberOfCards());
  }

  @Test
  public void canGetNextCard(){
    ICard second = deck.getCard(1);
    //get first card on deck
    deck.next();
    assertEquals(second, deck.next());
  }

  @Test
  public void canCheckDeckHasNoCardsLeft(){
    while (deck.hasNext()){
        System.out.println(((Card) deck.next()).getName());
    }
    assertEquals(52, deck.getMyIndex());
  }

}
