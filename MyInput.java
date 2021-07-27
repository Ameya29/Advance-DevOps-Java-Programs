import java.io.*;
 class MyInput
 {     public static void main(String[] args) throws IOException
                 {    String text;
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
  System.out.println("Enter the string/number");
           text = br.readLine();    //Reading String 
 int i=Integer.parseInt(text);
     System.out.println(text);
System.out.println(i);
  }
}
