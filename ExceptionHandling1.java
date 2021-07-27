class ExceptionHandling1
{
 public static void main(String args[])
 {
  try
  {
   int a=0,b=1;
   int c=b/a;
  }
  catch(ArithmeticException e)
  {
   System.out.println("Cannot Divide By Zero :"+e);
   int a=2;
   int b=2;
    int c=b/a;
   System.out.println(+c);
   
  }
   System.out.println("End OF Main");
 }
}