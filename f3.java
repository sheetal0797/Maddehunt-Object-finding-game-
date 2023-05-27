import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
class showhintf3 extends Thread
{
JLabel frm5;
public showhintf3(JLabel obj)
{
frm5=obj;
}

public void run()
{
try
{
for(int i=0;i<10;i++)
{
frm5.setVisible(!frm5.isVisible());
Thread.sleep(200);
}
frm5.setVisible(true);
}
catch(Exception ex)
{
System.out.println(ex.getMessage());
}
}
}

//----------------------------------------------
class showtimef3 implements Runnable
{
f3 frm5;
JLabel lb7;
int time;
int o;
public showtimef3(f3 obj,JLabel object,int tm)
{
frm5=obj;
time=tm;
lb7=object;
}

public void run()
{
try
{

int a2=3;
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
if(foo<3)
{FileOutputStream fout;		

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
		}
}
int a=time*600;
for(int i=(time-1);i>=0;i--)
{for(int j=60;j>=0;j--)
{lb7.setText(""+i+":"+j+"");
 lb7.setFont(new Font("Algerian", Font.BOLD,30));
      lb7.setForeground(Color.black);
Thread.sleep(1000);}
}
}
catch(Exception ex)
{
System.out.println(ex.getMessage());
}
if(frm5.i<15)
{JOptionPane.showMessageDialog(null,"GAME OVER...");
new f3N();
frm5.dispose();}
}
}
//-------------------------------------------------------------------
class f3 extends JFrame implements MouseListener
{
    JLabel label,label1,label2,label3,b1,b2,b3,label4,label5,label6,label7,label8,label9,label10,label11,label12,label13,label14,l,u,v,w,a,b,c,h1,h2,h3,c1,c2,c3;
    int i,x,i1,k3,k4;
    boolean dt;
String r,s,q;
showhintf3 sh5;
Thread th;

    public f3(int k2) 
  {     setSize(1279,767);
        setVisible(true);
	//setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);	
        JPanel panel = (JPanel)getContentPane();  
        panel.setLayout(null);
u = new JLabel();
v = new JLabel();
w = new JLabel();
	h1 = new JLabel();  
        h2= new JLabel(); 
        h3 = new JLabel();
 	h1.setIcon(new ImageIcon("h1.png"));
        h2.setIcon(new ImageIcon("h2.png"));
	h3.setIcon(new ImageIcon("h3.png"));
        l=new JLabel();
	a = new JLabel();  
        b= new JLabel(); 
        c = new JLabel(); 
	c1 = new JLabel();
	c2 = new JLabel();
	c3 = new JLabel();

	b1 = new JLabel();   	
        b2= new JLabel(); 
        b3 = new JLabel(); 
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
        label10= new JLabel(); 
	label11= new JLabel(); 
	label12 = new JLabel(); 
	label13 = new JLabel();
	label14 = new JLabel();
	c1.setIcon(new ImageIcon("obj/c6.png"));
	c2=new JLabel();
	c3=new JLabel();
	
 
	b1.setIcon(new ImageIcon("b1.png"));
        b2.setIcon(new ImageIcon("b2.png"));
	b3.setIcon(new ImageIcon("b3.png"));
   
        a.setIcon(new ImageIcon("obj/hammer3.png"));
        b.setIcon(new ImageIcon("obj/pendrive4.png"));
	c.setIcon(new ImageIcon("obj/car1.png"));

        label.setIcon(new ImageIcon("obj/hammer2.png"));
        label1.setIcon(new ImageIcon("obj/pendrive3.png"));
	label2.setIcon(new ImageIcon("obj/car.png"));
	label3.setIcon(new ImageIcon("obj/f.png"));
        label4.setIcon(new ImageIcon("obj/O1.png"));
        label5.setIcon(new ImageIcon("obj/N.png"));
	label6.setIcon(new ImageIcon("obj/T.png"));
	label7.setIcon(new ImageIcon("obj/cd.png"));
        label8.setIcon(new ImageIcon("obj/tap.png"));
        label9.setIcon(new ImageIcon("obj/effil tower.png"));
	label10.setIcon(new ImageIcon("obj/candy.png"));
	label11.setIcon(new ImageIcon("obj/peral2.png"));
	label12.setIcon(new ImageIcon("obj/chess piece.png"));
	label13.setIcon(new ImageIcon("obj/candle.png"));
	label14.setIcon(new ImageIcon("obj/whisk.png"));

	  panel.add(a);
        panel.add(b); 
	panel.add(c);
panel.add(c1);c1.addMouseListener(this);
panel.add(c2);
panel.add(c3);

	 panel.add(b1);
        panel.add(b2); 
	panel.add(b3);
         panel.add(label);  label.addMouseListener(this);
         panel.add(label1); label1.addMouseListener(this);
	 panel.add(label2); label2.addMouseListener(this);
	 panel.add(label3); 
         panel.add(label4); 
         panel.add(label5); 
	 panel.add(label6); 
	 panel.add(label7); 
         panel.add(label8); 
         panel.add(label9); 
	 panel.add(label10);
	 panel.add(label11); 
	 panel.add(label12); 
	 panel.add(label13); 
	 panel.add(label14); 
panel.add(h1); h1.addMouseListener(this);
        panel.add(h2); h2.addMouseListener(this);
	panel.add(h3); h3.addMouseListener(this);
	  Dimension size = label.getPreferredSize();

          c1.setBounds(1200, 650, size.width+150, size.height+20);
          c2.setBounds(346, 650, size.width+20, size.height+20);
          c3.setBounds(1020, 654, size.width+60, size.height+20);

         h1.setBounds(10, 620, 100,100);
	 h2.setBounds(30, 620, 100,100);	
          h3.setBounds(50, 620, 100,100);

	  a.setBounds(540, 634, size.width+50, size.height+50);
	  b.setBounds(630, 634, size.width+50, size.height+50);	
          c.setBounds(730, 634, size.width+50, size.height+50);
          b1.setBounds(400, 600, size.width+50, size.height+50);
	  b2.setBounds(500, 600, size.width+50, size.height+50);	
          b3.setBounds(600, 600, size.width+50, size.height+50);
   
          label.setBounds(400, 545, size.width, size.height);
	  label1.setBounds(195, 226, size.width, size.height);	
          label2.setBounds(1300, 0, size.width+80, size.height+80);
	  label3.setBounds(840, 380, size.width, size.height);
	  label4.setBounds(1126, 420, size.width, size.height);
	  label5.setBounds(706, 85, size.width, size.height);	
          label6.setBounds(1040,600, size.width, size.height);
	  label7.setBounds(330, 320, size.width, size.height);
	  label8.setBounds(120, 380, size.width, size.height);
	  label9.setBounds(806, 120, size.width, size.height);          
          label10.setBounds(660, 560, size.width, size.height);
	  label11.setBounds(255, 570, size.width, size.height);
	  label12.setBounds(0, 240, size.width, size.height);
	  label13.setBounds(1023, 210 ,size.width, size.height);
	  label14.setBounds(1250, 545, size.width, size.height);
          setLayout(new BorderLayout());
        JLabel background=new JLabel(new ImageIcon("3.jpg"));
        add(background);
	i=0;
k3=k2;
k4=0;

c3.setText(""+(k3)+"Points");
 c3.setFont(new Font("algerian", Font.ITALIC,19));
      c3.setForeground(Color.black);
	pack();
        showtimef3 t=new showtimef3(this,c2,2);
	th=new Thread(t);
	th.start();
r="label";
 s="label1";
 q="label2";
	
  }
public void mouseEntered(MouseEvent ae){}
public void mouseExited(MouseEvent ae){}
public void mousePressed(MouseEvent ae){}
public void mouseReleased(MouseEvent ae){}
public void mouseClicked(MouseEvent ae)
{ 
 if(ae.getSource()==label)
 {
 i++;label3.addMouseListener(this);
 label.setVisible(false);check(this);
checkscore(this);
  a.setIcon(new ImageIcon("obj/f.png"));
r="label3";
hintsong d2=new hintsong();
	Thread e2=new Thread(d2);
	e2.start();}

  	
 else if(ae.getSource()==label1)
 {
 i++;label4.addMouseListener(this);
 label1.setVisible(false);check(this);
  b.setIcon(new ImageIcon("obj/o1.png"));
s="label4";checkscore(this);
hintsong d2=new hintsong();
	Thread e2=new Thread(d2);
	e2.start();}

  	
else if(ae.getSource()==label2)
{i++;label5.addMouseListener(this);
label2.setVisible(false);check(this);
 c.setIcon(new ImageIcon("obj/N1.png"));
q="label5";checkscore(this);
hintsong d2=new hintsong();
	Thread e2=new Thread(d2);
	e2.start();}

else if(ae.getSource()==label3)
{i++;label6.addMouseListener(this);
label3.setVisible(false);check(this);
 a.setIcon(new ImageIcon("obj/T1.png"));
r="label6";checkscore(this);
hintsong d2=new hintsong();
	Thread e2=new Thread(d2);
	e2.start();
}

else if(ae.getSource()==label4)
{i++; label7.addMouseListener(this);
label4.setVisible(false);check(this);
 b.setIcon(new ImageIcon("obj/cd1.png"));
s="label7";checkscore(this);
hintsong d2=new hintsong();
	Thread e2=new Thread(d2);
	e2.start();
}
  	
else if(ae.getSource()==label5)
{i++; label8.addMouseListener(this);
label5.setVisible(false);check(this);
c.setIcon(new ImageIcon("obj/tap1.png"));
q="label8";checkscore(this);
hintsong d2=new hintsong();
	Thread e2=new Thread(d2);
	e2.start();}

  	
else if(ae.getSource()==label6)
{i++;label9.addMouseListener(this);
label6.setVisible(false);check(this);
a.setIcon(new ImageIcon("obj/effil tower1.png"));
r="label9";checkscore(this);
hintsong d2=new hintsong();
	Thread e2=new Thread(d2);
	e2.start();}

  	
else if(ae.getSource()==label7)
{i++;label10.addMouseListener(this);
label7.setVisible(false);check(this);
b.setIcon(new ImageIcon("obj/candy2.png"));
 s="label10";checkscore(this);
hintsong d2=new hintsong();
	Thread e2=new Thread(d2);
	e2.start();}

  	
else if(ae.getSource()==label8)
{i++;label11.addMouseListener(this);
label8.setVisible(false);check(this);
c.setIcon(new ImageIcon("obj/peral3.png"));
 q="label11";checkscore(this);
hintsong d2=new hintsong();
	Thread e2=new Thread(d2);
	e2.start();}

  	
else if(ae.getSource()==label9)
{i++;label12.addMouseListener(this);
label9.setVisible(false);check(this);
 a.setIcon(new ImageIcon("obj/chess piece1.png"));
r="label12";checkscore(this);
hintsong d2=new hintsong();
	Thread e2=new Thread(d2);
	e2.start();}

  	
else if(ae.getSource()==label10)
{i++;label13.addMouseListener(this);
label10.setVisible(false);check(this);
 b.setIcon(new ImageIcon("obj/candle2.png"));
 s="label13";checkscore(this);
hintsong d2=new hintsong();
	Thread e2=new Thread(d2);
	e2.start();}

  	
else if(ae.getSource()==label11)
{i++;label14.addMouseListener(this);
label11.setVisible(false);check(this);
 c.setIcon(new ImageIcon("obj/whisk1.png"));
q="label14";checkscore(this);
hintsong d2=new hintsong();
	Thread e2=new Thread(d2);
	e2.start();}


else if(ae.getSource()==label12)
{i++;checkscore(this);
label12.setVisible(false);
a.setVisible(false);
b1.setVisible(false);
hintsong d2=new hintsong();
	Thread e2=new Thread(d2);
	e2.start();}


else if(ae.getSource()==label13)
{i++;checkscore(this);
label13.setVisible(false);
b.setVisible(false);
b2.setVisible(false);check(this);
hintsong d2=new hintsong();
	Thread e2=new Thread(d2);
	e2.start();}


else if(ae.getSource()==label14)
{i++;checkscore(this);
label14.setVisible(false);
c.setVisible(false);
b3.setVisible(false);
check(this);
hintsong d2=new hintsong();
	Thread e2=new Thread(d2);
	e2.start();}



else if(ae.getSource()==c1)
{new fmenu((JFrame)this,0);
th.stop();
} 

else if(ae.getSource()==h1)
{
	if(b1.isVisible()==true)
	{if(r=="label")
	u=label;
	else if (r=="label3")
	u=label3;
	else if (r=="label6")
	u=label6;
	else if (r=="label9")
	u=label9;
	else if (r=="label12")
	u=label12;
	sh5=new showhintf3(u);
	sh5.start();
	}
	else if(b1.isVisible()==false && b2.isVisible()==true)
	{ if(s=="label1")
	v=label1;
	else if (s=="label4")
	v=label4;
	else if (s=="label7")
	v=label7;
	else if (s=="label10")
	v=label10;
	else if (s=="label13")
	v=label13;
	sh5=new showhintf3(v);
	sh5.start();
	}
	else if(b2.isVisible()==false) //&& b2.isVisible()=false)
	{ if(q=="label2")
	w=label2;
	else if (q=="label5")
	w=label5;
	else if (q=="label8")
	w=label8;
	else if (q=="label11")
	w=label11;
	else if (q=="label14")
	w=label14;
	sh5=new showhintf3(w);
	
	sh5.start();}

h1.setVisible(false);}	 

else if(ae.getSource()==h2)
{
	if(b1.isVisible()==true)
	{if(r=="label")
	u=label;
	else if (r=="label3")
	u=label3;
	else if (r=="label6")
	u=label6;
	else if (r=="label9")
	u=label9;
	else if (r=="label12")
	u=label12;
	sh5=new showhintf3(u);
	sh5.start();
	}
	else if(b1.isVisible()==false && b2.isVisible()==true)
	{ if(s=="label1")
	v=label1;
	else if (s=="label4")
	v=label4;
	else if (s=="label7")
	v=label7;
	else if (s=="label10")
	v=label10;
	else if (s=="label13")
	v=label13;
	sh5=new showhintf3(v);
	sh5.start();
	}
	else if(b2.isVisible()==false) //&& b2.isVisible()=false)
	{ if(q=="label2")
	w=label2;
	else if (q=="label5")
	w=label5;
	else if (q=="label8")
	w=label8;
	else if (q=="label11")
	w=label11;
	else if (q=="label14")
	w=label14;
	sh5=new showhintf3(w);

	sh5.start();
}

h2.setVisible(false);}	

else if(ae.getSource()==h3)
{
	if(b1.isVisible()==true)
	{if(r=="label")
	u=label;
	else if (r=="label3")
	u=label3;
	else if (r=="label6")
	u=label6;
	else if (r=="label9")
	u=label9;
	else if (r=="label12")
	u=label12;
	sh5=new showhintf3(u);
	sh5.start();
	}
	else if(b1.isVisible()==false && b2.isVisible()==true)
	{ if(s=="label1")
	v=label1;
	else if (s=="label4")
	v=label4;
	else if (s=="label7")
	v=label7;
	else if (s=="label10")
	v=label10;
	else if (s=="label13")
	v=label13;
	sh5=new showhintf3(v);
	sh5.start();
	}
	else if(b2.isVisible()==false) //&& b2.isVisible()=false)
	{ if(q=="label2")
	w=label2;
	else if (q=="label5")
	w=label5;
	else if (q=="label8")
	w=label8;
	else if (q=="label11")
	w=label11;
	else if (q=="label14")
	w=label14;
	sh5=new showhintf3(w);
	sh5.start();}

h3.setVisible(false);}	}

public static void main(String args[]) 
{f3 bgf3=new f3(0); 
    int t;   
int a2=3;
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
if(foo<3)
{FileOutputStream fout;		

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
		}
}
   check(bgf3);}

public static void checkscore(f3 bgf3)
{int i,k3;
k3=bgf3.k3;
bgf3.c3.setText(""+(k3+(bgf3.i*100))+"Points");
 bgf3.c3.setFont(new Font("algerian", Font.ITALIC,19));
      bgf3.c3.setForeground(Color.black);

bgf3.k4=k3+(bgf3.i*100);

}

public static void check(f3 bgf3)
{int i,j,a;
if(bgf3.i==15)
{
//JOptionPane.showMessageDialog(null,"Congratulations!!! You Have Cleared Stage Successfully. f3 Moving To Next Stage");
a=0;

if(bgf3.h1.isVisible()==true)
{
JOptionPane.showMessageDialog(null,"Congratulations!!! hint bonus:100 points");
try
{for(j=0;j<=100;j++)
{
bgf3.c3.setText(""+(j+bgf3.k4+a)+"Points");
Thread.sleep(5);}
}
catch(Exception ex){JOptionPane.showMessageDialog(null,ex.getMessage());}
a=a+100;
bgf3.h1.setVisible(false);}


if(bgf3.h2.isVisible()==true)
{JOptionPane.showMessageDialog(null,"Congratulations!!! hint bonus:100 points");

try
{for(j=0;j<=100;j++)
{
bgf3.c3.setText(""+(j+bgf3.k4+a)+"Points");
Thread.sleep(5);}
}
catch(Exception ex){JOptionPane.showMessageDialog(null,ex.getMessage());}
a=a+100;
bgf3.h2.setVisible(false);}


if(bgf3.h3.isVisible()==true)
{JOptionPane.showMessageDialog(null,"Congratulations!!! hint bonus:100 points");
try
{for(j=0;j<100;j++)
{
bgf3.c3.setText(""+(j+bgf3.k4+a)+"Points");
Thread.sleep(5);}
}
catch(Exception ex){JOptionPane.showMessageDialog(null,ex.getMessage());}

a=a+100;
bgf3.h3.setVisible(false);}
bgf3.k4=bgf3.k4+a;
JOptionPane.showMessageDialog(null,"Total Score:"+bgf3.k4);
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
if(fo<bgf3.k4)
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
		    new PrintStream(fout).print(bgf3.k4);
		    fout.close();		
		}
		catch (IOException e)
		{
			System.err.println ("Unable to write to file");
			System.exit(-1);
	}	}
new f4(bgf3.k4);
bgf3.dispose();
}}}