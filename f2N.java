import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
class showtimef2n implements Runnable
{
f2N frm3;
int time;
JLabel lb5;
public showtimef2n(f2N obj,JLabel object,int tm)
{
frm3=obj;
time=tm;
lb5=object;
}

public void run()
{
try
{
int a=time*600;
for(int i=(time-1);i>=0;i--)
{for(int j=60;j>=0;j--)
{lb5.setText(""+i+":"+j+"");
 lb5.setFont(new Font("Algerian", Font.BOLD,30));
      lb5.setForeground(Color.white);
Thread.sleep(1000);}
}
}
catch(Exception ex)
{
System.out.println(ex.getMessage());
}
if(frm3.i<15)
{JOptionPane.showMessageDialog(null,"Game Over...");
new f2N1();
frm3.dispose();}
}}
//------------------------------------------
class showhintf2n extends Thread
{
JLabel frm3;
public showhintf2n(JLabel obj)
{
frm3=obj;
}

public void run()
{
try
{
for(int i=0;i<10;i++)
{
frm3.setVisible(!frm3.isVisible());
Thread.sleep(200);
}
frm3.setVisible(true);
}
catch(Exception ex)
{
System.out.println(ex.getMessage());
}

}
}
//-------------------------------------------------------------------
class f2N extends JFrame implements MouseListener
{
    JLabel label,label1,label2,label3,b1,b2,b3,label4,label5,label6,label7,label8,label9,label10,label11,label12,label13,label14,l,u,v,w,a,b,c,h1,h2,h3,c1,c2,c3;
    int i,x,k;
    boolean dt;
String r,s,q;
showhintf2n sh3;
Thread th;
 
    public f2N() 
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
	b1 = new JLabel();   	
        b2= new JLabel(); 
        b3 = new JLabel(); 
c1 = new JLabel();
	c2 = new JLabel();
	c3 = new JLabel();
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
c1.setIcon(new ImageIcon("obj/c6.png"));
	c2=new JLabel();
	c3=new JLabel();
  		b1.setIcon(new ImageIcon("b1.png"));
        b2.setIcon(new ImageIcon("b2.png"));
	b3.setIcon(new ImageIcon("b3.png"));
  		a.setIcon(new ImageIcon("obj/perfume1.png"));
        b.setIcon(new ImageIcon("obj/bird2.png"));
	c.setIcon(new ImageIcon("obj/butterfly.png"));
   	label.setIcon(new ImageIcon("obj/perfume1.png"));
        label1.setIcon(new ImageIcon("obj/bird.png"));
	label2.setIcon(new ImageIcon("obj/butterfly.png"));
	label3.setIcon(new ImageIcon("obj/mop1.png"));
        label4.setIcon(new ImageIcon("obj/ringbox.png"));
        label5.setIcon(new ImageIcon("obj/comb2.png"));
	label6.setIcon(new ImageIcon("obj/mobile.png"));
	label7.setIcon(new ImageIcon("obj/towel.png"));
        label8.setIcon(new ImageIcon("obj/hat1.png"));
        label9.setIcon(new ImageIcon("obj/pearls.png"));
	label10.setIcon(new ImageIcon("obj/binaculas2.png"));
	label11.setIcon(new ImageIcon("obj/keyring.png"));
	label12.setIcon(new ImageIcon("obj/pendrive.png"));
	label13.setIcon(new ImageIcon("obj/spects3.png"));
	label14.setIcon(new ImageIcon("obj/sunglasses.png"));
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
  	
          c1.setBounds(1200, 660, size.width+150, size.height+20);
          c2.setBounds(226, 0, size.width+80, size.height);
          c3.setBounds(1293, 50, size.width+80, size.height+20);
  
         h1.setBounds(1284, 450, 100,100);
	 h2.setBounds(1294, 450, 100,100);	
         h3.setBounds(1304, 450, 100,100);

	
          a.setBounds(1300, 120, size.width+50, size.height+50);
	  b.setBounds(1310, 190, size.width+50, size.height+50);	
          c.setBounds(1300, 260, size.width+50, size.height+50);
 b1.setBounds(400, 600, size.width+50, size.height+50);
	  b2.setBounds(500, 600, size.width+50, size.height+50);	
          b3.setBounds(600, 600, size.width+50, size.height+50);
         label.setBounds(755, 190, size.width, size.height);
  label.setBounds(371, 43, size.width, size.height);
	  label1.setBounds(0, 290, size.width+80, size.height+80);	
          label2.setBounds(540, 570, size.width+50, size.height+50);
	  label3.setBounds(725, 550, size.width+80, size.height+80);
	  label4.setBounds(250, 5, size.width+50, size.height+50);
	  label5.setBounds(380, 457, size.width+80, size.height+80);	
          label6.setBounds(927, 160, size.width+50, size.height+50);
	  label7.setBounds(370, 175, size.width+50, size.height+50);
	  label8.setBounds(140,210, size.width+80, size.height+80);
	  label9.setBounds(390, 610, size.width+100, size.height+100);          
          label10.setBounds(1035, 580, size.width+80, size.height+80);
	  label11.setBounds(260, 448, size.width+100, size.height+100);
	  label12.setBounds(453, 620, size.width+80, size.height+80);
	  label13.setBounds(517, 110, size.width+100, size.height+100);
	  label14.setBounds(270, 520, size.width+80, size.height+80);
          setLayout(new BorderLayout());
        JLabel background=new JLabel(new ImageIcon("2.jpg"));
        add(background);
	i=0;
k=0;
c3.setText(""+(i*100)+"Points");
 c3.setFont(new Font("algerian", Font.ITALIC,13));
      c3.setForeground(Color.black);
	pack();
        showtimef2n t=new showtimef2n(this,c2,2);
	Thread th=new Thread(t);
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
label.setVisible(false);check(this);checkscore(this);
 a.setIcon(new ImageIcon("obj/mop1.1.png"));
r="label3";}
  	
else if(ae.getSource()==label1)
{
i++;label4.addMouseListener(this);checkscore(this);
label1.setVisible(false);check(this);
 b.setIcon(new ImageIcon("obj/ringbox2.png"));
s="label4";}
  	
else if(ae.getSource()==label2)
{
i++;label5.addMouseListener(this);checkscore(this);
label2.setVisible(false);check(this);
 c.setIcon(new ImageIcon("obj/comb3.png"));
q="label5";}

else if(ae.getSource()==label3)
{
i++;label6.addMouseListener(this);checkscore(this);
label3.setVisible(false);check(this);
 a.setIcon(new ImageIcon("obj/mobile1.png"));
r="label6";}

else if(ae.getSource()==label4)
{
i++; label7.addMouseListener(this);checkscore(this);
label4.setVisible(false);check(this);
 b.setIcon(new ImageIcon("obj/towel2.png"));
s="label7";}
  	
else if(ae.getSource()==label5)
{
i++; label8.addMouseListener(this);checkscore(this);
label5.setVisible(false);check(this);
c.setIcon(new ImageIcon("obj/hat5.png"));
q="label8";}
  	
else if(ae.getSource()==label6)
{
i++;label9.addMouseListener(this);checkscore(this);
label6.setVisible(false);check(this);
a.setIcon(new ImageIcon("obj/pearls2.png"));
r="label9";}
  	
else if(ae.getSource()==label7)
{
i++;label10.addMouseListener(this);checkscore(this);
label7.setVisible(false);check(this);
b.setIcon(new ImageIcon("obj/binaculas3.png"));
 s="label10";}
  	
else if(ae.getSource()==label8)
{
i++;label11.addMouseListener(this);checkscore(this);
label8.setVisible(false);check(this);
 c.setIcon(new ImageIcon("obj/keyring3.png"));
 q="label11";}
  	
else if(ae.getSource()==label9)
{
i++;label12.addMouseListener(this);checkscore(this);
label9.setVisible(false);check(this);
 a.setIcon(new ImageIcon("obj/pendrive2.png"));
r="label12";}
  	
else if(ae.getSource()==label10)
{
i++;label13.addMouseListener(this);checkscore(this);
label10.setVisible(false);check(this);
 b.setIcon(new ImageIcon("obj/spects2.png"));
 s="label13";}
  	
else if(ae.getSource()==label11)
{
i++;label14.addMouseListener(this);checkscore(this);
label11.setVisible(false);check(this);
 c.setIcon(new ImageIcon("obj/sunglasses2.png"));
q="label14";}

else if(ae.getSource()==label12)
{i++;

label12.setVisible(false);check(this);checkscore(this);
a.setVisible(false);check(this);
b1.setVisible(false);check(this);
}

else if(ae.getSource()==label13)
{i++;
label13.setVisible(false);check(this);
b.setVisible(false);checkscore(this);
b2.setVisible(false);
}

else if(ae.getSource()==label14)
{i++;
label14.setVisible(false);checkscore(this);
c.setVisible(false);
b3.setVisible(false);
check(this);
} 

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
	sh3=new showhintf2n(u);
	sh3.start();
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
	sh3=new showhintf2n(v);
	sh3.start();
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
	sh3=new showhintf2n(w);
	sh3.start();}

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
	sh3=new showhintf2n(u);
	sh3.start();
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
	sh3=new showhintf2n(v);
	sh3.start();
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
	sh3=new showhintf2n(w);
	sh3.start();}

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
	sh3=new showhintf2n(u);
	sh3.start();
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
	sh3=new showhintf2n(v);
	sh3.start();
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
	sh3=new showhintf2n(w);
	sh3.start();}
h3.setVisible(false);}	}	

public static void main(String args[]) 
{f2N bgf2n=new f2N(); 
    int t;  
int a1=2;
String z1=null;  
FileInputStream fin;
	try
		{
		    fin = new FileInputStream("newfile.txt");
      z1=new DataInputStream(fin).readLine();
		    fin.close();		
		}
		catch (IOException e)
		{
			System.err.println ("Unable to read from file");
			System.exit(-1);
		}
//if(z1)
int foo = Integer.parseInt(z1);
if(foo<2)
{FileOutputStream fout;		

		try
		{
		    fout = new FileOutputStream ("newfile.txt");
		    new PrintStream(fout).print(a1);
		    fout.close();		
		}
		catch (IOException e)
		{
			System.err.println ("Unable to write to file");
			System.exit(-1);
		}

 }
   check(bgf2n);}

public static void checkscore(f2N bgf2N)
{int i;
bgf2N.c3.setText(""+(bgf2N.i*100)+"Points");
 bgf2N.c3.setFont(new Font("algerian", Font.ITALIC,13));
      bgf2N.c3.setForeground(Color.black);
i=bgf2N.i*100;
bgf2N.k=i;


}
public static void check(f2N bgf2n)
{int i,j,a;
if(bgf2n.i==15)
{//JOptionPane.showMessageDialog(null,"Congratulations!!! You Have Cleared Stage Successfully. f2 Moving To Next Stage");
a=0;

if(bgf2n.h1.isVisible()==true)
{
JOptionPane.showMessageDialog(null,"Congratulations!!! hint bonus:100 points");
try
{for(j=0;j<=100;j++)
{
bgf2n.c3.setText(""+(j+bgf2n.k+a)+"Points");
Thread.sleep(5);}
}
catch(Exception ex){JOptionPane.showMessageDialog(null,ex.getMessage());}
a=a+100;
bgf2n.h1.setVisible(false);}


if(bgf2n.h2.isVisible()==true)
{JOptionPane.showMessageDialog(null,"Congratulations!!! hint bonus:100 points");

try
{for(j=0;j<=100;j++)
{
bgf2n.c3.setText(""+(j+bgf2n.k+a)+"Points");
Thread.sleep(5);}
}
catch(Exception ex){JOptionPane.showMessageDialog(null,ex.getMessage());}
a=a+100;
bgf2n.h2.setVisible(false);}


if(bgf2n.h3.isVisible()==true)
{JOptionPane.showMessageDialog(null,"Congratulations!!! hint bonus:100 points");
try
{for(j=0;j<100;j++)
{
bgf2n.c3.setText(""+(j+bgf2n.k+a)+"Points");
Thread.sleep(5);}
}
catch(Exception ex){JOptionPane.showMessageDialog(null,ex.getMessage());}

a=a+100;
bgf2n.h3.setVisible(false);}
bgf2n.k=bgf2n.k+a;

JOptionPane.showMessageDialog(null,"Total Score:"+bgf2n.k);
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
if(fo<bgf2n.k)
{FileOutputStream fout;		

		try
		{
		    fout = new FileOutputStream ("score.txt");
		    new PrintStream(fout).print(bgf2n.k);
		    fout.close();		
		}
		catch (IOException e)
		{
			System.err.println ("Unable to write to file");
			System.exit(-1);
	}	}
new f3(bgf2n.k);
bgf2n.dispose();
}}}