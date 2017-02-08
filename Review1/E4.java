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
      if (num >= 1){
        System.out.println("The factor(s) are:");
        leastFactor(num);
      }
      else{
        break;
      }

    }

  }

  public static void leastFactor (int n){
    int t = 0;
    if (n > 1){
      if(n % 2 == 0){
        t = 2;
      }
      else{
        for(int x = 3; x <= n; x+=2){
          if (n % x == 0){
            t = x;
            break;
          }
        }
      }
      System.out.print(t + " ");
      int div = n / t;
      leastFactor(div);
    }

  }
}
