public class Dealer extends Player{

  public Dealer(){
    super("Big Brother");
  }
  //Dealer only shows first card and not all of them initially.
  public String showFirstCard(){
    return CardUtils.cardToString(hand[0]);
  }

}
