/*************************************************************
Name: Jaden Wang
Course: ICS4U1
Date: February 6, 2017
Teacher: Ms. Strelkovska
Assignment: Assignment1
Description: A program that utilizes Scanner and JOptionPane
*************************************************************/

import java.util.Scanner;
import javax.swing.JOptionPane;

public class A1{
  public static void main (String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Can you guess my favourite meme of all time?");
    String meme = input.nextLine();
    String repeat = JOptionPane.showInputDialog("What did you just say?");

    if (meme.equalsIgnoreCase("john cena") && repeat.equalsIgnoreCase(meme) ){
      JOptionPane.showMessageDialog( null, "You are an educated memer.");
    }
    else{
      JOptionPane.showMessageDialog( null, "You are a filthy memer.");
    }
    String credit = JOptionPane.showInputDialog("Please enter your credit card.");
    String ssn = JOptionPane.showInputDialog("Please enter your Social Security Number");

    System.out.println("Verifying information");
    for (int x = 0; x < 50; x++){
      System.out.print(".");
    }

    System.out.println("\nThank you for using WangJ_assgn1.");
  }
}
