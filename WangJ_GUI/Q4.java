import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;
import java.awt.Toolkit;
import java.awt.Dimension;
public class Q4 extends JFrame{

  public Q4(){

    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    double height = screenSize.getHeight();

    this.setSize((int)(height * 2.0/3),(int)(height * 2.0/3));
    this.setVisible(true);
    this.setDefaultCloseOperation ( WindowConstants.EXIT_ON_CLOSE );
    Q4Panel panel = new Q4Panel();
    this.add(panel);

  }

}

class Q4Panel extends JPanel{

  public void paintComponent (Graphics g){

    int width = getWidth();
    int height = getHeight();

    int yCoord = getHeight()/2;
    int xCoord = getWidth()/2;

    int heightFactor = 10;
    int widthFactor = 20;

    int counter = 1;

    while(counter*widthFactor < width && counter*heightFactor < height){
      //Top
      if(counter % 2 == 1){
        g.drawArc(xCoord, yCoord - heightFactor*counter, counter*widthFactor, 2*counter*heightFactor, 0, 180);
        xCoord -= widthFactor;
      }
      //Bottom
      else if(counter % 2 == 0){
        g.drawArc(xCoord, yCoord - heightFactor*counter, counter*widthFactor, 2*counter*heightFactor, 0, -180);
      }

      counter++;
    }


  }
}
