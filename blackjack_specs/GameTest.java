import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import org.junit.*;
import blackjack.*;

public class GameTest {
  Game game;
  Player player;
  Player dealer;
  Deck deck;
  Card card1;
  Card card2;
  Card card3;
  Hand playerHand;


  @Before
  public void before(){
    game = new Game();
    player = new Player("Daniel");
    dealer = new Player("Dealer");
    deck = new Deck();
    card1 = new Card(1,1);
    card2 = new Card(11,2);
    card3 = new Card(5,3);
    playerHand = player.getHand();


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
    game.addDeck(deck);
    assertEquals(true, game.getDeck() instanceof Deck);
  }

  @Test
  public void canInitializeGame(){
    deck.populateDeck();
    game.start(player, deck);
    assertEquals(2, player.getHand().numberOfCards());
  }

  @Test

  public void canSumPlayerhandAceValueOne(){
    playerHand.addIcard(card1);
    playerHand.addIcard(card2);
    playerHand.addIcard(card3);
    assertEquals(16, game.handPlayerSum(player));
  }

  @Test
  public void canSumPlayerHandAceValueEleven(){
    playerHand.addIcard(card1);
    playerHand.addIcard(card3);
    assertEquals(16, game.handPlayerSum(player));
  }

  @Test
  public void checkHasBlackJack(){
    playerHand.addIcard(new Card(1,1));
    playerHand.addIcard(new Card(12,3));
    assertEquals(true, game.checkBlackJack(player));
  }

  @Test
  public void checkBusted(){
    playerHand.addIcard(new Card(1,1));
    playerHand.addIcard(new Card(12,3));
    playerHand.addIcard(new Card(12,2));
    playerHand.addIcard(new Card(2,3));
    assertEquals(true, game.checkBusted(player));
  }

}
