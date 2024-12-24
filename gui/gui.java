
// Simple Gui made by Zae-Azaroth-
// Java imports
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

// Main Method
public class gui {
  public static void main(String[] args) {
    JFrame frame = new JFrame("MainEditor");
    frame.setSize(420, 420); // Sets the size of pixels in width, height
    frame.setDefaultCloseOperation(
        JFrame.EXIT_ON_CLOSE); // Closes the program whenever you close the
                               // window.
    frame.setLayout(null);
    frame.setResizable(false);
    JLabel label = new JLabel("ButtonNotActivated");
    label.setBounds(15, 15, 300, 300);
    JButton button = new JButton("Save");
    button.setBounds(150, 150, 150, 30);
    frame.add(button);
    button.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        label.setText("Saving your files");
      }
    });

    frame.add(label);
    label.setFont(new Font("Verdana", Font.BOLD, 15)); // Font
    frame.setVisible(true);
  }
}
