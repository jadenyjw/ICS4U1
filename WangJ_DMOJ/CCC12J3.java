import java.util.*;
public class CCC12J3{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int k = input.nextInt();


    for(int x = 0; x < k; x++){
        for(int y = 0; y < k; y++){
          System.out.print("*");
        }
        for(int y = 0; y < k; y++){
          System.out.print("x");
        }
        for(int y = 0; y < k; y++){
          System.out.print("*");
        }
        System.out.println();
    }
    for(int x = 0; x < k; x++){
        for(int y = 0; y < k; y++){
          System.out.print(" ");
        }
        for(int y = 0; y < k; y++){
          System.out.print("x");
        }
        for(int y = 0; y < k; y++){
          System.out.print("x");
        }
        System.out.println();
    }
    for(int x = 0; x < k; x++){
        for(int y = 0; y < k; y++){
          System.out.print("*");
        }
        for(int y = 0; y < k; y++){
          System.out.print(" ");
        }
        for(int y = 0; y < k; y++){
          System.out.print("*");
        }
        System.out.println();
    }


  }
}
