import java.util.Scanner;
public class Exp1
{
 public static void main(String args[])
 {
  int a,b,c;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter 2 Nos.=");
  a=sc.nextInt();
  b=sc.nextInt();
  sc.close();
  c=a & b;
  System.out.println("a & b= "+c);
  c=a | b;
  System.out.println("a | b= "+c);
  c=a^b;
  System.out.println("a ^ b= "+c);
  c=~a;
  System.out.println("~a= "+c);
  c=a<<2;
  System.out.println("a<<2= "+c);
  c=a>>2;
  System.out.println("a>>2= "+c);
  }
}