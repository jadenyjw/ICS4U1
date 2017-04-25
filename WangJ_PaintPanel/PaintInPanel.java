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

    setSize((int)(height * 2.0/3),(int)(height * 2.0/3));
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE );
    PaintPanel panel = new PaintPanel();
    add(panel);
    setVisible(true);
  }
  public static void main(String[] args){
    new PaintInPanel();
  }

}

class PaintPanel extends JPanel implements ActionListener{

  LinesPanel lines = new LinesPanel();
  ButtonPanel buttons = new ButtonPanel();
  public PaintPanel(){
    new Timer(1,this).start();
    setLayout(new BorderLayout());
    buttons.draw.addActionListener(this);
    buttons.exit.addActionListener(this);
    add(buttons, BorderLayout.SOUTH);
    add(lines, BorderLayout.CENTER);
  }

  public void actionPerformed(ActionEvent e){

    if(e.getSource() instanceof Timer){
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

class LinesPanel extends JPanel implements MouseMotionListener, MouseListener{

  public boolean drawing = false;
  public boolean rotating = true;

  ArrayList<Line> lines = new ArrayList<Line>();
  public LinesPanel(){
    addMouseMotionListener(this);
    addMouseListener(this);
    for(int x = 0; x < 50; x++){
      for(int y = 0; y < 50; y++){
        lines.add(new Line(x*20, y*20));
      }
    }
  }

  public void mouseDragged(MouseEvent e){
    int mouseY = e.getY();
    int mouseX = e.getX();
    for(int x = 0; x < lines.size(); x++){
        lines.get(x).point(mouseX, mouseY);
    }
  }

  public void mouseMoved(MouseEvent e){
    int mouseY = e.getY();
    int mouseX = e.getX();
    for(int x = 0; x < lines.size(); x++){
        lines.get(x).point(mouseX, mouseY);
    }

  }

  public void mouseExited(MouseEvent e){
    rotating = true;
  }

  public void mouseEntered(MouseEvent e){
    rotating = false;
  }

  public void mouseReleased(MouseEvent e){

  }

  public void mousePressed(MouseEvent e){
    Line.color = new Color(Line.random.nextInt(255), Line.random.nextInt(255), Line.random.nextInt(255));
  }

  public void mouseClicked(MouseEvent e){

  }


  public void paintComponent(Graphics g){
    super.paintComponent(g);
    if(drawing){
      for(int x = 0; x < lines.size(); x++){
        if(rotating){
          lines.get(x).rotate();
        }
        lines.get(x).draw(g);
      }
    }

  }


}

class Line{

  public int x1, x2, y1, y2;
  public double angle;
  public final int length = 20;
  static Random random = new Random();
  static Color color = new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));;

  public Line(int x1, int y1){

    this.x1 = x1;
    this.x2 = (int)(x1 + length*Math.cos(Math.toRadians(angle)));
    this.y1 = y1;
    this.y2 = (int) (y1 + length*Math.sin(Math.toRadians(angle)));
    angle = random.nextInt(360);

  }

  void draw(Graphics g){
    g.setColor(color);
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

  void point(int x, int y){
    angle = Math.atan2(y1 - y, x1 - x);

    this.x2 = (int)(x1 + length*Math.cos(angle));
    this.y2 = (int) (y1 + length*Math.sin(angle));
  }


}
class ButtonPanel extends JPanel{

  public JButton draw = new JButton("Draw");
  public JButton exit = new JButton("Exit");
  public ButtonPanel(){
    setLayout(new FlowLayout());
    add(draw);
    add(exit);
  }

}
