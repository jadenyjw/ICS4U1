package players;

import java.util.Random;

public class AnnoyingPlayer extends Player{
  public AnnoyingPlayer(){

    Random random = new Random();
    int n = random.nextInt(50);
    for(int x = 0; x < n; x++){
      name += (char)(random.nextInt(57) + 65);
    }
  }

}
