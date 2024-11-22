class DemoApp {

  public void sayHello() {
    System.out.println("Hello, World!");
  }

  public static void main(String[] args) {

    // To use the method sayHello, we create an instance of the class DemoApp
    DemoApp app = new DemoApp();

    // Then we call the method sayHello on the instance app
    app.sayHello();
  }
}

// So, somewhere in memory, the runtime creates a method stack for the main
// method

// main method stack
// |---------------------|
// | main method |
// |---------------------|
// | args |
// |---------------------|
// | app |
// |---------------------|
// | sayHello method |
// |---------------------|
