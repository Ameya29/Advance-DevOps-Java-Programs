import java.awt.*;
import java.awt.event.*;
public class Checkbox1
{
 Checkbox1()
 {
  Frame f=new Frame("CheckBox Example");
  Label l=new Label();
  l.setAlignment(Label.CENTER);
  l.setSize(400,200);
  Checkbox c1=new Checkbox("Pizza");
  c1.setBounds(100,100,50,50);
  Checkbox c2=new Checkbox("Pasta");
  c2.setBounds(100,150,50,50);
  Checkbox c3=new Checkbox("Paneer");
  c3.setBounds(100,200,50,50);
  f.add(c1);
  f.add(c2); 
  f.add(c3);
  f.add(l);

  c1.addItemListener(new ItemListener()
  {
   public void itemStateChanged(ItemEvent e)
   {
    l.setText("Pizza : "+(e.getStateChange()==1?"Added ":"Removed"));
   }
  });
  
 c2.addItemListener(new ItemListener()
  {
   public void itemStateChanged(ItemEvent e)
   {
    l.setText("Pasta : "+(e.getStateChange()==1?"Added ":"Removed"));
   }
  });

  c3.addItemListener(new ItemListener()
  {
   public void itemStateChanged(ItemEvent e)
   {
    l.setText("Paneer : "+(e.getStateChange()==1?"Added ":"Removed "));
   }
  });

 f.setSize(500,500);
 f.setLayout(null);
 f.setVisible(true);
 }

 public static void main(String args[])
 {
  new Checkbox1();
 }
}








  