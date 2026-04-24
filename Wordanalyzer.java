import java.util.ArrayList;

public class WordAnalyzer {
   private String[] sentences;
   private String[] words;

   public WordAnalyzer(String[] sentences) {
      this.sentences = sentences;
   }

   public void analyze() {
      ArrayList<String> list = new ArrayList<String>();

      for (int i = 0; i < sentences.length; i++) {
         String[] parts = sentences[i].split("\\s+");

         for (int j = 0; j < parts.length; j++) {
            String word = parts[j].trim();
            if (word.length() > 0) {
               list.add(word);
            }
         }
      }

      words = new String[list.size()];
      for (int i = 0; i < list.size(); i++) {
         words[i] = list.get(i);
      }
   }

   public String[] getWords() {
      return words;
   }

   public int getWordCount() {
      return words.length;
   }
}
