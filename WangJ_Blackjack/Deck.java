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

  public void shuffle(){
    //Shuffles the deck.
    Random b = new Random();
    for (int i = 0; i < 52; i++){
      int a = b.nextInt(52);
      int temp = cards[a];
      cards[a] = cards[i];
      cards[i] = temp;
    }
  }

  public int drawAcard(){
    return cards[lastCard--];
  }

  public int getLastCard(){
    return lastCard;
  }

  public int getNextCard(){
    return cards[lastCard];
  }

  //Gets string representation of the deck.
  public String toString(){
    String cardSymbols = "";
    String values = "";

    for(int x = 0; x <= lastCard; x++){
      cardSymbols += CardUtils.cardToString(cards[x]) + " ";
      values += CardUtils.getValue(cards[x]) + " ";
    }

    return cardSymbols + "\n" + values + "\n";

  }

}
