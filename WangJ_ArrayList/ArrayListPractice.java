/*************************************************************
Name: Jaden Wang
Course: ICS4U1
Date: March 28, 2017
Teacher: Ms. Strelkovska
Assignment: ArrayList Sorting Practice
*************************************************************/

import java.util.*;
import java.io.*;

public class ArrayListPractice{
  public static void main(String[] args) throws Exception{
    Scanner input = new Scanner(new File("test.txt"));
    ArrayList<Pair> words = new ArrayList<Pair>();

    while(input.hasNext()){
        String word = input.next();
        int size = words.size();
        boolean exists = false;
        for(int x = 0; x < size; x++){
          Pair retrieved = words.get(x);
          if (retrieved.word.equals(word)){
            exists = true;
            words.get(x).count++;
            break;
          }
        }

        if(!exists){
          words.add(new Pair(word, 1));
        }
    }
    Collections.sort(words);
    for(int x = 0; x < words.size(); x++){
      System.out.println(words.get(x).word + " " + words.get(x).count);
    }
  }

}

class Pair implements Comparable<Pair>{
  public String word;
  public int count;

  @Override
  public int compareTo(Pair other){
    if(count != other.count){
      return other.count - count;
    }
    else{
      return word.compareTo(other.word);
    }
  }
  public Pair(String word, int count){
    this.word = word;
    this.count = count;
  }
}
