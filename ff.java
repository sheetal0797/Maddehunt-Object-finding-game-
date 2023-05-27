import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
class ff extends JFrame implements MouseListener
{
    JLabel label,label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12,label13,label14,l,a,b,c,labels,labels1,labels2,labels3,labels4,labels5,labels6,labels7,labels8,labels9,labels10,labels11,labels12,labels13,labels14;

    public ff() 

        {
        setSize(1279,700);
        setVisible(true);
	setTitle("");
	//setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

	JPanel panel = (JPanel)getContentPane();  
        panel.setLayout(null);
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
	labels = new JLabel();  
        labels1 = new JLabel(); 
        labels2 = new JLabel(); 
	labels3 = new JLabel(); 
	labels4 = new JLabel();  
        labels5 = new JLabel(); 
        labels6 = new JLabel(); 
	labels7 = new JLabel();
        labels8 = new JLabel();  
        labels9 = new JLabel(); 
        labels10 = new JLabel(); 
	labels11 = new JLabel(); 
	labels12 = new JLabel(); 
	labels13 = new JLabel();
	labels14 = new JLabel();
	labels.setIcon(new ImageIcon("s1.png"));
       labels1.setIcon(new ImageIcon("s2.png"));
	labels2.setIcon(new ImageIcon("s3.png"));
	labels3.setIcon(new ImageIcon("s4.png"));
        labels4.setIcon(new ImageIcon("s5.png"));
        labels5.setIcon(new ImageIcon("s6.png"));
	labels6.setIcon(new ImageIcon("s7.png"));
	labels7.setIcon(new ImageIcon("s8.png"));
        labels8.setIcon(new ImageIcon("s9.png"));
        labels9.setIcon(new ImageIcon("s10.png"));
	labels10.setIcon(new ImageIcon("s11.png"));
	labels11.setIcon(new ImageIcon("s12.png"));
	labels12.setIcon(new ImageIcon("s13.png"));
	labels13.setIcon(new ImageIcon("s14.png"));
	labels14.setIcon(new ImageIcon("s15.png"));
	label.setIcon(new ImageIcon("f1.png"));
        label1.setIcon(new ImageIcon("f2.jpg"));
	label2.setIcon(new ImageIcon("f3.jpg"));
	label3.setIcon(new ImageIcon("f4.png"));
        label4.setIcon(new ImageIcon("f5.jpg"));
        label5.setIcon(new ImageIcon("f6.jpg"));
	label6.setIcon(new ImageIcon("f10.jpg"));
	label7.setIcon(new ImageIcon("f11.jpg"));
        label8.setIcon(new ImageIcon("f12.jpg"));
        label9.setIcon(new ImageIcon("f7.jpg"));
	label10.setIcon(new ImageIcon("f8.png"));
	label11.setIcon(new ImageIcon("f9.jpg"));
	label12.setIcon(new ImageIcon("f13.jpg"));
	label13.setIcon(new ImageIcon("f14.jpg"));
	label14.setIcon(new ImageIcon("f15.jpg"));
	panel.add(label);  label.addMouseListener(this);
         panel.add(label1); label1.addMouseListener(this);
	 panel.add(label2); label2.addMouseListener(this);
	panel.add(label3); label3.addMouseListener(this);
         panel.add(label4); label4.addMouseListener(this);
         panel.add(label5); label5.addMouseListener(this);
	 panel.add(label6); label6.addMouseListener(this);
	 panel.add(label7); label7.addMouseListener(this);
         panel.add(label8); label8.addMouseListener(this);
         panel.add(label9); label9.addMouseListener(this);
	 panel.add(label10);label10.addMouseListener(this);
	 panel.add(label11); label11.addMouseListener(this);
	 panel.add(label12); label12.addMouseListener(this);
	 panel.add(label13); label13.addMouseListener(this);
	 panel.add(label14); label14.addMouseListener(this);
	panel.add(labels);
panel.add(labels1);
panel.add(labels2);
panel.add(labels3);
panel.add(labels4);
panel.add(labels5);
panel.add(labels6);
panel.add(labels7);
panel.add(labels8);
panel.add(labels9);
panel.add(labels10);
panel.add(labels11);
panel.add(labels12);
panel.add(labels13);
panel.add(labels14);

	   Dimension size = label.getPreferredSize();

        label.setBounds(10, 10, size.width, size.height);
	label1.setBounds(320,10, size.width, size.height);
	label2.setBounds(640,10, size.width, size.height);
	label3.setBounds(960,10, size.width, size.height);
	label4.setBounds(10, 190, size.width, size.height);
	label5.setBounds(320,190, size.width, size.height);
	label6.setBounds(640,190, size.width, size.height);
	label7.setBounds(960,190, size.width, size.height);
  	label8.setBounds(10, 380, size.width, size.height);
	label9.setBounds(320,380, size.width, size.height);
	label10.setBounds(640,380, size.width, size.height);
	label11.setBounds(960,380, size.width, size.height);
	label12.setBounds(10,560, size.width, size.height);
	label13.setBounds(320,560, size.width, size.height);
	label14.setBounds(640,560, size.width, size.height);
	   labels.setBounds(90, 100, size.width, size.height);
	labels1.setBounds(400,100, size.width, size.height);
	labels2.setBounds(750,100, size.width, size.height);
	labels3.setBounds(1050,100, size.width, size.height);
	labels4.setBounds(90, 280, size.width, size.height);
	labels5.setBounds(400,280, size.width, size.height);
	labels6.setBounds(750,280, size.width, size.height);
	labels7.setBounds(1050,280, size.width, size.height);
  	labels8.setBounds(90, 470, size.width, size.height);
	labels9.setBounds(400,470, size.width, size.height);
	labels10.setBounds(750,470, size.width, size.height);
	labels11.setBounds(1050,470, size.width, size.height);
	labels12.setBounds(90,640, size.width, size.height);
	labels13.setBounds(400,640, size.width, size.height);
	labels14.setBounds(750,640, size.width, size.height);

	label1.setEnabled(false);

	label2.setEnabled(false);

	label3.setEnabled(false);

	label4.setEnabled(false);

	label5.setEnabled(false);

	label6.setEnabled(false);

	label7.setEnabled(false);

	label8.setEnabled(false);

	label9.setEnabled(false);

	label10.setEnabled(false);
      	label11.setEnabled(false);
        label12.setEnabled(false);
	label13.setEnabled(false);
	label14.setEnabled(false);
	

        setLayout(new BorderLayout());
	
        JLabel background=new JLabel(new ImageIcon("ff.jpg"));

        add(background);
//JFrame.setBackground(Color.RED);
    pack();

int k=0; 
}
public void mouseEntered(MouseEvent ae){
FileInputStream fin;
String p2=null;	

		try
		{
		    // Open an input stream
		    fin = new FileInputStream("newfile.txt");
		    // Read a line of text
		   // p2= new DataInputStream(fin).readLine();
  //DataInputStream din = new DataInputStream(fin);       
    //     p2 = din.readInt();
		    // Close our input stream
    p2=new DataInputStream(fin).readLine();
		    fin.close();		
		}
		catch (IOException e)
		{
			System.err.println ("Unable to read from file");
			System.exit(-1);
		}
if(p2.equals("2"))
//if(p2=="2")
{label1.setEnabled(true);}

else if(p2.equals("3"))
{label2.setEnabled(true);
label1.setEnabled(true);
}
else if(p2.equals("4"))
{label2.setEnabled(true);
label1.setEnabled(true);
label3.setEnabled(true);}

else if(p2.equals("5"))
{label2.setEnabled(true);
label1.setEnabled(true);
label3.setEnabled(true);
label4.setEnabled(true);}

else if(p2.equals("6"))
{label2.setEnabled(true);
label1.setEnabled(true);
label3.setEnabled(true);
label4.setEnabled(true);
label5.setEnabled(true);}

else if(p2.equals("7"))
{label2.setEnabled(true);
label1.setEnabled(true);
label3.setEnabled(true);
label4.setEnabled(true);
label5.setEnabled(true);
label6.setEnabled(true);}

else if(p2.equals("8"))
{label2.setEnabled(true);
label1.setEnabled(true);
label3.setEnabled(true);
label4.setEnabled(true);
label5.setEnabled(true);
label6.setEnabled(true);
label7.setEnabled(true);}

else if(p2.equals("9"))
{label2.setEnabled(true);
label1.setEnabled(true);
label3.setEnabled(true);
label4.setEnabled(true);
label5.setEnabled(true);
label6.setEnabled(true);
label7.setEnabled(true);
label8.setEnabled(true);}

else if(p2.equals("10"))
{label2.setEnabled(true);
label1.setEnabled(true);
label3.setEnabled(true);
label4.setEnabled(true);
label5.setEnabled(true);
label6.setEnabled(true);
label7.setEnabled(true);
label8.setEnabled(true);
label9.setEnabled(true);}

else if(p2.equals("11"))
{label2.setEnabled(true);
label1.setEnabled(true);
label3.setEnabled(true);
label4.setEnabled(true);
label5.setEnabled(true);
label6.setEnabled(true);
label7.setEnabled(true);
label8.setEnabled(true);
label9.setEnabled(true);
label10.setEnabled(true);}

else if(p2.equals("12"))
{label2.setEnabled(true);
label1.setEnabled(true);
label3.setEnabled(true);
label4.setEnabled(true);
label5.setEnabled(true);
label6.setEnabled(true);
label7.setEnabled(true);
label8.setEnabled(true);
label9.setEnabled(true);
label10.setEnabled(true);
label11.setEnabled(true);}

else if(p2.equals("13"))
{label2.setEnabled(true);
label1.setEnabled(true);
label3.setEnabled(true);
label4.setEnabled(true);
label5.setEnabled(true);
label6.setEnabled(true);
label7.setEnabled(true);
label8.setEnabled(true);
label9.setEnabled(true);
label10.setEnabled(true);
label11.setEnabled(true);
label12.setEnabled(true);}

else if(p2.equals("14"))
{label2.setEnabled(true);
label1.setEnabled(true);
label3.setEnabled(true);
label4.setEnabled(true);
label5.setEnabled(true);
label6.setEnabled(true);
label7.setEnabled(true);
label8.setEnabled(true);
label9.setEnabled(true);
label10.setEnabled(true);
label11.setEnabled(true);
label12.setEnabled(true);
label13.setEnabled(true);}

else if(p2.equals("15"))
{label2.setEnabled(true);
label1.setEnabled(true);
label3.setEnabled(true);
label4.setEnabled(true);
label5.setEnabled(true);
label6.setEnabled(true);
label7.setEnabled(true);
label8.setEnabled(true);
label9.setEnabled(true);
label10.setEnabled(true);
label11.setEnabled(true);
label12.setEnabled(true);
label13.setEnabled(true);
label14.setEnabled(true);}   }
public void mouseExited(MouseEvent ae){}
public void mousePressed(MouseEvent ae){}
public void mouseReleased(MouseEvent ae){}
public void mouseClicked(MouseEvent ae)
{ 
if(ae.getSource()==label)
{new f1();

}

else if(ae.getSource()==label1)
{
new f2(0);}


else if(ae.getSource()==label2)
{new f3(0);}


else if(ae.getSource()==label3)
{new f4(0);}


else if(ae.getSource()==label4)
{new f5(0);}


else if(ae.getSource()==label5)
{new f6(0);}



else if(ae.getSource()==label6)
{new f10(0);}



else if(ae.getSource()==label7)
{new f11(0);}


else if(ae.getSource()==label8)
{new f12N();}


else if(ae.getSource()==label9)
{new f7(0);}


else if(ae.getSource()==label10)
{new f8(0);}


else if(ae.getSource()==label11)
{new f9(0);}


else if(ae.getSource()==label12)
{new f13(0);}

else if(ae.getSource()==label13)
{new f14(0);}


else if (ae.getSource()==label14)
{new f15(0);}

}

    

    public static void main(String args[]) 
    {
        ff bgff=new ff();

}
}