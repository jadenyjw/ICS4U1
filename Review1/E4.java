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
    int num = 0;

    do{
      System.out.println("Enter an integer > 1.");
      num = input.nextInt();
    }while(num <= 1);

    System.out.println("The factor(s) are:");
    leastFactor(num);
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
