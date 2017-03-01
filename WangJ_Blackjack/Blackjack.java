/*************************************************************
Name: Jaden Wang
Course: ICS4U1
Date: February 28, 2017
Teacher: Ms. Strelkovska
Assignment: Blackjack
*************************************************************/

public class Blackjack{

  public static void main(String[] args){
    int[] cards = new int[52];
    /* The cards are represented like:
    A 2 3 4 5 6 7 8 9 10 J Q K A 2 3...
    The order of suites are Diamonds > Clubs > Hearts > Spades
    */
    //Populate and print the array.
    System.out.println("Unshuffled Array:");
    for (int i = 0; i < 52; i++){
      cards[i] = i;
      System.out.print(cards[i] + " ");
    }
    // Reads the array as actual cards.
    System.out.println("\nCards:");
    for (int i=0; i<cards.length; i++){
      System.out.print(cardToString(cards[i])+ " ");
    }
    //Reads the Blackjack values of the cards.
    System.out.println("\nCard values:");
    for (int i=0; i<cards.length; i++){
      System.out.print(getValue(cards[i])+ " " );
    }

    // After shuffling, read the cards and values again.
    System.out.println("\nShuffled cards:");
    shuffle(cards);
    for (int i=0; i<cards.length; i++){
      System.out.print(cardToString (cards[i])+ " " );
    }
    System.out.println("\nShuffled card values:");
    for (int i=0; i<cards.length; i++){
      System.out.print(getValue (cards[i])+ " " );

    }
    System.out.println();

  }

  public static String cardToString(int n){

    char suite = 'x';
    String card = "";

    switch(n/13){
    case 0:
      suite = (char)'\u2666';
      break;
    case 1:
      suite = (char)'\u2663';
      break;
    case 2:
      suite = (char)'\u2764';
      break;
    case 3:
      suite = (char)'\u2660';
      break;
    }

    switch(n%13){
    case 0:
      card = "A";
      break;
    case 10:
      card = "J";
      break;
    case 11:
      card = "Q";
      break;
    case 12:
      card = "K";
      break;
    default:
      card = n%13 + "";
    }

    return (suite + "" + card);
  }

  public static int getValue(int n){

    if(n % 13 >= 10 &&  n % 13 <= 13){
      return 10;
    }
    else{
      return n % 13 + 1;
    }

  }

  public static void shuffle(int[] cards){
    for (int i = 0; i < 52; i++){
      int a = (int) (Math.random() * 52);
      int temp = cards[a];
      cards[a] = cards[i];
      cards[i] = temp;
    }
  }

}
