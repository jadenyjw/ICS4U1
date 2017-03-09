import java.util.Scanner;
import players.*;
public class Game{
  protected double pool;
  
  public Game(HumanPlayer human, Player player, Dealer dealer, Deck deck){

    boolean gameEnded = false;

    System.out.println("Your money: " + human.getMoney());
    while(!gameEnded){
      if (player instanceof InstantWinPlayer){
        System.out.println("You lost because xXxNoobSlayerxXx is a master hacker.");
        break;
      }

      human.setMoney(human.getMoney() + 100);

      System.out.println(deck);
      break;

    }
    Scanner input = new Scanner(System.in);
    System.out.println("Do you wish to play again? [y/N]");

    String answer = input.nextLine();
    if(answer.length() > 0 && answer.toLowerCase().charAt(0) == 'y'){
      new Game(human, player, dealer, deck);
    }
    else{
      System.out.println("Goodbye!");
    }

  }
}
