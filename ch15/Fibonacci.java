class Fibonacci {

  public static int fibonacci(int n) {
    if (n == 0 || n == 1) { // base case
      return n;
    } else {
      return fibonacci(n - 1) + fibonacci(n - 2); // recursive case (calls itself)
    }
  }

  public static void main(String[] args) {

    int x = 4;
    int result = fibonacci(x);
    System.out.println("Fibonacci of " + x + " is " + result);
  }
}
