
public interface BoardGameInterface {
  char PLAYER_X = 'X'; // public static final
  char PLAYER_O = 'O'; // public static final
  char EMPTY_CELL = ' '; // public static final

  void populateBoard();

  public void clearBoard();

  void placeMarker(int rowIndex, int colIndex);

  boolean isWinner();

  boolean isDraw();

  boolean isEmpty();

  boolean isFull();

  void changeTurn();

}
