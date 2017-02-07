/*************************************************************
Name: Jaden Wang
Course: ICS4U1
Date: January 7, 2017
Teacher: Ms. Strelkovska
Assignment: Question 2
*************************************************************/
public class E2{

  public static void main (String[] args){
  
  }

  public static int digit (int n, int position){


        String word = Integer.toString(n);
      if ((word.length() - 1 - position) >= 0){
        return Character.getNumericValue( (word.charAt(word.length() - 1 - position)));
      }
      else{
        return 0;
      }
  }

}
