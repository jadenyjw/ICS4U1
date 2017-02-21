/*************************************************************
Name: Jaden Wang
Course: ICS4U1
Date: February 17, 2017
Teacher: Ms. Strelkovska
Assignment: Encode@DMOJ
*************************************************************/

import java.util.Scanner;

public class DMOJ {


  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();

    input.nextLine();
    String line = input.nextLine();

    n = n%26;


    String encoded = "";

    for (int x = 0; x < line.length(); x++){
      char letter = line.charAt(x);

      if ('a' <= letter && letter <= 'z'){
        int id = (letter - 97 - n);
        if (id >= 26){
          letter = (char)(letter - n - 26);
        }

        else if(id < 0){
          letter = (char)(letter - n + 26);
        }
        else{
          letter = (char)(letter - n);
        }
      }
      else if ('A' <= letter && letter <= 'Z'){
        int id = (letter - 65 - n);

        if (id >= 26){
          letter = (char) (letter - n - 26);
        }

        else if(id < 0){
          letter = (char) (letter - n + 26);
        }
        else{
          letter = (char) (letter - n);
        }
      }
      encoded = encoded + letter;


    }
    System.out.println(encoded);
    /* ADD YOUR CODE HERE */

  }

}
