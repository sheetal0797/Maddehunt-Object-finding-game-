import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
class showhintf1N extends Thread
{
JLabel frm44;
public showhintf1N(JLabel obj)
{
frm44=obj;
}

public void run()
{
try
{
for(int i=0;i<10;i++)
{
frm44.setVisible(!frm44.isVisible());
Thread.sleep(200);
}
frm44.setVisible(true);
}
catch(Exception ex)
{
System.out.println(ex.getMessage());
}
}
}

//----------------------------------------------
class showtimef1N implements Runnable
{
f1N frm44;
JLabel lb2;
int time;

public showtimef1N(f1N obj,JLabel object,int tm)
{
frm44=obj;
lb2=object;
time=tm;
}

public void run()
{
try
{
int a=time*600;
for(int i=(time-1);i>=0;i--)
{for(int j=60;j>=0;j--)
{lb2.setText(""+i+":"+j+"");
 lb2.setFont(new Font("Algerian", Font.BOLD,30));
      lb2.setForeground(Color.black);
Thread.sleep(1000);}
}
}
catch(Exception ex)
{
System.out.println(ex.getMessage());
}
// condition if time out and i!=15 
if(frm44.i<15)
{JOptionPane.showMessageDialog(null,"Game Over");
new f1N1();
frm44.dispose();}
}
}
//-------------------------------------------------------------------
class f1N extends JFrame implements MouseListener
{
    JLabel label,label1,label2,label3,b1,b2,b3,label4,label5,label6,label7,label8,label9,label10,label11,label12,label13,label14,l,u,v,w,a,b,c,h1,h2,h3,c1,c2,c3;
    int i,x,i1,k;
    boolean dt;
String r,s,q;
showhintf1N sh44;
Thread th;
 
    public f1N() 
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
c1=new JLabel();
c1.setIcon(new ImageIcon("obj/c6.png"));
	c2=new JLabel();
	c3=new JLabel();
   	a.setIcon(new ImageIcon("obj/beetle1.png"));
        b.setIcon(new ImageIcon("obj/whistle4.png"));
	c.setIcon(new ImageIcon("obj/key1.2.png"));
	b1.setIcon(new ImageIcon("b1.png"));
        b2.setIcon(new ImageIcon("b2.png"));
	b3.setIcon(new ImageIcon("b3.png"));
        label.setIcon(new ImageIcon("obj/beetle2.png"));
        label1.setIcon(new ImageIcon("obj/whistle5.png"));
	label2.setIcon(new ImageIcon("obj/key5.png"));
	label3.setIcon(new ImageIcon("obj/diamond.png"));
        label4.setIcon(new ImageIcon("obj/broom.png"));
        label5.setIcon(new ImageIcon("obj/moon.png"));
	label6.setIcon(new ImageIcon("obj/rollingpin2.png"));
	label7.setIcon(new ImageIcon("obj/earthworm4.png"));
        label8.setIcon(new ImageIcon("obj/axe5.png"));
        label9.setIcon(new ImageIcon("obj/nail1.png"));
	label10.setIcon(new ImageIcon("obj/bucket.png"));
	label11.setIcon(new ImageIcon("obj/rugby ball.png"));
	label12.setIcon(new ImageIcon("obj/spinach.png"));
	label13.setIcon(new ImageIcon("obj/clarinet copy.png"));
	label14.setIcon(new ImageIcon("obj/stick2.png"));
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

  h1.setBounds(10, 620, 100,100);
	 h2.setBounds(30, 620, 100,100);	
          h3.setBounds(50, 620, 100,100);
  
          c1.setBounds(1200, 660, size.width+150, size.height+20);
          c2.setBounds(1175, 0, size.width+80, size.height);
          c3.setBounds(988, 660, size.width+80, size.height+20);

	  a.setBounds(400, 640, size.width+60, size.height+60);
	  b.setBounds(480, 640, size.width+60, size.height+60);	
          c.setBounds(580, 640, size.width+60, size.height+60);

	  b1.setBounds(400, 550, size.width+60, size.height+60);
	  b2.setBounds(480, 600, size.width+60, size.height+60);	
          b3.setBounds(580, 600, size.width+60, size.height+60);
          a.setBounds(400, 640, size.width+60, size.height+60);
	  b.setBounds(500, 640, size.width+60, size.height+60);	
          c.setBounds(600, 640, size.width+60, size.height+60);

          label.setBounds(341, 95, size.width, size.height);
	  label1.setBounds(180, 524, size.width+50, size.height+50);	
          label2.setBounds(0, 70, size.width+100, size.height+100);
	  label3.setBounds(120, 45, size.width+50, size.height+100);
	  label4.setBounds(0, 380, size.width+80, size.height+80);
	  label5.setBounds(1020, 90, size.width+50, size.height+50);	
          label6.setBounds(830, 283, size.width+80, size.height+80);
	  label7.setBounds(366, 560, size.width+80, size.height+80);
	  label8.setBounds(110, 280, size.width+100, size.height+100);
	  label9.setBounds(1059, 376, size.width+50, size.height+50);          
          label10.setBounds(1110, 510, size.width+80, size.height+80);
	  label11.setBounds(989, 296, size.width+50, size.height+50);
	  label12.setBounds(0, 513, size.width+100, size.height+100);
	  label13.setBounds(860, 540, size.width+60, size.height+60);
	  label14.setBounds(160, 370, size.width+100, size.height+100);
       
          setLayout(new BorderLayout());
        JLabel background=new JLabel(new ImageIcon("1.png"));
        add(background);
	i=0;
k=0;

c3.setText(""+(i*100)+"Points");
 c3.setFont(new Font("algerian", Font.ITALIC,19));
      c3.setForeground(Color.black);
	pack();
        showtimef1N t=new showtimef1N(this,c2,2);
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
  a.setIcon(new ImageIcon("obj/diamond2.png"));
r="label3";

}
  	
 else if(ae.getSource()==label1)
 {
 i++;label4.addMouseListener(this);
 label1.setVisible(false);check(this);
  b.setIcon(new ImageIcon("obj/broom2.png"));
s="label4";checkscore(this);

}
  	
else if(ae.getSource()==label2)
{i++;label5.addMouseListener(this);
label2.setVisible(false);check(this);
 c.setIcon(new ImageIcon("obj/moon2.png"));
q="label5";checkscore(this);
}

else if(ae.getSource()==label3)
{i++;label6.addMouseListener(this);
label3.setVisible(false);check(this);
 a.setIcon(new ImageIcon("obj/rollingpin3.png"));
r="label6";checkscore(this);

}

else if(ae.getSource()==label4)
{i++; label7.addMouseListener(this);
label4.setVisible(false);check(this);
 b.setIcon(new ImageIcon("obj/earthworm3.png"));
s="label7";checkscore(this);

}
  	
else if(ae.getSource()==label5)
{i++; label8.addMouseListener(this);
label5.setVisible(false);check(this);
c.setIcon(new ImageIcon("obj/axe4.png"));
q="label8";checkscore(this);

}
  	
else if(ae.getSource()==label6)
{i++;label9.addMouseListener(this);
label6.setVisible(false);check(this);
a.setIcon(new ImageIcon("obj/nail3.png"));
r="label9";checkscore(this);

}
  	
else if(ae.getSource()==label7)
{i++;label10.addMouseListener(this);
label7.setVisible(false);check(this);
b.setIcon(new ImageIcon("obj/bucket3.png"));
 s="label10";checkscore(this);

}
  	
else if(ae.getSource()==label8)
{i++;label11.addMouseListener(this);
label8.setVisible(false);check(this);
c.setIcon(new ImageIcon("obj/rugby ball1.png"));
 q="label11";checkscore(this);

}
  	
else if(ae.getSource()==label9)
{i++;label12.addMouseListener(this);
label9.setVisible(false);check(this);
 a.setIcon(new ImageIcon("obj/spinach2.png"));
r="label12";checkscore(this);

}
  	
else if(ae.getSource()==label10)
{i++;label13.addMouseListener(this);
label10.setVisible(false);check(this);
 b.setIcon(new ImageIcon("obj/clarinet2.png"));
 s="label13";checkscore(this);

}
  	
else if(ae.getSource()==label11)
{i++;label14.addMouseListener(this);
label11.setVisible(false);check(this);
 c.setIcon(new ImageIcon("obj/stick3.png"));
q="label14";checkscore(this);

}

else if(ae.getSource()==label12)
{i++;checkscore(this);
label12.setVisible(false);
a.setVisible(false);
b1.setVisible(false);

}

else if(ae.getSource()==label13)
{i++;checkscore(this);
label13.setVisible(false);
b.setVisible(false);
b2.setVisible(false);check(this);

}

else if(ae.getSource()==label14)
{i++;checkscore(this);
label14.setVisible(false);
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
	sh44=new showhintf1N(u);
	sh44.start();
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
	sh44=new showhintf1N(v);
	sh44.start();
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
	sh44=new showhintf1N(w);
	
	sh44.start();}

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
	sh44=new showhintf1N(u);
	sh44.start();
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
	sh44=new showhintf1N(v);
	sh44.start();
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
	sh44=new showhintf1N(w);

	sh44.start();
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
	sh44=new showhintf1N(u);
	sh44.start();
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
	sh44=new showhintf1N(v);
	sh44.start();
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
	sh44=new showhintf1N(w);
	sh44.start();}

h3.setVisible(false);}	}

public static void main(String args[]) 
{f1N bgf1N=new f1N(); 
    int t; 
String g1=null;
int z1=1;  
		FileInputStream fin;		

		try
		{
		    fin = new FileInputStream ("newfile.txt");
		    g1= new DataInputStream(fin).readLine() ;
		    fin.close();		
		}
		catch (IOException e)
		{
			System.err.println ("Unable to read from file");
			System.exit(-1);
		}


//if(g1.equal("2"))
int foo = Integer.parseInt(g1);
if(foo<1)
{FileOutputStream fout;		

		try
		{
		    fout = new FileOutputStream ("newfile.txt");
		    new PrintStream(fout).print(z1);
		    fout.close();		
		}
		catch (IOException e)
		{
			System.err.println ("Unable to write to file");
			System.exit(-1);
		}
  }
   check(bgf1N);}

public static void checkscore(f1N bgf1N)
{int i;
bgf1N.c3.setText(""+(bgf1N.i*100)+"Points");
 bgf1N.c3.setFont(new Font("algerian", Font.ITALIC,19));
      bgf1N.c3.setForeground(Color.black);

i=bgf1N.i*100;
bgf1N.k=i;

}

public static void check(f1N bgf1N)
{int i,j,a;
if(bgf1N.i==15)
{//JOptionPane.showMessageDialog(null,"Congratulations!!! You Have Cleared Stage Successfully. f1N Moving To Next Stage");
a=0;

if(bgf1N.h1.isVisible()==true)
{
JOptionPane.showMessageDialog(null,"Congratulations!!! hint bonus:100 points");
try
{for(j=0;j<=100;j++)
{
bgf1N.c3.setText(""+(j+bgf1N.k+a)+"Points");
Thread.sleep(5);}
}
catch(Exception ex){JOptionPane.showMessageDialog(null,ex.getMessage());}
a=a+100;
bgf1N.h1.setVisible(false);}


if(bgf1N.h2.isVisible()==true)
{JOptionPane.showMessageDialog(null,"Congratulations!!! hint bonus:100 points");

try
{for(j=0;j<=100;j++)
{
bgf1N.c3.setText(""+(j+bgf1N.k+a)+"Points");
Thread.sleep(5);}
}
catch(Exception ex){JOptionPane.showMessageDialog(null,ex.getMessage());}
a=a+100;
bgf1N.h2.setVisible(false);}


if(bgf1N.h3.isVisible()==true)
{JOptionPane.showMessageDialog(null,"Congratulations!!! hint bonus:100 points");
try
{for(j=0;j<100;j++)
{
bgf1N.c3.setText(""+(j+bgf1N.k+a)+"Points");
Thread.sleep(5);}
}
catch(Exception ex){JOptionPane.showMessageDialog(null,ex.getMessage());}

a=a+100;
bgf1N.h3.setVisible(false);}
bgf1N.k=bgf1N.k+a;

JOptionPane.showMessageDialog(null,"Total Score:"+bgf1N.k);
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
if(fo<bgf1N.k)
{FileOutputStream fout;		

		try
		{
		    fout = new FileOutputStream ("score.txt");
		    new PrintStream(fout).print(bgf1N.k);
		    fout.close();		
		}
		catch (IOException e)
		{
			System.err.println ("Unable to write to file");
			System.exit(-1);
	}	}

new f2(bgf1N.k);
bgf1N.dispose();
}}}