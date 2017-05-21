package blackjack;
import interfaces.*;
public class Card implements ICard {

  private final int rank;
  private final int suite;
  private final String name;

  private static final String[] suitString = {
		"clubs", "diamonds", "hearts", "spades"
	};

  private static final char[] suitSymbol = {
    '\u2663', '\u2666', '\u2764', '\u2660'
  };

  private static final String[] rankStrings = {
		"cero","ace","two","three","four","five",
		"six","seven","eight","nine","ten",
		"jack","queen","king"
	};

  public Card(int rank, int suite){
    this.rank = rank;
    this.suite = suite;
    this.name = getStringName();
  }

  public int getRank() {
    return this.rank;
  }

  public int getSuite() {
    return this.suite;
  }

  public String getStringName(){
    String myname = rankStrings[this.rank] + " of " + suitString[this.suite];
    return myname;
  }

  public String getName(){
    return this.name;
  }


}
