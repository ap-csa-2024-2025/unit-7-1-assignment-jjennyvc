import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String input = "";

    ArrayList<String> words = new ArrayList<String>();
    System.out.print("Please enter words, enter STOP to stop the loop");

    while (!input.equals("STOP"))
    {
      System.out.println("Inside the loop! Enter a word");
      input = sc.nextLine();
      words.add(input);
      System.out.println("Just addedthe word. ArrayList is now" + words);
    }
    System.out.println("Exited loop. ArrayList is now" + words);

    int lastIndex = words.size()-1;
    words.remove(lastIndex);
    System.out.println("Removed the last word. ArrayList is now " + words);

    lastIndex = words.size()-1;
    String firstWord = words.get(0);
    words.set(lastIndex, firstWord);
    System.out.println("Added the first word to the last word. ArrayList is now " + words);
  }


}
