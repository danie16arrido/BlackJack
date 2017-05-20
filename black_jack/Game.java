import java.util.ArrayList;
public class Game {

  private ArrayList<Player> players;
  private Deck deck;

  public Game(){
    this.players = new ArrayList<>();
    this.deck = new Deck();
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

}
