import java.util.Random;

public class AnnoyingPlayer extends Player{
  public AnnoyingPlayer(){
    super();
    this.name = generateName();
  }

  private String generateName(){
    Random random = new Random();
    int n = random.nextInt(30);
    String name = "";
    for(int x = 0; x < n; x++){
      name += (char)(random.nextInt(57) + 65);
    }

    return name;
  }

  public boolean hit(int nextCard){
    System.out.println(this.name + " says " + this.name + "!");
    if(super.hit(nextCard)){
      return true;
    }
    else{
      return false;
    }

  }
}
