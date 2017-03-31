import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;


public class Q1 extends JFrame{
  public Q1(){

    this.setSize(500,500);
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
    int centerX = getWidth() / 2;
    int increment = getWidth()/32;

    for(int x = 0; x < colors.length; x++){
      g.setColor(colors[x]);
      g.fillArc(x * increment, x * increment + getHeight()/2, getWidth() - 2 * x * increment, getHeight() - x*increment, 0, 180);
    }
  }

}
