public class TextAnalyzer {
   private String text;
   private ParagraphAnalyzer paragraphAnalyzer;

   public TextAnalyzer(String text) {
      this.text = text;
   }

   public void analyze() {
      paragraphAnalyzer = new ParagraphAnalyzer(text);
      paragraphAnalyzer.analyze();

      int numParagraphs = paragraphAnalyzer.getParagraphCount();

      System.out.println("Number of paragraphs: " + numParagraphs);
   }
}
