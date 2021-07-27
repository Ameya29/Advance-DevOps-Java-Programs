//Thread Creation By Implementing Runnable Class

class MultithreadingDemo2 implements Runnable  //Interface(implements)
{
 public void run()
 {
  System.out.println("My Thread Is In Running State");
 }
 public static void main(String args[])
 {
  MultithreadingDemo2 obj=new MultithreadingDemo2();
  Thread tobj = new Thread(obj);  //Reference Of Obj Of Child Class
  tobj.start();
 }
}