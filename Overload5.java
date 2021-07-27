//this()ConstructorOverloading
class Shape
{
 Shape(int a, int b,int c)
 {
   this(a,b);
  System.out.println("Cuboid="+(a*b*c));
 }
 Shape(int a, int b)
 {
   this(a);
  System.out.println("2 Product="+(a*b));
 }
 Shape(int a)
 {
  System.out.println("Value="+(a));
 }
}
class Overload5
{
 public static void main(String [] args)
 {
  Shape ob1=new Shape(3,4,5);
  
 }
}

