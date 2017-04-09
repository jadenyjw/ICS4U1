import java.awt.*;
import javax.swing.*;


public class Q1 extends JFrame{
  public Q1(){

    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    double height = screenSize.getHeight();

    this.setSize((int)(height * 2.0/3),(int)(height * 2.0/3));

    this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE );
    Q1Panel panel = new Q1Panel();
    this.add(panel);
    this.setVisible(true);

  }

}

class Q1Panel extends JPanel{

  ImageIcon image = new ImageIcon("Image.png");
  JLabel label = new JLabel("", image, JLabel.CENTER);
  JPanel panel = new JPanel(new FlowLayout());
  JPanel grid = new JPanel(new GridLayout(2, 1));

  public Q1Panel(){
    this.setLayout(new BorderLayout());
    JTextField text = new JTextField("Java GUI is so hard.");
    text.setPreferredSize(new Dimension(200, 20));
    panel.add(text);
    panel.add(new JButton("Java GUI is so hard."));
    panel.add(new JButton("Java GUI is so hard."));
    panel.add(new JButton("Java GUI is so hard."));
    grid.add(new JLabel("Test."));
    grid.add(new JLabel("Test."));
    grid.add(new JLabel("Test."));
    grid.add(new JLabel("Test."));
    this.add(label, BorderLayout.NORTH);
    this.add(panel, BorderLayout.CENTER);
    this.add(grid, BorderLayout.SOUTH);
  }

  public void paintComponent(Graphics g){
    super.paintComponent(g);

  }


}
