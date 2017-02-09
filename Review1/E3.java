/*************************************************************
Name: Jaden Wang
Course: ICS4U1
Date: February 7, 2017
Teacher: Ms. Strelkovska
Assignment: Question 3
*************************************************************/
public class E3{

  public static void main (String[] args){
    printTriangle('j', 1);
  }

  public static void printTriangle(char c, int n){
    //Print the initial character
    System.out.println(c);


    if (n > 2){
    //Loop for each line.
    for (int x = 0; x < n - 2; x++){
      //Print the last beginning character.
      System.out.print(c);

      //Print spaces between the characters.
      for(int y = 0; y < x; y++){
        System.out.print(" ");
      }
      //Print the end character.
      System.out.print(c + "\n");

    }
    }

    //Print last line if number of lines is not 1.
    if (n != 1){
      for (int x = 0; x < n; x++){
        System.out.print(c);
      }
    }
  }

}
