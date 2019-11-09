package Palindrome;
import java.util.Scanner;

public class Palindrome {
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
int n=s.nextInt();

int sum = 0, r;
int temp = n;    
    while(n>0)
  {    
       r = n % 10;  
       sum = (sum*10)+r;    
       n = n/10;    
      }    
     if(temp==sum)    
       System.out.println("It is a Palindrome number.");    
     else    
       System.out.println("Not a palindrome");    
    }  

}




