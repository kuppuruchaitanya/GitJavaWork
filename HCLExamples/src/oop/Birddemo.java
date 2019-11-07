package oop;

public class Birddemo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Bird p=new Bird();
		//set values to attributes
		p.birdcolour= "green";
		p.birdname= "parrot";
		/*p.legs= 2 ;
		p.wings= 2 ;*/
		
		//call walk method
		p.walk();
		p.setsingingStatus();
		p.sing();
		//call fly method  
		p.fly();
		
		Bird k=new Bird();
		k.birdcolour="Black";
		k.birdname="kokila";
		k.walk();
		k.setsingingStatus();
		k.sing();
		k.fly();
		System.out.println("Object id: "+p.hashCode());

	}

}
