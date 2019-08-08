public class Word extends Sentence
{
   private String noVowelsWord;
   public Word(String s, String w)
   {
      super(s);
      String d = w.replaceAll("[UEOAIueoai]","");
      this.noVowelsWord = d;
   }
   
   public String getNoVowelsWord()
   {
      return noVowelsWord;
   }
   
   public boolean isSubstring()
   {
      return getSentence().contains(noVowelsWord);
   }
}