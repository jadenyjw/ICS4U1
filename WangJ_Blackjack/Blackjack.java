/*************************************************************
Name: Jaden Wang
Course: ICS4U1
Date: February 28, 2017
Teacher: Ms. Strelkovska
Assignment: Blackjack
*************************************************************/

import players.*;
import java.util.*;
import java.io.*;
public class Blackjack{

  public static void main(String[] args){

    Random random = new Random();
    Scanner input = new Scanner(System.in);
    System.out.println("What is your name?");

    HumanPlayer human = new HumanPlayer(input.nextLine());
    System.out.println("We are now searching for an appropriate opponent.");
    int n = random.nextInt(100);
    //InstantWinPlayer, GeniusPlayer, AnnoyingPlayer, Player
  
    if(n == 0){
      InstantWinPlayer player = new InstantWinPlayer();
      System.out.println("GG you're facing a hacker.");
    }
    else if(n >= 1 && n <= 20){
      GeniusPlayer player = new GeniusPlayer();
      System.out.println("You are facing a PhD student in combinatorics.");
    }
    else if(n >= 21 && n <= 50){
      AnnoyingPlayer player = new AnnoyingPlayer();
      System.out.println("You are facing a player who is particularily annoying (and random).");
    }
    else{
      Player player = new Player();
      System.out.println("You are facing a casual Blackjack player.");
    }

    System.out.println(human.getName() + " VERSUS " + player.getName());

    Deck deck = new Deck();




  }



}
