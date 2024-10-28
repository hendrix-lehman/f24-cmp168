
import java.util.Scanner;

public class App {

  public String promptUser(String prompt) {
    Scanner scanner = new Scanner(System.in);
    System.out.print(prompt);
    String input = scanner.nextLine();
    return input;
  }

  public String capitalize(String word) {
    //hello
    // [h, e, l, l, o]
    String firstLetter = word.substring(/*from index?*/0, /* to index? */ 1);
    //H
    String firstLetterCapitalized = firstLetter.toUpperCase();
    // ello
    String restOfWord = word.substring(/*/from index */ 1, /* to index */ word.length());
    // Hello
    String capitalizedWord = firstLetterCapitalized + restOfWord;
    return capitalizedWord;
    // return word.substring(0, 1).toUpperCase() + word.substring(1);
  }

  public String fixSpacing(String sentence) {
    return sentence.replaceAll("\\s+", " ");
  }

/*
Capitalize the first letter in the file
and capitalize the 1st letter after every period 
and correct the spacing by removing any duplicate spaces so that there is only 1 space between words.
  */

  public static void main(String[] args) {

    App app = new App();
    String weather = app.promptUser("How is the weather? ");
    while(true) {
      if (weather.equals("rainy")) {
        System.out.println("Take an umbrella!");
        break;
      } else if (weather.equals("sunny")) {
        System.out.println("Wear a hat!");
        break;
      } else {
        weather = app.promptUser("I don't understand that weather. Please enter 'rainy' or 'sunny': ");
      }
    }

  }
}
