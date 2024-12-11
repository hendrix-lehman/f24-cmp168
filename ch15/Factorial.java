class Factorial {

  public static int factorial(int n) {
    if (n == 0) { // base case
      return 1;
    }
    return n * factorial(n - 1); // recursive call (call itself)
  }

  public static void main(String[] args) {
    int n = 4;
    int result = factorial(n);

    System.out.println("Factorial of " + n + " is " + result);
  }
}
