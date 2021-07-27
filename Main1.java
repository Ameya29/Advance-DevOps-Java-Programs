//SINGLE INHERITANCE

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
class Input
{
  int i,j;
 public void gett(int x,int y)
 {
  i=x;
  j=y;
  System.out.println("Values Are " +i+ " And " +j);
 }
}
class Operation extends Input
{
 public void calc(int x, int y)
 {
  System.out.println("Addition :" +(x+y));
 System.out.println("Subtraction :" +(x-y));
 System.out.println("Multiplication :" +(x*y));
 System.out.println("Division :" +(x/y));
 }

 
}
 public class Main1
 { 
  public static void main(String args [])
 {
  int a,b;
   Scanner ob = new Scanner(System.in);
  System.out.print("Enter 1st No.=");
   a=ob.nextInt();
   System.out.print("Enter 2nd No.=");
   b=ob.nextInt();
   Operation op=new Operation();
   op.gett(a,b);
    op.calc(a,b);
  }
}
   
  
   