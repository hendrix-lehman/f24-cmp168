class SumOfTwoNumbers {

  public static int getSum(int a, int b) {
    if   (a == 0) { // base case
      return b;
    }

    return getSum(a - 1, b + 1); // recursive call (calling itself)
  }

  public static void main(String[] args) {

    int a = 5;
    int b = 3;
    int sum = getSum(a, b);

    System.out.println("Sum of " + a + " and " + b + " is " + sum);
  }
}
