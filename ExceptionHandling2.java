class ExceptionHandling2
{
 public static void main(String args[])
 {
  try
  {
   int g[]={10};
   g[20]=100;
  }
  catch(ArrayIndexOutOfBoundsException e)
  {
   System.out.println("Check The Array :"+e);
  }
  System.out.println("Main End");
 }
}