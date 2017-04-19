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
import java.util.ArrayList;
import java.util.Random;



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

  private Timer timer;
  LinesPanel lines = new LinesPanel();
  ButtonPanel buttons = new ButtonPanel();
  public PaintPanel(){
    timer = new Timer(5,this);
    timer.start();
    this.setLayout(new BorderLayout());
    this.add(lines, BorderLayout.CENTER);
    buttons.draw.addActionListener(this);
    buttons.exit.addActionListener(this);
    this.add(buttons, BorderLayout.SOUTH);

  }

  public void actionPerformed(ActionEvent e){

    if(e.getSource() == timer){
      lines.repaint();
    }

    else if(e.getActionCommand().equals("Draw")){
      lines.drawing=true;
      lines.repaint();
    }
    else if(e.getActionCommand().equals("Exit")){
      System.exit(0);
    }

  }


}

class LinesPanel extends JPanel{

  public boolean drawing = false;
  ArrayList<Line> lines = new ArrayList<Line>();
  public LinesPanel(){
    int height = this.getHeight();
    int width = this.getWidth();
    for(int x = 0; x < 50; x++){
      for(int y = 0; y < 50; y++){
        lines.add(new Line(x*20, y*20));

      }
    }
  }

  public void paintComponent(Graphics g){
    super.paintComponent(g);
    if(drawing){
      for(int x = 0; x < lines.size(); x++){
        lines.get(x).rotate();
        lines.get(x).draw(g);
      }
    }

  }


}

class Line{

  int x1, x2, y1, y2, angle;
  final int length = 20;

  public Line(int x1, int y1){
    Random random = new Random();
    this.x1 = x1;
    this.x2 = (int)(x1 + length*Math.sin(Math.toRadians(angle)));
    this.y1 = y1;
    this.y2 = (int) (y1 + length*Math.cos(Math.toRadians(angle)));
    this.angle = random.nextInt(360);

  }

  void draw(Graphics g){
    g.drawLine(x1, y1, x2, y2);
  }

  void rotate(){
    if(angle == 360){
      angle = 0;
    }
    else{
      angle++;
    }
    this.x2 = (int)(x1 + length*Math.sin(Math.toRadians(angle)));
    this.y2 = (int) (y1 + length*Math.cos(Math.toRadians(angle)));
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
