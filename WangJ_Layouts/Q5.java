import java.awt.*;
import javax.swing.*;


public class Q5 extends JFrame{
  public Q5(){

    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    double height = screenSize.getHeight();

    this.setSize((int)(height * 2.0/3),(int)(height * 2.0/3));
    this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE );
    Q5Panel panel = new Q5Panel();
    this.add(panel);
    this.setVisible(true);

  }

}

class Q5Panel extends JPanel{

  ImageIcon image = new ImageIcon("Image.png");
  JLabel label = new JLabel("", image, JLabel.CENTER);

  public Q5Panel(){

    this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    this.add(Box.createRigidArea(new Dimension(10, 55)));// space at the top
    label.setAlignmentX(Component.CENTER_ALIGNMENT);
    this.add(label);
    this.add(Box.createRigidArea(new Dimension(5, 15)));
    for (int i=0; i <= 5; i++) {
      JButton button = new JButton("Button  " + i);
  	  button.setAlignmentX(Component.CENTER_ALIGNMENT);
      this.add(button);
  	  this.add(Box.createRigidArea(new Dimension(5, 15)));// space between buttons
    }
  }
  public void paintComponent(Graphics g){

  }

}
