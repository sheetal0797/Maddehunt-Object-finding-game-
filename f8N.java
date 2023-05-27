import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

class showhintf8N extends Thread
{
JLabel frm21;
public showhintf8N(JLabel obj)
{
frm21=obj;
}

public void run()
{
try
{
for(int i=0;i<10;i++)
{
frm21.setVisible(!frm21.isVisible());
Thread.sleep(210);
}
frm21.setVisible(true);
}
catch(Exception ex)
{
System.out.println(ex.getMessage());
}
}
}
//-----------------------------------------------
class showtimef8N implements Runnable
{
f8N frm21;
int time;
JLabel lb23;
public showtimef8N(f8N obj,JLabel object,int tm)
{
frm21=obj;
time=tm;
lb23=object;
}

public void run()
{
try
{
int a=time*600;
for(int i=(time-1);i>=0;i--)
{for(int j=60;j>=0;j--)
{lb23.setText(""+i+":"+j+"");
 lb23.setFont(new Font("Algerian", Font.BOLD,30));
      lb23.setForeground(Color.black);
Thread.sleep(1000);}
}
}
catch(Exception ex)
{
System.out.println(ex.getMessage());
}
if(frm21.i<15)
{JOptionPane.showMessageDialog(null,"GAME OVER...");
new f8N1();
frm21.dispose();}
}
}
//-------------------------------------------------------------------


class f8N extends JFrame implements MouseListener
{
    JLabel label,label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12,label13,label14,l,u,v,w,a,b,c,h1,h2,h3,c1,c2,c3;
    int i,k;
    boolean dt;
showhintf8N sh21;
Thread th;
    public f8N() 
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
	label14 = new JLabel();label.setIcon(new ImageIcon("obj/egg.png"));
        label1.setIcon(new ImageIcon("obj/holepunch.png"));
	label2.setIcon(new ImageIcon("obj/pencil box.png"));
	label3.setIcon(new ImageIcon("obj/PSR.png"));
        label4.setIcon(new ImageIcon("obj/rat.png"));
        label5.setIcon(new ImageIcon("obj/suttlecock1.png"));
	label6.setIcon(new ImageIcon("obj/torch.png"));
	label7.setIcon(new ImageIcon("obj/umbrella2.png"));
        label8.setIcon(new ImageIcon("obj/eraser.png"));
        label9.setIcon(new ImageIcon("obj/scissor.png"));
	label10.setIcon(new ImageIcon("obj/soap.png"));
	label11.setIcon(new ImageIcon("obj/speakers.png"));
	label12.setIcon(new ImageIcon("obj/magnifying glass.png"));
	label13.setIcon(new ImageIcon("obj/highlighter2.png"));
	label14.setIcon(new ImageIcon("obj/unio.png"));
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
   c1.setBounds(1200, 660, size.width+120, size.height+80);
          c2.setBounds(250, 0, size.width+8, size.height+21);
          c3.setBounds(835, 6, size.width+80, size.height+21);
  h1.setBounds(10, 605, 100,100);
	 h2.setBounds(30, 605, 100,100);	
          h3.setBounds(50, 605, 100,100);

      
          label.setBounds(290, 278, size.width+80, size.height+80);
	  label1.setBounds(518, 459, size.width+80, size.height+80);	
          label2.setBounds(410, 600, size.width+80, size.height+80);
	  label3.setBounds(823, 422, size.width+80, size.height+80);
	  label4.setBounds(260, 30, size.width+80, size.height+80);
	  label5.setBounds(208, 94, size.width+80, size.height+80);	
          label6.setBounds(810, 514, size.width+80, size.height+80);
	  label7.setBounds(980, 0, size.width+80, size.height+80);
	  label8.setBounds(46, 215, size.width+80, size.height+80);
	  label9.setBounds(727, 560, size.width+80, size.height+80);          
          label10.setBounds(767, 640, size.width+80, size.height+80);
	  label11.setBounds(600, 96, size.width+80, size.height+80);
	  label12.setBounds(1202, 380, size.width+80, size.height+80);
	  label13.setBounds(620, 546, size.width+80, size.height+80);
	  label14.setBounds(133, 288, size.width+80, size.height+80);


          setLayout(new BorderLayout());
        JLabel background=new JLabel(new ImageIcon("8.png"));
        add(background);
	i=0;
k=0;
c3.setText(""+(i*100)+"Points");
 c3.setFont(new Font("algerian", Font.ITALIC,21));
      c3.setForeground(Color.black);
	pack();
showtimef8N t=new showtimef8N(this,c2,2);
	th=new Thread(t);
	th.start();
framedisplay fd=new framedisplay("Egg,Hole Punch,Pencilbox,PSR,Rat,Shuttlecork,Torch,Umbrella,Eraser,Scissor,Soap,Speaker,Magnifying Glass,Highlighter,Unio");
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
{i++;checkscore(this);
label.setVisible(false);check(this);
hintsong d2=new hintsong();
	Thread e2=new Thread(d2);
	e2.start();}
  	
else if(ae.getSource()==label1)
{i++;checkscore(this);
label1.setVisible(false);check(this);
hintsong d2=new hintsong();
	Thread e2=new Thread(d2);
	e2.start();}
  	
else if(ae.getSource()==label2)
{i++;checkscore(this);
label2.setVisible(false);check(this);
hintsong d2=new hintsong();
	Thread e2=new Thread(d2);
	e2.start();}

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
sh21=new showhintf8N(u);
	sh21.start();  }
else if(label1.isVisible()==true)
   {u=label1;
sh21=new showhintf8N(u);
	sh21.start();  }
else if(label2.isVisible()==true)
   {u=label2;
sh21=new showhintf8N(u);
	sh21.start();  }
else if(label3.isVisible()==true)
   {u=label3;
sh21=new showhintf8N(u);
	sh21.start();  }
else if(label4.isVisible()==true)
  {u=label4;
sh21=new showhintf8N(u);
	sh21.start();  }
else if(label5.isVisible()==true)
   {u=label5;
sh21=new showhintf8N(u);
	sh21.start();  }
else if(label6.isVisible()==true)
   {u=label6;
sh21=new showhintf8N(u);
	sh21.start();  }
else if(label7.isVisible()==true)
   {u=label7;
sh21=new showhintf8N(u);
	sh21.start();  }
else if(label8.isVisible()==true)
   {u=label8;
sh21=new showhintf8N(u);
	sh21.start();  }
else if(label9.isVisible()==true)
   {u=label9;
sh21=new showhintf8N(u);
	sh21.start();  }
else if(label10.isVisible()==true)
   {u=label10;
sh21=new showhintf8N(u);
	sh21.start();  }
else if(label11.isVisible()==true)
   {u=label11;
sh21=new showhintf8N(u);
	sh21.start();  }
else if(label12.isVisible()==true)
   {u=label12;
sh21=new showhintf8N(u);
	sh21.start();  }
else if(label13.isVisible()==true)
   {u=label13;
sh21=new showhintf8N(u);
	sh21.start();  }
else if(label14.isVisible()==true)
   {u=label14;
sh21=new showhintf8N(u);
	sh21.start();  }

h1.setVisible(false);}

else if(ae.getSource()==h2)
{if(label.isVisible()==true)
   {u=label;
sh21=new showhintf8N(u);
	sh21.start();  }
else if(label1.isVisible()==true)
   {u=label1;
sh21=new showhintf8N(u);
	sh21.start();  }
else if(label2.isVisible()==true)
   {u=label2;
sh21=new showhintf8N(u);
	sh21.start();  }
else if(label3.isVisible()==true)
   {u=label3;
sh21=new showhintf8N(u);
	sh21.start();  }
else if(label4.isVisible()==true)
  {u=label4;
sh21=new showhintf8N(u);
	sh21.start();  }
else if(label5.isVisible()==true)
   {u=label5;
sh21=new showhintf8N(u);
	sh21.start();  }
else if(label6.isVisible()==true)
   {u=label6;
sh21=new showhintf8N(u);
	sh21.start();  }
else if(label7.isVisible()==true)
   {u=label7;
sh21=new showhintf8N(u);
	sh21.start();  }
else if(label8.isVisible()==true)
   {u=label8;
sh21=new showhintf8N(u);
	sh21.start();  }
else if(label9.isVisible()==true)
   {u=label9;
sh21=new showhintf8N(u);
	sh21.start();  }
else if(label10.isVisible()==true)
   {u=label10;
sh21=new showhintf8N(u);
	sh21.start();  }
else if(label11.isVisible()==true)
   {u=label11;
sh21=new showhintf8N(u);
	sh21.start();  }
else if(label12.isVisible()==true)
   {u=label12;
sh21=new showhintf8N(u);
	sh21.start();  }
else if(label13.isVisible()==true)
   {u=label13;
sh21=new showhintf8N(u);
	sh21.start();  }
else if(label14.isVisible()==true)
   {u=label14;
sh21=new showhintf8N(u);
	sh21.start();  }

h2.setVisible(false);}

else if(ae.getSource()==h3)
{if(label.isVisible()==true)
   {u=label;
sh21=new showhintf8N(u);
	sh21.start();  }
else if(label1.isVisible()==true)
   {u=label1;
sh21=new showhintf8N(u);
	sh21.start();  }
else if(label2.isVisible()==true)
   {u=label2;
sh21=new showhintf8N(u);
	sh21.start();  }
else if(label3.isVisible()==true)
   {u=label3;
sh21=new showhintf8N(u);
	sh21.start();  }
else if(label4.isVisible()==true)
  {u=label4;
sh21=new showhintf8N(u);
	sh21.start();  }
else if(label5.isVisible()==true)
   {u=label5;
sh21=new showhintf8N(u);
	sh21.start();  }
else if(label6.isVisible()==true)
   {u=label6;
sh21=new showhintf8N(u);
	sh21.start();  }
else if(label7.isVisible()==true)
   {u=label7;
sh21=new showhintf8N(u);
	sh21.start();  }
else if(label8.isVisible()==true)
   {u=label8;
sh21=new showhintf8N(u);
	sh21.start();  }
else if(label9.isVisible()==true)
   {u=label9;
sh21=new showhintf8N(u);
	sh21.start();  }
else if(label10.isVisible()==true)
   {u=label10;
sh21=new showhintf8N(u);
	sh21.start();  }
else if(label11.isVisible()==true)
   {u=label11;
sh21=new showhintf8N(u);
	sh21.start();  }
else if(label12.isVisible()==true)
   {u=label12;
sh21=new showhintf8N(u);
	sh21.start();  }
else if(label13.isVisible()==true)
   {u=label13;
sh21=new showhintf8N(u);
	sh21.start();  }
else if(label14.isVisible()==true)
   {u=label14;
sh21=new showhintf8N(u);
	sh21.start();  }
h3.setVisible(false);}


     }

    public static void main(String args[]) 
    {
	f8N bgf8N=new f8N();
         //SwingUtilities.invokeLater(new Runnable() {  public void run() {  }; });  
     int t;  
int a2=8;
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
if(foo<8)
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
check(bgf8N);
}

public static void checkscore(f8N bgf8N)
{int i;
bgf8N.c3.setText(""+(bgf8N.i*100)+"Points");
 bgf8N.c3.setFont(new Font("algerian", Font.ITALIC,21));
      bgf8N.c3.setForeground(Color.black);
i=bgf8N.i*100;
bgf8N.k=i;
}
public static void check(f8N bgf8N)
{
int i,j,a;
if(bgf8N.i==15)
{
//JOptionPane.showMessageDialog(null,"Congratulations!!! You Have Cleared Stage Successfully.");
a=0;

if(bgf8N.h1.isVisible()==true)
{
JOptionPane.showMessageDialog(null,"Congratulations!!! hint bonus:100 points");
try
{for(j=0;j<=100;j++)
{
bgf8N.c3.setText(""+(j+bgf8N.k+a)+"Points");
Thread.sleep(5);}
}
catch(Exception ex){JOptionPane.showMessageDialog(null,ex.getMessage());}
a=a+100;
bgf8N.h1.setVisible(false);}


if(bgf8N.h2.isVisible()==true)
{JOptionPane.showMessageDialog(null,"Congratulations!!! hint bonus:100 points");

try
{for(j=0;j<=100;j++)
{
bgf8N.c3.setText(""+(j+bgf8N.k+a)+"Points");
Thread.sleep(5);}
}
catch(Exception ex){JOptionPane.showMessageDialog(null,ex.getMessage());}
a=a+100;
bgf8N.h2.setVisible(false);}


if(bgf8N.h3.isVisible()==true)
{JOptionPane.showMessageDialog(null,"Congratulations!!! hint bonus:100 points");
try
{for(j=0;j<100;j++)
{
bgf8N.c3.setText(""+(j+bgf8N.k+a)+"Points");
Thread.sleep(5);}
}
catch(Exception ex){JOptionPane.showMessageDialog(null,ex.getMessage());}

a=a+100;
bgf8N.h3.setVisible(false);}
bgf8N.k=bgf8N.k+a;

JOptionPane.showMessageDialog(null,"Total Score:"+bgf8N.k);
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
if(fo<bgf8N.k)
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
		    new PrintStream(fout).print(bgf8N.k);
		    fout.close();		
		}
		catch (IOException e)
		{
			System.err.println ("Unable to write to file");
			System.exit(-1);
	}	}
new f9(bgf8N.k);
bgf8N.dispose();
}
 }

}