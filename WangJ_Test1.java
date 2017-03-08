/*************************************************************
Name: Jaden Wang
Course: ICS4U1
Date: February 23, 2017
Teacher: Ms. Strelkovska
Assignment: Test 1 Pattern Matching
*************************************************************/
import java.util.Scanner;
import java.util.*;
public class Test1{
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    String sentence = "";

    while(!sentence.equals("!")){
      sentence = input.nextLine();
      if (sentence.equals("!")){
        System.out.println("Good Bye");
        continue;
      }
      String[] words = sentence.toLowerCase().split(" ");
      char[] word1 = new char[words[0].length()];
      for (int x = 0; x < words[0].length(); x++){
        if(isVowel(words[0].charAt(x))){
          word1[x] = 'V';
        }
        else{
          word1[x] = 'C';
        }

      }
      char[] word2 = new char[words[1].length()];
      for (int x = 0; x < words[1].length(); x++){
        if(isVowel(words[1].charAt(x))){
          word2[x] = 'V';
        }
        else{
          word2[x] = 'C';
        }

      }

      if(Arrays.equals(word1, word2)){
        System.out.println("same");
      }
      else{
        System.out.println("different");
      }

      //Works for some cases.
      ArrayList<Integer> maxes = new ArrayList<Integer>();
      ArrayList<Character> maxChars = new ArrayList<Character>();
      int maximum = 0;
      char currentChar = words[0].charAt(0);

      for(int x = 0; x < words[0].length(); x++){
        if(words[0].charAt(x) == currentChar){
          maximum++;
        }
        else{

          maxes.add(maximum);
          maxChars.add(currentChar);
          currentChar = words[0].charAt(x);
          maximum = 1;
        }

      }
      maxes.add(maximum);
      maxChars.add(currentChar);

      int theMax = 0;
      for (int x = 0; x < maxes.size();x++){
        if (maxes.get(x) > theMax) theMax = maxes.get(x);
      }


      int id = maxes.indexOf(theMax);
      System.out.println(maxChars.get(theMax));


    }

  }

  public static boolean isVowel(char a){
    return (a =='a' || a =='e' || a =='i' || a =='o' || a =='u');
  }



}
