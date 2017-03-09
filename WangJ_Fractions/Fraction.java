/*************************************************************
Name: Jaden Wang
Course: ICS4U1
Date: March 7, 2017
Teacher: Ms. Strelkovska
Assignment: Fractions
Description: A program that asks for fractions and computes artihmetic.
*************************************************************/
import java.util.*;
public class Fraction{
  // instance variables
  private int num;               // top part
  private int den;                // bottom part

  private Scanner sc=new Scanner(System.in);
  /*********************
  * Constructor for objects of class Fraction
  *  Create an object representing 0/1
  ********************/
  public Fraction()	{
    // initialise instance variables
    num = 0;
    den = 1;
  }
  /*********************
  * Construct a fraction given two ints (numerator first)
  *
  * @param n the numerator
  * @param d the denominator
  ********************/
  public Fraction(int num, int den)	{
    // initialise instance variables
    this.num = num;
    this.den = den;
    // reduce
    this.reduce();
  }


  //Arithmetic Methods
  public Fraction plus(Fraction other){
    Fraction result = new Fraction(num*other.den + den*other.num, den*other.den);
    return result;
  }
  public Fraction minus(Fraction other){
    Fraction result = new Fraction(num*other.den - den*other.num, den*other.den);
    return result;
  }
  public Fraction multiply(Fraction other){
    Fraction result = new Fraction(num*other.num, den*other.den);
    return result;
  }
  public Fraction divide(Fraction other){
    Fraction result = new Fraction(num*other.den, den*other.num);
    return result;
  }
  //Equality testing.
  public boolean equals(Fraction other){
    return(num == other.num && den == other.den);
  }

  //Prints the fraction as a string.
  public String toString(){
    if (den != 0)
      return("" + num + "/" + den);
    else if (num ==0)
      return "NaN";
    else if (num > 0)
      return "Infinity";
    else
      return " - Infinity";

  }

  //Reduces fractions to lowest terms.
  private void reduce(){
    for (int i = Math.min(Math.abs(num),Math.abs(den)); i>=2;i--)   // we don't need to open and close brackets here
    if (num%i == 0 && den%i == 0){                 //because if(..){..} is one statement
      num/=i;
      den/=i;
    } // end if
  }// end reduce
}// end Fraction class
