class DemoArrays {

  public static void main(String[] args) {

    // most popular array in java is in the String class
    // because internally it is an array of characters
    char[] hello = {'H', 'e', 'l', 37385, 'o', ' ', 'W', 'o', 'r', 'l', 'd'};
    int index = 3;
    System.out.printf("array length = %d \n", hello.length);
    System.out.printf("array first char = %c \n", hello[0]);
    System.out.printf("array last char = %c \n", hello[hello.length - 1]);
    System.out.printf("array first index is 0 and last index is %d \n", hello.length - 1);
    System.out.printf("value at index[%d] = %c \n", index, hello[index]);
    for (char c : new String(hello).toCharArray()) {
      System.out.println(c);
    }

  }
}
