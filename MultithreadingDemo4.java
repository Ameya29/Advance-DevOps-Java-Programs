//Thread Creation By Implementing Runnable Class

class hello implements Runnable
{
 public void run()
 {
  for(int i=0;i<5;i++)
  {
   System.out.println("Hello");
   try                             //Interrupted Exception
   {
    Thread.sleep(1000); 
   }
   catch(Exception e)   
   {};
  }
 }
}

class hi implements Runnable
{
 public void run()
 {
  for(int i=0;i<5;i++)
  {
   System.out.println("Hi");
   try
   {
    Thread.sleep(2000);
   }
   catch(Exception e)
   {};
  }
 }
}

class hey implements Runnable
{
 public void run()
 {
  for(int i=0;i<5;i++)
  {
   System.out.println("Hey");
   try
   {
    Thread.sleep(3000);
   }
   catch(Exception e)
   {};
  }
 }
}

class MultithreadingDemo4
{
 public static void main(String args[])
 {
  MultithreadingDemo4 obj=new MultithreadingDemo4();
  hi obj1=new hi();
  hello obj2=new hello();
  hey obj3=new hey();
   Thread t1=new Thread(obj1);
   Thread t2=new Thread(obj2);
   Thread t3=new Thread(obj3);
   t1.start();
   t2.start();
   t3.start();
 }
}


