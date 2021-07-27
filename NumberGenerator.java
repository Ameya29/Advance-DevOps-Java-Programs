import java.util.Scanner;
class NumberGenerator
{
 static int i,begin,end;
 public static void main(String args[])
 {
  Scanner in=new Scanner(System.in);
  System.out.print("Enter Starting Number :");
  begin=in.nextInt();
  System.out.print("Enter End Number :");
  end=in.nextInt();
  in.close();
  for(i=begin;i<=end;i++)
  {
   System.out.println(i);
  }
 }
}