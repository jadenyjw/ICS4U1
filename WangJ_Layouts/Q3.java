import java.awt.*;
import javax.swing.*;


public class Q3 extends JFrame{
  public Q3(){

    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    double height = screenSize.getHeight();

    this.setSize((int)(height * 2.0/3),(int)(height * 2.0/3));
    this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE );
    Q3Panel panel = new Q3Panel();
    this.add(panel);
    this.setVisible(true);
  }

}

class Q3Panel extends JPanel{

  JPanel p1 = new JPanel();
  JPanel p2 = new JPanel();
  ImageIcon image = new ImageIcon("Image.png");
  JLabel label = new JLabel("", image, JLabel.CENTER);

  public Q3Panel(){
    this.setLayout(new BorderLayout());

    JLabel l1 = new JLabel("Testing");
    l1.setVerticalAlignment(JLabel.CENTER);
    l1.setHorizontalAlignment(JLabel.CENTER);
    p1.add(l1);
    p2.add(new JLabel("Testing", JLabel.CENTER));


    this.add(p1, BorderLayout.EAST);
    this.add(p2, BorderLayout.SOUTH);
    this.add(label, BorderLayout.CENTER);
  }
  public void paintComponent(Graphics g){
    super.paintComponent(g);
  }

}
