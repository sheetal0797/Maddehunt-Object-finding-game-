import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class showimg 
{
JLabel l1;
JFrame frm;
public showimg(String imgname,int x,int y)
{
frm=new JFrame();
frm.setSize(200,200);
frm.setUndecorated(true);
frm.setLocation(x,y);
frm.setVisible(true);
l1=new JLabel(new ImageIcon(imgname));
frm.setLayout(new GridLayout(1,1));
frm.add(l1);
frm.setSize(200,210);
try
{
Thread.sleep(2000);
}
catch(Exception ex)
{}
frm.dispose();
}
public static void main(String [] str)
{
//new showimg();
}
}