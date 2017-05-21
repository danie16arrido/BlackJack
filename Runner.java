import blackjack.*;
import interfaces.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Runner {

  public static void main(String[] args){
    gameon();
  }

  private static void gameon(){
    initGame();
  }

  private static void initGame(){
    Scanner user_input = new Scanner(System.in);
    int selection = 0;
    int selectionSubMenu = 0;
    String playerName;
    clearScreen();
    System.out.println("Welcome to <BlackJack>");
    System.out.print("Enter your name:  ");
    playerName = user_input.next();
    Game game = new Game();
    Player player = new Player(playerName);
    Deck deck = new Deck();
    deck.populateDeck();

    game.start(player, deck);



    clearScreen();

    do {
      player.getHand().clear();
      Player dealer = game.getPlayersList().get(0);
      dealer.getHand().clear();

      System.out.println("bideal");
      game.initialDeal();

      boolean isUserActive = true;

      System.out.println("<BlackJack> " + playerName + " is playing now.");
      System.out.println("Choose an Option: ");
      System.out.println("[1] Play");
      System.out.println("[2] Quit Game");
      selection = user_input.nextInt();

      switch (selection){
        case 1:

          clearScreen();
          do {
            System.out.println(game.getDeck().getMyIndex());
            showHand(player);
            System.out.println("\tTotal: " + game.handPlayerSum(player) + "\tWins: [" + player.getWins() + "]");
            showHand(dealer);
            System.out.println("\tTotal: " + game.handPlayerSum(dealer) + "\tWins: [" + dealer.getWins() + "]");
            System.out.println(dealer.getWins());

            if (game.checkBlackJack(dealer)){
              System.out.println("Dealer Wins");
              dealer.addWin();

              break;
            }
            if (game.checkBlackJack(player)){
              System.out.println("Player Wins");
              player.addWin();
              break;
            }
            if (game.checkBusted(player)){
              System.out.println("Player busted!!");
              dealer.addWin();
              break;
            }
            if(game.checkBusted(dealer)){
              System.out.println("Player Wins");
              player.addWin();
              break;
            }
            if (!isUserActive){
              int difference = game.handPlayerSum(player) - game.handPlayerSum(dealer);
              if (difference > 0){
                System.out.println("Player Wins");
                player.addWin();
                break;
              }else if (difference == 0){
                System.out.println("It is a draw");
                break;
              }else if (difference < 0 ){
                System.out.println("Dealer wins!");
                dealer.addWin();
                break;
              }
            }

            System.out.print("What do you do now?\n");
            System.out.println("[1] Hit");
            System.out.println("[2] Stand");
            System.out.println("[3] Quit");

            selectionSubMenu = user_input.nextInt();

            switch (selectionSubMenu) {
              case 1:
                System.out.println("new card for your.");
                dealCardTo(player, deck);
                clearScreen();
                break;
              case 2:
                System.out.println("Let's see the dealer's hand.");
                while (game.handPlayerSum(dealer) <= 16){
                  dealCardTo(dealer, deck);
                }
                isUserActive = false;
                clearScreen();
                break;
              case 3:
                clearScreen();
                  System.out.println("Sudden exit!!");
                break;
              default:
                System.out.println("Selection is invalid, try again.");
            }
          }while (selectionSubMenu != 3);
          break;

        case 2:
          System.out.println("Bye Thanks for playing....");
          break;
        default:
          clearScreen();
          System.out.println("Wrong choice");
      }
    }while (selection != 2);
  }

  private static void showHand(Player player){
    PrintHand playerMessage = new PrintHandPlayer(player);
    playerMessage.now();
  }

  private static void dealCardTo(Player player, Deck deck){
    player.getHand().addIcard(deck.next());
  }

  private static void clearScreen(){
      System.out.print(String.format("\033[2J"));
  }

}
