package Org.animals;

class Animaldemo
{
public static void main(String args[])
{
Lion l=new Lion("Wheatish",25.25f,11);
Monkey m=new Monkey("Black",7.5f,12);
Elephant e=new Elephant("Ivory",25.00f,20);



	System.out.println(l.color+" Lion weight is "+l.weight+"and it has "+l.age+"years of age");
	System.out.println(m.color+" Monkey weight is "+m.weight+"and it has "+m.age+"years of age");
	System.out.println(e.color+" Elephant weight is "+e.weight+"and it has "+e.age+"years of age");

}
}

