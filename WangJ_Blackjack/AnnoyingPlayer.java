import java.util.Random;

public class AnnoyingPlayer extends Player{
  public AnnoyingPlayer(){
    super();
    this.name = generateName();
  }

  private String generateName(){
    Random random = new Random();
    int n = random.nextInt(50);
    String name = "";
    for(int x = 0; x < n; x++){
      name += (char)(random.nextInt(57) + 65);
    }

    return name;
  }

}
