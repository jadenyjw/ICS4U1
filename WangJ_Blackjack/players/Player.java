package players;
public class Player{

  protected String name;
  protected double money;
  protected int[] hand;

  public Player(String name){
    this.name = name;
    this.money = 100;
    this.hand = new int[11];
  }

  public Player(){
    this("Bob");
  }
  public int takeAcard(int n){
    return 0;
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

  public int getHandValue(){
    
  }

}
