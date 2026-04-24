import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextReader {

    public String ReadFile() {
        Scanner keyboard = new Scanner(System.in);
        String content = "";
        boolean succes = false;

        while (!succes) {
            System.out.print("Enter path to a text file: ");
            String path = keyboard.nextLine();

            try {
                File file = new File(path);

                Scanner fileScanner = new Scanner(file, "UTF-8");

                while (fileScanner.hasNextLine()) {
                    content = content + fileScanner.nextLine() + "\n";
                }

                fileScanner.close();
                succes = true;
            }
            catch (FileNotFoundException e) {
                System.out.println("Could not find file \"" + path + "\". Try again.");
                content = "";
            }
        }

        return content;
    }
}