import java.util.Scanner;
class Conditional
{
 public static void main(String args[])
 { 
   int a,b,c;
    Scanner input=new Scanner(System.in);
    System.out.println("Enter 3 Numbers : ");
     a=input.nextInt();
     b=input.nextInt();
     c=input.nextInt();
	System.out.println("Larger Number Is : "+((a>b?a:b)>c?(a>b?a:b):c));
       }
    }
