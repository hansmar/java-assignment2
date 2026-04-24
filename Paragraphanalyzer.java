import java.util.ArrayList;

public class ParagraphAnalyzer {
   private String text;
   private String[] paragraphs;

   public ParagraphAnalyzer(String text) {
      this.text = text;
   }

   public void analyze() {
      String[] parts = text.split("\n\n");

      ArrayList<String> list = new ArrayList<String>();
      for (int i = 0; i < parts.length; i++) {
         String trimmed = parts[i].trim();
         if (trimmed.length() > 0) {
            list.add(trimmed);
         }
      }

      paragraphs = new String[list.size()];
      for (int i = 0; i < list.size(); i++) {
         paragraphs[i] = list.get(i);
      }
   }

   public String[] getParagraphs() {
      return paragraphs;
   }

   public int getParagraphCount() {
      return paragraphs.length;
   }
}
