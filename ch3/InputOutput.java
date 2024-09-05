import java.util.Scanner;

class InputOutput {
    public static void main(String[] args) {
      // take an input from the user
      System.out.print("Enter your name: ");

      // create a Scanner object
      Scanner scanner = new Scanner(System.in);
      String name = scanner.nextLine();

      // output the input
      System.out.printf("Hello %1s %1d\n", name, 20);
    }
}
