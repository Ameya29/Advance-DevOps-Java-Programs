//MethodOverloading
class Shape
{
 static int area(int length, int breadth)
 {
  return length*breadth;
 }
 static double area(double rad)
 {
  return 3.141*rad*rad;
 }
 static double area(double base, double height)
 {
  return (base*height)/2;
 }
static long area(long a)
 {
  return 6*a*a;
 }
}
class Overload3
{
 public static void main(String [] args)
 {
  System.out.println("Area OF Rectangle="+(Shape.area(12,13)));
  System.out.println("Circle Area="+(Shape.area(13.7)));
  System.out.println("Triangle ARea="+(Shape.area(2.6,3.8)));
  System.out.println("Cube Surface Area="+(Shape.area(2.6)));
 }
}

