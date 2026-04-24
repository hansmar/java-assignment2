// TextReader.java
// TODO: add proper error handling later.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextReader {

   public String ReadFile() throws FileNotFoundException {
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter the path to a text file: ");
      String path = keyboard.nextLine();

      File file = new File(path);
      Scanner fileScanner = new Scanner(file);

      String content = "";
      while (fileScanner.hasNextLine()) {
         content = content + fileScanner.nextLine() + "\n";
      }

      fileScanner.close();
      return content;
   }
}
