class Decisions {
  public static void main(String[] args) {
    int x = 5;
    String hello = "hello";
    if (x < 3) {
      System.out.printf("x is equal to %d which is less than 3\n", x);
    } else if (x == 3) {
      System.out.printf("x is equal to %d\n", x);
    } else if (x == 5) {
      System.out.printf("x is equal to %d\n", x);
    } else if (x > 3) {
      System.out.printf("x is equal to %d which is greater than 3\n", x);
    } else {
      System.out.println("x is not less than 3, equal to 3, or greater than 3");
    }

    if (hello.equals("hello")) {
      System.out.println("hello is equal to \"hello\"");
    } else {
      System.out.println("hello is not equal to \"hello\"");
    }

    // decision branch using switch statement
    switch (x) {
      case 1:
        System.out.println("x is equal to 1");
        break;
      case 2:
        System.out.println("x is equal to 2");
        break;
      case 3:
        System.out.println("x is equal to 3");
        break;
      case 4:
        System.out.println("x is equal to 4");
        break;
      case 5:
        System.out.println("x is equal to 5");
        break;
      default:
        System.out.println("x is not equal to 1, 2, 3, 4, or 5");
    }
  }
}
