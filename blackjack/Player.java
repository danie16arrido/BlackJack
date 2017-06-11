package blackjack;

public class Player {

  private String name;
  private Hand hand;
  private int handsWon;

  public Player(String name){
    this.name = name;
    this.hand = new Hand();//breaks the "Dependency inversion principal"
    //a higher object must set the hand and the hand may be different
    //depending on the game being played.
    this.handsWon = 0;
  }

  public String getName(){
    return this.name;
  }

  public Hand getHand(){
    return this.hand;
  }
  public int getWins(){
    return this.handsWon;
  }

  public void addWin(){
    this.handsWon += 1;
  }

}
