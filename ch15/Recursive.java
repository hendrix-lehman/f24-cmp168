class Recursive {

  public static int add(int a, int b) {
    int sum = a + b;
    return sum;
  }

  public static int addRecursive(int a, int b) {
    if (b == 0) { // base case
      return a; // termination point
    }

    // call itself
    return addRecursive(a + 1, b - 1);
  }

  public static int addIterative(int a, int b) {
    while (b != 0) {
      a++;
      b--;
    }
    return a;
  }

  public static void main(String[] args) {

    // adding 2 numbers
    // a = 3; b = 4;
    // 3 + 4 = 7

    // recursive step 1
    // (a + 1) + (b - 1);
    // (3 + 1) + (4 - 1);
    // 4 + 3;

    // recursive step 2
    // (a + 1) + (b - 1);
    // (4 + 1) + (3 - 1);
    // 5 + 2;

    // recursive step 3
    // (a + 1) + (b - 1);
    // (5 + 1) + (2 - 1);
    // 6 + 1;

    // recursive step 4
    // (a + 1) + (b - 1);
    // (6 + 1) + (1 - 1);
    // 7 + 0;

    // the result is in variable a
    int a = 3;
    int b = 4;
    int sum = add(a, b);
    for (int i = 0; i < 999999999; i++) {
      sum = addIterative(a, b);
    }
    System.out.println("Sum of " + a + " and " + b + " is " + sum);

    sum = addRecursive(a, b);
    System.out.println("Sum of " + a + " and " + b + " is " + sum);

    a = 1239999999;
    b = 999999999;
    sum = addIterative(a, b);
    System.out.println("Sum of " + a + " and " + b + " is " + sum);

  }
}
