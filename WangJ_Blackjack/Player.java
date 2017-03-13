
public class Player{

  protected String name;
  protected double money;
  protected int[] hand;
  protected int handSize;
  protected double currentBet;
  protected boolean victory;

  public Player(String name){
    this.name = name;
    this.money = 100;
    this.hand = new int[11];
    this.handSize = 0;
  }

  public Player(){
    this("Bob");
  }
  public void takeAcard(int n){
    hand[handSize++] = n;
  }

  public String getName(){
    return this.name;
  }

  public void setMoney(double n){
    this.money = n;
  }
  public double getMoney(){
    return this.money;
  }
  public void clearHand(){
    hand = new int[11];
    handSize = 0;
  }

  public String showCards(){
    String actualCards = "";

    for (int x = 0; x < handSize; x++){
      actualCards += CardUtils.cardToString(hand[x]) + " ";
    }
    return actualCards;
  }


  public int getHandValue(){
    int sum = 0;
    int aceCount = 0;
    for (int x = 0; x < handSize; x++){
      sum += CardUtils.getValue(hand[x]);
      if (hand[x] % 13 == 0){
        aceCount++;
      }
    }
    if (sum > 21){
      for(int x = 0; x < aceCount; x++){
        sum -= 10;
        if(sum <= 21){
          break;
        }
      }
    }
    return sum;
  }

  public boolean bet(double n){
    if(this.money - n < 0 || n < 0){
      return false;
    }
    else{
      this.money -= n;
      this.currentBet = n;
      return true;
    }
  }

  public double getCurrentBet(){
    return this.currentBet;
  }

  public void setVictory(boolean victory){
    this.victory = victory;
  }

  public boolean getVictory(){
    return this.victory;
  }

  public boolean hit(int nextCard){
    if(this.getHandValue() <= 17){
      return true;
    }
    else{
      return false;
    }

  }
}
