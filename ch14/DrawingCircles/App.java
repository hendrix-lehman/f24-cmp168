import javax.swing.JFrame;

class App {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Circle Drawer Example 1");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 400);
    // frame.add(new CircleDrawerExample1());
    // frame.add(new CircleDrawerExample2());
    // frame.add(new CircleDrawerExample3());
    frame.add(new CircleDrawerExample4());
    frame.setVisible(true);
  }
}
