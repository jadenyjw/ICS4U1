import java.io.*;

public class TestProcessor{

  public static void main(String[] args){
    File myFile = new File("test.txt");
    FileReader fr;
    FileWriter fw;
    BufferedReader reader;
    BufferedWriter writer;
    String name;

    try {
      fr = new FileReader(myFile);
      fw = new FileWriter ("marks.dat");
      reader = new BufferedReader(fr);
      writer = new BufferedWriter(fw);

      char[] correct = reader.readLine().toCharArray();

      while ((name = reader.readLine()) != null) {

        double score = 0.0;
        String answers = reader.readLine();


        for(int x = 0; x < answers.length(); x++){
        
          if (answers.charAt(x) == correct[x]){
            score++;
          }

        }
        int percent = (int) ((score / correct.length) * 100);
        writer.write(name + " " + percent + "%\n");

      }
      reader.close();
      fr.close();
      writer.close();
      fw.close();
    }
    catch (FileNotFoundException e) {

    }
    catch (IOException e) {

    }

  }

}
