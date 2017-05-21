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
    // initialDeal();
  }

  public void initialDeal(){
    for (Player player : players){
      Hand pHand = player.getHand();
      for (int i=0; i < 2; i++){
        pHand.addIcard(this.deck.next());
      }
    }
  }

  public int handPlayerSum(Player player){
    ArrayList<ICard> pHand = player.getHand().getCards();
    int sum = 0;
    int cardRank;
    int aces = 0;
    for (ICard card: pHand){
      cardRank = card.getRank();
      if (cardRank == 1){ //Ace card
        aces++;
        sum += 11;
      } else if (cardRank > 10){ //face card
        sum += 10;
      } else {
        sum += cardRank;
      }
    }
    while (sum > 21 && aces > 0){
      sum -= 10;
      aces--;
    }
    return sum;
  }

  private int checkBlackJackState(Player player){
    int playerHandSum = handPlayerSum(player);
    if( playerHandSum == 21){
      return 1;
    }
    else if (playerHandSum > 21) {
      return -1;
    }
    else {
      return 0;
    }
  }

  public boolean checkBlackJack(Player player){
    return (checkBlackJackState(player) == 1) ? true: false;
  }

  public boolean checkBusted(Player player){
    return (checkBlackJackState(player) == -1) ? true: false;
  }

}
