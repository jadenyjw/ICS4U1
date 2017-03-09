/*************************************************************
Name: Jaden Wang
Course: ICS4U1
Date: March 7, 2017
Teacher: Ms. Strelkovska
Assignment: Fractions
Description: A program that asks for fractions and computes artihmetic.
*************************************************************/
import java.util.*;
public class Main {
  public static void main(String[] args){
    //Ask for all the fractions to compute addition, subtraction, etc.
    Scanner input = new Scanner(System.in);
    System.out.println("Enter 2 fractions below to compute arithmetic functions:");
    System.out.println("What is the numerator of the first fraction?");
    int num1 = input.nextInt();
    System.out.println("What is the denominator of the first fraction?");
    int den1 = input.nextInt();
    System.out.println("What is the numerator of the second fraction?");
    int num2 = input.nextInt();
    System.out.println("What is the denominator of the second fraction?");
    int den2 = input.nextInt();

    //Initialize the fraction objects.
    Fraction f1 = new Fraction(num1, den1);
    Fraction f2 = new Fraction(num2, den2);

    System.out.println("The sum is " + f1.plus(f2));
    System.out.println("The difference is " + f1.minus(f2));
    System.out.println("The product is " + f1.multiply(f2));
    System.out.println("The quotient is " + f1.divide(f2));
    System.out.println();

    //Ask for new fraction to test for equality.
    System.out.println("Enter 2 fractions below to test for equality:");
    System.out.println("What is the numerator of the first fraction?");
    int num3 = input.nextInt();
    System.out.println("What is the denominator of the first fraction?");
    int den3 = input.nextInt();
    System.out.println("What is the numerator of the second fraction?");
    int num4 = input.nextInt();
    System.out.println("What is the denominator of the second fraction?");
    int den4 = input.nextInt();
    //Create new fractions.
    Fraction f3 = new Fraction(num3, den3);
    Fraction f4 = new Fraction(num4, den4);

    if(f3.equals(f4)){
      System.out.println("These fractions are equal.");
    }
    else{
      System.out.println("These fractions are not equal.");
    }

  }
}
