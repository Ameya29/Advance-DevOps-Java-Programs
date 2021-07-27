//MethodOverloading
class Multiply
{
 static int mult(int a, int b)
 {
  return a*b;
 }
 static double mult(double a,double b)
 {
  return a*b;
 }
}
class Overload2
{
 public static void main(String [] args)
 {
  System.out.println("Product Of 2 Nos.="+(Multiply.mult(12,13)));
  System.out.println("Product Of 3 Nos.="+(Multiply.mult(12.5,13.7)));
 }
}

