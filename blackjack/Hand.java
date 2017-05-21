package blackjack;
import java.util.ArrayList;
import java.util.Collections;
import interfaces.*;
public class Hand {

  private ArrayList<ICard> cardsInHand;

  public Hand(){
    this.cardsInHand = new ArrayList<ICard>();
  }

  public int numberOfCards(){
    return this.cardsInHand.size();
  }

  public void addIcard(ICard card){
    this.cardsInHand.add(card);
  }

  public void removeIcard(ICard card){
    this.cardsInHand.remove(card);
  }

  public ArrayList<ICard> getCards(){
    return this.cardsInHand;
  }

  public void clear(){
    this.cardsInHand.clear();
  }

}
