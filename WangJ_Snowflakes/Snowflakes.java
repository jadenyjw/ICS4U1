import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;


public class Snowflakes extends JFrame{
  public Snowflakes(){


    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    double height = screenSize.getHeight();
    double width = screenSize.getWidth();
    this.setSize((int)(height * 2.0/3),(int)(height * 2.0/3));
    this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE );
    SnowPanel panel = new SnowPanel( (int)(height * 2.0/3) , (int)(width * 2.0/3));
    this.add(panel);
    this.setVisible(true);
  }

  public static void main(String[] args){
    new Snowflakes();
  }
}



class SnowPanel extends JPanel implements ActionListener{

  ArrayList<Snowflake> snowflakes = new ArrayList<Snowflake>();
  Random random;
  Tree tree = new Tree();

  public SnowPanel(int height, int width){
    random = new Random();
    Timer timer = new Timer(20, this);
    timer.start();
    setBackground(Color.BLACK);

    for(int x = 0; x < random.nextInt(10) + 2; x++){
        snowflakes.add(new Snowflake(60, 6, random.nextInt(width), random.nextInt(height)));
    }
  }

  public void actionPerformed(ActionEvent e){
    for(int x = 0; x < snowflakes.size(); x++){
      Snowflake snowflake = snowflakes.get(x);
      snowflake.moveFlake();
    }
    repaint();

  }

  public void paintComponent(Graphics g){
    super.paintComponent(g);
    g.setColor(Color.BLUE);
    tree.drawRoot(g, this.getHeight() / 4, this.getWidth() / 2, this.getHeight());
    tree.drawTree(g, this.getHeight() / 4, this.getWidth() / 2, this.getHeight() - this.getHeight() / 4, 90);
    for(int x = 0; x < snowflakes.size(); x++){
      Snowflake snowflake = snowflakes.get(x);
      if(snowflake.y > this.getHeight() + snowflake.len){
        snowflakes.remove(snowflake);
        snowflakes.add(new Snowflake(60, 6, random.nextInt(this.getWidth()), 0));
      }
      else{
         snowflake.drawFlake(g, snowflake.len, snowflake.x, snowflake.y);
      }

      }
    }


}

class Snowflake{
  int x, y, sticks, len, angle;
  Color colour;
  static Random random = new Random();

  public Snowflake(int len, int sticks, int x, int y){
    this.x = x;
    this.y = y;
    this.sticks = sticks;
    this.len = len;
    colour = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
  }

  public void drawFlake(Graphics g, int len, int x, int y){
    g.setColor(colour);
    if(len <= 6){
      return;
    }
    for(int i = 0; i < sticks; i++){
      int xEnd = (int)(x + len*Math.cos(Math.toRadians((360/sticks) * i + angle)));
      int yEnd = (int) (y - len*Math.sin(Math.toRadians((360/sticks) * i + angle)));
      g.drawLine(x, y, xEnd, yEnd);
      drawFlake(g, len/3, xEnd, yEnd);
    }
  }

  public void moveFlake(){
    this.y = this.y + 2;
    this.angle = this.angle + 1;
  }
}

class Tree{
  int x, y;

  public void drawTree(Graphics g, int len, int x, int y, int angle){
    if (len <= 1){
      return;
    }
    else{

      len = (int) (len * 0.7);
      int endX = (int)(x + len*Math.cos(Math.toRadians(angle + 30)));
      int endY = (int)(y - len*Math.sin(Math.toRadians(angle + 30)));
      g.drawLine(x, y, endX, endY);
      drawTree(g, len, endX, endY, angle + 30);
      endX = (int)(x + len*Math.cos(Math.toRadians(angle - 15)));
      endY = (int)(y - len*Math.sin(Math.toRadians(angle - 15)));
      g.drawLine(x, y, endX, endY);
      drawTree(g, len, endX, endY, angle - 15);

    }
  }

  public void drawRoot(Graphics g, int len, int x, int y){
    g.drawLine(x, y, x, y - len);
  }
}