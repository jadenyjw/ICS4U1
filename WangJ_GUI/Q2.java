import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.event.*;
import java.util.Random;

public class Q2 extends JFrame implements ActionListener{

  private Timer timer;
  public Q2(){

    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    double height = screenSize.getHeight();

    timer = new Timer(100,this);
    timer.start();

    this.setSize((int)(height * 2.0/3),(int)(height * 2.0/3));
    this.setVisible(true);
    this.setDefaultCloseOperation ( WindowConstants.EXIT_ON_CLOSE );
    Q2Panel panel = new Q2Panel();
    this.add(panel);
  }

  public void actionPerformed( ActionEvent e ){         // is called every interval
	   repaint();
   }
}



class Q2Panel extends JPanel{

  public void paintComponent (Graphics g){

    int width = getWidth();
    int height = getHeight();

    Random random = new Random();

    int a = random.nextInt(256);
    int b = random.nextInt(256);
    int c = random.nextInt(256);

    Color color = new Color(a, b, c);

    g.setColor(color);
    g.fillRect( 0, 0, width, height);

    g.setColor(Color.black);
    for(int x = 0; x < height; x+= height/50){
      g.drawLine(0, x, x, height);
      g.drawLine(width, x, width - x, height);
      g.drawLine(0, height - x, x, 0);
      g.drawLine(width, height -x , width - x, 0);
    }


  }


}
