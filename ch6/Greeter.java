import java.util.Scanner;

/* 
1. Ask the user to enter a word.

2. Retrieve the word and print it back to the user on 1 line.

3. Then iterate through it using the loop structure of your choice (for, while, do while)

Visit each index location and print the character on a separate line until all characters of the word are displayed each on their own line.



Hint: Some String methods to remember are length(), charAt(index)   
*/
class Greeter {

  public String getWordFromUser() {
    // ask the user to enter a word
    System.out.print("Enter a word: ");
    Scanner scanner = new Scanner(System.in);

    // retrieve the word and print it back to the user on 1 line
    String word = scanner.nextLine();

    scanner.close();
    return word;
  }

  public void printWordVertically(String word)  {
    // iterate through the word using a for loop
    for (int i = 0; i < word.length(); i++) {
      System.out.println(word.charAt(i));
    }
  }

  public void printWordVerticallyInReverse(String word) {
    for(int i = word.length() - 1; i >= 0; i--) {
      System.out.println(word.charAt(i));
    }
  }

  public int add(int a, int b) {
    a = 0;
    return a + b;
  }

}
