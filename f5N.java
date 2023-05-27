import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

class showhintf5N extends Thread
{
JLabel frm12;
public showhintf5N(JLabel obj)
{
frm12=obj;
}

public void run()
{
try
{
for(int i=0;i<10;i++)
{
frm12.setVisible(!frm12.isVisible());
Thread.sleep(200);
}
frm12.setVisible(true);
}
catch(Exception ex)
{
System.out.println(ex.getMessage());
}
}
}
//-----------------------------------------------
class showtimef5N implements Runnable
{
f5N frm12;
int time;
JLabel lb14;
public showtimef5N(f5N obj,JLabel object,int tm)
{
frm12=obj;
time=tm;
lb14=object;
}

public void run()
{
try
{
int a=time*600;
for(int i=(time-1);i>=0;i--)
{for(int j=60;j>=0;j--)
{lb14.setText(""+i+":"+j+"");
 lb14.setFont(new Font("Algerian", Font.BOLD,30));
      lb14.setForeground(Color.black);
Thread.sleep(1000);}
}
}
catch(Exception ex)
{
System.out.println(ex.getMessage());
}
if(frm12.i<15)
{JOptionPane.showMessageDialog(null,"GAME OVER...");
new f5N1();
frm12.dispose();}
}
}
//-------------------------------------------------------------------


class f5N extends JFrame implements MouseListener
{
    JLabel label,label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12,label13,label14,l,u,v,w,a,b,c,h1,h2,h3,c1,c2,c3,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
    int i,k;
    boolean dt;
showhintf5N sh12;
Thread th;
    public f5N() 
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
  
        l1 = new JLabel("Almond"); 
        l2 = new JLabel("Box"); 
	l3 = new JLabel("Chirag"); 
	l4 = new JLabel("Shave kit");  
        l5 = new JLabel("Voilin"); 
        l6 = new JLabel("Beaver"); 
	l7 = new JLabel("Cup");
        l8 = new JLabel("Razor");  
        l9 = new JLabel("Tweezer"); 
        l10 = new JLabel("Acorn"); 
	l11 = new JLabel("Hedgehog"); 
	l12 = new JLabel("Perfume"); 
	l13 = new JLabel("Knob");
	l14 = new JLabel("Sponge");
        l15 = new JLabel("Leek");
c1.setIcon(new ImageIcon("obj/c6.png"));
	c2=new JLabel();
	c3=new JLabel();
        label.setIcon(new ImageIcon("obj/almond.png"));
        label1.setIcon(new ImageIcon("obj/box.png"));
	label2.setIcon(new ImageIcon("obj/chiraag1.png"));
	label3.setIcon(new ImageIcon("obj/shave kit1.png"));
        label4.setIcon(new ImageIcon("obj/voilin1.png"));
        label5.setIcon(new ImageIcon("obj/beaver.png"));
	label6.setIcon(new ImageIcon("obj/cup.png"));
	label7.setIcon(new ImageIcon("obj/razor.png"));
        label8.setIcon(new ImageIcon("obj/tweezer.png"));
        label9.setIcon(new ImageIcon("obj/acorn.png"));
	label10.setIcon(new ImageIcon("obj/hedgehog.png"));
	label11.setIcon(new ImageIcon("obj/perfume.png"));
	label12.setIcon(new ImageIcon("obj/knob1.png"));
	label13.setIcon(new ImageIcon("obj/sponge.png"));
	
         label14.setIcon(new ImageIcon("obj/leek1.png"));
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
c1.setBounds(1200, 670, size.width+150, size.height+40);
          c2.setBounds(480, 0, size.width+80, size.height+20);
          c3.setBounds(810, 3, size.width+80, size.height+20);
  h1.setBounds(10, 610, 100,100);
	 h2.setBounds(30, 610, 100,100);	
          h3.setBounds(50, 610, 100,100);
           
          label.setBounds(1130, 86, size.width+80, size.height+80);
	  label1.setBounds(1200, 435, size.width+80, size.height+80);	
          label2.setBounds(575, 458, size.width+80, size.height+80);
	  label3.setBounds(395, 380, size.width+80, size.height+80);
	  label4.setBounds(190, 336, size.width+80, size.height+80);
	  label5.setBounds(990, 25, size.width+80, size.height+80);	
          label6.setBounds(612, 26, size.width+80, size.height+80);
	  label7.setBounds(488, 310, size.width+80, size.height+80);
	  label8.setBounds(896, 473, size.width+80, size.height+80);
	  label9.setBounds(815, 290, size.width+80, size.height+80);          
          label10.setBounds(950, 590, size.width+80, size.height+80);
	  label11.setBounds(1155, 487, size.width+80, size.height+80);
	  label12.setBounds(1250, 150, size.width+80, size.height+80);
	  label13.setBounds(260, 156, size.width+80, size.height+80);
	  label14.setBounds(20, 435, size.width+80, size.height+80);
l1.setBounds(180, 670, size.width+40, size.height);
          l2.setBounds(310, 670, size.width+40, size.height);

          l3.setBounds(440, 670, size.width+40, size.height);
          l4.setBounds(570, 670, size.width+40, size.height);
          l5.setBounds(700, 670, size.width+40, size.height);

          l6.setBounds(830, 670, size.width+40, size.height);
          l7.setBounds(960, 670, size.width+40, size.height);
          l8.setBounds(1070, 670, size.width+40, size.height);
          l9.setBounds(180, 690, size.width+40, size.height);

          l10.setBounds(310, 690, size.width+40, size.height);
          l11.setBounds(440, 690, size.width+40, size.height);      
    l12.setBounds(570, 690, size.width+40, size.height);

          l13.setBounds(700, 690, size.width+40, size.height);
          l14.setBounds(830, 690, size.width+40, size.height);
          l15.setBounds(960, 690, size.width+40, size.height);
          setLayout(new BorderLayout());
        JLabel background=new JLabel(new ImageIcon("5.jpg"));
        add(background);
	i=0;
k=0;
c3.setText(""+(i*100)+"Points");
 c3.setFont(new Font("algerian", Font.ITALIC,19));
      c3.setForeground(Color.black);
	pack();
showtimef5N t=new showtimef5N(this,c2,2);
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
sh12=new showhintf5N(u);
	sh12.start();  }
else if(label1.isVisible()==true)
   {u=label1;
sh12=new showhintf5N(u);
	sh12.start();  }
else if(label2.isVisible()==true)
   {u=label2;
sh12=new showhintf5N(u);
	sh12.start();  }
else if(label3.isVisible()==true)
   {u=label3;
sh12=new showhintf5N(u);
	sh12.start();  }
else if(label4.isVisible()==true)
  {u=label4;
sh12=new showhintf5N(u);
	sh12.start();  }
else if(label5.isVisible()==true)
   {u=label5;
sh12=new showhintf5N(u);
	sh12.start();  }
else if(label6.isVisible()==true)
   {u=label6;
sh12=new showhintf5N(u);
	sh12.start();  }
else if(label7.isVisible()==true)
   {u=label7;
sh12=new showhintf5N(u);
	sh12.start();  }
else if(label8.isVisible()==true)
   {u=label8;
sh12=new showhintf5N(u);
	sh12.start();  }
else if(label9.isVisible()==true)
   {u=label9;
sh12=new showhintf5N(u);
	sh12.start();  }
else if(label10.isVisible()==true)
   {u=label10;
sh12=new showhintf5N(u);
	sh12.start();  }
else if(label11.isVisible()==true)
   {u=label11;
sh12=new showhintf5N(u);
	sh12.start();  }
else if(label12.isVisible()==true)
   {u=label12;
sh12=new showhintf5N(u);
	sh12.start();  }
else if(label13.isVisible()==true)
   {u=label13;
sh12=new showhintf5N(u);
	sh12.start();  }
else if(label14.isVisible()==true)
   {u=label14;
sh12=new showhintf5N(u);
	sh12.start();  }

h1.setVisible(false);}

else if(ae.getSource()==h2)
{if(label.isVisible()==true)
   {u=label;
sh12=new showhintf5N(u);
	sh12.start();  }
else if(label1.isVisible()==true)
   {u=label1;
sh12=new showhintf5N(u);
	sh12.start();  }
else if(label2.isVisible()==true)
   {u=label2;
sh12=new showhintf5N(u);
	sh12.start();  }
else if(label3.isVisible()==true)
   {u=label3;
sh12=new showhintf5N(u);
	sh12.start();  }
else if(label4.isVisible()==true)
  {u=label4;
sh12=new showhintf5N(u);
	sh12.start();  }
else if(label5.isVisible()==true)
   {u=label5;
sh12=new showhintf5N(u);
	sh12.start();  }
else if(label6.isVisible()==true)
   {u=label6;
sh12=new showhintf5N(u);
	sh12.start();  }
else if(label7.isVisible()==true)
   {u=label7;
sh12=new showhintf5N(u);
	sh12.start();  }
else if(label8.isVisible()==true)
   {u=label8;
sh12=new showhintf5N(u);
	sh12.start();  }
else if(label9.isVisible()==true)
   {u=label9;
sh12=new showhintf5N(u);
	sh12.start();  }
else if(label10.isVisible()==true)
   {u=label10;
sh12=new showhintf5N(u);
	sh12.start();  }
else if(label11.isVisible()==true)
   {u=label11;
sh12=new showhintf5N(u);
	sh12.start();  }
else if(label12.isVisible()==true)
   {u=label12;
sh12=new showhintf5N(u);
	sh12.start();  }
else if(label13.isVisible()==true)
   {u=label13;
sh12=new showhintf5N(u);
	sh12.start();  }
else if(label14.isVisible()==true)
   {u=label14;
sh12=new showhintf5N(u);
	sh12.start();  }

h2.setVisible(false);}

else if(ae.getSource()==h3)
{if(label.isVisible()==true)
   {u=label;
sh12=new showhintf5N(u);
	sh12.start();  }
else if(label1.isVisible()==true)
   {u=label1;
sh12=new showhintf5N(u);
	sh12.start();  }
else if(label2.isVisible()==true)
   {u=label2;
sh12=new showhintf5N(u);
	sh12.start();  }
else if(label3.isVisible()==true)
   {u=label3;
sh12=new showhintf5N(u);
	sh12.start();  }
else if(label4.isVisible()==true)
  {u=label4;
sh12=new showhintf5N(u);
	sh12.start();  }
else if(label5.isVisible()==true)
   {u=label5;
sh12=new showhintf5N(u);
	sh12.start();  }
else if(label6.isVisible()==true)
   {u=label6;
sh12=new showhintf5N(u);
	sh12.start();  }
else if(label7.isVisible()==true)
   {u=label7;
sh12=new showhintf5N(u);
	sh12.start();  }
else if(label8.isVisible()==true)
   {u=label8;
sh12=new showhintf5N(u);
	sh12.start();  }
else if(label9.isVisible()==true)
   {u=label9;
sh12=new showhintf5N(u);
	sh12.start();  }
else if(label10.isVisible()==true)
   {u=label10;
sh12=new showhintf5N(u);
	sh12.start();  }
else if(label11.isVisible()==true)
   {u=label11;
sh12=new showhintf5N(u);
	sh12.start();  }
else if(label12.isVisible()==true)
   {u=label12;
sh12=new showhintf5N(u);
	sh12.start();  }
else if(label13.isVisible()==true)
   {u=label13;
sh12=new showhintf5N(u);
	sh12.start();  }
else if(label14.isVisible()==true)
   {u=label14;
sh12=new showhintf5N(u);
	sh12.start();  }
h3.setVisible(false);}


     }

    public static void main(String args[]) 
    {
	f5N bgf5N=new f5N();
         //SwingUtilities.invokeLater(new Runnable() {  public void run() {  }; });  
     int t; 
int a2=5;
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
if(foo<5)
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
check(bgf5N);
}

public static void checkscore(f5N bgf5N)
{int i;
bgf5N.c3.setText(""+(bgf5N.i*100)+"Points");
 bgf5N.c3.setFont(new Font("algerian", Font.ITALIC,19));
      bgf5N.c3.setForeground(Color.black);

i=bgf5N.i*100;
bgf5N.k=i;
}
public static void check(f5N bgf5N)
{int i,j,a;
if(bgf5N.i==15)
{//JOptionPane.showMessageDialog(null,"Congratulations!!! You Have Cleared Stage Successfully.");
a=0;

if(bgf5N.h1.isVisible()==true)
{
JOptionPane.showMessageDialog(null,"Congratulations!!! hint bonus:100 points");
try
{for(j=0;j<=100;j++)
{
bgf5N.c3.setText(""+(j+bgf5N.k+a)+"Points");
Thread.sleep(5);}
}
catch(Exception ex){JOptionPane.showMessageDialog(null,ex.getMessage());}
a=a+100;
bgf5N.h1.setVisible(false);}


if(bgf5N.h2.isVisible()==true)
{JOptionPane.showMessageDialog(null,"Congratulations!!! hint bonus:100 points");

try
{for(j=0;j<=100;j++)
{
bgf5N.c3.setText(""+(j+bgf5N.k+a)+"Points");
Thread.sleep(5);}
}
catch(Exception ex){JOptionPane.showMessageDialog(null,ex.getMessage());}
a=a+100;
bgf5N.h2.setVisible(false);}


if(bgf5N.h3.isVisible()==true)
{JOptionPane.showMessageDialog(null,"Congratulations!!! hint bonus:100 points");
try
{for(j=0;j<100;j++)
{
bgf5N.c3.setText(""+(j+bgf5N.k+a)+"Points");
Thread.sleep(5);}
}
catch(Exception ex){JOptionPane.showMessageDialog(null,ex.getMessage());}

a=a+100;
bgf5N.h3.setVisible(false);}
bgf5N.k=bgf5N.k+a;

JOptionPane.showMessageDialog(null,"Total Score:"+bgf5N.k);
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
if(fo<bgf5N.k)
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
		    new PrintStream(fout).print(bgf5N.k);
		    fout.close();		
		}
		catch (IOException e)
		{
			System.err.println ("Unable to write to file");
			System.exit(-1);
	}	}
new f6(bgf5N.k);
bgf5N.dispose();
}
 }

}