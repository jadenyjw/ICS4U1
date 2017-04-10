import java.awt.*;
import javax.swing.*;


public class Q4 extends JFrame{
  public Q4(){

    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    double height = screenSize.getHeight();

    this.setSize((int)(height * 2.0/3),(int)(height * 2.0/3));
    this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE );
    Q4Panel panel = new Q4Panel();
    this.add(panel);
    this.setVisible(true);

  }

}

class Q4Panel extends JPanel{

  JButton b1 = new JButton("Text1");
  JButton b2 = new JButton("Text2");
  JButton b3 = new JButton("Text3");
  JPanel buttons = new JPanel(new GridLayout(1,3));
  JPanel grid = new JPanel(new GridLayout(4, 4));
  JPanel lay = new JPanel(new FlowLayout());
  JPanel p2 = new JPanel(new GridLayout(1,1));
  public Q4Panel(){
    this.setLayout(new BorderLayout());


    buttons.add(b1);
    buttons.add(b2);
    buttons.add(b3);

    this.add(buttons, BorderLayout.SOUTH);

    grid.setBorder(BorderFactory.createEmptyBorder(2,2,2,2));
    for (int i =0; i<(4*4); i++){
        final JLabel label = new JLabel("Labelgghdfgdfgdgfdgfdfgdfgdgfdgfdgfdgfdgfvc");
        label.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        grid.add(label);
    }
    //lay.setPreferredSize(new Dimension(2000, 2000));
    //lay.add(grid);
    p2.add(grid);
    this.add(p2, BorderLayout.CENTER);

    this.add(new JLabel("Text"), BorderLayout.NORTH);
  }

  public void paintComponent(Graphics g){


  }

}
