import java.util.Scanner;
class BubbleSort
{
 public static void main(String args [])
 {
 int n,i,j,swap;
 Scanner input=new Scanner(System.in);
  System.out.println("Enter No. Of Integers To Sort :");
  n=input.nextInt();
   int a[]=new int[n];
  System.out.println("Enter "+ n +" Integers :");

  for(i=0;i<n;i++)
   a[i]=input.nextInt();
   for(i=0;i<(n-1);i++)
  {
    for(j=0;j<n-i-1;j++)
    {
     if(a[j]>a[j+1])
      { 
        swap=a[j];
         a[j]=a[j+1];
	a[j+1]=swap;
      }
    }
  }
  System.out.println("\nSorted Array :");
 for(i=0;i<n;i++)
  System.out.print(" " +a[i]);
  } 
}
 