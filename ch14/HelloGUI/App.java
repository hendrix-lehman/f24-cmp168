import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.GridLayout;

class App {

  public static void main(String[] args) {

    // FlowLayout
    // GridLayout
    // BorderLayout

    App app = new App();
    System.out.println(app);

    HelloFrame frame = new HelloFrame();

    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(3, 3));

    for (int i = 0; i < 9; i++) {
      JButton button = new JButton("Button " + i);
      button.addActionListener(event -> {
        // System.out.println("Button clicked! " + event.getActionCommand());
        button.setText("Clicked!");
      });
      panel.add(button);
    }

    frame.add(panel, BorderLayout.CENTER);

    frame.setVisible(true);
  }
}
