import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
class showhintf10N extends Thread
{
JLabel frm27;
public showhintf10N(JLabel obj)
{
frm27=obj;
}
public void run()
{
try
{
for(int i=0;i<10;i++)
{
frm27.setVisible(!frm27.isVisible());
Thread.sleep(200);
}
frm27.setVisible(true);
}
catch(Exception ex)
{
System.out.println(ex.getMessage());
}
}
}

//-----------------------------------------------
class showtimef10N implements Runnable
{
f10N frm27;
int time;
JLabel lb29;
public showtimef10N(f10N obj,JLabel object,int tm)
{
frm27=obj;
time=tm;
lb29=object;
}

public void run()
{
try
{
int a=time*600;
for(int i=(time-1);i>=0;i--)
{for(int j=60;j>=0;j--)
{lb29.setText(""+i+":"+j+"");
 lb29.setFont(new Font("Algerian", Font.BOLD,30));
      lb29.setForeground(Color.black);
Thread.sleep(1000);}
}
}
catch(Exception ex)
{
System.out.println(ex.getMessage());
}
if(frm27.i<15)
{JOptionPane.showMessageDialog(null,"GAME OVER...");
new f10N1();
frm27.dispose();}
}
}

class f10N extends JFrame implements MouseListener
{
    JLabel label,label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12,label13,label14,l,u,v,w,a,b,c,h1,h2,h3,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,c1,c2,c3;
    int i,k;
    boolean dt;
showhintf10N sh27;
Thread th;
    public f10N() 
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
	
	
	l1 = new JLabel("A pin with a point that is bent back to the head & is held in a guard when closed");
  l1.setFont(new Font("times new roman", Font.BOLD,24));
      l1.setForeground(Color.black);  
        l2 = new JLabel("A weapon with a long metal blade used for sriking."); 
  l2.setFont(new Font("times new roman", Font.BOLD,25));
      l2.setForeground(Color.black); 
        l3 = new JLabel("An instrument which is inserted into a lock & turned to open and close it."); 
  l3.setFont(new Font("times new roman", Font.BOLD,24));
      l3.setForeground(Color.black);
	l4 = new JLabel("A pale yellow oval citrus fruit with thick skin & fragrant,acidic juice."); 
  l4.setFont(new Font("times new roman", Font.BOLD,24));
	l5 = new JLabel("An alphabet having zero like shape."); 
  l5.setFont(new Font("times new roman", Font.BOLD,24));
        l6 = new JLabel("A small powerfull boat used for towing large boat & ships.");
  l6.setFont(new Font("times new roman", Font.BOLD,24)); 
        l7 = new JLabel("A machine that is used for drilling holes through materials including the range of wood etc."); 
  l7.setFont(new Font("times new roman", Font.BOLD,23));
	l8 = new JLabel("It is a hand tool used to trim hangnails etc.");
  l8.setFont(new Font("times new roman", Font.BOLD,24));
        l9 = new JLabel("A musical instrument consisting of a flat wooden soundbox with numerous strings across it."); 
  l9.setFont(new Font("times new roman", Font.BOLD,24)); 
        l10 = new JLabel("An insect bolonging to suborder anisoptera."); 
  l10.setFont(new Font("times new roman", Font.BOLD,24));
        l11 = new JLabel("A wrinkled edible seed havings two halves contained within a hard shell."); 
  l11.setFont(new Font("times new roman", Font.BOLD,24));
	l12 = new JLabel("A small hexagonal piece of metal used for screwing onto a bolt."); 
  l12.setFont(new Font("times new roman", Font.BOLD,24));
	l13 = new JLabel("A hard solid non-metallic mineral matter of which rock is made."); 
  l13.setFont(new Font("times new roman", Font.BOLD,24));
	l14 = new JLabel("A metal pin used to join things together by being rotated. ");
  l14.setFont(new Font("times new roman", Font.BOLD,24));
	l15 = new JLabel("A powered fly vehical with fixed wings.");
  l15.setFont(new Font("times new roman", Font.BOLD,24));


        label.setIcon(new ImageIcon("obj/safetypin.png"));
        label1.setIcon(new ImageIcon("obj/sword.png"));
	label2.setIcon(new ImageIcon("obj/key7.png"));
	label3.setIcon(new ImageIcon("obj/lemon.png"));
        label4.setIcon(new ImageIcon("obj/O1.png"));
        label5.setIcon(new ImageIcon("obj/tug.png"));
	label6.setIcon(new ImageIcon("obj/drill machine.png"));
	label7.setIcon(new ImageIcon("obj/nail cutter.png"));
        label8.setIcon(new ImageIcon("obj/zither.png"));
        label9.setIcon(new ImageIcon("obj/dragon fly1.png"));
	label10.setIcon(new ImageIcon("obj/wallnut.png"));
	label11.setIcon(new ImageIcon("obj/nutbold1.png"));
	label12.setIcon(new ImageIcon("obj/stone.png"));
	label13.setIcon(new ImageIcon("obj/screw1.png"));
	label14.setIcon(new ImageIcon("obj/airoplane.png"));

panel.add(c1);c1.addMouseListener(this);
panel.add(c2);
panel.add(c3);

         panel.add(label); label.addMouseListener(this);
         panel.add(label1); 
	 panel.add(label2); 
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
	panel.add(h1); h1.addMouseListener(this);
        panel.add(h2); h2.addMouseListener(this);
	panel.add(h3); h3.addMouseListener(this);
	   Dimension size = label.getPreferredSize();
 c1.setBounds(1180, 665, size.width+60, size.height+20);
          c2.setBounds(50, 64, size.width+80, size.height+20);
          c3.setBounds(1245, 73, size.width+100, size.height+20);
  h1.setBounds(10, 608, 100,100);
	 h2.setBounds(30, 608, 100,100);	
          h3.setBounds(50, 608, 100,100);

          label.setBounds(1010, 50, size.width+80, size.height+80);
	  label1.setBounds(463, 200, size.width+80, size.height+80);	
          label2.setBounds(170, 460, size.width+80, size.height+80);
	  label3.setBounds(920, 400, size.width+80, size.height+80);
	  label4.setBounds(1225, 160, size.width+80, size.height+80);
	  label5.setBounds(445, 30, size.width+80, size.height+80);	
          label6.setBounds(20, 360, size.width+80, size.height+80);
	  label7.setBounds(990, 130, size.width+80, size.height+80);
	  label8.setBounds(840, 310, size.width+80, size.height+80);
	  label9.setBounds(190, 340, size.width+80, size.height+80);    
          label10.setBounds(1030, 410, size.width+80, size.height+80);
	  label11.setBounds(1030, 500, size.width+80, size.height+80);
	  label12.setBounds(650, 480, size.width+80, size.height+80);
	  label13.setBounds(305, 170, size.width+80, size.height+80);
	  label14.setBounds(480, 245, size.width+80, size.height+80);
          l1.setBounds(50, 5, size.width+1200, size.height+20);
          l2.setBounds(50, 5, size.width+1200, size.height+20);
          l3.setBounds(50, 5, size.width+1200, size.height+20);
          l4.setBounds(50, 5, size.width+1200, size.height+20);
          l5.setBounds(50, 5, size.width+1200, size.height+20);
          l6.setBounds(50, 5, size.width+1200, size.height+20);
          l7.setBounds(50, 5, size.width+1200, size.height+20);
          l8.setBounds(50, 5, size.width+1200, size.height+20);
          l9.setBounds(50, 5, size.width+1200, size.height+20);
          l10.setBounds(50, 5, size.width+1200, size.height+20);
          l11.setBounds(50, 5, size.width+1200, size.height+20);     
          l12.setBounds(50, 5, size.width+1200, size.height+20);
          l13.setBounds(50, 5, size.width+1200, size.height+20);
          l14.setBounds(50, 5, size.width+1200, size.height+20);
          l15.setBounds(50, 5, size.width+1200, size.height+20);
l2.setVisible(false);
l3.setVisible(false);
l4.setVisible(false);
l5.setVisible(false);
l6.setVisible(false);
l7.setVisible(false);
l8.setVisible(false);
l9.setVisible(false);
l10.setVisible(false);
l11.setVisible(false);
l12.setVisible(false);
l13.setVisible(false);
l14.setVisible(false);
l15.setVisible(false);
          setLayout(new BorderLayout());
        JLabel background=new JLabel(new ImageIcon("10.jpg"));
        add(background);
	i=0;
k=0;
c3.setText(""+(i*100)+"Points");
 c3.setFont(new Font("algerian", Font.ITALIC,19));
      c3.setForeground(Color.black);
	pack();
 
showtimef10N t=new showtimef10N(this,c2,2);
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
label1.addMouseListener(this);
l1.setVisible(false);
l2.setVisible(true);
check(this);}
  	
else if(ae.getSource()==label1)
{i++;label2.addMouseListener(this);
l2.setVisible(false);checkscore(this);
l3.setVisible(true);
label1.setVisible(false);check(this);
hintsong d2=new hintsong();
	Thread e2=new Thread(d2);
	e2.start();}
  	
else if(ae.getSource()==label2)
{i++;label3.addMouseListener(this);
l3.setVisible(false);checkscore(this);
l4.setVisible(true);
label2.setVisible(false);check(this);
hintsong d2=new hintsong();
	Thread e2=new Thread(d2);
	e2.start();}

else if(ae.getSource()==label3)
{i++;label4.addMouseListener(this);
l4.setVisible(false);checkscore(this);
l5.setVisible(true);
label3.setVisible(false);check(this);
hintsong d2=new hintsong();
	Thread e2=new Thread(d2);
	e2.start();}

else if(ae.getSource()==label4)
{i++;label5.addMouseListener(this);
l5.setVisible(false);checkscore(this);
l6.setVisible(true);
label4.setVisible(false);check(this);
hintsong d2=new hintsong();
	Thread e2=new Thread(d2);
	e2.start();}
  	
else if(ae.getSource()==label5)
{i++;label6.addMouseListener(this);
l6.setVisible(false);checkscore(this);
l7.setVisible(true);
label5.setVisible(false);check(this);
hintsong d2=new hintsong();
	Thread e2=new Thread(d2);
	e2.start();}
  	
else if(ae.getSource()==label6)
{i++;label7.addMouseListener(this);
l7.setVisible(false);checkscore(this);
l8.setVisible(true);
label6.setVisible(false);check(this);
hintsong d2=new hintsong();
	Thread e2=new Thread(d2);
	e2.start();}
  	
else if(ae.getSource()==label7)
{i++;label8.addMouseListener(this);
l8.setVisible(false);checkscore(this);
l9.setVisible(true);
label7.setVisible(false);check(this);
hintsong d2=new hintsong();
	Thread e2=new Thread(d2);
	e2.start();}
  	
else if(ae.getSource()==label8)
{i++;label9.addMouseListener(this);
l9.setVisible(false);checkscore(this);
l10.setVisible(true);
label8.setVisible(false);check(this);
hintsong d2=new hintsong();
	Thread e2=new Thread(d2);
	e2.start();}
  	
else if(ae.getSource()==label9)
{i++;l10.setVisible(false);checkscore(this);
label10.addMouseListener(this);
l11.setVisible(true);
label9.setVisible(false);check(this);
hintsong d2=new hintsong();
	Thread e2=new Thread(d2);
	e2.start();}
  	
else if(ae.getSource()==label10)
{i++;label11.addMouseListener(this);
l11.setVisible(false);checkscore(this);
l12.setVisible(true);
label10.setVisible(false);check(this);hintsong d2=new hintsong();
	Thread e2=new Thread(d2);
	e2.start();}
  	
else if(ae.getSource()==label11)
{i++;label12.addMouseListener(this);
l12.setVisible(false);checkscore(this);
l13.setVisible(true);
label11.setVisible(false);check(this);
hintsong d2=new hintsong();
	Thread e2=new Thread(d2);
	e2.start();}

else if(ae.getSource()==label12)
{i++;label13.addMouseListener(this);
l13.setVisible(false);checkscore(this);
l14.setVisible(true);
label12.setVisible(false);check(this);
hintsong d2=new hintsong();
	Thread e2=new Thread(d2);
	e2.start();}

else if(ae.getSource()==label13)
{i++;label14.addMouseListener(this);
l14.setVisible(false);checkscore(this);
l15.setVisible(true);
label13.setVisible(false);check(this);
hintsong d2=new hintsong();
	Thread e2=new Thread(d2);
	e2.start();}

else if(ae.getSource()==label14)
{i++;l5.setVisible(false);checkscore(this);
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
sh27=new showhintf10N(u);
	sh27.start();  }
else if(label1.isVisible()==true)
   {u=label1;
sh27=new showhintf10N(u);
	sh27.start();  }
else if(label2.isVisible()==true)
   {u=label2;
sh27=new showhintf10N(u);
	sh27.start();  }
else if(label3.isVisible()==true)
   {u=label3;
sh27=new showhintf10N(u);
	sh27.start();  }
else if(label4.isVisible()==true)
  {u=label4;
sh27=new showhintf10N(u);
	sh27.start();  }
else if(label5.isVisible()==true)
   {u=label5;
sh27=new showhintf10N(u);
	sh27.start();  }
else if(label6.isVisible()==true)
   {u=label6;
sh27=new showhintf10N(u);
	sh27.start();  }
else if(label7.isVisible()==true)
   {u=label7;
sh27=new showhintf10N(u);
	sh27.start();  }
else if(label8.isVisible()==true)
   {u=label8;
sh27=new showhintf10N(u);
	sh27.start();  }
else if(label9.isVisible()==true)
   {u=label9;
sh27=new showhintf10N(u);
	sh27.start();  }
else if(label10.isVisible()==true)
   {u=label10;
sh27=new showhintf10N(u);
	sh27.start();  }
else if(label11.isVisible()==true)
   {u=label11;
sh27=new showhintf10N(u);
	sh27.start();  }
else if(label12.isVisible()==true)
   {u=label12;
sh27=new showhintf10N(u);
	sh27.start();  }
else if(label13.isVisible()==true)
   {u=label13;
sh27=new showhintf10N(u);
	sh27.start();  }
else if(label14.isVisible()==true)
   {u=label14;
sh27=new showhintf10N(u);
	sh27.start();  }

h1.setVisible(false);}

else if(ae.getSource()==h2)
{if(label.isVisible()==true)
   {u=label;
sh27=new showhintf10N(u);
	sh27.start();  }
else if(label1.isVisible()==true)
   {u=label1;
sh27=new showhintf10N(u);
	sh27.start();  }
else if(label2.isVisible()==true)
   {u=label2;
sh27=new showhintf10N(u);
	sh27.start();  }
else if(label3.isVisible()==true)
   {u=label3;
sh27=new showhintf10N(u);
	sh27.start();  }
else if(label4.isVisible()==true)
  {u=label4;
sh27=new showhintf10N(u);
	sh27.start();  }
else if(label5.isVisible()==true)
   {u=label5;
sh27=new showhintf10N(u);
	sh27.start();  }
else if(label6.isVisible()==true)
   {u=label6;
sh27=new showhintf10N(u);
	sh27.start();  }
else if(label7.isVisible()==true)
   {u=label7;
sh27=new showhintf10N(u);
	sh27.start();  }
else if(label8.isVisible()==true)
   {u=label8;
sh27=new showhintf10N(u);
	sh27.start();  }
else if(label9.isVisible()==true)
   {u=label9;
sh27=new showhintf10N(u);
	sh27.start();  }
else if(label10.isVisible()==true)
   {u=label10;
sh27=new showhintf10N(u);
	sh27.start();  }
else if(label11.isVisible()==true)
   {u=label11;
sh27=new showhintf10N(u);
	sh27.start();  }
else if(label12.isVisible()==true)
   {u=label12;
sh27=new showhintf10N(u);
	sh27.start();  }
else if(label13.isVisible()==true)
   {u=label13;
sh27=new showhintf10N(u);
	sh27.start();  }
else if(label14.isVisible()==true)
   {u=label14;
sh27=new showhintf10N(u);
	sh27.start();  }

h2.setVisible(false);}

else if(ae.getSource()==h3)
{if(label.isVisible()==true)
   {u=label;
sh27=new showhintf10N(u);
	sh27.start();  }
else if(label1.isVisible()==true)
   {u=label1;
sh27=new showhintf10N(u);
	sh27.start();  }
else if(label2.isVisible()==true)
   {u=label2;
sh27=new showhintf10N(u);
	sh27.start();  }
else if(label3.isVisible()==true)
   {u=label3;
sh27=new showhintf10N(u);
	sh27.start();  }
else if(label4.isVisible()==true)
  {u=label4;
sh27=new showhintf10N(u);
	sh27.start();  }
else if(label5.isVisible()==true)
   {u=label5;
sh27=new showhintf10N(u);
	sh27.start();  }
else if(label6.isVisible()==true)
   {u=label6;
sh27=new showhintf10N(u);
	sh27.start();  }
else if(label7.isVisible()==true)
   {u=label7;
sh27=new showhintf10N(u);
	sh27.start();  }
else if(label8.isVisible()==true)
   {u=label8;
sh27=new showhintf10N(u);
	sh27.start();  }
else if(label9.isVisible()==true)
   {u=label9;
sh27=new showhintf10N(u);
	sh27.start();  }
else if(label10.isVisible()==true)
   {u=label10;
sh27=new showhintf10N(u);
	sh27.start();  }
else if(label11.isVisible()==true)
   {u=label11;
sh27=new showhintf10N(u);
	sh27.start();  }
else if(label12.isVisible()==true)
   {u=label12;
sh27=new showhintf10N(u);
	sh27.start();  }
else if(label13.isVisible()==true)
   {u=label13;
sh27=new showhintf10N(u);
	sh27.start();  }
else if(label14.isVisible()==true)
   {u=label14;
sh27=new showhintf10N(u);
	sh27.start();  }
h3.setVisible(false);}
}

    public static void main(String args[]) 
    {
	f10N bgf10N=new f10N();
        
     int t;  
int a2=10;
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
if(foo<10)
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
}		}
bgf10N.dt=true;
check(bgf10N);
}

public static void checkscore(f10N bgf10N)
{int i;
bgf10N.c3.setText(""+(bgf10N.i*100)+"Points");
 bgf10N.c3.setFont(new Font("algerian", Font.ITALIC,19));
      bgf10N.c3.setForeground(Color.black);

i=bgf10N.i*100;
bgf10N.k=i;

}
public static void check(f10N bgf10N)
{
int i,j,a;
if(bgf10N.i==15)
{
//JOptionPane.showMessageDialog(null,"Congratulations!!! You Have Cleared Stage Successfully.");
a=0;

if(bgf10N.h1.isVisible()==true)
{
JOptionPane.showMessageDialog(null,"Congratulations!!! hint bonus:100 points");
try
{for(j=0;j<=100;j++)
{
bgf10N.c3.setText(""+(j+bgf10N.k+a)+"Points");
Thread.sleep(5);}
}
catch(Exception ex){JOptionPane.showMessageDialog(null,ex.getMessage());}
a=a+100;
bgf10N.h1.setVisible(false);}


if(bgf10N.h2.isVisible()==true)
{JOptionPane.showMessageDialog(null,"Congratulations!!! hint bonus:100 points");

try
{for(j=0;j<=100;j++)
{
bgf10N.c3.setText(""+(j+bgf10N.k+a)+"Points");
Thread.sleep(5);}
}
catch(Exception ex){JOptionPane.showMessageDialog(null,ex.getMessage());}
a=a+100;
bgf10N.h2.setVisible(false);}


if(bgf10N.h3.isVisible()==true)
{JOptionPane.showMessageDialog(null,"Congratulations!!! hint bonus:100 points");
try
{for(j=0;j<100;j++)
{
bgf10N.c3.setText(""+(j+bgf10N.k+a)+"Points");
Thread.sleep(5);}
}
catch(Exception ex){JOptionPane.showMessageDialog(null,ex.getMessage());}

a=a+100;
bgf10N.h3.setVisible(false);}
bgf10N.k=bgf10N.k+a;

JOptionPane.showMessageDialog(null,"Total Score:"+bgf10N.k);
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
if(fo<bgf10N.k)
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
		    new PrintStream(fout).print(bgf10N.k);
		    fout.close();		
		}
		catch (IOException e)
		{
			System.err.println ("Unable to write to file");
			System.exit(-1);
	}	}
new f11(bgf10N.k);
bgf10N.dispose();
}
 }

}