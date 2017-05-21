package interfaces;
import blackjack.*;
import java.util.ArrayList;

public interface CardCollectionable {

  public void addIcard(ICard card);
  public void removeIcard(ICard card);
  public int numberOfCards();
  public void clear();

  // public ArrayList getAllCards();

}
