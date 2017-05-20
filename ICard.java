public interface ICard {

  public static final int CLUBS = 0;
	public static final int DIAMONDS= 1;
	public static final int HEARTS = 2;
	public static final int SPADES = 3;

  public int getRank();
  public int getSuite();
}
