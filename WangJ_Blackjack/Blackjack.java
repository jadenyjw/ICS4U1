/*************************************************************
Name: Jaden Wang
Course: ICS4U1
Date: March 9, 2017
Teacher: Ms. Strelkovska
Assignment: Blackjack
*************************************************************/
import java.util.Random;

import java.util.*;
import java.io.*;

public class Blackjack{

  public static void main(String[] args){

    boolean cheatMode = false;

    //Cheating argument.
    if (args.length == 1 && args[0].equals("cheat")){
      cheatMode = true;
    }
    System.out.println(Rules.getBanner());
    System.out.println(Rules.getRules());

    Random random = new Random();
    Scanner input = new Scanner(System.in);
    System.out.println("What is your name?");

    HumanPlayer human = new HumanPlayer(input.nextLine());
    System.out.println("We are now searching for an appropriate opponent.\n");
    int n = random.nextInt(100);

    //Randomly pick a player to face from InstantWinPlayer, GeniusPlayer, AnnoyingPlayer, and Player with given probabilities.

    Player player;

    if(n == 0){
      player = new InstantWinPlayer();
      System.out.println("GG you are playing with a hacker.");
    }
    else if(n >= 1 && n <= 20){
      player = new GeniusPlayer();
      System.out.println("You are playing with a Blackjack veteran.");
    }
    else if(n >= 21 && n <= 50){
      player = new AnnoyingPlayer();
      System.out.println("You are playing with a player who is particularily annoying (and random).");
    }
    else{
      player = new Player();
      System.out.println("You are playing with a casual Blackjack player.");
    }
    System.out.println();
    System.out.println(human.getName() + " versus " + player.getName() + "!");

    //Initialize required objects and start the game.
    Deck deck = new Deck();
    deck.shuffle();
    Dealer dealer = new Dealer();
    System.out.println("The dealer's name is " + dealer.getName() + ".\n");
    new Game(human, player, dealer, deck, cheatMode);


  }








}
