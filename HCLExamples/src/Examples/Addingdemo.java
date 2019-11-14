package Examples;

public class Addingdemo {

public static void main(String[] args) {

int a,b,result;
if(args.length!=2)
{
System.out.println("Please pass two numbers as arguments");
}else
{
a=Integer.parseInt(args[0]);
b=Integer.parseInt(args[1]);
try
{
result=a/b;
System.out.println(result);
}catch(Exception e)
{
//e.printStackTrace();
System.out.println("Please pass non-ZERO value as 2nd arguments!!!");
}

}

}

}
