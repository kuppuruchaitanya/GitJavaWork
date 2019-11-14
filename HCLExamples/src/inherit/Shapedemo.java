

package inherit;

public class Shapedemo {

public static void main(String[] args) {

Triangle t = new Triangle();

t.base=2.5f; t.height=5.0f;
t.shapeName="Triangle";
t.vertex=3;
t.showShape();
Circle c=new Circle();
c.shapeName="Circle";
c.vertex=0;
c.radius=2.5f;
c.showShape();
Shape s1=acceptobject(c);
s1.calcArea();
Shape s2=acceptobject(c);
s2.calcArea();
}

public static Shape acceptobject(Shape s)
{
if(s instanceof Triangle)
{
System.out.println("Triangle passed as an object");
}else if(s instanceof Circle)
{
System.out.println("Circle passed as an oblect");
}
 return s;
}
}