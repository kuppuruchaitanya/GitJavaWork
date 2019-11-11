package inherit;

public abstract class Shape {

	//instance variables or properties or characteristics or attributes
public String shapeName;
public int vertex;

	//create abstract methods -indicates to compiler,no body for this method
public abstract void calcArea();

	//concrete method
public void showShape()	{	
	System.out.println("Shape:"+shapeName);
	System.out.println("Numbe of vertex:"+vertex);

	}

}
