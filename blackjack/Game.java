package blackjack;
import java.util.ArrayList;
import interfaces.*;

public class Game {

  private ArrayList<Player> players;
  private Deck deck;
  private Player dealer;

  public Game(){
    this.players = new ArrayList<>();
    this.dealer = new Player("DealerBot");
  }

  public ArrayList<Player> getPlayersList(){
    return this.players;
  }

  public int numberOfPlayers(){
    return this.players.size();
  }

  public void addPlayer(Player player){
    players.add(player);
  }

  public Deck getDeck(){
    return this.deck;
  }

  public void addDeck(Deck deck){
    this.deck = deck;
  }

  public void start(Player player, Deck deck){
    addDeck(deck);
    addPlayer(this.dealer);
    addPlayer(player);
    initialDeal();
  }

  public void initialDeal(){
    for (Player player : players){
      Hand pHand = player.getHand();
      for (int i=0; i < 2; i++){
        pHand.addIcard(this.deck.next());
      }
    }
  }

  


}
