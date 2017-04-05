import java.io.*;
import java.util.*;

public class CCC03J1{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int t = input.nextInt();
    int s = input.nextInt();
    int h = input.nextInt();
    for(int x = 0; x < t; x++){
      System.out.print("*");
      for(int y = 0; y < s; y++){
        System.out.print(" ");
      }
      System.out.print("*");
      for(int y = 0; y < s; y++){
        System.out.print(" ");
      }
      System.out.println("*");
    }

    for(int x = 0; x <= s*2 + 2; x++){
      System.out.print("*");

    }
    System.out.print("\n");

    for(int x = 0; x < h; x++){
      for(int y = 0; y < 1 + s; y++){
        System.out.print(" ");
      }
      System.out.println("*");
    }
  }


}

//ccc12j3
