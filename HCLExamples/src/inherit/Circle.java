package inherit;

public class Circle extends Shape {
float radius,area;
     final static float PI=3.141f;
     // default constructor
     Circle()
    {

     }
    //overload constructor
   Circle(float radius)
   {
   this.radius=radius;
   }
   public void calcArea()
   {
    area=PI*radius*radius;
    System.out.println("Area of a " +shapeName +area);
}

}