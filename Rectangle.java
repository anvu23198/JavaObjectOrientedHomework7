public class Rectangle extends Shape
{
   private double width;
   private double length;
   
   public Rectangle()
   {
      this.length = 2;
      this.width = 1;
   }
   public Rectangle(double width, double length)
   {
      this.width = width;
      this.length = length;
   }
   public Rectangle(double width, double length, boolean isFilled, String color)
   {
      super(isFilled, color);
      setLW(width,length);
   }
   public double getterWidth()
   {
      return this.width;
   }
   public double getterLength()
   {
      return this.length;
   }
   public void setLW(double x, double y)
   {
      double max = Math.max(x,y);
      double min = Math.min(x,y);
      this.length = max;
      this.width = min;
   }
   public double getArea()
   {
      return this.width*this.length;
   }
   
   @Override
   public String toString()
   {
      String j = "Width: " + this.width + "\nLength: " + this.length + "\nArea: " + this.getArea()
      + "\nFilled: " + super.getisFilled() + "\nColor: " + super.getColor() + "";
      return j;
   }
   
}