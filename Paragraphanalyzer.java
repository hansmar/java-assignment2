// ParagraphAnalyzer.java

public class ParagraphAnalyzer {
   private String text;
   private String[] paragraphs;

   public ParagraphAnalyzer(String text) {
      this.text = text;
   }

   public void analyze() {
      // split on double newline
      paragraphs = text.split("\n\n");
   }

   public String[] getParagraphs() {
      return paragraphs;
   }

   public int getParagraphCount() {
      return paragraphs.length;
   }
}
