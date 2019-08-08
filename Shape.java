public class Shape
{
   private boolean isFilled;
   private String color;
   
   public Shape()
   {
      this.isFilled = true;
      this.color = "Green";
   }
   
   public Shape(boolean isFilled, String color)
   {
      this.isFilled = isFilled;
      this.color = color;
   }
   
   public boolean getisFilled()
   {
      return this.isFilled;
   }
   public void b(boolean t)
   {
      this.isFilled = t;
   }
   
   public String getColor()
   {
      return this.color;
   }
   public void e(String ha)
   {
      this.color = ha;
   }
   
   @Override
   public String toString()
   {
      String g = "Filled: " + isFilled + "\nColor: " + this.color + "";
      return g;
   }
   
}