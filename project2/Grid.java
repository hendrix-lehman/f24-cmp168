import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class Grid {

  private int[][] grid;

  private int[][] countGrid;

  private void createGrid() {
    int rows = 3;
    int cols = 3;
    int count = 0;

    grid = new int[rows][cols];

    // fill the grid with 0s and 1s. There should be at least 3 1s in the grid
    // and the rest should be 0s

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {

        // main logic to fill the grid with 0s and 1s goes here

        // [ 0] [0 ] [0 ]
        // [ 1] [1 ] [0 ]
        // [ 0] [0 ] [1 ]

        // select a random number between 0 and 1
        int random = (int) (Math.random() * 2);

        // if the random number is 1 and the count is less than 3
        // then fill the grid with 1
        if (random == 1 && count < 3) {
          grid[i][j] = 1;
          count++;
        } else {
          grid[i][j] = 0;
        }
      }
    }
  }

  /**
   * This method creates a two-dimensional array called countGrid which will
   * store the number of 1s in the current cell and its neighbours
   *
   * if the grid two-dimensional array is as follows:
   * [ 0] [0 ] [0 ]
   * [ 1] [1 ] [0 ]
   * [ 0] [0 ] [1 ]
   * 
   * then the countGrid two-dimensional array should be as follows:
   * [ 2] [2 ] [1 ]
   * [ 2] [3 ] [2 ]
   * [ 2] [3 ] [2 ]
   */
  private void createCountGrid() {
    int rows = 3;
    int cols = 3;

    countGrid = new int[rows][cols];

    // loop through the grid
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[i].length; j++) {
        int count = 0;

        // if the current cell is 1 then increment the count
        if (grid[i][j] == 1) {
          count++;
        }
        // i is the row and j is the column
        count += getNeighbours(i, j);

        countGrid[i][j] = count;
      }
    }
  }

  /**
   * This method returns the number of neighbours of the current cell
   * 
   * @param row
   * @param col
   * @return the number of neighbours of the current cell
   */
  private int getNeighbours(int row, int col) {
    int neighbours = 0;

    // let's check the cell directly above the current cell
    if (row - 1 >= 0) {
      if (grid[row - 1][col] == 1) {
        neighbours++;
      }
    }

    // let's check the cell above and to the left of the current cell
    if (row - 1 >= 0 && col - 1 >= 0) {
      if (grid[row - 1][col - 1] == 1) {
        neighbours++;
      }
    }

    // let's check the cell above and to the right of the current cell
    if (row - 1 >= 0 && col + 1 < grid[row].length) {
      if (grid[row - 1][col + 1] == 1) {
        neighbours++;
      }
    }

    // let's check the cell directly to the left of the current cell
    if (col - 1 >= 0) {
      if (grid[row][col - 1] == 1) {
        neighbours++;
      }
    }

    // let's check the cell directly to the right of the current cell
    if (col + 1 < grid[row].length) {
      if (grid[row][col + 1] == 1) {
        neighbours++;
      }
    }

    // let's check the cell directly below the current cell
    if (row + 1 < grid.length) {
      if (grid[row + 1][col] == 1) {
        neighbours++;
      }
    }

    // let's check the cell below and to the left of the current cell
    if (row + 1 < grid.length && col - 1 >= 0) {
      if (grid[row + 1][col - 1] == 1) {
        neighbours++;
      }
    }

    // let's check the cell below and to the right of the current cell
    if (row + 1 < grid.length && col + 1 < grid[row].length) {
      if (grid[row + 1][col + 1] == 1) {
        neighbours++;
      }
    }

    return neighbours;
  }

  public class ButtonActionListener implements ActionListener {
    private int row;
    private int col;
    private int[][] grid;

    public ButtonActionListener(int[][] grid, int row, int col) {
      this.grid = grid;
      this.row = row;
      this.col = col;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      JButton button = (JButton) e.getSource();
      if (grid[row][col] == 1) {
        button.setText("Bomb");
      } else {
        button.setText("No");
      }
    }
  }

  public static void main(String[] args) {

    Grid g = new Grid();
    g.createGrid();

    for (int i = 0; i < g.grid.length; i++) {
      for (int j = 0; j < g.grid[i].length; j++) {
        System.out.print(g.grid[i][j] + " ");
      }
      System.out.println();
    }

    System.out.println();

    g.createCountGrid();

    for (int i = 0; i < g.countGrid.length; i++) {
      for (int j = 0; j < g.countGrid[i].length; j++) {
        System.out.print(g.countGrid[i][j] + " ");
      }
      System.out.println();
    }

    JFrame frame = new JFrame();
    JPanel board = new JPanel();
    board.setLayout(new GridLayout(3, 3));
    for (int i = 0; i < g.grid.length; i++) { // rows
      for (int j = 0; j < g.grid[i].length; j++) { // columns
        JButton button = new JButton();

        button.setFont(button.getFont().deriveFont(24.0f));
        // button.setText(g.countGrid[i][j] + "");
        button.addActionListener(g.new ButtonActionListener(g.grid, i, j));
        board.add(button);

      }
    }
    frame.add(board);

    // at this point, there are 3 2-dimensional arrays.
    // The first one is the grid with 1s and 0s
    // The second one is the countGrid with the number of 1s in the current cell and
    // its neighbours
    // The third one is the board which is a JPanel with 9 JButtons

    frame.setSize(300, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);

  }
}
