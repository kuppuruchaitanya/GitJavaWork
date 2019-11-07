package oop;

public class Bird {

	public static int legs = 2;
	public static int wings = 2;
	public String birdname;
	public String birdcolour;
	private boolean singStatus;
	
	//constructer is method used to intialize common values to the attributes or properties
	Bird()
	{
		legs=2;
		wings=2;
	}
		
	public void setsingingStatus()
	{
		if(this.birdname.equalsIgnoreCase("kokila"))
		{
			singStatus=true;
		}
	}
	//method to describe thr behavior of object
	public void walk()
	{
		System.out.println(birdcolour+" "+birdname+" is walking with "+legs+"legs.");
	}
	
	public void fly()
	{
		System.out.println(birdcolour+" "+birdname+" is flying with "+wings+"wings.");
	}
	public void sing()
	{
		if(singStatus)
		{
			System.out.println("la ra looo...la ra loo..");
			
		}else
		{
			System.out.println("can't sing!!!! ");
		}
	}
	
}
