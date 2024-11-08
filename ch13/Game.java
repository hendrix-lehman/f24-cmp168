import java.util.Scanner;

class Game {

  public static void main(String[] args) {

    TicTacToe ttt = new TicTacToe();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Welcome to Tic Tac Toe!");
    ttt.displayBoard();
    ttt.setCurrPlayer(TicTacToe.Player.PLAYER_X);

    // game loop
    while (true) {
      System.out.printf("Player %c, enter your move (row[0-2] column[0-2]): ", ttt.getCurrPlayer());
      String input = scanner.nextLine();
      String[] inputs = input.split(" ");
      int row = Integer.parseInt(inputs[0]);
      int col = Integer.parseInt(inputs[1]);
      ttt.placeMarker(row, col);
      ttt.displayBoard();
      if (ttt.isWinner()) {
        System.out.printf("Player %c wins!\n", ttt.getCurrPlayer());
        break;
      }
      if (ttt.isDraw()) {
        System.out.println("It's a draw!");
        break;
      }
      ttt.changeTurn();
    }

    scanner.close();
  }
}
