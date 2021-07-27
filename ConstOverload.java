class Shapes
{
  Shapes()
 {
  System.out.println("Constructor Function");
 }
 Shapes(int a, int b)
 {
  System.out.println("Rectangle Area :"+(a*b));
 }
 Shapes(float a)
 {
  System.out.println("Circle Area :"+(3.14*a*a));
 }
 Shapes(int a)
 {
  System.out.println("Square Area :"+(a*a));
 }
}

class ConstOverload
{
 public static void main(String args  [])
 {
  Shapes ob1=new Shapes();
   Shapes ob2=new Shapes(3,4);
   Shapes ob3=new Shapes(4.5f); 
  Shapes ob4=new Shapes(9);
 }
}