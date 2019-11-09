


package oop;

public class Boxingdemo {
	public static void main (String args[])
	{
	int a=0;
	int b=0;

	if(args.length!=0)
	{

	a=Integer.parseInt(args[0]);

	b=Integer.parseInt(args[1]);
	
	Integer result=a+b;
	

	System.out.println(result);
	}
	else
	{
	System.out.println("Please pass two integers as arguments!");
	}
	}


}
