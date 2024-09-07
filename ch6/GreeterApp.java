class GreeterApp {

  public static void main(String[] args) {

    Greeter greeter = new Greeter();

    String word = greeter.getWordFromUser();
    System.out.println("Word: " + word);

    System.out.println("Word vertically: ");
    greeter.printWordVertically(word);

    System.out.println("Reversed word: ");
    greeter.printWordVerticallyInReverse(word);

    int sum = greeter.add(5, 10);
    System.out.println("Sum: " + sum);

  }
}
