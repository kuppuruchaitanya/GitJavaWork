package inherit;

public class Bike implements Cycle,Automobile {

@Override
public boolean selfdriven() {

return true;
}

@Override
public void balance() {

System.out.println("We must balance");
}

}