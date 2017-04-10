import javax.swing.*;
import java.awt.*;

public class JDemo{
  public static void main(String[] args){
    JFrame frame = new JFrame();
    frame.setSize(1000, 1000);
    frame.setVisible(true);
    JPanel panel = new JPanel();
    frame.add(panel);
    JLabel label = new JLabel("Hello.");
    panel.add(label);
    JTextField textfield = new JTextField();
    panel.add(textfield);

  }
}
