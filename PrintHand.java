import blackjack.*;
import interfaces.*;
import java.util.ArrayList;

public abstract class PrintHand {
  private Player player;
  private Hand hand;
  private String message;
  private String divider;

  public PrintHand(Player player){
    this.player = player;
    this.hand = player.getHand();
    this.message = player.getName() + " these are your cards: ";
    this.divider = "=====================";
  }

  public void now(){
    System.out.println(this.message);
    System.out.println(this.divider);
    ArrayList<ICard> cards = hand.getCards();
    for (ICard icard: cards){
      Card card = (Card) icard;
      System.out.print( " // " + card.getName());
    }
    System.out.println();
    System.out.print(this.divider + this.divider);
  }
}
