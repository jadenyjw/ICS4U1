/*************************************************************
Name: Jaden Wang
Course: ICS4U1
Date: February 7, 2017
Teacher: Ms. Strelkovska
Assignment: CCC Review (https://dmoj.ca/problem/ccc11s2)
*************************************************************/

import java.util.Scanner;
public class CCC11S2{


  public static void main (String[] args){
    Scanner input = new Scanner(System.in);


    int n = input.nextInt();
    String[] answers = new String[n];
    String[] correct = new String[n];
    input.nextLine();

    for (int x = 0; x < n;x++){

      answers[x] = input.nextLine();

    }
    for (int x = 0; x < n;x++){

      correct[x] = input.nextLine();

    }
    int count = 0;
    for (int x = 0; x < n;x++){
      if (answers[x].equals(correct[x])){
        count++;
      }
    }
    System.out.println(count);



  }
}
