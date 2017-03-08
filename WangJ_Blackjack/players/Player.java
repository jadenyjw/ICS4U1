package players;
public class Player{


  protected String name;
  protected double money;

  public Player(String name){
    this.name = name;
    this.money = 100;
  }

  public Player(){
    this("Bob");
  }
  public int takeAcard(int n){
    return 0;
  }

  public int drawAcard(int n){
    return 0;
  }

  public String getName(){
    return this.name;
  }


}
