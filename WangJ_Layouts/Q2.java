import java.awt.*;
import javax.swing.*;


public class Q2 extends JFrame{
  public Q2(){

    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    double height = screenSize.getHeight();

    this.setSize((int)(height * 2.0/3),(int)(height * 2.0/3));
    this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE );
    Q2Panel panel = new Q2Panel();
    this.add(panel);
    this.setVisible(true);

  }

}

class Q2Panel extends JPanel{

  JPanel p1 = new JPanel(new GridLayout(10, 10));
  JPanel p2 = new JPanel(new GridLayout(10, 10));
  JPanel p3 = new JPanel(new GridLayout(10, 10));
  JPanel text = new JPanel(new BorderLayout());

  public Q2Panel(){
    this.setLayout(new GridLayout(2,2));
    p1.setBorder(BorderFactory.createEmptyBorder(2,2,2,2));
    for (int i =0; i<(10*10); i++){
        final JLabel label = new JLabel("Label");
        label.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        p1.add(label);
    }

    p2.setBorder(BorderFactory.createEmptyBorder(2,2,2,2));
    for (int i =0; i<(10*10); i++){
        final JLabel label = new JLabel("Label");
        label.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        p2.add(label);
    }

    p3.setBorder(BorderFactory.createEmptyBorder(2,2,2,2));
    for (int i =0; i<(10*10); i++){
        final JLabel label = new JLabel("Label");
        label.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        p3.add(label);
    }


    this.add(p1);
    JPanel flow = new JPanel(new FlowLayout());
    flow.add(new JButton("Button"));
    text.add(flow, BorderLayout.SOUTH);
    this.add(text);
    this.add(p2);
    this.add(p3);

  }
  public void paintComponent(Graphics g){

  }

}
