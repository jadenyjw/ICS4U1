import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args){

    ArrayList<Mammal> mammals = new ArrayList<Mammal>();

    Mammal scruff = new Dog();
    Dog scooby = new Dog();

    System.out.println(scooby.getName());

    File stuFile = new File("mammals.dat");
    Mammal p1;

		try {
			/* write objects */
			FileOutputStream out = new FileOutputStream(stuFile);
			ObjectOutputStream writeStu = new ObjectOutputStream(out);
			writeStu.writeObject(scruff);
			writeStu.writeObject(scooby);
			writeStu.close();
			out.close();
			System.out.println("Data written to file.");

			/* read objects */
			System.out.println("\nStart reading data..........\n");
			FileInputStream in = new FileInputStream(stuFile);
			ObjectInputStream readStu = new ObjectInputStream(in);

			do{
			     p1 = (Mammal)readStu.readObject();
				 if (p1!=null){
				   mammals.add(p1);
         }
			}while(p1!=null);

			readStu.close();

			System.out.println(p1);


			} catch (FileNotFoundException e) {
				System.out.println("File could not be found.");
				System.err.println("FileNotFoundException: " + e.getMessage());
			} catch (IOException e) {
				if (e.getMessage()==null)
					System.err.println("No more record to read");
				else{
					System.out.println("Problem with input/output.");
				    System.err.println("IOException: " + e.getMessage());
				}
			} catch (ClassNotFoundException e) {
				System.out.println("Class could not be used to cast object.");
				System.err.println("ClassNotFoundException: " + e.getMessage());
			}

  }
}

class Mammal implements Serializable{
  protected static boolean hasFur = true;
  protected static int legs = 4;

}

class Dog extends Mammal implements Serializable{

  String name;

  public Dog(){
    this("Default Name");
  }
  public Dog(String name){
    this.name = name;
  }

  public String getName(){
    return this.name;
  }
}
