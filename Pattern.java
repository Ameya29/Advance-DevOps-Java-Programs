import java.util.Scanner;
class Pattern
{
 public static void main(String args[])
 { 
   int rows,i,j,space;
   Scanner input=new Scanner(System.in);
    System.out.println("Enter No. Of Rows : ");
	rows=input.nextInt();
	space=2*rows-2;
	for(i=1;i<=rows;i++)
      {
       for(j=1;j<=space;j++)
       System.out.print();
       for(j=i;j>=1;j--)
	System.out.print(j);
	for(j=1;j>=i-1;j++)
       System.out.print(j); 
       System.out.println(); 
    space=space-2;
      }
    }
}
	
    