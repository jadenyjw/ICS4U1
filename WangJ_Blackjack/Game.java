import java.util.Scanner;

public class Game{

  public Game(HumanPlayer human, Player player, Dealer dealer, Deck deck, boolean cheatMode){

    Scanner input = new Scanner(System.in);

    System.out.println("Your money: " + human.getMoney() + "\n");
    System.out.println(player.getName()+ "'s money: " + player.getMoney() + "\n");

    if (cheatMode){
      System.out.println(deck);
    }

    //Get players to draw cards.

    dealer.takeAcard(deck.drawAcard());
    dealer.takeAcard(deck.drawAcard());

    human.takeAcard(deck.drawAcard());
    human.takeAcard(deck.drawAcard());

    player.takeAcard(deck.drawAcard());
    player.takeAcard(deck.drawAcard());

    System.out.println(player.getName() + " has the cards: " + player.showCards() + ".");
    System.out.println("This is a value of " + player.getHandValue() + ".\n");

    //Show the cards players have, except only one for dealer.

    System.out.println("You have the cards: " + human.showCards() + ".");
    System.out.println("This is a value of " + human.getHandValue() + ".\n");
    System.out.println("Dealer's cards: " + dealer.showFirstCard() + " ?.\n");

    if (cheatMode){
      System.out.println(deck);
    }

    //Ask the user how much they want to bet.
    while(true){
      double money = 0;
      try{
          System.out.println("How much do you bet?");
          money = input.nextDouble();
          if (human.bet(money)){
            System.out.println("You now have " + human.getMoney() + " dollars.\n");
            break;
          }
          else{
            System.out.println("Not enough money or invalid bet.");
          }
        }
        catch(Exception e){
          System.out.println("Please enter a valid numerical bet.");
          input.nextLine();
        }
    }

    input.nextLine();

    //Human makes their move.
    boolean humanStandOrBusted = false;
    while(!humanStandOrBusted){

      //Prints the deck if deck viewing is on.
      if (cheatMode){
        System.out.println(deck);
      }
      //Creates a new deck if required.
      if(deck.getLastCard() <= 10){
        deck = new Deck();
        deck.shuffle();
      }

      //Asks user if they want to hit or stand. Default to Stand.
      System.out.println("Do you wish to hit or stand? [h/S]");

      String answer = input.nextLine().toLowerCase();
      if (answer.length() > 0 && answer.charAt(0) == 'h'){
        human.takeAcard(deck.drawAcard());
        if (human.getHandValue() > 21){
          humanStandOrBusted = true;
          System.out.println("You busted!");
        }
      }
      else{
        humanStandOrBusted = true;
      }

      System.out.println("You have the cards: " + human.showCards() + ".");
      System.out.println("This is a value of " + human.getHandValue() + ".\n");


    }

    //Player makes their move. Player always bets half of their current money to have infinite money.
    System.out.println(player.getName() + " bets " + player.getMoney()/2 + " dollars!");
    player.bet(player.getMoney()/2);

    while(player.hit(deck.getNextCard())){

      if(deck.getLastCard() <= 10){
        deck = new Deck();
        deck.shuffle();
      }
      player.takeAcard(deck.drawAcard());
      System.out.println(player.getName() + " hits and has the cards: " + player.showCards() + ".");
      System.out.println("This is a value of " + player.getHandValue() + ".\n");

    }

    //Dealer makes their move.
    System.out.println(dealer.getName() + " hits and has the cards: " + dealer.showCards() + ".");
    System.out.println("This is a value of " + dealer.getHandValue() + ".\n");

    while(dealer.hit(deck.getNextCard())){

      if(deck.getLastCard() <= 10){
        deck = new Deck();
        deck.shuffle();
      }
      dealer.takeAcard(deck.drawAcard());
      System.out.println(dealer.getName() + " has the cards: " + dealer.showCards() + ".");
      System.out.println("This is a value of " + dealer.getHandValue() + ".\n");

    }


    //Check which players win against the dealer.
    if(dealer.getHandValue() == 21){
      human.setVictory(false);
      player.setVictory(false);
      System.out.println("Dealer wins automatically from Blackjack!");
    }

    else{
      //If player and dealer ties.
      if(dealer.getHandValue() == player.getHandValue()){
        player.setVictory(true);
      }
      //Dealer busts and player doesn't.
      else if(dealer.getHandValue() > 21 && player.getHandValue() <= 21){
        player.setVictory(true);
      }
      //Both dealer and player bust.
      else if(dealer.getHandValue() > 21 && player.getHandValue() > 21){
        if(player.getHandValue() < dealer.getHandValue()){
          player.setVictory(true);
        }
        else{
          player.setVictory(false);
        }
      }
      //Player busts and dealer doesn't.
      else if(player.getHandValue() > 21 && dealer.getHandValue() <= 21){
        player.setVictory(false);
      }
      //Both do not bust.
      else if(player.getHandValue() <= 21 && dealer.getHandValue() <= 21){
        if(player.getHandValue() > dealer.getHandValue()){
          player.setVictory(true);
        }
        else{
          player.setVictory(false);
        }
      }



      //If human and dealer ties.
      if(dealer.getHandValue() == human.getHandValue()){
        human.setVictory(true);
      }
      //Dealer busts and human doesn't.
      else if(dealer.getHandValue() > 21 && human.getHandValue() <= 21){
        human.setVictory(true);
      }
      //Both dealer and human bust.
      else if(dealer.getHandValue() > 21 && human.getHandValue() > 21){
        if(human.getHandValue() < dealer.getHandValue()){
          human.setVictory(true);
        }
        else{
          human.setVictory(false);
        }
      }
      //human busts and dealer doesn't.
      else if(human.getHandValue() > 21 && dealer.getHandValue() <= 21){
        human.setVictory(false);
      }
      //Both do not bust.
      else if(human.getHandValue() <= 21 && dealer.getHandValue() <= 21){
        if(human.getHandValue() > dealer.getHandValue()){
          human.setVictory(true);
        }
        else{
          human.setVictory(false);
        }
      }


    }
    //If playing against the InstantWinPlayer, automatically lose.
    if (player instanceof InstantWinPlayer){
      System.out.println("You lost automatically because xXxNoobSlayerxXx is a master hacker.");
      human.setVictory(false);
      player.setVictory(true);
    }

    //Give money to winning players.
    if(human.getVictory() == true){
      System.out.println(human.getName() + " won " + 2*human.getCurrentBet() + " dollars!");
      human.setMoney(2*human.getCurrentBet() + human.getMoney());
    }
    else{
      System.out.println(human.getName() + " did not win against the dealer!");
    }

    if(player.getVictory() == true){
      System.out.println(player.getName() + " won " + 2*player.getCurrentBet() + " dollars!");
      player.setMoney(2*player.getCurrentBet() + player.getMoney());
    }
    else{
      System.out.println(player.getName() + " did not win against the dealer!");
    }

    //Give these filthy casuals some pity money.
    if(human.getMoney() == 0){
      System.out.println("You have lost all your money! The house pitys you and awards you $1.");
      human.setMoney(1);
    }

    System.out.println("Do you wish to play again? [y/N]");

    String answer = input.nextLine();
    if(answer.length() > 0 && answer.toLowerCase().charAt(0) == 'y'){
      player.clearHand();
      human.clearHand();
      dealer.clearHand();
      //Create a new game with the same players and deck.
      new Game(human, player, dealer, deck, cheatMode);
    }
    else{
      System.out.println("You had " + human.getMoney() + " dollars.");
      System.out.println(player.getName() + " had " + player.getMoney() + " dollars.");
      System.out.println("Goodbye. Thank you for playing Blackjack!");
    }

  }

}
