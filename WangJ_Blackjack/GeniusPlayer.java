import java.util.*;
public class GeniusPlayer extends Player{

  public GeniusPlayer(){
    super("Patrick");

  }

  public boolean hit(int nextCard){
    int number = 0;
    if (nextCard % 13 == 0){
      if(this.getHandValue() + 11 > 21){
        number = this.getHandValue() + 1;
      }
      else{
        number = this.getHandValue() + 11;
      }
    }
    else{
      number = this.getHandValue() + CardUtils.getValue(nextCard);
    }

    return(number <= 21);

  }

}
