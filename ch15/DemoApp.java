class DemoApp {
  private int num = 10;

  public void sayHello(/* input parameters */) {
    int a = 10;
    System.out.println("Hello, World!");
  }

  public void add(int a, int b) {
    int sum = a + b;
    b = 100;
    System.out.println("Sum: " + sum);
  }

  public int add(int a, DemoApp app) {
    int sum = a + app.num;
    app.num = 100;
    System.out.println("Sum: " + sum);
    return sum;
  }

  public static void main(String[] args) {

    // To use the method sayHello, we create an instance of the class DemoApp
    DemoApp app = new DemoApp();

    // Then we call the method sayHello on the instance app
    app.sayHello(/* input parameters */);

    app.add(10, 20);
    app.add(3, 4);

    app.add(2, app);

    int result = app.add(2, app);
    System.out.println("Result: " + result);

    System.out.println("next instruction. return address is here");
  }
}

// So, somewhere in memory, the runtime creates a method stack for the main
// method

// Activation Record is created
// [ input parameter]
// [ local variables]
// [ return address ]

// The Activation Record is *pushed* onto the stack

// [ sayHello method - Activation Record]
// [ main method - Activation Record (
// app variable is a reference to the instance of the class DemoApp
// )]
// Stack

// instance of the class DemoApp
// Heap

// After the sayHello method is called, the Activation Record for the sayHello
// is *popped off* the stack
