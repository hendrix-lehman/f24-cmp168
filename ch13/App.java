class App {

  public void displayArray(String[][] array) {
    // loop through the rows
    for (int row = 0; row < array.length; row++) {
      System.out.printf("row %d: ", row);
      // loop through the columns
      for (int col = 0; col < array[row].length; col++) {
        System.out.printf("%s\t", array[row][col]);
      }
      System.out.println();
    }
  }

  public void displayArray(int[][] arr) {
    for (int row = 0; row < arr.length; row++) {
      System.out.print("row " + row + ": ");
      for (int col = 0; col < arr[row].length; col++) {
        System.out.print(arr[row][col] + " ");
      }
      System.out.println();
    }
  }

  public String[][] getPopulatedArray(int rows, int cols) {
    String[][] arr = new String[rows][cols];
    return arr;
  }

  public int[][] getPopulatedIntArray(int rows, int cols) {
    int[][] arr = new int[rows][cols];
    return arr;
  }

  public boolean isTargetInArray(int[][] arr, int target) {
    for (int row = 0; row < arr.length; row++) {
      for (int col = 0; col < arr[row].length; col++) {
        if (arr[row][col] == target) {
          return true;
        }
      }
    }
    return false;
  }

  public int[][] findTargetLocation(int[][] arr, int target) {
    for (int row = 0; row < arr.length; row++) {
      for (int col = 0; col < arr[row].length; col++) {
        if (arr[row][col] == target) {
          return new int[][] { { row, col } };
        }
      }
    }
    return new int[][] { { -1, -1 } };
  }

  public static void main(String[] args) {

    // 2D array
    int[][] scores = new int[/* number of rows */ 3][/* number of columns */ 5];

    System.out.println("number of rows: " + scores.length);
    System.out.println("number of columns: " + scores[2].length);

    scores[1][1] = 7;

    App app = new App();
    app.displayArray(scores);

    System.out.println();

    // a single array with an array at each index
    int[] cols0 = new int[10];
    int[] cols1 = new int[3];
    int[] cols2 = new int[7];
    // int[][] scores2 = { cols0, cols1, cols2 };
    int[][] rows = new int[/* rows */ 3][ /* columns NOT YET INITIALIZED */];
    rows[0] = cols0;
    rows[1] = cols1;
    rows[2] = cols2;

    rows[0][3] = 9;
    System.out.println("number of columns row0: " + rows[0].length);
    System.out.println("number of columns: row1: " + rows[1].length);
    System.out.println("number of columns: row2: " + rows[2].length);

    app.displayArray(rows);

    System.out.println();

    // create a 2D array with 2 rows and 3 columns
    String[][] names = new String[2][3];
    names[0][0] = "John";
    names[0][1] = "Paul";
    names[0][2] = "George";
    names[1][0] = "Ringo";
    names[1][1] = "Pete";
    names[1][2] = "Stu";

    app.displayArray(names);

    System.out.println();

    String[][] array = app.getPopulatedArray(3, 5);
    app.displayArray(array);

  }
}
