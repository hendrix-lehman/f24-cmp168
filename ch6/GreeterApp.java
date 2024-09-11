class GreeterApp {

  public void setObjectNumber(Greeter greeter, String number) {

  }

  public void setObjectNumber(Greeter greeter, int number) {
    greeter.setNumber(number);
    greeter = null; // this will not affect the greeter object in the main method
  }

  public static void main(String[] args) {

    GreeterApp greeterApp = new GreeterApp();
    Greeter greeter = new Greeter();

    String someString = new String("Hello");
    System.out.println(someString.hashCode());
    someString = new String("world");
    System.out.println(someString.hashCode());
    System.out.println(someString);

    int n = 5;
    n = 10;

    // String word = greeter.getWordFromUser();
    // System.out.println("Word: " + word);
    //
    // System.out.println("Word vertically: ");
    // greeter.printWordVertically(word);
    //
    // System.out.println("Reversed word: ");
    // greeter.printWordVerticallyInReverse(word);
    //

    // passing reference data types to a method
    // we are passing the reference of the greeter object to the setObjectNumber method
    // so, therefore we pass the reference by value
    System.out.println("FROM: main -> number: " + greeter.getNumber());
    greeterApp.setObjectNumber(greeter, 10);
    System.out.println("FROM: main -> number: " + greeter.getNumber());


    // passing primitive data types to a method
    int a = 5;
    System.out.println("FROM: main -> a: " + a);
    int b = 10;
    // we are passing the values of a and b to the add method
    // NOT the variables themselves or references to the variables
    // so, therefore we pass by value NOT by reference
    int sum = greeter.add(a, b);
    System.out.println("FROM: main -> a: " + a);
    System.out.println("Sum: " + sum);



    for (int i = 0; i < 5; i++) {
      int randomNumber = greeter.getRandomNumber(100);
      System.out.println("Random number: " + randomNumber);
    }

  }
}
