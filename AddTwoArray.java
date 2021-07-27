import java.util.Scanner;
class AddTwoArray
{
 public static void main(String args [])
 {
   int m,n,c,d;
   Scanner in = new Scanner(System.in);

   System.out.println("Enter No. Of Rows N Columns :");
   m=in.nextInt();
   n=in.nextInt();
   
   int first[][]=new int[m][n];
   int second[][]=new int[m][n];
   int sum[][]=new int[m][n];

   System.out.println("Enter Elements Of 1st Matrix :");
   for(c=0;c<n;c++)
    for(d=0;d<n;d++)
     first[c][d]=in.nextInt();

   System.out.println("Enter Elements Of 2nd Matrix :");
   for(c=0;c<n;c++)
    for(d=0;d<n;d++)
    second[c][d]=in.nextInt();

   for(c=0;c<n;c++)
    for(d=0;d<n;d++)
     sum[c][d]=first[c][d] + second[c][d];
    
    for(c=0;c<n;c++)
     for(d=0;d<n;d++)
      System.out.println(" "+sum[c][d]);
 }
}
        











