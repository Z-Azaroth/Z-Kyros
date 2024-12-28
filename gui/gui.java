
import java.awt.*;
import java.awt.ActiveEvent;
import javax.swing.*;

public class gui {
  public static void main(String[] args) {

    // Variables
    JFrame frame = new JFrame();
    String version = "1.0.0";
    ImageIcon image = new ImageIcon("./assets/Icon.png");
    JLabel title = new JLabel("Kryos");
    JButton file = new JButton("File");
    JButton prefrences = new JButton("Prefrences");
    JButton debug = new JButton("Debug");
    // Classes ( not working on yet)

    // Frame Configuration
    frame.setTitle("Kyros " + version);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(1080, 600);
    frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
    frame.setIconImage(image.getImage());
    frame.getContentPane().setBackground(new Color(22, 34, 49));
    // Label Configuration
    title.setFont(new Font("Verdana", Font.BOLD, 12));
    title.setBounds(0, 90, 90, 90);
    title.setBackground(Color.WHITE);
    // Add the components to the frame
    frame.add(title);

    // Set the frame as Visible !DO LAST!
    frame.setVisible(true);
  }
}
