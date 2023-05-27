import javax.swing.*;

import java.awt.*;

import java.awt.event.*;
import java.io.*;
import java.net.URL;
import javax.sound.sampled.*;
class fstart extends JFrame 
{   JButton b1;
    JLabel l1;
    public fstart() {
        setSize(1279,700);
        setVisible(true);
	setTitle("Welcome to Madde Hunt");
setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);	


        setLayout(new BorderLayout());

        JLabel background=new JLabel(new ImageIcon("fstart.jpg"));

        add(background); 
        background.setLayout(new FlowLayout());
//JFrame.setBackground(Color.RED);
    pack(); 
/*bksong d1=new bksong();
Thread e1=new Thread(d1);
e1.start();*/
try
{
Thread.sleep(7000);
}
catch(Exception ex){JOptionPane.showMessageDialog(null,ex.getMessage());}
new fmenu((JFrame)this,1);

    }


    public static void main(String args[]) 
    {
        fstart ff=new fstart();
    }
}