import java.io.*;

public class TestProcessor{

  public static void main(String[] args){
    //Initialize variables
    File myFile = new File("test.txt");
    FileReader fr;
    FileWriter fw;
    BufferedReader reader;
    BufferedWriter writer;
    String name;

    try {
      //Define variables inside the try block
      fr = new FileReader(myFile);
      fw = new FileWriter ("marks.dat");
      reader = new BufferedReader(fr);
      writer = new BufferedWriter(fw);

      char[] correct = reader.readLine().toCharArray();

      while ((name = reader.readLine()) != null) {

        double score = 0.0;
        String answers = reader.readLine();
        //Finds the number of correct answers.
        for(int x = 0; x < answers.length(); x++){

          if (answers.charAt(x) == correct[x]){
            score++;
          }

        }
        int percent = (int) (score / correct.length * 100);
        //Writes the correct answers.
        writer.write(name + " " + percent + "%\n");

      }

      //Close defined objects
      reader.close();
      fr.close();
      writer.close();
      fw.close();
    }
    catch (FileNotFoundException e) {
      System.out.println("File test.txt not found.")
    }
    catch (IOException e) {
      System.out.println("Oops. Something went wrong...")
    }

  }

}
