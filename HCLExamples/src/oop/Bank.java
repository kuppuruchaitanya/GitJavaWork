package oop;

import java.util.Scanner;

public class Bank {
public static void main(String args[])
{
long bankid;
String bankname;
String IFSCcode;

Scanner sc=new Scanner(System.in);
System.out.println("Enter bank id");
bankid=sc.nextLong();
System.out.println("Enter bank name");
bankname=sc.next();
System.out.println("Enter IFSC code");
IFSCcode= sc.next();


System.out.println("The BankId  is :  "+bankid);
System.out.println("The  Bank Name is     :    "+bankname);
System.out.println("The IFSC code is :  "+IFSCcode);
}
}