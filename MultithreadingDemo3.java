//Thread Creation By Extending Thread Class

class hello extends Thread
{
 public void run()
 {
  for(int i=0;i<5;i++)
  {
   System.out.println("Hello");
   try
   {
    Thread.sleep(500);
   }
   catch(Exception e)
   {};
  }
 }
}

class hi extends Thread
{
 public void run()
 {
  for(int i=0;i<5;i++)
  {
   System.out.println("Hi");
   try
   {
    Thread.sleep(500);
   }
   catch(Exception e)
   {};
  }
 }
}

class MultithreadingDemo3
{
 public static void main(String args[])
 {
  MultithreadingDemo3 obj=new MultithreadingDemo3();
  hi obj1=new hi();
  hello obj2=new hello();
  obj1.start();
  obj2.start();
 }
}


//If You Dont Extend Thread Class And Run The Functions Then Firstly
//Called Functions Output Will Be Generated One BY One 
//Else If Thread Class Extended Then Both Threads Will Run Simultaneously..