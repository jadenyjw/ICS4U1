import java.util.*;
import java.io.*;
public class Rules{

  static String rules = "This is the game of Blackjack. The objective of "
  + "the game is to get as close to or equal to 21, without going over. "
  + "Each round, you will bet a sum of money. "
  + "If you win the round, you will obtain double your bet. "
  + "If you lose, you lose your money. You start with $100. "
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
