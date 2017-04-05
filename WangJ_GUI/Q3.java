import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;
import java.awt.Toolkit;
import java.awt.Dimension;
public class Q3 extends JFrame{

  public Q3(){

    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    double height = screenSize.getHeight();

    this.setSize((int)(height * 2.0/3),(int)(height * 2.0/3));
    this.setVisible(true);
    this.setDefaultCloseOperation ( WindowConstants.EXIT_ON_CLOSE );
    Q3Panel panel = new Q3Panel();
    this.add(panel);

  }

}

class Q3Panel extends JPanel{

  public void paintComponent (Graphics g){

    int width = getWidth();
    int height = getHeight();

    int yCoord = getHeight()/2;
    int xCoord = getWidth()/2;

    int counter = 1;

    while(counter*5 < width && counter*5 < height){

      //Down
      if (counter % 4 == 1){
        g.drawLine(xCoord, yCoord, xCoord, yCoord + counter * 5);
        yCoord = yCoord + counter * 5;
      }
      //Left
      else if (counter % 4 == 2){
        g.drawLine(xCoord, yCoord, xCoord - counter*5, yCoord);
        xCoord = xCoord - counter*5;
      }
      //Up
      else if (counter % 4 == 3){
        g.drawLine(xCoord, yCoord, xCoord, yCoord - counter*5);
        yCoord = yCoord - counter*5;
      }
      //Right
      else if (counter % 4 == 0){
        g.drawLine(xCoord, yCoord, xCoord + counter*5, yCoord);
        xCoord = xCoord + counter*5;
      }

      counter++;

    }


  }
}
