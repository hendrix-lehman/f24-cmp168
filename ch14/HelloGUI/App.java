import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JPanel;

class App {

  public static void main(String[] args) {
    HelloFrame frame = new HelloFrame();

    JPanel panel = new JPanel();
    // add a button to the frame
    JButton button = new JButton("Click me!");

    button.addActionListener(event -> {
      
      System.out.println("Button clicked! " + event.getActionCommand());
    });
    panel.add(button);



    frame.add(panel, BorderLayout.CENTER);

    frame.setVisible(true);
  }
}
