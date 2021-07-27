//MethodOverloading
class Multiply
{
 static int mult(int a, int b)
 {
  return a*b;
 }
 static int mult(int a,int b, int c)
 {
  return a*b*c;
 }
}
class Overload1
{
 public static void main(String [] args)
 {
  System.out.println("Product Of 2 Nos.="+(Multiply.mult(12,13)));
  System.out.println("Product Of 3 Nos.="+(Multiply.mult(12,13,13)));
 }
}

