/*************************************************************
Name: Jaden Wang
Course: ICS4U1
Date: February 21, 2017
Teacher: Ms. Strelkovska
Assignment: Phrase Finder
*************************************************************/
import java.util.Scanner;
import java.io.*;

public class Phrase{
  public static void main(String[] args){

    //Ask for path and phrase information
    Scanner input = new Scanner(System.in);

    System.out.println("Please enter the absolute path of the folder you wish to list.");
    String path = input.nextLine();

    System.out.println("Please enter a phrase you wish to search for.");
    String phrase = input.nextLine();

    System.out.println("What would you like to replace this phrase with?");
    String replacement = input.nextLine();

    //Initialize variables outside of the try block
    File folder = null;
    File[] files;
    FileReader fr;
    FileWriter fw;
    BufferedReader reader;
    BufferedWriter writer;
    String name;

    try{
      folder = new File(path);
      //Store all files into an array
      files = folder.listFiles();
      System.out.println("Replaced " + phrase + " with " + replacement + " in these files:");

      for(int x = 0; x < files.length; x++){

        fr = new FileReader(files[x]);
        reader = new BufferedReader(fr);
        //Initialize a writer in a temporary file.
        fw = new FileWriter("tmp");
        writer = new BufferedWriter(fw);

        boolean isRead = false;
        //Read through all the lines.
        while ((name = reader.readLine()) != null) {
          //Look for the line that they specified.
          if(name.contains(phrase)){
            if(isRead == false){
              System.out.println(files[x].getName());
              isRead = true;
            }
            name = name.replace(phrase, replacement);
          }

          writer.write(name + "\n");
        }
        //Close IO objects.
        reader.close();
        fr.close();
        writer.close();
        fw.close();

        //Replace old file with temporary file.
        File old = new File(files[x].getAbsolutePath());
        old.delete();
        File newFile = new File("tmp");
        newFile.renameTo(old);

      }


    }
    catch (IOException e) {
      System.out.println("Oops. Something went wrong...");
    }
    catch (Exception e){
      System.out.println(e);
    }

  }
}
