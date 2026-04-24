import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextReader {

   public String ReadFile() {
      Scanner keyboard = new Scanner(System.in);
      String content = "";
      boolean success = false;

      while (!success) {
         System.out.print("Enter the path to a text file: ");
         String path = keyboard.nextLine();

         try {
            File file = new File(path);
            Scanner fileScanner = new Scanner(file);

            while (fileScanner.hasNextLine()) {
               content = content + fileScanner.nextLine() + "\n";
            }

            fileScanner.close();
            success = true;
         }
         catch (FileNotFoundException e) {
            System.out.println("Could not find file \"" + path + "\". Try again.");
            content = "";
         }
      }

      return content;
   }
}
