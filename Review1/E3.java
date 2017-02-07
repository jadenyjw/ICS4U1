/*************************************************************
Name: Jaden Wang
Course: ICS4U1
Date: January 7, 2017
Teacher: Ms. Strelkovska
Assignment: Question 3
*************************************************************/
public class E3{

  public static void main (String[] args){


  }

  public static void printTriangle(char c, int n){
    System.out.println(c);

    if (n > 2){
    for (int x = 0; x < n - 2; x++){
      System.out.print(c);
      for(int y = 0; y < x; y++){
        System.out.print(" ");
      }
      System.out.print(c);
      System.out.print("\n");
    }
    }
    if (n != 1){
      for (int x = 0; x < n; x++){
        System.out.print(c);
      }
    }
  }

}
