package Org.animals;
  class Lion
{
String color;
float weight;
int age;

Lion()
{
}

Lion(String color,float weight,int age)
{
this.color=color;
this.weight=weight;
this.age=age;


}

public boolean isVegetarian()
{
return false;
}
public boolean canClimb()

{
 return false;

}
public void getSound()
{
System.out.println("Roars");

}

}
 



class Monkey

{
String color;
float weight;
int age;

Monkey() {}
Monkey (String color,float weight,int age)
{
this.color=color;
this.weight=weight;
this.age=age;


}

public boolean isVegetarian()
{
return true;
}
public boolean canClimb()

{
 return true;

}
public void getSound()
{

System.out.println("Barks");

}



}




class Elephant
{
String color;
float weight;
int age;
Elephant() {}

Elephant (String color,float weight,int age)
{
this.color=color;
this.weight=weight;
this.age=age;


}

public boolean isVegetarian()
{
return true ;
}
public boolean canClimb()

{
 return false;

}
public void getSound()
{
System.out.println("Trumpts");

}



}


