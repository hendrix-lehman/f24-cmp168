class DemoApp {
  private int num = 10;

  public void sayHello(/* no input parameters here */) {
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
    app.sayHello(/* no input parameters here */);

    // What happens when we call app.add(10, 20)
    // public void add(int a, int b) {...}
    // 1. The value 10 is copied into the variable a
    // 2. The value 20 is copied into the variable b
    // 3. The activation record for the add method is created
    // 4. The activation record is pushed onto the stack
    // 5. The activation record has input parameters (int a, int b), local variables
    // (int sum), and a return
    // 6. When the function add is finished, the activation record is popped off the
    // stack (removed)
    app.add(10, 20);

    app.add(3, 4);

    // What happens when we call app.add(2, app)
    // public int add(int a, DemoApp app) {...}
    // 1. The value 2 is copied into the variable a
    // 2. The reference (is an address to a location in the heap) to the instance
    // app is copied into the variable app
    // 3. The activation record for the add method is created
    // 4. The activation record is pushed onto the stack
    // 5. The activation record has input parameters (int a, DemoApp app), local
    // variables
    // (int sum), and a return
    // 6. When the function add is finished, the activation record is popped off the
    // stack (removed)
    app.add(2, app);

    // this will create an entry in the memory stack with a reference to the string
    // and also and entry in the heap with the string DATA itself
    String name = "John";

    // this will update the entry in the memory stack with a NEW reference to the
    // string
    // and also add a NEW entry in the heap with the NEW string DATA itself
    name = name + " Doe";

    int result = app.add(2, app);
    System.out.println("Result: " + result);

    System.out.println("next instruction. return address is here");
  }
}

// Primitive and Reference Data Types
// In other words, where is the data stored?

// - Primitive Data Types: int, float, double, char, boolean
// - Data is stored in the stack

// - Reference Data Types: Objects, Arrays, Strings
// - Data is stored in the heap

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
