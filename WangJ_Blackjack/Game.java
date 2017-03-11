import java.util.Scanner;

public class Game{

  protected double pool;
  protected int[] playedCards;

  public Game(HumanPlayer human, Player player, Dealer dealer, Deck deck, boolean cheatMode){

    Scanner input = new Scanner(System.in);
    boolean gameEnded = false;

    System.out.println("Your money: " + human.getMoney());

    while(!gameEnded){

      //If you're facing the instawinplayer.
      if (player instanceof InstantWinPlayer){
        System.out.println("You lost because xXxNoobSlayerxXx is a master hacker.");
        break;
      }
      //Prints the deck if deck viewing is on.
      if (cheatMode == true){
        System.out.println(deck);
      }
      //Creates a new deck if required.
      if(deck.getLastCard() <= 10){
        deck = new Deck();
        deck.shuffle();
      }

      dealer.takeAcard(deck.drawAcard());
      dealer.takeAcard(deck.drawAcard());

      human.takeAcard(deck.drawAcard());
      human.takeAcard(deck.drawAcard());

      player.takeAcard(deck.drawAcard());
      player.takeAcard(deck.drawAcard());

      player.showCards();
      dealer.showCards();
      human.showCards();
      
      while(true){
        double money = 0;
        try{
            System.out.println("How much do you bet?");
            money = input.nextDouble();
            if (human.bet(money)){
              System.out.println("You now have " + human.getMoney() + " dollars.");
              break;
            }
            else{
              System.out.println("Not enough money.");
            }
          }
          catch(Exception e){
            System.out.println("Please enter a valid numerical bet.");
            input.nextLine();
          }
      }



    }
    System.out.println("Do you wish to play again? [y/N]");

    String answer = input.nextLine();
    if(answer.length() > 0 && answer.toLowerCase().charAt(0) == 'y'){
      new Game(human, player, dealer, deck, cheatMode);
    }
    else{
      System.out.println("You had " + human.getMoney() + " dollars.");
      System.out.println(player.getName() + " had " + player.getMoney() + " dollars.");
      System.out.println("Goodbye!");
    }

  }
}
