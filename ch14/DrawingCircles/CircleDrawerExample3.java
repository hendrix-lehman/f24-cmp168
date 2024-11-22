
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;

public class CircleDrawerExample3 extends JPanel {

  public CircleDrawerExample3() {
    addMouseListener(new CircleDrawerAdapter());
  }

  // named inner class
  private class CircleDrawerAdapter extends MouseAdapter {
    private Color shapeColor = Color.BLUE;
    private int drawingSize = 20;
    private int lastX = 0, lastY = 0;
    private int x, y = 0;

    public void mousePressed(MouseEvent e) {
      lastX = e.getX();
      lastY = e.getY();
      Graphics g = e.getComponent().getGraphics();
      Graphics2D g2d = (Graphics2D) g;
      g2d.setColor(shapeColor);
      g2d.fillOval(lastX - drawingSize, lastY - drawingSize,
          2 * drawingSize, 2 * drawingSize);
    }
  }
}
