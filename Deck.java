import java.util.ArrayList;
import java.util.Collections;

public class Deck {

  private ArrayList<ICard> cardList;
  private int index;

  public Deck(){
    this.cardList = new ArrayList<ICard>();
    populateDeck();
    shuffle();
  }

  public void addCard(ICard card){
    this.cardList.add(card);
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

  public boolean hasNext(){
    return index < this.cardList.size();
  }

  public ICard getCard(int a_index){
    return this.cardList.get(a_index);
  }

  public int getMyIndex(){
    return this.index;
  }


}
