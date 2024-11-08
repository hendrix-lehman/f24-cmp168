public class TicTacToe implements BoardGameInterface {

  private char[][] ttt;
  private char currPlayer;
  public static final int NUM_ROWS = 3;
  public static final int NUM_COLS = 3;

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

  public char getCurrPlayer() {
    return currPlayer;
  }

  public void setCurrPlayer(Player player) {
    currPlayer = player.getPlayer();
  }

  @Override
  public void displayBoard() {
    for (int i = 0; i < NUM_ROWS; i++) {
      for (int j = 0; j < NUM_COLS; j++) {
        System.out.print("| " + ttt[i][j] + " | ");
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
