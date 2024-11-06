public class TicTacToe implements BoardGameInterface {

  private char[][ ttt;
  private char cu layer;
  public stati fi l int NUM_ROWS = 3;
//  
// 
  public static final int NUM_COLS = 3;

  public TicTacToe() {
    ttt = new char[NUM_ROWS][NUM_COLS];
    populateBoard();
  }

  @Override
  public void populateBoard() {
    for (int i = 0; i < NUM_ROWS; i++) {
      for (int j = 0; j < NUM_COLS; j++) {
        ttt[i][j] = EMPTY_CELL;
      }
    }
  }

  @Override
  public void displayBoard() {
    for (int i = 0; i < NUM_ROWS; i++) {
      for (int j = 0; j < NUM_COLS; j++) {
        System.out.print(ttt[i][j] + " ");
      }
      System.out.println();
    }
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

  @Override
  public boolean isWinner() {
    // TODO: Implement this method
    return false;
  }

  @Override
  public boolean isDraw() {
    // TODO: Implement this method
    return false;
  }

  @Override
  public boolean isEmpty() {
    // TODO: Implement this method
    return false;
  }

  @Override
  public boolean isFull() {
    // TODO: Implement this method
    return false;
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
