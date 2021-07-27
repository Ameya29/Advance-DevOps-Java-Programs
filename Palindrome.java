import java.util.*;
public class Palindrome
{
 public static void main(String args[])
  {
   String str;
   System.out.println("Enter A Word :");
   Scanner ob=new Scanner(System.in);
   str=ob.nextLine();
   ob.close();
   
 StringBuffer sb=new StringBuffer(str);
  StringBuffer sb1=new StringBuffer();
  sb1=sb.reverse();
   System.out.println(sb1);
  if(sb.equals(sb1))
    System.out.println("Palindrome");
   else
     System.out.println("Not Palindrome");
    }
}
  