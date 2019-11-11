package inherit;
//
public class Bikedemo {
	
	public static void main(String [] args) {
		Bike b=new Bike();
		boolean isBikeselfdriven=b.selfdriven();
		if(isBikeselfdriven)
		{
			System.out.println("Bike drives itself,just we have  ");
		}
		b.balance();
	}

}
