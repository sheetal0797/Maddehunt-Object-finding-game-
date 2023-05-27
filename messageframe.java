import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

class messageframe extends JFrame
{
JLabel l1;
String data;
public messageframe(String names)
{
super("Object Names");
setSize(100,100);
setUndecorated(true);
setLocation(580,320);
setVisible(true);

data=names;
l1=new JLabel("");
add(l1);
displaynames();
}

private void displaynames()
{
String [] arr=data.split(",");
for(int i=0;i<arr.length;i++)
{
l1.setText(arr[i]);
try
{
Thread.sleep(1000);
}
catch(Exception ex)
{
System.out.println(ex.getMessage());
}
}
this.dispose();
}
}