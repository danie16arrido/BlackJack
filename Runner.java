import blackjack.*;

public class Runner {

  public static void main(String[] args){
    gameon();
  }

  private static void gameon(){
    initGame();
  }

  private static void initGame(){
    Game game = new Game();
    Player player = new Player("Daniel");
    game.addPlayer(player);

    System.out.println(game.getDeck().numberOfCards());
    System.out.println(((Card) game.getDeck().next()).getName());
    System.out.println(game.getDeck().getMyIndex());
    System.out.println(game.getPlayersList());
  }



}
