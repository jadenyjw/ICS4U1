/*************************************************************
Name: Jaden Wang
Course: ICS4U1
Date: February 8, 2017
Teacher: Ms. Strelkovska
Assignment: Question 1
*************************************************************/

import java.util.Scanner;
import java.io.*;

public class E1{

  public static void main (String[] args) throws Exception{
    Scanner input = new Scanner(new File("Review2Data.txt"));
    String count = "";
    while(input.hasNext()){
      String line = input.nextLine();
      for(int x = 0; x < line.length(); x++){

        if(line.charAt(x) >= '0' && line.charAt(x) <= '9'){
          count = count + line.charAt(x);

        }
        else{
          int countInt = Integer.parseInt(count);
          for(int z = 0; z < countInt; z++){
            System.out.print(line.charAt(x));
          }
          count = "";
        }

      }
      System.out.print("\n");

  }
}
}
