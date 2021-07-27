//Thread Creation By Extending Thread Class

class MultithreadingDemo1 extends Thread
{
 public void run()
 {
  System.out.println("My Thread Is In Running State");
 }
 public static void main(String args[])
 {
  MultithreadingDemo1 obj=new MultithreadingDemo1();
  obj.start();  //Calls Run Method
 }
}