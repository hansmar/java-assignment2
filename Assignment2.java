// Assignment2.java

public class Assignment2 {
   public static void main(String[] args) throws java.io.FileNotFoundException {
      TextReader reader = new TextReader();
      String text = reader.ReadFile();

      // quick check that the file was actually read
      System.out.println("File read. Length: " + text.length() + " characters.");

      TextAnalyzer analyzer = new TextAnalyzer(text);
      analyzer.analyze();
   }
}
