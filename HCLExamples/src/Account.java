

import java.util.Scanner;

public class Account {
public static void main (String args[])
{
double AccountNumber;
String Accounttype;
float balance;
String username;
String IFSCcode;

Scanner sc=new Scanner(System.in);
System.out.println("Enter 11 digit Acc Number");
AccountNumber=sc.nextDouble();

System.out.println("Enter Acc type ");
sc.next();
Accounttype =sc.nextLine();

System.out.println("Enter the balance");

balance=sc.nextFloat();
System.out.println("Enter username");
sc.next();
username =sc.nextLine();
System.out.print("Enter the IFSCcode");
IFSCcode=sc.nextLine();



}


}