import javax.swing.*;
import java.awt.*;

public class PaintInPanel extends JFrame{

  public PaintInPanel(){
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    double height = screenSize.getHeight();

    this.setSize((int)(height * 2.0/3),(int)(height * 2.0/3));
    this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE );
    PaintPanel panel = new PaintPanel();
    this.add(panel);
    this.setVisible(true);
  }
  public static void main(String[] args){
    new PaintInPanel();
  }

}

class PaintPanel extends JPanel{

  public PaintPanel(){
    this.setLayout(new BorderLayout());
    this.add(new CirclesPanel(), BorderLayout.CENTER);
    this.add(new ButtonPanel(), BorderLayout.SOUTH);
  }

}

class CirclesPanel extends JPanel{

  public CirclesPanel(){

  }

  public void paintComponent(Graphics g){
    int height = this.getHeight();
    int width = this.getWidth();

    for(int x = 0; x < width/50; x++){
      for(int y = 0; y < height/50; y++){
        g.fillOval(x*50, y*50, 30, 30);
      }
    }
  }


}
class ButtonPanel extends JPanel{
  public ButtonPanel(){
    this.setLayout(new FlowLayout());
    this.add(new JButton("Draw"));
    this.add(new JButton("Exit"));
  }

}
