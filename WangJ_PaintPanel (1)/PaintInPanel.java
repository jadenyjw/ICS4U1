/*************************************************************
Name: Jaden Wang
Course: ICS4U1
Date: April 18, 2017
Teacher: Ms. Strelkovska
Assignment: Paint in Panel
*************************************************************/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


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

class PaintPanel extends JPanel implements ActionListener{

  CirclesPanel circles = new CirclesPanel();
  ButtonPanel buttons = new ButtonPanel();
  public PaintPanel(){
    this.setLayout(new BorderLayout());
    this.add(circles, BorderLayout.CENTER);
    buttons.draw.addActionListener(this);
    buttons.exit.addActionListener(this);
    this.add(buttons, BorderLayout.SOUTH);
  }

  public void actionPerformed(ActionEvent e){
    if(e.getActionCommand().equals("Draw")){
      circles.drawing=true;
      circles.repaint();
    }
    else{
      System.exit(0);
    }
  }


}

class CirclesPanel extends JPanel{

  public boolean drawing = false;

  public CirclesPanel(){

  }

  public void paintComponent(Graphics g){
    super.paintComponent(g);

    if(drawing){
      int height = this.getHeight();
      int width = this.getWidth();

      for(int x = 0; x < width/50; x++){
        for(int y = 0; y < height/50; y++){
          g.fillOval(x*50, y*50, 30, 30);
        }
      }
    }

  }


}
class ButtonPanel extends JPanel{

  public JButton draw = new JButton("Draw");
  public JButton exit = new JButton("Exit");
  public ButtonPanel(){
    this.setLayout(new FlowLayout());
    this.add(draw);
    this.add(exit);
  }

}
