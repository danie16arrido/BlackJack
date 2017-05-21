package blackjack;
import java.util.ArrayList;
import java.util.Collections;
import interfaces.*;

public class Deck implements CardCollectionable{

  private ArrayList<ICard> cardList;
  private int index = 0;

  public Deck(){
    this.cardList = new ArrayList<ICard>();
  }

  public void addIcard(ICard card){
    this.cardList.add(card);
  }

  public void removeIcard(ICard card){
    this.cardList.remove(card);
  }

  public int numberOfCards(){
    return this.cardList.size();
  }

  public void populateDeck(){
    for(int suit = ICard.CLUBS; suit <= ICard.SPADES; suit++){
			for (int rank = 1; rank <= 13; rank++){
				this.cardList.add(new Card(rank, suit));
      }
		}
    shuffle();
  }

  private void shuffle(){
    Collections.shuffle(this.cardList);
    index = 0;
  }

  public ICard next() {
		ICard card = (ICard) cardList.get(index);
		index++;
		return card;
	}
  public ICard deal(){
    return next();
  }

  public boolean hasNext(){
    return index < this.cardList.size();
  }

  public ICard getCard(int a_index){
    return this.cardList.get(a_index);
  }

  public int getMyIndex(){
    return this.index;
  }

  public void clear(){
    this.cardList.clear();
  }


}
