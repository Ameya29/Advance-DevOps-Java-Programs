import java.io.*;
public class CopyFile
{
 public static void main(String args[]) throws IOException
 {
   FileInputStream in = new FileInputStream("input.txt");
   FileOutputStream out = new FileOutputStream("output.txt");
   int c;
   while((c=in.read())!=-1)
   {
    out.write(c);
    //System.out.print(c);
    System.out.print((char)c);
   }
  }
}

//Output File Automatically Gets Created In Java Programs Folder