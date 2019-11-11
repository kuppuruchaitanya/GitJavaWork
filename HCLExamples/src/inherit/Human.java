package inherit;

public class Human {
public static int legs=2;
public boolean swimmingStatus;

//Human constructor
Human()
{
	swimmingStatus=false;
}

	public static void talk()
	{
		System.out.println("can talk");
	}
	public void walk()
	{
		System.out.println("can walk"+legs+"legs.");
	}
}
