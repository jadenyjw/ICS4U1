import java.awt.Color;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.Dimension;
import javax.swing.*;


public class Q1 extends JFrame{
  public Q1(){

    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    double height = screenSize.getHeight();

    this.setSize((int)(height * 2.0/3),(int)(height * 2.0/3));
    this.setVisible(true);
    this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE );
    Q1Panel panel = new Q1Panel();
    this.add(panel);

  }

}

class Q1Panel extends JPanel{
  Color VIOLET = new Color( 128, 0, 128 );
  Color INDIGO = new Color( 75, 0, 130 );
  Color colors[] = {VIOLET, INDIGO, Color.BLUE, Color.GREEN, Color.YELLOW, Color.ORANGE, Color.RED, Color.WHITE };

  public void paintComponent(Graphics g){

    int increment = getWidth()/32;

    for(int x = 0; x < colors.length; x++){
      g.setColor(colors[x]);
      g.fillArc(x * increment, x * increment + getHeight()/2, getWidth() - 2 * x * increment, getHeight() - x*increment, 0, 180);
    }
  }

}
