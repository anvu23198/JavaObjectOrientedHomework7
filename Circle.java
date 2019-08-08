public class Circle extends Shape
{
   private double radius;
   
   public Circle()
   {
      this.radius = 1;
   }
   
   public Circle(double radius)
   {
      this.radius = radius;
   }
   
   public Circle(double radius, boolean isFilled, String color)
   {
      super(isFilled, color);
      this.radius = radius;
   }
   
   public double getterRadius()
   {
      return this.radius;
   }
   public void setterRadius(double radius)
   {
      this.radius = radius;
   }
   public double getArea()
   {
      double pi = 3.141592653589793238;
      double area = pi * (Math.pow(this.radius,2));
      return area;
   }
   
   @Override
   public String toString()
   {
      String t = "Radius: " + this.radius + "\nArea: " + this.getArea() + "\nFilled: " + 
      super.getisFilled() + "\nColor: " + super.getColor() + "";
      return t;
   }
   
}