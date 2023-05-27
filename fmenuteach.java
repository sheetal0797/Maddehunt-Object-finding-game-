import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

class fmenu extends JFrame implements ActionListener 
{
	JButton b1,b2,b3,b4,b5,b6;
    JLabel l1;
//Thread e1;
public fmenu()
{}
    public fmenu(JFrame tt,int t) {
        setSize(1366,740);
        setVisible(true);
	JPanel panel = (JPanel)getContentPane();  
        panel.setLayout(null);  
	setTitle("Welcome to Madde Hunt");
if (t==0)tt.dispose();
b1=new JButton("NEW GAME");
b2=new JButton("SELECT STAGE");
b3=new JButton("EXIT"); 
b5=new JButton("Start");
b4=new JButton("HIGH SCORE");
b6=new JButton("Stop");
add(b1); b1.addActionListener(this);
add(b2);b2.addActionListener(this);
add(b3); b3.addActionListener(this);
add(b4);b4.addActionListener(this);
//add(b5);b5.addActionListener(this);
//add(b6);b6.addActionListener(this);
 Dimension size = b1.getPreferredSize();
	  b1.setBounds(350, 220,size.width+40, size.height );
	  b2.setBounds(345, 280, size.width+40, size.height);	
         b3.setBounds(340, 340, size.width+40, size.height);
         b4.setBounds(335, 410, size.width+40, size.height);
 // b5.setBounds(335, 450, size.width, size.height);
 // b6.setBounds(385, 450, size.width, size.height);
       setLayout(new BorderLayout());
	 JLabel background=new JLabel(new ImageIcon("fmenu1.jpg"));
        add(background);
    pack(); 


    }
public void actionPerformed(ActionEvent ae){
if(ae.getSource()==b1)
  {new f1();}
else if(ae.getSource()==b2)
  {new ff();}
else if(ae.getSource()==b3)
  {System.exit(0);}
/*else if(ae.getSource()==b5)
{e1.start();}
//else if(ae.getSource()==b6)
//{//e1.stop();}*/
}

    public static void main(String args[]) 
    {new fmenu(new JFrame(),1);}
}