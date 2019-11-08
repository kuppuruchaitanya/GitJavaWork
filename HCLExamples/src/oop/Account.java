package oop;

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
System.out.print("Enter 11 digit Acc Number");
AccountNumber=sc.nextDouble();
System.out.print("Enter Acc type ");
Accounttype =sc.nextLine();
System.out.print("Enter the balance");
balance=sc.nextFloat();
System.out.print("Enter username");
username =sc.nextLine();
System.out.print("Enter the IFSCcode");
IFSCcode=sc.nextLine();



}


}
