import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;
public class Q2 extends JFrame{

  public Q2(){

    this.setSize(500,500);
    this.setVisible(true);
    this.setDefaultCloseOperation ( WindowConstants.EXIT_ON_CLOSE );
    Q2Panel panel = new Q2Panel();
    this.add(panel);
  }

}

class Q2Panel extends JPanel{

  public void paintComponent (Graphics g){

    int width = getWidth();
    int height = getHeight();

    for(int x = 0; x < height; x+= height/50){
      g.drawLine(0, x, x, height);
      g.drawLine(width, x, width - x, height);
      g.drawLine(0, height - x, x, 0);
      g.drawLine(width, height -x , width - x, 0);
    }


  }
}
