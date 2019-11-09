package Zoo;

class VandalurZoo
{
public static void main(String args[])
{
Lion l=new Lion("Wheatish",25.25f,15);
Monkey m=new Monkey("Black",7.5f,16);
Elephant e=new Elephant("Ivory",25.00f,29);

System.out.println(l.color+" Lion weight is    "+l.weight+"and it has   "+l.age+"    years of age");
System.out.println(m.color+" Monkey weight is    "+m.weight+"and it has   "+m.age+"   years of age");
System.out.println(e.color+" Elephant weight is   "+e.weight+"and it has   "+e.age+"  years of age");
}
}
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

