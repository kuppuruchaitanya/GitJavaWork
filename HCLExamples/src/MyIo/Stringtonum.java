package MyIo;



public class Stringtonum {
public static void main (String args[])
{
String amount="2344345.8";
int length =amount.length();
int i=0,value=0;
while(length>0)
{
if(amount.charAt(i)>'0' && amount.charAt(i)<'9')
value+=Integer.parseInt(""+amount.charAt(i));
length--;i++;
}
System.out.println("value="+value);
}
}



