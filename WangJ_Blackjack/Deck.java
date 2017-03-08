import java.util.Random;
public class Deck{

  protected int[] cards;
  protected int lastCard = 51;

  public Deck(){
    cards = new int[52];
    //Fill the deck.
    for (int x = 0; x < 52; x++){
      cards[x] = x;
    }
  }

  public void shuffle(int[] cards){
    Random b = new Random();
    for (int i = 0; i < 52; i++){
      int a = b.nextInt(52);
      int temp = cards[a];
      cards[a] = cards[i];
      cards[i] = temp;
    }
  }

  public String cardToString(int n){

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

  public int getValue(int n){

    if(n % 13 >= 10 &&  n % 13 <= 13){
      return 10;
    }
    else{
      return n % 13 + 1;
    }

  }



}
