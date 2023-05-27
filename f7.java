import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

class showhintf7 extends Thread
{
JLabel frm17;
public showhintf7(JLabel obj)
{
frm17=obj;
}

public void run()
{
try
{
for(int i=0;i<10;i++)
{
frm17.setVisible(!frm17.isVisible());
Thread.sleep(200);
}
frm17.setVisible(true);
}
catch(Exception ex)
{
System.out.println(ex.getMessage());
}
}
}
//-----------------------------------------------
class showtimef7 implements Runnable
{
f7 frm17;
int time;
JLabel lb19;
public showtimef7(f7 obj,JLabel object,int tm)
{
frm17=obj;
time=tm;
lb19=object;
}

public void run()
{
try
{
int a2=7;
String z2=null;  
FileInputStream fin;
	try
		{
		    fin = new FileInputStream("newfile.txt");
      z2=new DataInputStream(fin).readLine();
		    fin.close();		
		}
		catch (IOException e)
		{
			System.err.println ("Unable to read from file");
			System.exit(-1);
		}
int foo = Integer.parseInt(z2);
if(foo<7)
{
FileOutputStream fout;		

		try
		{
		    fout = new FileOutputStream ("newfile.txt");
		    new PrintStream(fout).print(a2);
		    fout.close();		
		}
		catch (IOException e)
		{
			System.err.println ("Unable to write to file");
			System.exit(-1);
}		}
int a=time*600;
for(int i=(time-1);i>=0;i--)
{for(int j=60;j>=0;j--)
{lb19.setText(""+i+":"+j+"");
 lb19.setFont(new Font("Algerian", Font.BOLD,30));
      lb19.setForeground(Color.black);
Thread.sleep(1000);}
}
}
catch(Exception ex)
{
System.out.println(ex.getMessage());
}
if(frm17.i<15)
{JOptionPane.showMessageDialog(null,"GAME OVER...");
new f7N();
frm17.dispose();}
}
}
//-------------------------------------------------------------------


class f7 extends JFrame implements MouseListener
{
    JLabel label,label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12,label13,label14,l,u,v,w,a,b,c,h1,h2,h3,c1,c2,c3;
    int i,k11,k12;
    boolean dt;
showhintf7 sh17;
Thread th;
    public f7(int k10) 
  {     setSize(1279,767);
        setVisible(true);
	//setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);	
        JPanel panel = (JPanel)getContentPane();  
        panel.setLayout(null);
        l=new JLabel();
u = new JLabel();
	h1 = new JLabel();  
        h2= new JLabel(); 
        h3 = new JLabel();
c1 = new JLabel();
	c2 = new JLabel();
	c3 = new JLabel();
c1.setIcon(new ImageIcon("obj/c6.png"));
 h1.setIcon(new ImageIcon("h1.png"));
        h2.setIcon(new ImageIcon("h2.png"));
	h3.setIcon(new ImageIcon("h3.png"));
	label = new JLabel();  
        label1 = new JLabel(); 
        label2 = new JLabel(); 
	label3 = new JLabel(); 
	label4 = new JLabel();  
        label5 = new JLabel(); 
        label6 = new JLabel(); 
	label7 = new JLabel();
        label8 = new JLabel();  
        label9 = new JLabel(); 
        label10 = new JLabel(); 
	label11 = new JLabel(); 
	label12 = new JLabel(); 
	label13 = new JLabel();
	label14 = new JLabel();

        label.setIcon(new ImageIcon("obj/strawberry.png"));
        label1.setIcon(new ImageIcon("obj/marker.png"));
	label2.setIcon(new ImageIcon("obj/unio2.png"));
	label3.setIcon(new ImageIcon("obj/knob2.png"));
        label4.setIcon(new ImageIcon("obj/machine.png"));
        label5.setIcon(new ImageIcon("obj/cap.png"));
	label6.setIcon(new ImageIcon("obj/warning symbol.png"));
	label7.setIcon(new ImageIcon("obj/weight machine.png"));
        label8.setIcon(new ImageIcon("obj/axe6.png"));
        label9.setIcon(new ImageIcon("obj/earthworm 4.png"));
	label10.setIcon(new ImageIcon("obj/joystick.png"));
	label11.setIcon(new ImageIcon("obj/care.png"));
	label12.setIcon(new ImageIcon("obj/nail1.png"));
	label13.setIcon(new ImageIcon("obj/trumpet.png"));
	label14.setIcon(new ImageIcon("obj/percent sign1.png"));
     panel.add(c1);c1.addMouseListener(this);
     panel.add(c2);
     panel.add(c3);
         panel.add(label); label.addMouseListener(this);
         panel.add(label1); label1.addMouseListener(this);
	 panel.add(label2); label2.addMouseListener(this);
	 panel.add(label3); label3.addMouseListener(this);
         panel.add(label4);label4.addMouseListener(this);
         panel.add(label5); label5.addMouseListener(this);
	 panel.add(label6); label6.addMouseListener(this);
	 panel.add(label7); label7.addMouseListener(this);
         panel.add(label8); label8.addMouseListener(this);
         panel.add(label9);label9.addMouseListener(this);
	 panel.add(label10);label10.addMouseListener(this);
	 panel.add(label11); label11.addMouseListener(this);
	 panel.add(label12); label12.addMouseListener(this);
	 panel.add(label13); label13.addMouseListener(this);
	 panel.add(label14); label14.addMouseListener(this);
panel.add(h1); h1.addMouseListener(this);
        panel.add(h2); h2.addMouseListener(this);
	panel.add(h3); h3.addMouseListener(this);
	   Dimension size = label.getPreferredSize();
   c1.setBounds(1200, 650, size.width+120, size.height+80);
          c2.setBounds(260, 6, size.width+80, size.height);
          c3.setBounds(774, 0, size.width+80, size.height+20);
  h1.setBounds(10, 600, 100,100);
	 h2.setBounds(30, 600, 100,100);	
          h3.setBounds(50, 600, 100,100);
 label.setBounds(350,320, size.width+80, size.height+80);
	  label1.setBounds(500, 340, size.width+80, size.height+80);	
          label2.setBounds(732, 349, size.width+80, size.height+80);
	  label3.setBounds(195, 490, size.width+80, size.height+80);
	  label4.setBounds(730, 500, size.width+80, size.height+80);
	  label5.setBounds(185, 650, size.width+80, size.height+80);	
          label6.setBounds(437, 449, size.width+80, size.height+80);
	  label7.setBounds(920, 640, size.width+80, size.height+80);
	  label8.setBounds(340, 635, size.width+80, size.height+80);
	  label9.setBounds(1005, 25, size.width+80, size.height+80);          
          label10.setBounds(935, 446, size.width+80, size.height+80);
	  label11.setBounds(720, 7, size.width+80, size.height+80);
	  label12.setBounds(880, 400, size.width+80, size.height+80);
	  label13.setBounds(1200, 340, size.width+80, size.height+80);
	  label14.setBounds(724, 412, size.width+80, size.height+80);
          setLayout(new BorderLayout());
        JLabel background=new JLabel(new ImageIcon("7.jpg"));
        add(background);
	i=0;
k11=k10;
k12=0;
c3.setText(""+(i*100)+"Points");
 c3.setFont(new Font("algerian", Font.ITALIC,19));
      c3.setForeground(Color.black);
	pack();
showtimef7 t=new showtimef7(this,c2,2);
	th=new Thread(t);
	th.start();
framedisplay fd=new framedisplay("Strawberry,Marker,Unio,Knob,Machine,Cap,Warning Symbol,Weight Machine,Axe,Earthworm,Joystick,Care,Nail,Trumpet,Percent Sign");
 Thread t1=new Thread(fd);
 t1.start(); 
}
public void mouseEntered(MouseEvent ae){}
public void mouseExited(MouseEvent ae){}
public void mousePressed(MouseEvent ae){}
public void mouseReleased(MouseEvent ae){}
public void mouseClicked(MouseEvent ae)
{ 
if(ae.getSource()==label)
{i++;hintsong d2=new hintsong();
	Thread e2=new Thread(d2);
	e2.start();
checkscore(this);
label.setVisible(false);check(this);}
  	
else if(ae.getSource()==label1)
{i++;checkscore(this);hintsong d2=new hintsong();
	Thread e2=new Thread(d2);
	e2.start();
label1.setVisible(false);check(this);}
  	
else if(ae.getSource()==label2)
{i++;checkscore(this);
hintsong d2=new hintsong();
	Thread e2=new Thread(d2);
	e2.start();
label2.setVisible(false);check(this);}

else if(ae.getSource()==label3)
{i++;checkscore(this);
label3.setVisible(false);check(this);
hintsong d2=new hintsong();
	Thread e2=new Thread(d2);
	e2.start();}

else if(ae.getSource()==label4)
{i++;checkscore(this);
label4.setVisible(false);check(this);
hintsong d2=new hintsong();
	Thread e2=new Thread(d2);
	e2.start();}
  	
else if(ae.getSource()==label5)
{i++;checkscore(this);
label5.setVisible(false);check(this);
hintsong d2=new hintsong();
	Thread e2=new Thread(d2);
	e2.start();}
  	
else if(ae.getSource()==label6)
{i++;checkscore(this);
label6.setVisible(false);check(this);
hintsong d2=new hintsong();
	Thread e2=new Thread(d2);
	e2.start();}
  	
else if(ae.getSource()==label7)
{i++;checkscore(this);
label7.setVisible(false);check(this);
hintsong d2=new hintsong();
	Thread e2=new Thread(d2);
	e2.start();}
  	
else if(ae.getSource()==label8)
{i++;checkscore(this);
label8.setVisible(false);check(this);
hintsong d2=new hintsong();
	Thread e2=new Thread(d2);
	e2.start();}
  	
else if(ae.getSource()==label9)
{i++;checkscore(this);
label9.setVisible(false);check(this);
hintsong d2=new hintsong();
	Thread e2=new Thread(d2);
	e2.start();}
  	
else if(ae.getSource()==label10)
{i++;checkscore(this);
label10.setVisible(false);check(this);
hintsong d2=new hintsong();
	Thread e2=new Thread(d2);
	e2.start();}
  	
else if(ae.getSource()==label11)
{i++;checkscore(this);
label11.setVisible(false);check(this);
hintsong d2=new hintsong();
	Thread e2=new Thread(d2);
	e2.start();}

else if(ae.getSource()==label12)
{i++;checkscore(this);
label12.setVisible(false);check(this);
hintsong d2=new hintsong();
	Thread e2=new Thread(d2);
	e2.start();}

else if(ae.getSource()==label13)
{i++;checkscore(this);
label13.setVisible(false);check(this);
hintsong d2=new hintsong();
	Thread e2=new Thread(d2);
	e2.start();}

else if(ae.getSource()==label14)
{i++;checkscore(this);
label14.setVisible(false);check(this);
hintsong d2=new hintsong();
	Thread e2=new Thread(d2);
	e2.start();}

else if(ae.getSource()==c1)
{new fmenu((JFrame)this,0);
th.stop();
}

else if(ae.getSource()==h1)
{if(label.isVisible()==true)
   {u=label;
sh17=new showhintf7(u);
	sh17.start();  }
else if(label1.isVisible()==true)
   {u=label1;
sh17=new showhintf7(u);
	sh17.start();  }
else if(label2.isVisible()==true)
   {u=label2;
sh17=new showhintf7(u);
	sh17.start();  }
else if(label3.isVisible()==true)
   {u=label3;
sh17=new showhintf7(u);
	sh17.start();  }
else if(label4.isVisible()==true)
  {u=label4;
sh17=new showhintf7(u);
	sh17.start();  }
else if(label5.isVisible()==true)
   {u=label5;
sh17=new showhintf7(u);
	sh17.start();  }
else if(label6.isVisible()==true)
   {u=label6;
sh17=new showhintf7(u);
	sh17.start();  }
else if(label7.isVisible()==true)
   {u=label7;
sh17=new showhintf7(u);
	sh17.start();  }
else if(label8.isVisible()==true)
   {u=label8;
sh17=new showhintf7(u);
	sh17.start();  }
else if(label9.isVisible()==true)
   {u=label9;
sh17=new showhintf7(u);
	sh17.start();  }
else if(label10.isVisible()==true)
   {u=label10;
sh17=new showhintf7(u);
	sh17.start();  }
else if(label11.isVisible()==true)
   {u=label11;
sh17=new showhintf7(u);
	sh17.start();  }
else if(label12.isVisible()==true)
   {u=label12;
sh17=new showhintf7(u);
	sh17.start();  }
else if(label13.isVisible()==true)
   {u=label13;
sh17=new showhintf7(u);
	sh17.start();  }
else if(label14.isVisible()==true)
   {u=label14;
sh17=new showhintf7(u);
	sh17.start();  }

h1.setVisible(false);}

else if(ae.getSource()==h2)
{if(label.isVisible()==true)
   {u=label;
sh17=new showhintf7(u);
	sh17.start();  }
else if(label1.isVisible()==true)
   {u=label1;
sh17=new showhintf7(u);
	sh17.start();  }
else if(label2.isVisible()==true)
   {u=label2;
sh17=new showhintf7(u);
	sh17.start();  }
else if(label3.isVisible()==true)
   {u=label3;
sh17=new showhintf7(u);
	sh17.start();  }
else if(label4.isVisible()==true)
  {u=label4;
sh17=new showhintf7(u);
	sh17.start();  }
else if(label5.isVisible()==true)
   {u=label5;
sh17=new showhintf7(u);
	sh17.start();  }
else if(label6.isVisible()==true)
   {u=label6;
sh17=new showhintf7(u);
	sh17.start();  }
else if(label7.isVisible()==true)
   {u=label7;
sh17=new showhintf7(u);
	sh17.start();  }
else if(label8.isVisible()==true)
   {u=label8;
sh17=new showhintf7(u);
	sh17.start();  }
else if(label9.isVisible()==true)
   {u=label9;
sh17=new showhintf7(u);
	sh17.start();  }
else if(label10.isVisible()==true)
   {u=label10;
sh17=new showhintf7(u);
	sh17.start();  }
else if(label11.isVisible()==true)
   {u=label11;
sh17=new showhintf7(u);
	sh17.start();  }
else if(label12.isVisible()==true)
   {u=label12;
sh17=new showhintf7(u);
	sh17.start();  }
else if(label13.isVisible()==true)
   {u=label13;
sh17=new showhintf7(u);
	sh17.start();  }
else if(label14.isVisible()==true)
   {u=label14;
sh17=new showhintf7(u);
	sh17.start();  }

h2.setVisible(false);}

else if(ae.getSource()==h3)
{if(label.isVisible()==true)
   {u=label;
sh17=new showhintf7(u);
	sh17.start();  }
else if(label1.isVisible()==true)
   {u=label1;
sh17=new showhintf7(u);
	sh17.start();  }
else if(label2.isVisible()==true)
   {u=label2;
sh17=new showhintf7(u);
	sh17.start();  }
else if(label3.isVisible()==true)
   {u=label3;
sh17=new showhintf7(u);
	sh17.start();  }
else if(label4.isVisible()==true)
  {u=label4;
sh17=new showhintf7(u);
	sh17.start();  }
else if(label5.isVisible()==true)
   {u=label5;
sh17=new showhintf7(u);
	sh17.start();  }
else if(label6.isVisible()==true)
   {u=label6;
sh17=new showhintf7(u);
	sh17.start();  }
else if(label7.isVisible()==true)
   {u=label7;
sh17=new showhintf7(u);
	sh17.start();  }
else if(label8.isVisible()==true)
   {u=label8;
sh17=new showhintf7(u);
	sh17.start();  }
else if(label9.isVisible()==true)
   {u=label9;
sh17=new showhintf7(u);
	sh17.start();  }
else if(label10.isVisible()==true)
   {u=label10;
sh17=new showhintf7(u);
	sh17.start();  }
else if(label11.isVisible()==true)
   {u=label11;
sh17=new showhintf7(u);
	sh17.start();  }
else if(label12.isVisible()==true)
   {u=label12;
sh17=new showhintf7(u);
	sh17.start();  }
else if(label13.isVisible()==true)
   {u=label13;
sh17=new showhintf7(u);
	sh17.start();  }
else if(label14.isVisible()==true)
   {u=label14;
sh17=new showhintf7(u);
	sh17.start();  }
h3.setVisible(false);}


     }

    public static void main(String args[]) 
    {
	f7 bgf7=new f7(0);
         //SwingUtilities.invokeLater(new Runnable() {  public void run() {  }; });  
     int t;  
int a2=7;
String z2=null;  
FileInputStream fin;
	try
		{
		    fin = new FileInputStream("newfile.txt");
      z2=new DataInputStream(fin).readLine();
		    fin.close();		
		}
		catch (IOException e)
		{
			System.err.println ("Unable to read from file");
			System.exit(-1);
		}
int foo = Integer.parseInt(z2);
if(foo<7)
{
FileOutputStream fout;		

		try
		{
		    fout = new FileOutputStream ("newfile.txt");
		    new PrintStream(fout).print(a2);
		    fout.close();		
		}
		catch (IOException e)
		{
			System.err.println ("Unable to write to file");
			System.exit(-1);
}		}
check(bgf7);
}

public static void checkscore(f7 bgf7)
{int i,k11;
k11=bgf7.k11;
bgf7.c3.setText(""+(k11+(bgf7.i*100))+"Points");
 bgf7.c3.setFont(new Font("algerian", Font.ITALIC,19));
      bgf7.c3.setForeground(Color.black);
bgf7.k12=k11+(bgf7.i*100);
}
public static void check(f7 bgf7)
{
int i,j,a;
if(bgf7.i==15)
{
//JOptionPane.showMessageDialog(null,"Congratulations!!! You Have Cleared Stage Successfully.");
a=0;

if(bgf7.h1.isVisible()==true)
{
JOptionPane.showMessageDialog(null,"Congratulations!!! hint bonus:100 points");
try
{for(j=0;j<=100;j++)
{
bgf7.c3.setText(""+(j+bgf7.k12+a)+"Points");
Thread.sleep(5);}
}
catch(Exception ex){JOptionPane.showMessageDialog(null,ex.getMessage());}
a=a+100;
bgf7.h1.setVisible(false);}


if(bgf7.h2.isVisible()==true)
{JOptionPane.showMessageDialog(null,"Congratulations!!! hint bonus:100 points");

try
{for(j=0;j<=100;j++)
{
bgf7.c3.setText(""+(j+bgf7.k12+a)+"Points");
Thread.sleep(5);}
}
catch(Exception ex){JOptionPane.showMessageDialog(null,ex.getMessage());}
a=a+100;
bgf7.h2.setVisible(false);}


if(bgf7.h3.isVisible()==true)
{JOptionPane.showMessageDialog(null,"Congratulations!!! hint bonus:100 points");
try
{for(j=0;j<100;j++)
{
bgf7.c3.setText(""+(j+bgf7.k12+a)+"Points");
Thread.sleep(5);}
}
catch(Exception ex){JOptionPane.showMessageDialog(null,ex.getMessage());}

a=a+100;
bgf7.h3.setVisible(false);}
bgf7.k12=bgf7.k12+a;

JOptionPane.showMessageDialog(null,"Total Score:"+bgf7.k12);
String r1=null;  
FileInputStream fin;

	try
		{
		    fin = new FileInputStream("score.txt");
      r1=new DataInputStream(fin).readLine();
		    fin.close();		
		}
		catch (IOException e)
		{
			System.err.println ("Unable to read from file");
			System.exit(-1);
		}
//if(z1)
int fo = Integer.parseInt(r1);
if(fo<bgf7.k12)
{String s;
 
     
 s= JOptionPane.showInputDialog("Enter your name ");
      
FileOutputStream foutput;		

		try
		{
		    foutput = new FileOutputStream ("score name.txt");
		    new PrintStream(foutput).print(s);
		    foutput.close();		
		}
		catch (IOException e)
		{
			System.err.println ("Unable to write to file");
			System.exit(-1);
		}
FileOutputStream fout;		

		try
		{
		    fout = new FileOutputStream ("score.txt");
		    new PrintStream(fout).print(bgf7.k12);
		    fout.close();		
		}
		catch (IOException e)
		{
			System.err.println ("Unable to write to file");
			System.exit(-1);
	}	}
new f8(bgf7.k12);
bgf7.dispose();
}
 }

}