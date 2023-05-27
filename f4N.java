import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Scanner;
class showhintf4N extends Thread
{
JLabel frm9;
public showhintf4N(JLabel obj)
{
frm9=obj;
}

public void run()
{
try
{
for(int i=0;i<10;i++)
{
frm9.setVisible(!frm9.isVisible());
Thread.sleep(200);
}
frm9.setVisible(true);
}
catch(Exception ex)
{
System.out.println(ex.getMessage());
}
}
}

//---------------------------------------
class showtimef4N implements Runnable
{
f4N frm9;
int time;
JLabel lb11;
public showtimef4N(f4N obj,JLabel object,int tm)
{
frm9=obj;
time=tm;
lb11=object;
}

public void run()
{
try
{
int a=time*600;
for(int i=(time-1);i>=0;i--)
{for(int j=60;j>=0;j--)
{lb11.setText(""+i+":"+j+"");
 lb11.setFont(new Font("Algerian", Font.BOLD,30));
      lb11.setForeground(Color.black);
Thread.sleep(1000);}
}
}
catch(Exception ex)
{
System.out.println(ex.getMessage());
}
if(frm9.i<15)
{JOptionPane.showMessageDialog(null,"Game Over");
new f4N1();
frm9.dispose();}
}}
//----------------------------------------------



class f4N extends JFrame implements MouseListener
{
    JLabel label,label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12,label13,label14,l,u,v,w,a,b,c,h1,h2,h3,c1,c2,c3,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
    int i,k;
    boolean dt;
showhintf4N sh9;
Thread th;
    public f4N() 
  {     setSize(1279,767);
        setVisible(true);
	//setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);	
        JPanel panel = (JPanel)getContentPane();  
        panel.setLayout(null);
	u = new JLabel();
	h1 = new JLabel();  
        h2= new JLabel(); 
        h3 = new JLabel();
        l=new JLabel();
	c1 = new JLabel();
	c2 = new JLabel();
	c3 = new JLabel();
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
l1 = new JLabel("Caterpiller");  
        l2 = new JLabel("Doller"); 
        l3 = new JLabel("Chick"); 
	l4 = new JLabel("Goose"); 
	l5 = new JLabel("Pea");  
        l6 = new JLabel("Jwellery Box"); 
        l7 = new JLabel("Book"); 
	l8 = new JLabel("posiedon Statue");
        l9 = new JLabel("Robot");  
        l10 = new JLabel("Crab"); 
        l11 = new JLabel("Eye Patch"); 
	l12 = new JLabel("Flacon"); 
	l13 = new JLabel("Baseball Bar"); 
	l14 = new JLabel("Pillow");
	l15 = new JLabel("Watch");
c1.setIcon(new ImageIcon("obj/c6.png"));
	c2=new JLabel();
	c3=new JLabel();
     label.setIcon(new ImageIcon("obj/caterpillar.png"));
        label1.setIcon(new ImageIcon("obj/doller.png"));
	label2.setIcon(new ImageIcon("obj/chick.png"));
	label3.setIcon(new ImageIcon("obj/goose1.png"));
        label4.setIcon(new ImageIcon("obj/pea.png"));
        label5.setIcon(new ImageIcon("obj/jwellry box.png"));
	label6.setIcon(new ImageIcon("obj/book.png"));
	label7.setIcon(new ImageIcon("obj/posiedon statue.png"));
        label8.setIcon(new ImageIcon("obj/robot.png"));
        label9.setIcon(new ImageIcon("obj/crab.png"));
	label10.setIcon(new ImageIcon("obj/eye patch.png"));
	label11.setIcon(new ImageIcon("obj/flacon.png"));
	label12.setIcon(new ImageIcon("obj/baseball bar.png"));
	label13.setIcon(new ImageIcon("obj/pillow.png"));
	label14.setIcon(new ImageIcon("obj/watch4.png"));
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
panel.add(l1);
panel.add(l2);
panel.add(l3);
panel.add(l4);
panel.add(l5);
panel.add(l6);
panel.add(l7);
panel.add(l8);
panel.add(l9);
panel.add(l10);
panel.add(l11);
panel.add(l12);
panel.add(l13);
panel.add(l14);
panel.add(l15);
panel.add(c1);c1.addMouseListener(this);
panel.add(c2);
panel.add(c3);
panel.add(h1); h1.addMouseListener(this);
        panel.add(h2); h2.addMouseListener(this);
	panel.add(h3); h3.addMouseListener(this);
	   Dimension size = label.getPreferredSize();
   c1.setBounds(1170, 665, size.width+60, size.height+20);
          c2.setBounds(357, 0, size.width+20, size.height+20);
          c3.setBounds(750, 5, size.width+60, size.height+20);
  h1.setBounds(10, 620, 100,100);
	 h2.setBounds(30, 620, 100,100);	
          h3.setBounds(50, 620, 100,100);   

          label.setBounds(1226, 0, size.width+50, size.height+50);
	  label1.setBounds(796, 200, size.width+50, size.height+50);	
          label2.setBounds(1250, 512, size.width+50, size.height+50);
	  label3.setBounds(300, 570, size.width+80, size.height+80);
	  label4.setBounds(130, 0, size.width+80, size.height+80);
	  label5.setBounds(940, 335, size.width+80, size.height+80);	
          label6.setBounds(890, 345, size.width+80, size.height+80);
	  label7.setBounds(570, 260, size.width+80, size.height+80);
	  label8.setBounds(10, 590, size.width, size.height);
	  label9.setBounds(570, 129, size.width+80, size.height+80);          
          label10.setBounds(330, 210, size.width+80, size.height+80);
	  label11.setBounds(450, 510, size.width+80, size.height+80);
	  label12.setBounds(850, 14, size.width+80, size.height);
	  label13.setBounds(803, 300, size.width+80, size.height+80);
	  label14.setBounds(595, 580, size.width+80, size.height+80);
          
          l1.setBounds(180, 690, size.width, size.height);
          l2.setBounds(310, 690, size.width, size.height);

          l3.setBounds(440, 690, size.width+40, size.height);
          l4.setBounds(570, 690, size.width+40, size.height);
          l5.setBounds(700, 690, size.width+40, size.height);

          l6.setBounds(830, 690, size.width+40, size.height);
          l7.setBounds(960, 690, size.width+40, size.height);
          l8.setBounds(1090, 690, size.width+40, size.height);
          l9.setBounds(180, 670, size.width+40, size.height);

          l10.setBounds(310, 670, size.width+40, size.height);
          l11.setBounds(440, 670, size.width+40, size.height);      
    l12.setBounds(570, 670, size.width+40, size.height);

          l13.setBounds(700, 670, size.width+40, size.height);
          l14.setBounds(830, 670, size.width+40, size.height);
          l15.setBounds(960, 670, size.width+40, size.height);;
          setLayout(new BorderLayout());
        JLabel background=new JLabel(new ImageIcon("4.png"));
        add(background);
	i=0;
k=0;
c3.setText(""+(i*100)+"Points");
 c3.setFont(new Font("algerian", Font.ITALIC,19));
      c3.setForeground(Color.black);
	pack();
showtimef4N t=new showtimef4N(this,c2,2);
	th=new Thread(t);
	th.start();


}
public void mouseEntered(MouseEvent ae){}
public void mouseExited(MouseEvent ae){}
public void mousePressed(MouseEvent ae){}
public void mouseReleased(MouseEvent ae){}
public void mouseClicked(MouseEvent ae)
{ 
if(ae.getSource()==label)
{i++;checkscore(this);l1.setEnabled(false);
label.setVisible(false);check(this);
hintsong d2=new hintsong();
	Thread e2=new Thread(d2);
	e2.start();}
  	
else if(ae.getSource()==label1)
{i++;checkscore(this);l2.setEnabled(false);
label1.setVisible(false);check(this);
hintsong d2=new hintsong();
	Thread e2=new Thread(d2);
	e2.start();}
  	
else if(ae.getSource()==label2)
{i++;checkscore(this);l3.setEnabled(false);
label2.setVisible(false);check(this);
hintsong d2=new hintsong();
	Thread e2=new Thread(d2);
	e2.start();}

else if(ae.getSource()==label3)
{i++;checkscore(this);l4.setEnabled(false);
label3.setVisible(false);check(this);
hintsong d2=new hintsong();
	Thread e2=new Thread(d2);
	e2.start();}

else if(ae.getSource()==label4)
{i++;checkscore(this);l5.setEnabled(false);
label4.setVisible(false);check(this);
hintsong d2=new hintsong();
	Thread e2=new Thread(d2);
	e2.start();}
  	
else if(ae.getSource()==label5)
{i++;checkscore(this);l6.setEnabled(false);
label5.setVisible(false);check(this);
hintsong d2=new hintsong();
	Thread e2=new Thread(d2);
	e2.start();}
  	
else if(ae.getSource()==label6)
{i++;checkscore(this);l7.setEnabled(false);
label6.setVisible(false);check(this);
hintsong d2=new hintsong();
	Thread e2=new Thread(d2);
	e2.start();}
  	
else if(ae.getSource()==label7)
{i++;checkscore(this);l8.setEnabled(false);
label7.setVisible(false);check(this);
hintsong d2=new hintsong();
	Thread e2=new Thread(d2);
	e2.start();}
  	
else if(ae.getSource()==label8)
{i++;checkscore(this);l9.setEnabled(false);
label8.setVisible(false);check(this);
hintsong d2=new hintsong();
	Thread e2=new Thread(d2);
	e2.start();}
  	
else if(ae.getSource()==label9)
{i++;checkscore(this);l10.setEnabled(false);
label9.setVisible(false);check(this);
hintsong d2=new hintsong();
	Thread e2=new Thread(d2);
	e2.start();}
  	
else if(ae.getSource()==label10)
{i++;checkscore(this);l11.setEnabled(false);
label10.setVisible(false);check(this);
hintsong d2=new hintsong();
	Thread e2=new Thread(d2);
	e2.start();}
  	
else if(ae.getSource()==label11)
{i++;checkscore(this);l12.setEnabled(false);
label11.setVisible(false);check(this);
hintsong d2=new hintsong();
	Thread e2=new Thread(d2);
	e2.start();}

else if(ae.getSource()==label12)
{i++;checkscore(this);l13.setEnabled(false);
label12.setVisible(false);check(this);
hintsong d2=new hintsong();
	Thread e2=new Thread(d2);
	e2.start();}

else if(ae.getSource()==label13)
{i++;checkscore(this);l14.setEnabled(false);
label13.setVisible(false);check(this);
hintsong d2=new hintsong();
	Thread e2=new Thread(d2);
	e2.start();}

else if(ae.getSource()==label14)
{i++;checkscore(this);l15.setEnabled(false);
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
sh9=new showhintf4N(u);
	sh9.start();  }
else if(label1.isVisible()==true)
   {u=label1;
sh9=new showhintf4N(u);
	sh9.start();  }
else if(label2.isVisible()==true)
   {u=label2;
sh9=new showhintf4N(u);
	sh9.start();  }
else if(label3.isVisible()==true)
   {u=label3;
sh9=new showhintf4N(u);
	sh9.start();  }
else if(label4.isVisible()==true)
  {u=label4;
sh9=new showhintf4N(u);
	sh9.start();  }
else if(label5.isVisible()==true)
   {u=label5;
sh9=new showhintf4N(u);
	sh9.start();  }
else if(label6.isVisible()==true)
   {u=label6;
sh9=new showhintf4N(u);
	sh9.start();  }
else if(label7.isVisible()==true)
   {u=label7;
sh9=new showhintf4N(u);
	sh9.start();  }
else if(label8.isVisible()==true)
   {u=label8;
sh9=new showhintf4N(u);
	sh9.start();  }
else if(label9.isVisible()==true)
   {u=label9;
sh9=new showhintf4N(u);
	sh9.start();  }
else if(label10.isVisible()==true)
   {u=label10;
sh9=new showhintf4N(u);
	sh9.start();  }
else if(label11.isVisible()==true)
   {u=label11;
sh9=new showhintf4N(u);
	sh9.start();  }
else if(label12.isVisible()==true)
   {u=label12;
sh9=new showhintf4N(u);
	sh9.start();  }
else if(label13.isVisible()==true)
   {u=label13;
sh9=new showhintf4N(u);
	sh9.start();  }
else if(label14.isVisible()==true)
   {u=label14;
sh9=new showhintf4N(u);
	sh9.start();  }

h1.setVisible(false);}

else if(ae.getSource()==h2)
{if(label.isVisible()==true)
   {u=label;
sh9=new showhintf4N(u);
	sh9.start();  }
else if(label1.isVisible()==true)
   {u=label1;
sh9=new showhintf4N(u);
	sh9.start();  }
else if(label2.isVisible()==true)
   {u=label2;
sh9=new showhintf4N(u);
	sh9.start();  }
else if(label3.isVisible()==true)
   {u=label3;
sh9=new showhintf4N(u);
	sh9.start();  }
else if(label4.isVisible()==true)
  {u=label4;
sh9=new showhintf4N(u);
	sh9.start();  }
else if(label5.isVisible()==true)
   {u=label5;
sh9=new showhintf4N(u);
	sh9.start();  }
else if(label6.isVisible()==true)
   {u=label6;
sh9=new showhintf4N(u);
	sh9.start();  }
else if(label7.isVisible()==true)
   {u=label7;
sh9=new showhintf4N(u);
	sh9.start();  }
else if(label8.isVisible()==true)
   {u=label8;
sh9=new showhintf4N(u);
	sh9.start();  }
else if(label9.isVisible()==true)
   {u=label9;
sh9=new showhintf4N(u);
	sh9.start();  }
else if(label10.isVisible()==true)
   {u=label10;
sh9=new showhintf4N(u);
	sh9.start();  }
else if(label11.isVisible()==true)
   {u=label11;
sh9=new showhintf4N(u);
	sh9.start();  }
else if(label12.isVisible()==true)
   {u=label12;
sh9=new showhintf4N(u);
	sh9.start();  }
else if(label13.isVisible()==true)
   {u=label13;
sh9=new showhintf4N(u);
	sh9.start();  }
else if(label14.isVisible()==true)
   {u=label14;
sh9=new showhintf4N(u);
	sh9.start();  }

h2.setVisible(false);}

else if(ae.getSource()==h3)
{if(label.isVisible()==true)
   {u=label;
sh9=new showhintf4N(u);
	sh9.start();  }
else if(label1.isVisible()==true)
   {u=label1;
sh9=new showhintf4N(u);
	sh9.start();  }
else if(label2.isVisible()==true)
   {u=label2;
sh9=new showhintf4N(u);
	sh9.start();  }
else if(label3.isVisible()==true)
   {u=label3;
sh9=new showhintf4N(u);
	sh9.start();  }
else if(label4.isVisible()==true)
  {u=label4;
sh9=new showhintf4N(u);
	sh9.start();  }
else if(label5.isVisible()==true)
   {u=label5;
sh9=new showhintf4N(u);
	sh9.start();  }
else if(label6.isVisible()==true)
   {u=label6;
sh9=new showhintf4N(u);
	sh9.start();  }
else if(label7.isVisible()==true)
   {u=label7;
sh9=new showhintf4N(u);
	sh9.start();  }
else if(label8.isVisible()==true)
   {u=label8;
sh9=new showhintf4N(u);
	sh9.start();  }
else if(label9.isVisible()==true)
   {u=label9;
sh9=new showhintf4N(u);
	sh9.start();  }
else if(label10.isVisible()==true)
   {u=label10;
sh9=new showhintf4N(u);
	sh9.start();  }
else if(label11.isVisible()==true)
   {u=label11;
sh9=new showhintf4N(u);
	sh9.start();  }
else if(label12.isVisible()==true)
   {u=label12;
sh9=new showhintf4N(u);
	sh9.start();  }
else if(label13.isVisible()==true)
   {u=label13;
sh9=new showhintf4N(u);
	sh9.start();  }
else if(label14.isVisible()==true)
   {u=label14;
sh9=new showhintf4N(u);
	sh9.start();  }
h3.setVisible(false);}

}

    public static void main(String args[]) 
    {
	f4N bgf4N=new f4N(); 
     int t;  
int a2=4;
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
if(foo<4)
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
		}}
check(bgf4N);
}

public static void checkscore(f4N bgf4N)
{int i;
bgf4N.c3.setText(""+(bgf4N.i*100)+"Points");
 bgf4N.c3.setFont(new Font("algerian", Font.ITALIC,19));
      bgf4N.c3.setForeground(Color.black);
i=bgf4N.i*100;
bgf4N.k=i;

}
public static void check(f4N bgf4N)
{int i,j,a;
if(bgf4N.i==15)
{//JOptionPane.showMessageDialog(null,"Congratulations!!! You Have Cleared Stage Successfully.");
a=0;

if(bgf4N.h1.isVisible()==true)
{
JOptionPane.showMessageDialog(null,"Congratulations!!! hint bonus:100 points");
try
{for(j=0;j<=100;j++)
{
bgf4N.c3.setText(""+(j+bgf4N.k+a)+"Points");
Thread.sleep(5);}
}
catch(Exception ex){JOptionPane.showMessageDialog(null,ex.getMessage());}
a=a+100;
bgf4N.h1.setVisible(false);}


if(bgf4N.h2.isVisible()==true)
{JOptionPane.showMessageDialog(null,"Congratulations!!! hint bonus:100 points");

try
{for(j=0;j<=100;j++)
{
bgf4N.c3.setText(""+(j+bgf4N.k+a)+"Points");
Thread.sleep(5);}
}
catch(Exception ex){JOptionPane.showMessageDialog(null,ex.getMessage());}
a=a+100;
bgf4N.h2.setVisible(false);}


if(bgf4N.h3.isVisible()==true)
{JOptionPane.showMessageDialog(null,"Congratulations!!! hint bonus:100 points");
try
{for(j=0;j<100;j++)
{
bgf4N.c3.setText(""+(j+bgf4N.k+a)+"Points");
Thread.sleep(5);}
}
catch(Exception ex){JOptionPane.showMessageDialog(null,ex.getMessage());}

a=a+100;
bgf4N.h3.setVisible(false);}
bgf4N.k=bgf4N.k+a;
JOptionPane.showMessageDialog(null,"Total Score:"+bgf4N.k);
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
if(fo<bgf4N.k)
{String s;
 
      Scanner in = new Scanner(System.in);
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
		    new PrintStream(fout).print(bgf4N.k);
		    fout.close();		
		}
		catch (IOException e)
		{
			System.err.println ("Unable to write to file");
			System.exit(-1);
	}	}
new f5(bgf4N.k);
bgf4N.dispose();
}

 }

}