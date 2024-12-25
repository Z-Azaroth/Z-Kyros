
// Simple Gui made by Zae-Azaroth-
// Java imports
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

// Main Method
public class gui {
  public static void main(String[] args) {
    // Variables
    JFrame frame = new JFrame("MainEditor");
    JLabel label = new JLabel("ButtonNotActivated");
    JButton button = new JButton("Save Files");

    // Frame Config
    frame.setSize(1080, 680); // Sets the size of pixels in width, height
    frame.setDefaultCloseOperation(
        JFrame.EXIT_ON_CLOSE); // Closes the program whenever you close the
                               // window.
    frame.setLayout(null);
    frame.setResizable(true);

    // Label Config
    label.setBounds(15, -50, 300, 300);

    // Button Config
    button.setBounds(150, 150, 150, 30);
    button.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        label.setText("Saving Files");
      }
    });
    // Adding to the frame
    frame.add(button);
    frame.add(label);

    // Activating the frame
    frame.setVisible(true);
  }
}
