import java.util.*;
import java.io.*;
public class Rules{

  static String rules = "This is the game of Blackjack.\nThe objective of "
  + "the game is to get as close to or equal to 21, without going over.\n"
  + "Each round, you will bet a sum of money.\n"
  + "If you win the round, you will obtain double your bet.\n"
  + "If you lose, you lose your money.\nYou start with $100.\n"
  + "You will be playing with one other player with the same deck, "
  + "in which you can see their cards and moves.\n";

  static String banner = "";

  static String getRules(){
    return rules;
  }
  static String getBanner(){

    try{
      Scanner input = new Scanner(new File("banner"));
      while(input.hasNext()){
        banner += input.nextLine() + "\n";
      }
      return banner;
    }
    catch (Exception e){
      return "No banner file found! Skipping banner display.";
    }

  }

}
