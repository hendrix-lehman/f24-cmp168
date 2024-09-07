class Loops {

  public static void main(String[] args) {

    System.out.println("-------------------- for loop -------------------");
    // for loop
    for (int i = 0; i < 5 ; i++) {
      System.out.println("Hello, World!");
    }
    
    System.out.println("-------------------- while loop -------------------");
    // while loop
    int i = 0;
    while (i < 5) {
      System.out.println("Hello, World!");
      i++;
    }

    System.out.println("-------------------- do-while loop -------------------");
    // do-while loop
    i = 0;
    do {
      // this will execute at least once
      System.out.println("Hello, World!");
      i++;
    } while (i < 5);

    System.out.println("-------------------- for-each loop -------------------");
    // for-each loop
    int[] numbers = {1, 2, 3, 4, 5};
    for (int number : numbers) {
      System.out.println(number);
    }

    // break statement
    System.out.println("-------------------- break statement -------------------");
    for (int j = 0; j < 5; j++) {
      if (j == 3) {
        break;
      }
      System.out.println(j);
    }

    // continue statement
    System.out.println("-------------------- continue statement -------------------");
    for (int j = 0; j < 5; j++) {
      if (j == 3) {
        continue; // continue to the next iteration. skip the rest of the code
        // System.out.println("This will not be printed");
      }
      System.out.println(j);
    }

    System.out.println("done");


  }
}
