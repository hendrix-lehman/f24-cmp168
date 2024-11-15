import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.GridLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe extends JFrame implements BoardGameInterface {

  private char[][] ttt;
  private char currPlayer;
  public static final int NUM_ROWS = 3;
  public static final int NUM_COLS = 3;

  private JPanel board;

  public static enum Player {
    PLAYER_X('X'), PLAYER_O('O');

    private char player;

    Player(char player) {
      this.player = player;
    }

    public char getPlayer() {
      return player;
    }
  }

  public TicTacToe() {
    // set up the JFrame
    setTitle("Tic Tac Toe");
    setSize(600, 600);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // set up the 2D array which is the game board representation
    ttt = new char[NUM_ROWS][NUM_COLS];
    populateBoard();

    // set up the game board using a JPanel
    board = new JPanel();
    board.setLayout(new GridLayout(3, 3));
    layoutBoard();

    // set the current player
    setCurrPlayer(Player.PLAYER_X);

    // add the game board to the JFrame
    add(board);
  }

  private class ButtonActionListener implements ActionListener {

    private int rowIndex;
    private int colIndex;

    // constructor
    public ButtonActionListener(int rowIndex, int colIndex) {
      this.rowIndex = rowIndex;
      this.colIndex = colIndex;
    }

    // This method is called when a button is clicked
    @Override
    public void actionPerformed(ActionEvent e) {
      JButton button = (JButton) e.getSource();
      if (button.getText().equals("")) {
        button.setText(String.valueOf(currPlayer));
        placeMarker(rowIndex, colIndex);
        if (isWinner()) {
          JOptionPane.showMessageDialog(null, "Player " + currPlayer + " wins!");
          clearAllButtons();
          clearBoard();
        } else if (isDraw()) {
          JOptionPane.showMessageDialog(null, "It's a draw!");
          clearAllButtons();
          clearBoard();
        } else {
          changeTurn();
        }
      }
    }
  }

  private void layoutBoard() {
    for (int i = 0; i < NUM_ROWS; i++) {
      for (int j = 0; j < NUM_COLS; j++) {
        JButton button = new JButton();
        button.setFont(button.getFont().deriveFont(50.0f));
        button.addActionListener(new ButtonActionListener(i, j));
        board.add(button);
      }
    }
  }

  private void clearAllButtons() {
    for (Component c : board.getComponents()) {
      JButton button = (JButton) c;
      button.setText("");
    }
  }

  @Override
  public void populateBoard() {
    for (int i = 0; i < NUM_ROWS; i++) {
      for (int j = 0; j < NUM_COLS; j++) {
        ttt[i][j] = EMPTY_CELL;
      }
    }
  }

  private void setCurrPlayer(Player player) {
    currPlayer = player.getPlayer();
  }

  @Override
  public void clearBoard() {
    for (int i = 0; i < NUM_ROWS; i++) {
      for (int j = 0; j < NUM_COLS; j++) {
        ttt[i][j] = EMPTY_CELL;
      }
    }
  }

  @Override
  public void placeMarker(int rowIndex, int colIndex) {
    ttt[rowIndex][colIndex] = currPlayer;
  }

  /**
   * [0,0] [0,1] [0,2]
   * [1,0] [1,1] [1,2]
   * [2,0] [2,1] [2,2]
   */
  @Override
  public boolean isWinner() {
    // check rows horizontally
    for (int i = 0; i < NUM_ROWS; i++) {
      if (ttt[i][0] == currPlayer && ttt[i][1] == currPlayer && ttt[i][2] == currPlayer) {
        return true;
      }
    }
    // check rows vertically
    for (int i = 0; i < NUM_COLS; i++) {
      if (ttt[0][i] == currPlayer && ttt[1][i] == currPlayer && ttt[2][i] == currPlayer) {
        return true;
      }
    }
    // check diagonals
    if (ttt[0][0] == currPlayer && ttt[1][1] == currPlayer && ttt[2][2] == currPlayer) {
      return true;
    }
    if (ttt[0][2] == currPlayer && ttt[1][1] == currPlayer && ttt[2][0] == currPlayer) {
      return true;
    }
    return false;
  }

  @Override
  public boolean isDraw() {
    if (isFull() && !isWinner()) {
      return true;
    }
    return false;
  }

  @Override
  public boolean isEmpty() {
    for (int i = 0; i < NUM_ROWS; i++) {
      for (int j = 0; j < NUM_COLS; j++) {
        if (ttt[i][j] != EMPTY_CELL) {
          return false;
        }
      }
    }
    return true;
  }

  @Override
  public boolean isFull() {
    for (int i = 0; i < NUM_ROWS; i++) {
      for (int j = 0; j < NUM_COLS; j++) {
        if (ttt[i][j] == EMPTY_CELL) {
          return false;
        }
      }
    }
    return true;
  }

  @Override
  public void changeTurn() {
    if (currPlayer == PLAYER_X) {
      currPlayer = PLAYER_O;
    } else {
      currPlayer = PLAYER_X;
    }
  }

}
