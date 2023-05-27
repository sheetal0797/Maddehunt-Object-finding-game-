import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
class showhintf15 extends Thread
{
JLabel frm41;
public showhintf15(JLabel obj)
{
frm41=obj;
}

public void run()
{
try
{
for(int i=0;i<10;i++)
{
frm41.setVisible(!frm41.isVisible());
Thread.sleep(200);
}
frm41.setVisible(true);
}
catch(Exception ex)
{
System.out.println(ex.getMessage());
}
}
}

//-----------------------------------------------
class showtimef15 implements Runnable
{
f15 frm41;
int time;
JLabel lb43;
public showtimef15(f15 obj,JLabel object,int tm)
{
frm41=obj;
time=tm;
lb43=object;
}

public void run()
{
try
{
int a2=15;
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
if(foo<15)
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
{lb43.setText(""+i+":"+j+"");
 lb43.setFont(new Font("Algerian", Font.BOLD,30));
      lb43.setForeground(Color.white);
Thread.sleep(1000);}
}
}
catch(Exception ex)
{
System.out.println(ex.getMessage());
}
if(frm41.i<15)
{JOptionPane.showMessageDialog(null,"GAME OVER");
new f15N();
frm41.dispose();}
}
}

class f15 extends JFrame implements MouseListener
{
    JLabel label,label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12,label13,label14,l,u,v,w,a,b,c,h1,h2,h3,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,c1,c2,c3;
    int i,k27,k28;
    boolean dt;
showhintf15 sh41;
Thread th;
    public f15(int k26) 
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
	l1 = new JLabel("Frog");  
        l2 = new JLabel("Electric Razor"); 
        l3 = new JLabel("HairDryer"); 
	l4 = new JLabel("Alphabet"); 
	l5 = new JLabel("Q");  
        l6 = new JLabel("Toilet Paper"); 
        l7 = new JLabel("Y"); 
	l8 = new JLabel("R");
        l9 = new JLabel("Sharpner");  
        l10 = new JLabel("Soap"); 
        l11 = new JLabel("Armadillo"); 
	l12 = new JLabel("Toothpaste"); 
	l13 = new JLabel("Mouthwash"); 
	l14 = new JLabel("Earthworm");
	l15 = new JLabel("Duster");
        label.setIcon(new ImageIcon("obj/frog.png"));
        label1.setIcon(new ImageIcon("obj/electric rasor.png"));
	label2.setIcon(new ImageIcon("obj/hairdryer.png"));
	label3.setIcon(new ImageIcon("obj/alphabets.png"));
        label4.setIcon(new ImageIcon("obj/Q.png"));
        label5.setIcon(new ImageIcon("obj/toiletpaper.png"));
	label6.setIcon(new ImageIcon("obj/Y.png"));
	label7.setIcon(new ImageIcon("obj/r2.png"));
        label8.setIcon(new ImageIcon("obj/sharpner.png"));
        label9.setIcon(new ImageIcon("obj/soap2.png"));
	label10.setIcon(new ImageIcon("obj/armadillo.png"));
	label11.setIcon(new ImageIcon("obj/toothpaste.png"));
	label12.setIcon(new ImageIcon("obj/mouthwash.png"));
	label13.setIcon(new ImageIcon("obj/earthworm 4.png"));
	label14.setIcon(new ImageIcon("obj/duster.png"));

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
   c1.setBounds(1170, 665, size.width+150, size.height+80);
          c2.setBounds(352, 0, size.width+80, size.height+10);
          c3.setBounds(1110, 2, size.width+60, size.height+20);
  h1.setBounds(10, 620, 100,100);
	 h2.setBounds(30, 620, 100,100);	
          h3.setBounds(50, 620, 100,100);

          label.setBounds(790, 437, size.width, size.height);
	  label1.setBounds(1150, 196, size.width, size.height);	
          label2.setBounds(120, 125, size.width, size.height);
	  label3.setBounds(390, 95, size.width, size.height);
	  label4.setBounds(0, 280, size.width, size.height);
	  label5.setBounds(800, 550, size.width, size.height);	
          label6.setBounds(230, 540, size.width, size.height);
	  label7.setBounds(200, 300, size.width, size.height);
	  label8.setBounds(1099, 329, size.width, size.height);
	  label9.setBounds(1270, 326, size.width, size.height);          
          label10.setBounds(500, 400, size.width, size.height);
	  label11.setBounds(915, 305, size.width, size.height);
	  label12.setBounds(382, 432, size.width, size.height);
	  label13.setBounds(925, 170, size.width, size.height);
	  label14.setBounds(600, 244, size.width, size.height);
l1.setBounds(180, 690, size.width, size.height);
          l2.setBounds(310, 690, size.width+80, size.height);

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
          l15.setBounds(960, 670, size.width+40, size.height);
          setLayout(new BorderLayout());
        JLabel background=new JLabel(new ImageIcon("15.jpg"));
        add(background);
	i=0;
k27=k26;
k28=0;
c3.setText(""+(i*100)+"Points");
 c3.setFont(new Font("algerian", Font.ITALIC,19));
      c3.setForeground(Color.white);
 c2.setFont(new Font("algerian", Font.ITALIC,19));
      c2.setForeground(Color.white);
	pack();
 
showtimef15 t=new showtimef15(this,c2,2);
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
{i++;
label.setVisible(false);checkscore(this);
l1.setEnabled(false);
check(this);
hintsong d2=new hintsong();
	Thread e2=new Thread(d2);
	e2.start();}
  	
else if(ae.getSource()==label1)
{i++;l2.setEnabled(false);checkscore(this);
label1.setVisible(false);check(this);
hintsong d2=new hintsong();
	Thread e2=new Thread(d2);
	e2.start();}
  	
else if(ae.getSource()==label2)
{i++;l3.setEnabled(false);checkscore(this);
label2.setVisible(false);check(this);
hintsong d2=new hintsong();
	Thread e2=new Thread(d2);
	e2.start();}

else if(ae.getSource()==label3)
{i++;l4.setEnabled(false);checkscore(this);
label3.setVisible(false);check(this);
hintsong d2=new hintsong();
	Thread e2=new Thread(d2);
	e2.start();}

else if(ae.getSource()==label4)
{i++;l5.setEnabled(false);checkscore(this);
label4.setVisible(false);check(this);
hintsong d2=new hintsong();
	Thread e2=new Thread(d2);
	e2.start();}
  	
else if(ae.getSource()==label5)
{i++;l6.setEnabled(false);checkscore(this);
label5.setVisible(false);check(this);
hintsong d2=new hintsong();
	Thread e2=new Thread(d2);
	e2.start();}
  	
else if(ae.getSource()==label6)
{i++;l7.setEnabled(false);checkscore(this);
label6.setVisible(false);check(this);
hintsong d2=new hintsong();
	Thread e2=new Thread(d2);
	e2.start();}
  	
else if(ae.getSource()==label7)
{i++;l8.setEnabled(false);checkscore(this);
label7.setVisible(false);check(this);
hintsong d2=new hintsong();
	Thread e2=new Thread(d2);
	e2.start();}
  	
else if(ae.getSource()==label8)
{i++;l9.setEnabled(false);checkscore(this);
label8.setVisible(false);check(this);
hintsong d2=new hintsong();
	Thread e2=new Thread(d2);
	e2.start();}
  	
else if(ae.getSource()==label9)
{i++;l10.setEnabled(false);checkscore(this);
label9.setVisible(false);check(this);
hintsong d2=new hintsong();
	Thread e2=new Thread(d2);
	e2.start();}
  	
else if(ae.getSource()==label10)
{i++;l11.setEnabled(false);checkscore(this);
label10.setVisible(false);check(this);
hintsong d2=new hintsong();
	Thread e2=new Thread(d2);
	e2.start();}
  	
else if(ae.getSource()==label11)
{i++;l12.setEnabled(false);checkscore(this);
label11.setVisible(false);check(this);
hintsong d2=new hintsong();
	Thread e2=new Thread(d2);
	e2.start();}

else if(ae.getSource()==label12)
{i++;l13.setEnabled(false);checkscore(this);
label12.setVisible(false);check(this);
hintsong d2=new hintsong();
	Thread e2=new Thread(d2);
	e2.start();}

else if(ae.getSource()==label13)
{i++;l14.setEnabled(false);checkscore(this);
label13.setVisible(false);check(this);
hintsong d2=new hintsong();
	Thread e2=new Thread(d2);
	e2.start();}

else if(ae.getSource()==label14)
{i++;l15.setEnabled(false);checkscore(this);
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
sh41=new showhintf15(u);
	sh41.start();  }
else if(label1.isVisible()==true)
   {u=label1;
sh41=new showhintf15(u);
	sh41.start();  }
else if(label2.isVisible()==true)
   {u=label2;
sh41=new showhintf15(u);
	sh41.start();  }
else if(label3.isVisible()==true)
   {u=label3;
sh41=new showhintf15(u);
	sh41.start();  }
else if(label4.isVisible()==true)
  {u=label4;
sh41=new showhintf15(u);
	sh41.start();  }
else if(label5.isVisible()==true)
   {u=label5;
sh41=new showhintf15(u);
	sh41.start();  }
else if(label6.isVisible()==true)
   {u=label6;
sh41=new showhintf15(u);
	sh41.start();  }
else if(label7.isVisible()==true)
   {u=label7;
sh41=new showhintf15(u);
	sh41.start();  }
else if(label8.isVisible()==true)
   {u=label8;
sh41=new showhintf15(u);
	sh41.start();  }
else if(label9.isVisible()==true)
   {u=label9;
sh41=new showhintf15(u);
	sh41.start();  }
else if(label10.isVisible()==true)
   {u=label10;
sh41=new showhintf15(u);
	sh41.start();  }
else if(label11.isVisible()==true)
   {u=label11;
sh41=new showhintf15(u);
	sh41.start();  }
else if(label12.isVisible()==true)
   {u=label12;
sh41=new showhintf15(u);
	sh41.start();  }
else if(label13.isVisible()==true)
   {u=label13;
sh41=new showhintf15(u);
	sh41.start();  }
else if(label14.isVisible()==true)
   {u=label14;
sh41=new showhintf15(u);
	sh41.start();  }

h1.setVisible(false);}

else if(ae.getSource()==h2)
{if(label.isVisible()==true)
   {u=label;
sh41=new showhintf15(u);
	sh41.start();  }
else if(label1.isVisible()==true)
   {u=label1;
sh41=new showhintf15(u);
	sh41.start();  }
else if(label2.isVisible()==true)
   {u=label2;
sh41=new showhintf15(u);
	sh41.start();  }
else if(label3.isVisible()==true)
   {u=label3;
sh41=new showhintf15(u);
	sh41.start();  }
else if(label4.isVisible()==true)
  {u=label4;
sh41=new showhintf15(u);
	sh41.start();  }
else if(label5.isVisible()==true)
   {u=label5;
sh41=new showhintf15(u);
	sh41.start();  }
else if(label6.isVisible()==true)
   {u=label6;
sh41=new showhintf15(u);
	sh41.start();  }
else if(label7.isVisible()==true)
   {u=label7;
sh41=new showhintf15(u);
	sh41.start();  }
else if(label8.isVisible()==true)
   {u=label8;
sh41=new showhintf15(u);
	sh41.start();  }
else if(label9.isVisible()==true)
   {u=label9;
sh41=new showhintf15(u);
	sh41.start();  }
else if(label10.isVisible()==true)
   {u=label10;
sh41=new showhintf15(u);
	sh41.start();  }
else if(label11.isVisible()==true)
   {u=label11;
sh41=new showhintf15(u);
	sh41.start();  }
else if(label12.isVisible()==true)
   {u=label12;
sh41=new showhintf15(u);
	sh41.start();  }
else if(label13.isVisible()==true)
   {u=label13;
sh41=new showhintf15(u);
	sh41.start();  }
else if(label14.isVisible()==true)
   {u=label14;
sh41=new showhintf15(u);
	sh41.start();  }

h2.setVisible(false);}

else if(ae.getSource()==h3)
{if(label.isVisible()==true)
   {u=label;
sh41=new showhintf15(u);
	sh41.start();  }
else if(label1.isVisible()==true)
   {u=label1;
sh41=new showhintf15(u);
	sh41.start();  }
else if(label2.isVisible()==true)
   {u=label2;
sh41=new showhintf15(u);
	sh41.start();  }
else if(label3.isVisible()==true)
   {u=label3;
sh41=new showhintf15(u);
	sh41.start();  }
else if(label4.isVisible()==true)
  {u=label4;
sh41=new showhintf15(u);
	sh41.start();  }
else if(label5.isVisible()==true)
   {u=label5;
sh41=new showhintf15(u);
	sh41.start();  }
else if(label6.isVisible()==true)
   {u=label6;
sh41=new showhintf15(u);
	sh41.start();  }
else if(label7.isVisible()==true)
   {u=label7;
sh41=new showhintf15(u);
	sh41.start();  }
else if(label8.isVisible()==true)
   {u=label8;
sh41=new showhintf15(u);
	sh41.start();  }
else if(label9.isVisible()==true)
   {u=label9;
sh41=new showhintf15(u);
	sh41.start();  }
else if(label10.isVisible()==true)
   {u=label10;
sh41=new showhintf15(u);
	sh41.start();  }
else if(label11.isVisible()==true)
   {u=label11;
sh41=new showhintf15(u);
	sh41.start();  }
else if(label12.isVisible()==true)
   {u=label12;
sh41=new showhintf15(u);
	sh41.start();  }
else if(label13.isVisible()==true)
   {u=label13;
sh41=new showhintf15(u);
	sh41.start();  }
else if(label14.isVisible()==true)
   {u=label14;
sh41=new showhintf15(u);
	sh41.start();  }
h3.setVisible(false);}
}

    public static void main(String args[]) 
    {
	f15 bgf15=new f15(0);
        
     int t;  
int a2=15;
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
if(foo<15)
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
bgf15.dt=true;
check(bgf15);
}

public static void checkscore(f15 bgf15)
{int i,k27;
k27=bgf15.k27;
bgf15.c3.setText(""+(k27+(bgf15.i*100))+"Points");
 bgf15.c3.setFont(new Font("algerian", Font.ITALIC,19));
      bgf15.c3.setForeground(Color.black);
bgf15.k28=k27+(bgf15.i*100);

}
public static void check(f15 bgf15)
{
int i,j,a;
if(bgf15.i==15)
{
JOptionPane.showMessageDialog(null,"Congratulations!!! You Completed the Game.");
a=0;

if(bgf15.h1.isVisible()==true)
{
JOptionPane.showMessageDialog(null,"Congratulations!!! hint bonus:100 points");
try
{for(j=0;j<=100;j++)
{
bgf15.c3.setText(""+(j+bgf15.k28+a)+"Points");
Thread.sleep(5);}
}
catch(Exception ex){JOptionPane.showMessageDialog(null,ex.getMessage());}
a=a+100;
bgf15.h1.setVisible(false);}

if(bgf15.h2.isVisible()==true)
{JOptionPane.showMessageDialog(null,"Congratulations!!! hint bonus:100 points");

try
{for(j=0;j<=100;j++)
{
bgf15.c3.setText(""+(j+bgf15.k28+a)+"Points");
Thread.sleep(5);}
}
catch(Exception ex){JOptionPane.showMessageDialog(null,ex.getMessage());}
a=a+100;
bgf15.h2.setVisible(false);}


if(bgf15.h3.isVisible()==true)
{JOptionPane.showMessageDialog(null,"Congratulations!!! hint bonus:100 points");
try
{for(j=0;j<100;j++)
{
bgf15.c3.setText(""+(j+bgf15.k28+a)+"Points");
Thread.sleep(5);}
}
catch(Exception ex){JOptionPane.showMessageDialog(null,ex.getMessage());}
a=a+100;
bgf15.h3.setVisible(false);}
bgf15.k28=bgf15.k28+a;
JOptionPane.showMessageDialog(null,"Total Score:"+bgf15.k28);
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
if(fo<bgf15.k28)
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
		    new PrintStream(fout).print(bgf15.k28);
		    fout.close();		
		}
		catch (IOException e)
		{
			System.err.println ("Unable to write to file");
			System.exit(-1);
	}	}
bgf15.dispose();
}
 }

}