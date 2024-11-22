import java.awt.Color;
import javax.swing.JPanel;

//Separate classes in 2 java files
//CircleDrawerAdapter extends MouseAdapter 

public class CircleDrawerExample2 extends JPanel {

  public CircleDrawerExample2() {
    addMouseListener(new CircleDrawerAdapter());
  }

}
