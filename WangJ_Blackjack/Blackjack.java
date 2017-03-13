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

    System.out.println(Rules.getRules());

    Random random = new Random();
    Scanner input = new Scanner(System.in);
    System.out.println("What is your name?");

    HumanPlayer human = new HumanPlayer(input.nextLine());
    System.out.println("We are now searching for an appropriate opponent.");
    int n = random.nextInt(100);

    //InstantWinPlayer, GeniusPlayer, AnnoyingPlayer, Player

    Player player;

    if(n == 0){
      player = new InstantWinPlayer();
      System.out.println("GG you are facing a hacker.");
    }
    else if(n >= 1 && n <= 20){
      player = new GeniusPlayer();
      System.out.println("You are facing a Blackjack veteran.");
    }
    else if(n >= 21 && n <= 50){
      player = new AnnoyingPlayer();
      System.out.println("You are facing a player who is particularily annoying (and random).");
    }
    else{
      player = new Player();
      System.out.println("You are facing a casual Blackjack player.");
    }

    System.out.println(human.getName() + " versus " + player.getName() + "!");

    Deck deck = new Deck();
    deck.shuffle();
    Dealer dealer = new Dealer();
    System.out.println("The dealer's name is " + dealer.getName() + ".");
    new Game(human, player, dealer, deck, cheatMode);


  }








}
