import java.awt.Color;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.Dimension;
import javax.swing.*;


public class Q6 extends JFrame{
  public Q6(){

    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    double height = screenSize.getHeight();

    this.setSize((int)(height * 2.0/3),(int)(height * 2.0/3));
    this.setVisible(true);
    this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE );
    Q6Panel panel = new Q6Panel();
    this.add(panel);

  }

}

class Q6Panel extends JPanel{

    
  public void paintComponent(Graphics g){


  }

}
