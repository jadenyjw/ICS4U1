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


  ImageIcon image = new ImageIcon("Image.png");
  JLabel label = new JLabel("", image, JLabel.CENTER);
  JPanel p1 = new JPanel(new GridLayout(6, 1));
  public Q3Panel(){
    this.setLayout(new BorderLayout());

    this.add(label, BorderLayout.SOUTH);
    p1.add(new JPanel());
    p1.add(new JPanel());
    JPanel p2 = new JPanel(new FlowLayout());
    JPanel p3 = new JPanel(new FlowLayout());

    p2.add(new JButton("Test Button."));
    p3.add(new JButton("Test Button."));
    p1.add(p2);
    p1.add(p3);

    this.add(p1, BorderLayout.EAST);

  }
  public void paintComponent(Graphics g){
    super.paintComponent(g);
  }

}
