import java.util.Scanner;

public class Game{
  protected double pool;

  public Game(HumanPlayer human, Player player, Dealer dealer, Deck deck, boolean cheatMode){
    Scanner input = new Scanner(System.in);
    boolean gameEnded = false;

    System.out.println("Your money: " + human.getMoney());
    while(!gameEnded){
      if (player instanceof InstantWinPlayer){
        System.out.println("You lost because xXxNoobSlayerxXx is a master hacker.");
        break;
      }



      if (cheatMode == true){
        System.out.println(deck);
      }

      System.out.println("How much do you bet?");

      double money = input.nextDouble();
      human.bet(money);
      System.out.println("You now have " + human.getMoney());

      if(deck.getLastCard() <= 10){
        deck = new Deck();
        deck.shuffle();
      }

      dealer.takeAcard(deck.drawAcard());
      dealer.takeAcard(deck.drawAcard());

      human.takeAcard(deck.drawAcard());
      dealer.takeAcard(deck.drawAcard());

      player.takeAcard(deck.drawAcard());
      player.takeAcard(deck.drawAcard());






    }

    System.out.println("Do you wish to play again? [y/N]");

    String answer = input.nextLine();
    if(answer.length() > 0 && answer.toLowerCase().charAt(0) == 'y'){
      new Game(human, player, dealer, deck, cheatMode);
    }
    else{
      System.out.println("Goodbye!");
    }

  }
}
