class GetBaseRaiseToExponent {

  public static int getBaseRaisedToExponent(int base, int exponent) {
    if (exponent == 0) { // base case
      return 1;
    }
    return base * getBaseRaisedToExponent(base, exponent - 1);
  }

  public static void main(String[] args) {

    int base = 3;
    int exponent = 4;
    int result = getBaseRaisedToExponent(base, exponent);
    System.out.println(base + " raised to the power of " + exponent + " is " + result);

  }
}
