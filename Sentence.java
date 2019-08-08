public class Sentence
{
   private String sentence;
   
   public Sentence(String sentence)
   {
      this.sentence = sentence;
   }
   public String getSentence()
   {
      return this.sentence;
   }
   
   @Override
   public boolean equals(Object other)
   {
      System.out.println("Sentece Equality");
      boolean eq = false;
      if(other == null)
         return false;
      else if(this.getClass() != other.getClass())
         return false;
      else
      {
         Sentence a = (Sentence) other;
         eq = this.getSentence() == a.getSentence();
      }
      return eq;
   }
}