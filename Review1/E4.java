/*************************************************************
Name: Jaden Wang
Course: ICS4U1
Date: February 7, 2017
Teacher: Ms. Strelkovska
Assignment: Question 4
*************************************************************/
import java.util.Scanner;
public class E4{


  public static void main (String[] args){
    Scanner input = new Scanner(System.in);
    int num = 1;

    while(num >=1){

      System.out.println("\nEnter an integer > 1.");
      num = input.nextInt();
      //When user enters something more than 0 to keep looping.
      if (num >= 1){
        System.out.println("The factor(s) are:");
        leastFactor(num);
      }
      //If user enters something less than 1 to exit the program.
      else{
        break;
      }

    }

  }

  public static void leastFactor (int n){
    //Initialze t (the factor).
    int t = 0;
    if (n > 1){
      //All even numbers have 2 as the least factor.
      if(n % 2 == 0){
        t = 2;
      }
      //If it's not even, then loop all odd numbers to that number.
      else{
        for(int x = 3; x <= n; x+=2){
          //If we find the factor, then end the loop to find it.
          if (n % x == 0){
            t = x;
            break;
          }
        }
      }

      System.out.print(t + " ");

      //Divide the initial number by the factor that we found.

      int div = n / t;
      //Keep factoring with the quotient after it divided with the factor.
      leastFactor(div);
    }

  }
}
