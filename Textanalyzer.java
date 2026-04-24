public class TextAnalyzer {
   private String text;

   private ParagraphAnalyzer paragraphAnalyzer;
   private SentenceAnalyzer sentenceAnalyzer;
   private WordAnalyzer wordAnalyzer;

   public TextAnalyzer(String text) {
      this.text = text;
   }

   public void analyze() {
      paragraphAnalyzer = new ParagraphAnalyzer(text);
      paragraphAnalyzer.analyze();
      String[] paragraphs = paragraphAnalyzer.getParagraphs();
      int numParagraphs = paragraphAnalyzer.getParagraphCount();

      sentenceAnalyzer = new SentenceAnalyzer(paragraphs);
      sentenceAnalyzer.analyze();
      String[] sentences = sentenceAnalyzer.getSentences();
      int numSentences = sentenceAnalyzer.getSentenceCount();

      wordAnalyzer = new WordAnalyzer(sentences);
      wordAnalyzer.analyze();
      int numWords = wordAnalyzer.getWordCount();

      
      double sentencesPerParagraph = 0.0;
      double wordsPerSentence = 0.0;
      if (numParagraphs > 0) {
         sentencesPerParagraph = (double) numSentences / numParagraphs;
      }
      if (numSentences > 0) {
         wordsPerSentence = (double) numWords / numSentences;
      }

      System.out.println();
      System.out.println("--- Text Analysis ---");
      System.out.println("Number of paragraphs    : " + numParagraphs);
      System.out.printf( "Sentences per paragraph : %.2f%n", sentencesPerParagraph);
      System.out.println("Number of sentences     : " + numSentences);
      System.out.printf( "Words per sentence      : %.2f%n", wordsPerSentence);
      System.out.println("Number of words         : " + numWords);
   }
}
