import java.util.Scanner;
class Bitwise
{
 public static void main(String args[])
 { 
   int a,b,choice;
    Scanner input=new Scanner(System.in);
    System.out.println("Enter 2 Numbers : ");
     a=input.nextInt();
     b=input.nextInt();
	System.out.println("1.AND 2.OR 3.XOR 4.1's COMPLEMENT 5.BINARY LEFT SHIFT 6.BINARY RIGHT SHIFT");
     System.out.println("Enter Your Choice : ");
      choice=input.nextInt();
	switch(choice)
      { 
        case 1:
	System.out.println("a&b="+(a&b));
	break;
	case 2:
	System.out.println("a|b="+(a|b));
	break;
	case 3:
	System.out.println("a^b="+(a^b));
	break;
	case 4:
	System.out.println("~a="+(~a));
	break;
	case 5:
	System.out.println("a<<2="+(a<<2));
	break;
	case 6:
	System.out.println("a>>2="+(a>>2));
	break;
	default:
          System.out.println("Error!!");
	
     }
	
   
   }
}









