import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

class back extends JFrame
{

    JButton b1;
    JLabel l1;

    public back() {
	
        setSize(1279,700);
        setVisible(true);

        setLayout(new BorderLayout());
	setTitle("Welcome to Madde Hunt");
        JLabel background=new JLabel(new ImageIcon("bk.jpg"));

        add(background);

        background.setLayout(new FlowLayout());
//JFrame.setBackground(Color.RED);
    pack(); 
    }

    public static void main(String args[]) 
    {
        new back();
    }
}