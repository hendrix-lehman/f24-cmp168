class Grid {

  private int[][] grid;

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

  public static void main(String[] args) {

    Grid g = new Grid();
    g.createGrid();

    for (int i = 0; i < g.grid.length; i++) {
      for (int j = 0; j < g.grid[i].length; j++) {
        System.out.print(g.grid[i][j] + " ");
      }
      System.out.println();
    }

  }
}
