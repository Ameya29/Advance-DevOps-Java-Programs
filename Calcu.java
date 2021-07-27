import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
<html>
<body>
<applet code="Calcu.class" width="500" height="500">
</applet>
</body>
</html>
*/
public class Calcu extends Applet implements ActionListener
{
 Button b1;
 Button b2;
 Button b3;
 Button b4;
 TextField t1;
 TextField t2;
 TextField t3;
 public void init()
 {
  Label l1=new Label("Enter 1st Number :");
  l1.setBounds(10,50,70,30);
  Label l2=new Label("Enter 2nd Number :");
  l2.setBounds(10,100,70,30);
 
  b1=new Button("+");
  b1.setBounds(150,250,70,30);
  b2=new Button("-");
  b2.setBounds(200,250,70,30);
  b3=new Button("*");
  b3.setBounds(250,250,70,30);
  b4=new Button("/");
  b4.setBounds(300,250,70,30);

  t1=new TextField();
  t1.setBounds(100,50,150,30);
  t2=new TextField();
  t2.setBounds(100,100,150,30);
  t3=new TextField();
  t3.setBounds(100,150,150,30);
  t3.setEditable(false);
  add(b1);
  add(b2);
  add(b3);
  add(b4);
  add(t1);
  add(t2);
  add(t3);
  b1.addActionListener(this);
  b2.addActionListener(this);
  b3.addActionListener(this);
  b4.addActionListener(this);
  
  setLayout(null);
 }
 public void actionPerformed(ActionEvent e)
 {
  String s1=t1.getText();
  String s2=t2.getText();
  int a=Integer.parseInt(s1);
  int b=Integer.parseInt(s2);
  int c=0;
  
  if(e.getSource()==b1)
   c=a+b;
  else if(e.getSource()==b2)
   c=a-b;
  else if(e.getSource()==b3)
   c=a*b;
  else if(e.getSource()==b4)
   c=a/b;
  String result=String.valueOf(c);
  t3.setText(result);
 }
 public static void main(String args[])
 {
  
 }
}
 