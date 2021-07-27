//HIERARCHICAL INHERITANCE

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
class Operation1 extends Input
{
 public void calc1(int x, int y)
 {
  System.out.println("Addition :" +(x+y));
  System.out.println("Subtraction :" +(x-y));
 }
}

class Operation2 extends Input
{
 public void calc2(int x, int y)
 {
   System.out.println("Multiplication :" +(x*y));
   System.out.println("Division :" +(x/y));
 }
}
 public class Main2
{
  public static void main(String args [])
 {
  int a,b;
   Scanner ob = new Scanner(System.in);
  System.out.print("Enter 1st No.=");
   a=ob.nextInt();
   System.out.print("Enter 2nd No.=");
   b=ob.nextInt();
   Operation1 op1=new Operation1();
   Operation2 op2=new Operation2();
    op1.gett(a,b);
    op1.calc1(a,b);
    op2.calc2(a,b);
  }
}




  
   