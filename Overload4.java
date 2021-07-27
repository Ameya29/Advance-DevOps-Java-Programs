//ConstructorOverloading
class Shape
{
 Shape(int length, int breadth)
 {
  System.out.println("Area OF Rectangle="+(length*breadth));
 }
 Shape(double rad)
 {
  System.out.println("Circle Area="+(3.14*rad*rad));
 }
 Shape(double base, double height)
 {
  System.out.println("Triangle ARea="+((base*height)/2));
 }
 Shape(long a)
 {
  System.out.println("Cube Surface Area="+(6*a*a));
 }
}
class Overload4
{
 public static void main(String [] args)
 {
  Shape ob1=new Shape(3,4);
  Shape ob2=new Shape(4.50);
  Shape ob3=new Shape(5,6);
  Shape ob4=new Shape(8);
 }
}

