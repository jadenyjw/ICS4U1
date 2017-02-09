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

    //Loop through all the lines in the file.
    while(input.hasNext()){
      String line = input.nextLine();
      //Loop through the entire line that we found.
      for(int x = 0; x < line.length(); x++){
        /*Checks if the character is numerical. If yes, append it to number n.
        If it's not, then we print that n times.
        */
        if(line.charAt(x) >= '0' && line.charAt(x) <= '9'){
          //Append the number.
          count = count + line.charAt(x);
        }
        else{
          int countInt = Integer.parseInt(count);
          //Print the character n times.
          for(int z = 0; z < countInt; z++){
            System.out.print(line.charAt(x));
          }
          count = "";
        }

      }
      //Print a new line for the next line.
      System.out.print("\n");

  }
}
}
