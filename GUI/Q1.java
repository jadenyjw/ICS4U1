import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;
public class Q1 extends JFrame{


  Color VIOLET = new Color( 128, 0, 128 );
  Color INDIGO = new Color( 75, 0, 130 );
  Color colors[] = { Color.WHITE, Color.WHITE, VIOLET, INDIGO, Color.BLUE, Color.GREEN, Color.YELLOW, Color.ORANGE, Color.RED };

  public Q1(){

    this.setSize(500,500);
    this.setVisible(true);
    this.setDefaultCloseOperation ( WindowConstants.EXIT_ON_CLOSE );

  }


  public void paint (Graphics g){
    super.paint(g);
    int width = this.getWidth();
    int height = this.getHeight();
    System.out.println(width);
    for(int x = 0; x < colors.length; x++){
      g.setColor(colors[x]);
      System.out.println(colors[x]);
      g.fillArc(0, 0 + 10*x, width + 5*x, height + 5*x, 0, 180 );
    }
  }

}
